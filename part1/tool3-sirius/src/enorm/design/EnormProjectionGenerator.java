package enorm.design;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

// EMF imports
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import enorm.EnormPackage;

/**
 * EnormProjectionGenerator - Generates 3 types of projections from ENORM models
 *
 * Following the same pattern as the professor's example:
 * 1. generateStructureDiagram() - PlantUML class diagrams
 * 2. generateBehaviorDiagrams() - PlantUML flow diagrams for processes
 * 3. generateTextualProjection() - Natural language text descriptions
 *
 * Usage (with hardcoded paths):
 *   EnormProjectionGenerator.generateStructureDiagram();
 *   EnormProjectionGenerator.generateBehaviorDiagrams();
 *   EnormProjectionGenerator.generateTextualProjection();
 */
public class EnormProjectionGenerator {

    // ==================== HARDCODED PATHS ====================
    
    // Input XMI file path - MODIFY THIS TO YOUR MODEL FILE
    private static final String INPUT_XMI_PATH =
            "C:\\Users\\franc\\Faculdade\\Mestrado\\2_Semestre\\ENORM\\project-enorm-25-26\\part1\\tool3-sirius\\model\\Reddit.xmi";
    
    // Output model name - MODIFY THIS TO CUSTOMIZE OUTPUT FILENAMES
    private static final String OUTPUT_MODEL_NAME = "Reddit";

    // Output paths (all artifacts saved under the same folder)
    private static final String OUTPUT_PROJECTIONS_DIR = "projections";

    // ==================== MAIN ENTRY POINTS ====================

    /**
     * Generates a structure diagram (PlantUML class diagram) from hardcoded XMI file
     * Shows the static structure of the ENORM model
     */
    public static void generateStructureDiagram() {
        Object refModel = loadModelFromXmi(INPUT_XMI_PATH);
        if (refModel == null) {
            System.err.println("Error: Failed to load model from " + INPUT_XMI_PATH);
            return;
        }
        String outputFile = OUTPUT_PROJECTIONS_DIR + "/" + OUTPUT_MODEL_NAME + "_structure_diagram.puml";
        generateStructureDiagramFromModel(refModel, outputFile);
    }

    /**
     * Generates a structure diagram from a specific model object
     */
    private static void generateStructureDiagramFromModel(Object refModel, String outputFile) {
        if (!isEClass(refModel, "RefModel")) {
            System.err.println("Error: Not a RefModel instance");
            return;
        }

        if (!ensureParentDirectory(outputFile)) {
            return;
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(outputFile));

            String modelName = safe(getFeatureValue(refModel, "name"));
            String version = safe(getFeatureValue(refModel, "version"));

            writer.println("@startuml");
            writer.println("title " + modelName + " v" + version + " - Structure Diagram");
            writer.println();

            Map<Object, String> resourceAliases = new IdentityHashMap<>();
            Map<Object, String> userAliases = new IdentityHashMap<>();
            Map<Object, String> feedbackTypeAliases = new IdentityHashMap<>();
            Map<Object, String> feedbackDefinitionAliases = new IdentityHashMap<>();

            // Generate ResourceTypes as classes
            writer.println("' ===== RESOURCE TYPES =====");
            List<Object> resourceTypes = getObjectList(refModel, "resourceTypes");
            for (int i = 0; i < resourceTypes.size(); i++) {
                Object resourceType = resourceTypes.get(i);
                String alias = generateStructureForResourceType(writer, resourceType, i);
                resourceAliases.put(resourceType, alias);
            }
            writer.println();

            // Generate UserTypes as stereotyped classes
            writer.println("' ===== USER TYPES =====");
            List<Object> userTypes = getObjectList(refModel, "userTypes");
            for (int i = 0; i < userTypes.size(); i++) {
                Object userType = userTypes.get(i);
                String alias = generateStructureForUserType(writer, userType, i);
                userAliases.put(userType, alias);
            }
            writer.println();

            // Generate FeedbackTypes as stereotyped classes
            writer.println("' ===== FEEDBACK TYPES =====");
            List<Object> feedbackTypes = getObjectList(refModel, "feedbackTypes");
            for (int i = 0; i < feedbackTypes.size(); i++) {
                Object feedbackType = feedbackTypes.get(i);
                String alias = generateStructureForFeedbackType(writer, feedbackType, i);
                feedbackTypeAliases.put(feedbackType, alias);
            }
            writer.println();

            // Generate FeedbackDefinitions as dedicated nodes
            writer.println("' ===== FEEDBACK DEFINITIONS =====");
            List<Object> feedbackDefinitions = getObjectList(refModel, "feedbackDefinitions");
            for (int i = 0; i < feedbackDefinitions.size(); i++) {
                Object feedbackDef = feedbackDefinitions.get(i);
                String alias = generateStructureForFeedbackDefinitionNode(writer, feedbackDef, i);
                feedbackDefinitionAliases.put(feedbackDef, alias);
            }
            writer.println();

            // Generate relationships
            writer.println("' ===== RELATIONSHIPS =====");
            for (Object relation : getObjectList(refModel, "resourceRelations")) {
                generateStructureForResourceRelation(writer, relation, resourceAliases);
            }
            writer.println();

            // Generate feedback relationships
            for (Object feedbackDef : feedbackDefinitions) {
                generateStructureForFeedbackDefinition(
                        writer,
                        feedbackDef,
                        feedbackTypeAliases,
                        feedbackDefinitionAliases,
                        userAliases,
                        resourceAliases);
            }

            writer.println("@enduml");
            writer.close();
            System.out.println("Structure diagram generated: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error writing structure diagram: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (writer != null) writer.close();
        }
    }

    /**
     * Generates behavior diagrams from hardcoded XMI file
     * Creates separate diagrams for each validation rule
     */
    public static void generateBehaviorDiagrams() {
        Object refModel = loadModelFromXmi(INPUT_XMI_PATH);
        if (refModel == null) {
            System.err.println("Error: Failed to load model from " + INPUT_XMI_PATH);
            return;
        }
        generateBehaviorDiagramsFromModel(refModel, OUTPUT_PROJECTIONS_DIR, OUTPUT_MODEL_NAME);
    }

    /**
     * Generates behavior diagrams from model object
     * Creates individual diagrams for each validation rule
     */
    private static void generateBehaviorDiagramsFromModel(Object refModel, String outputDir, String modelName) {
        if (!isEClass(refModel, "RefModel")) {
            System.err.println("Error: Not a RefModel instance");
            return;
        }

        if (!ensureParentDirectory(outputDir + "/dummy")) {
            return;
        }

        List<Object> validationRules = getObjectList(refModel, "validationRules");
        if (validationRules.isEmpty()) {
            System.out.println("No validation rules found in model");
            return;
        }

        System.out.println("Generating " + validationRules.size() + " behavior diagrams for validation processes...");

        for (Object valRule : validationRules) {
            generateBehaviorDiagramForValidationRule(valRule, outputDir, modelName);
        }

        System.out.println("Behavior diagrams generation completed");
    }

    /**
     * Generates a behavior diagram for a specific validation rule
     */
    private static void generateBehaviorDiagramForValidationRule(Object valRule, String outputDir, String modelName) {
        String ruleName = safe(getFeatureValue(valRule, "name"));
        String severity = safe(getFeatureValue(valRule, "severity"));
        String expression = safe(getFeatureValue(valRule, "expression"));
        Object kind = getFeatureValue(valRule, "kind");
        String kindStr = kind != null ? String.valueOf(kind) : "AUTOMATIC";

        PrintWriter writer = null;
        try {
            String filename = java.nio.file.Paths.get(outputDir, modelName + "_" + ruleName + "-behavior.puml").toString();
            writer = new PrintWriter(new FileWriter(filename));

            generateBehaviorPumlHeader(writer, ruleName, "Validation Process", kindStr, "", expression);
            generateBehaviorStartNode(writer);

            generateBehaviorNode(writer, "trigger", "Validation Triggered", "box");
            generateBehaviorNode(writer, "collect", "Collect Input Data", "box");
            generateBehaviorNode(writer, "check", "Check Expression", "box");
            generateBehaviorNode(writer, "decision", "Expression Valid?", "diamond");
            generateBehaviorNode(writer, "pass", "Validation Passed", "box");
            generateBehaviorNode(writer, "fail", "Validation Failed (" + severity + ")", "box");
            generateBehaviorNode(writer, "report", "Report Result", "box");

            generateBehaviorEdge(writer, "start", "trigger", null);
            generateBehaviorEdge(writer, "trigger", "collect", null);
            generateBehaviorEdge(writer, "collect", "check", null);
            generateBehaviorEdge(writer, "check", "decision", null);
            generateBehaviorEdge(writer, "decision", "pass", "true");
            generateBehaviorEdge(writer, "decision", "fail", "false");
            generateBehaviorEdge(writer, "pass", "report", null);
            generateBehaviorEdge(writer, "fail", "report", null);
            generateBehaviorEdge(writer, "report", "end", null);

            generateBehaviorPumlFooter(writer);
            writer.close();
            System.out.println("  Generated: " + filename);

        } catch (IOException e) {
            System.err.println("Error generating behavior diagram for " + ruleName + ": " + e.getMessage());
        } finally {
            if (writer != null) writer.close();
        }
    }

    /**
     * Generates a textual projection from hardcoded XMI file
     */
    public static void generateTextualProjection() {
        Object refModel = loadModelFromXmi(INPUT_XMI_PATH);
        if (refModel == null) {
            System.err.println("Error: Failed to load model from " + INPUT_XMI_PATH);
            return;
        }
        String outputFile = OUTPUT_PROJECTIONS_DIR + "/" + OUTPUT_MODEL_NAME + "_textual_projection.txt";
        generateTextualProjectionFromModel(refModel, outputFile);
    }

    /**
     * Generates a textual projection - natural language description of the model
     */
    private static void generateTextualProjectionFromModel(Object refModel, String outputFile) {
        if (!isEClass(refModel, "RefModel")) {
            System.err.println("Error: Not a RefModel instance");
            return;
        }

        if (!ensureParentDirectory(outputFile)) {
            return;
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(outputFile));

            String modelName = safe(getFeatureValue(refModel, "name"));
            String version = safe(getFeatureValue(refModel, "version"));

            // Header
            writer.println("==============================================================");
            writer.println("ENORM Model: " + modelName);
            writer.println("Version: " + version);
            writer.println("==============================================================");
            writer.println();

            // User Types
            writer.println("USER TYPES:");
            writer.println("-----------");
            for (Object userType : getObjectList(refModel, "userTypes")) {
                generateTextualForUserType(writer, userType);
            }
            writer.println();

            // Resource Types
            writer.println("RESOURCE TYPES:");
            writer.println("---------------");
            for (Object resourceType : getObjectList(refModel, "resourceTypes")) {
                generateTextualForResourceType(writer, resourceType);
            }
            writer.println();

            // Context Types
            writer.println("CONTEXT TYPES:");
            writer.println("--------------");
            for (Object contextType : getObjectList(refModel, "contextTypes")) {
                generateTextualForContextType(writer, contextType);
            }
            writer.println();

            // Feedback System
            writer.println("FEEDBACK SYSTEM:");
            writer.println("----------------");
            for (Object feedbackType : getObjectList(refModel, "feedbackTypes")) {
                generateTextualForFeedbackType(writer, feedbackType);
            }
            writer.println();

            for (Object feedbackDef : getObjectList(refModel, "feedbackDefinitions")) {
                generateTextualForFeedbackDefinition(writer, feedbackDef);
            }
            writer.println();

            // Authorization Rules
            writer.println("AUTHORIZATION RULES:");
            writer.println("-------------------");
            for (Object authRule : getObjectList(refModel, "authorizationRules")) {
                generateTextualForAuthorizationRule(writer, authRule);
            }
            writer.println();

            // Moderation Processes
            writer.println("MODERATION POLICIES:");
            writer.println("-------------------");
            for (Object modPolicy : getObjectList(refModel, "moderationPolicies")) {
                generateTextualForModerationPolicy(writer, modPolicy);
            }
            writer.println();

            // Validation Rules
            writer.println("VALIDATION RULES:");
            writer.println("-----------------");
            for (Object valRule : getObjectList(refModel, "validationRules")) {
                generateTextualForValidationRule(writer, valRule);
            }
            writer.println();

            // Automation Rules
            writer.println("AUTOMATION RULES:");
            writer.println("-----------------");
            for (Object autoRule : getObjectList(refModel, "automationRules")) {
                generateTextualForAutomationRule(writer, autoRule);
            }
            writer.println();

            writer.close();
            System.out.println("Textual projection generated: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error writing textual projection: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (writer != null) writer.close();
        }
    }

    // ==================== MODEL LOADING ====================

    /**
     * Loads an EMF model from an XMI file
     *
     * @param xmiFilePath Path to the .xmi file
     * @return The root object of the model, or null if loading fails
     */
    private static Object loadModelFromXmi(String xmiFilePath) {
        try {
            ResourceSet resourceSet = new ResourceSetImpl();

            // Register XMI resource factory
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                    .put("xmi", new XMIResourceFactoryImpl());

            // Register the ENORM EPackage
            EPackage.Registry.INSTANCE.put(EnormPackage.eNS_URI, EnormPackage.eINSTANCE);
            resourceSet.getPackageRegistry().put(EnormPackage.eNS_URI, EnormPackage.eINSTANCE);

            // Load the resource
            URI fileURI = URI.createFileURI(xmiFilePath);
            Resource resource = resourceSet.getResource(fileURI, true);

            // Get the root object
            if (resource.getContents().isEmpty()) {
                System.err.println("Error: XMI file is empty or invalid: " + xmiFilePath);
                return null;
            }

            Object root = resource.getContents().get(0);
            System.out.println("Successfully loaded model from: " + xmiFilePath);
            return root;

        } catch (Exception e) {
            System.err.println("Error loading XMI file: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // ==================== STRUCTURE DIAGRAM GENERATORS ====================

    private static String generateStructureForResourceType(PrintWriter writer, Object resourceType, int index) {
        String alias = "rt_" + index;
        String name = safe(getFeatureValue(resourceType, "name"));
        boolean supportsMedia = toBoolean(getFeatureValue(resourceType, "supportsMedia"));

        writer.println("class \"" + name + "\" as " + alias + " << (R,#FF7700) >> {");
        for (Object attr : getObjectList(resourceType, "attributes")) {
            String attrName = safe(getFeatureValue(attr, "name"));
            Object attrType = getFeatureValue(attr, "type");
            String type = attrType != null ? String.valueOf(attrType) : "UNKNOWN";
            boolean required = toBoolean(getFeatureValue(attr, "required"));

            writer.print("  " + attrName + ": " + type);
            if (required) writer.print(" [required]");
            writer.println();
        }
        writer.println("}");
        return alias;
    }

    private static String generateStructureForUserType(PrintWriter writer, Object userType, int index) {
        String alias = "ut_" + index;
        String name = safe(getFeatureValue(userType, "name"));
        Object kind = getFeatureValue(userType, "kind");
        String kindStr = kind != null ? String.valueOf(kind) : "GENERIC";
        writer.println("class \"" + name + "\" as " + alias + " << (U,#00CCFF) >> {");
        writer.println("  kind: " + kindStr);
        writer.println("}");
        return alias;
    }

    private static String generateStructureForFeedbackType(PrintWriter writer, Object feedbackType, int index) {
        String alias = "ft_" + index;
        String name = safe(getFeatureValue(feedbackType, "name"));
        Object kind = getFeatureValue(feedbackType, "kind");
        String kindStr = kind != null ? String.valueOf(kind) : "COMMENT";
        writer.println("class \"" + name + "\" as " + alias + " << (F,#00FF00) >> {");
        writer.println("  kind: " + kindStr);
        writer.println("}");
        return alias;
    }

    private static String generateStructureForFeedbackDefinitionNode(PrintWriter writer, Object feedbackDef, int index) {
        String alias = "fd_" + index;
        String name = safe(getFeatureValue(feedbackDef, "name"));
        writer.println("class \"" + name + "\" as " + alias + " << (D,#CCFFCC) >>");
        return alias;
    }

    private static void generateStructureForResourceRelation(PrintWriter writer, Object relation,
            Map<Object, String> resourceAliases) {
        Object source = getFeatureValue(relation, "source");
        Object target = getFeatureValue(relation, "target");
        String sourceAlias = resourceAliases.get(source);
        String targetAlias = resourceAliases.get(target);
        String sourceCard = safe(getFeatureValue(relation, "sourceCardinality"));
        String targetCard = safe(getFeatureValue(relation, "targetCardinality"));

        if (sourceAlias == null || targetAlias == null) {
            return;
        }

        writer.println(sourceAlias + " \"" + sourceCard + "\" --> \"" + targetCard + "\" " + targetAlias);
    }

    private static void generateStructureForFeedbackDefinition(PrintWriter writer, Object feedbackDef,
            Map<Object, String> feedbackTypeAliases, Map<Object, String> feedbackDefinitionAliases,
            Map<Object, String> userAliases, Map<Object, String> resourceAliases) {
        String feedbackDefAlias = feedbackDefinitionAliases.get(feedbackDef);
        if (feedbackDefAlias == null) {
            return;
        }

        Object type = getFeatureValue(feedbackDef, "type");
        String typeAlias = feedbackTypeAliases.get(type);
        Object author = getFeatureValue(feedbackDef, "author");
        String authorAlias = userAliases.get(author);

        if (typeAlias != null) {
            writer.println(typeAlias + " *--> " + feedbackDefAlias + ": feedback");
        }
        if (authorAlias != null) {
            writer.println(feedbackDefAlias + " --> " + authorAlias + ": author");
        }

        Object subjectResource = getFeatureValue(feedbackDef, "subjectResource");
        String subjectResourceAlias = resourceAliases.get(subjectResource);
        if (subjectResourceAlias != null) {
            writer.println(feedbackDefAlias + " --> " + subjectResourceAlias + ": subjectResource");
        }

        Object subjectFeedback = getFeatureValue(feedbackDef, "subjectFeedback");
        String subjectFeedbackAlias = feedbackDefinitionAliases.get(subjectFeedback);
        if (subjectFeedbackAlias != null) {
            writer.println(feedbackDefAlias + " --> " + subjectFeedbackAlias + ": subjectFeedback");
        }
    }

    // ==================== BEHAVIOR DIAGRAM GENERATORS ====================

    private static void generateBehaviorDiagramForModerationPolicy(Object modPolicy, String outputDir) {
        String policyName = safe(getFeatureValue(modPolicy, "name"));
        PrintWriter writer = null;

        try {
            String filename = java.nio.file.Paths.get(outputDir, policyName + "-behavior.puml").toString();
            writer = new PrintWriter(new FileWriter(filename));

            String mode = safe(getFeatureValue(modPolicy, "mode"));
            String decision = safe(getFeatureValue(modPolicy, "decision"));
            String trigger = safe(getFeatureValue(modPolicy, "trigger"));

            generateBehaviorPumlHeader(writer, policyName, "Moderation Process", mode, trigger, decision);
            generateBehaviorStartNode(writer);
            generateBehaviorNode(writer, "trigger", trigger.isEmpty() ? "trigger" : trigger, "box");
            generateBehaviorNode(writer, "evaluate", "Evaluate Policy", "box");
            generateBehaviorNode(writer, "decision", "Policy matches?", "diamond");
            generateBehaviorNode(writer, "action", decision.isEmpty() ? "Apply Decision" : decision, "box");
            generateBehaviorNode(writer, "process", "Process", "box");
            generateBehaviorNode(writer, "skip", "Skip", "box");

            generateBehaviorEdge(writer, "start", "trigger", null);
            generateBehaviorEdge(writer, "trigger", "evaluate", null);
            generateBehaviorEdge(writer, "evaluate", "decision", null);
            generateBehaviorEdge(writer, "decision", "action", "yes");
            generateBehaviorEdge(writer, "decision", "skip", "no");
            generateBehaviorEdge(writer, "action", "process", null);
            generateBehaviorEdge(writer, "process", "end", null);
            generateBehaviorEdge(writer, "skip", "end", null);
            generateBehaviorPumlFooter(writer);

            writer.close();
            System.out.println("  Generated: " + filename);

        } catch (IOException e) {
            System.err.println("Error generating behavior diagram for " + policyName + ": " + e.getMessage());
        } finally {
            if (writer != null) writer.close();
        }
    }

    private static void generateBehaviorDiagramForAutomationRule(Object autoRule, String outputDir) {
        String ruleName = safe(getFeatureValue(autoRule, "name"));
        PrintWriter writer = null;

        try {
            String filename = java.nio.file.Paths.get(outputDir, ruleName + "-behavior.puml").toString();
            writer = new PrintWriter(new FileWriter(filename));

            String trigger = safe(getFeatureValue(autoRule, "trigger"));
            String condition = safe(getFeatureValue(autoRule, "condition"));
            String actionDesc = safe(getFeatureValue(autoRule, "actionDescription"));

            generateBehaviorPumlHeader(writer, ruleName, "Automation Process", "", trigger, condition);
            generateBehaviorStartNode(writer);
            generateBehaviorNode(writer, "trigger", trigger.isEmpty() ? "trigger" : trigger, "box");
            generateBehaviorNode(writer, "check", "Check Condition", "box");
            generateBehaviorNode(writer, "execute", actionDesc.isEmpty() ? "Execute Action" : actionDesc, "box");
            generateBehaviorNode(writer, "skip", "Skip Action", "box");

            generateBehaviorEdge(writer, "start", "trigger", null);
            generateBehaviorEdge(writer, "trigger", "check", null);

            if (!condition.isEmpty()) {
                generateBehaviorNode(writer, "decision", condition, "diamond");
                generateBehaviorEdge(writer, "check", "decision", null);
                generateBehaviorEdge(writer, "decision", "execute", "true");
                generateBehaviorEdge(writer, "decision", "skip", "false");
                generateBehaviorEdge(writer, "skip", "end", null);
            } else {
                generateBehaviorEdge(writer, "check", "execute", null);
            }

            generateBehaviorEdge(writer, "execute", "end", null);
            generateBehaviorPumlFooter(writer);

            writer.close();
            System.out.println("  Generated: " + filename);

        } catch (IOException e) {
            System.err.println("Error generating behavior diagram for " + ruleName + ": " + e.getMessage());
        } finally {
            if (writer != null) writer.close();
        }
    }

    private static void generateBehaviorPumlHeader(PrintWriter writer, String graphName, String titleSuffix,
            String mode, String trigger, String decisionOrCondition) {
        // Keep behavior projections in native PlantUML syntax (no DOT/digraph) for Sirius compatibility.
        writer.println("@startuml");
        writer.println("title " + graphName + " " + titleSuffix);
        StringBuilder legend = new StringBuilder();
        if (!mode.isEmpty()) {
            legend.append("Mode: ").append(escapeForPumlLabel(mode)).append("\\n");
        }
        if (!trigger.isEmpty()) {
            legend.append("Trigger: ").append(escapeForPumlLabel(trigger)).append("\\n");
        }
        if (!decisionOrCondition.isEmpty()) {
            legend.append("Decision/Condition: ").append(escapeForPumlLabel(decisionOrCondition)).append("\\n");
        }
        if (legend.length() > 0) {
            writer.print(legend.toString());
        }
        writer.println();
    }

    private static void generateBehaviorPumlFooter(PrintWriter writer) {
        writer.println("@enduml");
    }

    private static void generateBehaviorStartNode(PrintWriter writer) {
        // State diagrams use [*] pseudo-states; start/end are mapped in edges.
    }

    private static void generateBehaviorNode(PrintWriter writer, String nodeId, String label, String shape) {
        String alias = sanitizeGraphId(nodeId);
        if ("diamond".equals(shape)) {
            writer.println("state \"" + escapeForPumlLabel(label) + "\" as " + alias + " <<choice>>");
            return;
        }
        writer.println("state \"" + escapeForPumlLabel(label) + "\" as " + alias);
    }

    private static void generateBehaviorEdge(PrintWriter writer, String fromId, String toId, String edgeLabel) {
        String from = "start".equals(fromId) ? "[*]" : sanitizeGraphId(fromId);
        String to = "end".equals(toId) ? "[*]" : sanitizeGraphId(toId);
        String edge = from + " --> " + to;
        if (edgeLabel != null && !edgeLabel.isEmpty()) {
            edge += " : " + escapeForPumlLabel(edgeLabel);
        }
        writer.println(edge);
    }

    private static String sanitizeGraphId(String value) {
        if (value == null || value.isEmpty()) {
            return "node";
        }
        return value.replaceAll("[^a-zA-Z0-9_]", "_");
    }

    private static String escapeForPumlLabel(String label) {
        if (label == null) {
            return "";
        }
        return label.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    // ==================== TEXTUAL PROJECTION GENERATORS ====================

    private static void generateTextualForUserType(PrintWriter writer, Object userType) {
        String name = safe(getFeatureValue(userType, "name"));
        Object kind = getFeatureValue(userType, "kind");
        String kindStr = kind != null ? String.valueOf(kind) : "GENERIC";
        writer.println("- " + name + " (kind: " + kindStr + ")");
    }

    private static void generateTextualForResourceType(PrintWriter writer, Object resourceType) {
        String name = safe(getFeatureValue(resourceType, "name"));
        boolean supportsMedia = toBoolean(getFeatureValue(resourceType, "supportsMedia"));

        writer.println("Resource " + name);
        if (supportsMedia) writer.println("  Supports multimedia content");

        for (Object attr : getObjectList(resourceType, "attributes")) {
            String attrName = safe(getFeatureValue(attr, "name"));
            Object attrType = getFeatureValue(attr, "type");
            String type = attrType != null ? String.valueOf(attrType) : "UNKNOWN";
            boolean required = toBoolean(getFeatureValue(attr, "required"));

            writer.print("  - " + attrName + ": " + type);
            if (required) writer.print(" (required)");
            writer.println();
        }
        writer.println();
    }

    private static void generateTextualForContextType(PrintWriter writer, Object contextType) {
        String name = safe(getFeatureValue(contextType, "name"));
        Object kind = getFeatureValue(contextType, "kind");
        String kindStr = kind != null ? String.valueOf(kind) : "GLOBAL";

        writer.println("Context " + name + " (kind: " + kindStr + ")");

        List<Object> contains = getObjectList(contextType, "contains");
        if (!contains.isEmpty()) {
            writer.println("  Contains:");
            for (Object res : contains) {
                writer.println("    - " + safe(getFeatureValue(res, "name")));
            }
        }
        writer.println();
    }

    private static void generateTextualForFeedbackType(PrintWriter writer, Object feedbackType) {
        String name = safe(getFeatureValue(feedbackType, "name"));
        Object kind = getFeatureValue(feedbackType, "kind");
        Object scope = getFeatureValue(feedbackType, "subjectScope");
        boolean hasRating = toBoolean(getFeatureValue(feedbackType, "hasRating"));
        boolean recursive = toBoolean(getFeatureValue(feedbackType, "recursive"));

        String kindStr = kind != null ? String.valueOf(kind) : "COMMENT";
        String scopeStr = scope != null ? String.valueOf(scope) : "RESOURCE_ONLY";

        writer.println("Feedback type " + name);
        writer.println("  Kind: " + kindStr);
        writer.println("  Subject scope: " + scopeStr);
        if (hasRating) writer.println("  Has rating capability");
        if (recursive) writer.println("  Supports recursive feedback");
        writer.println();
    }

    private static void generateTextualForFeedbackDefinition(PrintWriter writer, Object feedbackDef) {
        String name = safe(getFeatureValue(feedbackDef, "name"));
        Object type = getFeatureValue(feedbackDef, "type");
        String typeName = type != null ? safe(getFeatureValue(type, "name")) : "?";
        Object author = getFeatureValue(feedbackDef, "author");
        String authorName = author != null ? safe(getFeatureValue(author, "name")) : "?";
        boolean requiresVerified = toBoolean(getFeatureValue(feedbackDef, "requiresVerifiedContext"));

        writer.println("Feedback definition " + name);
        writer.println("  Type: " + typeName);
        writer.println("  Author: " + authorName);
        if (requiresVerified) writer.println("  Requires verified context");
        writer.println();
    }

    private static void generateTextualForAuthorizationRule(PrintWriter writer, Object authRule) {
        Object actor = getFeatureValue(authRule, "actor");
        Object target = getFeatureValue(authRule, "resourceTarget");
        String actorName = actor != null ? safe(getFeatureValue(actor, "name")) : "?";
        String targetName = target != null ? safe(getFeatureValue(target, "name")) : "?";
        Object action = getFeatureValue(authRule, "allowedAction");
        String actionStr = action != null ? String.valueOf(action) : "?";

        writer.println("- " + actorName + " can " + actionStr + " " + targetName);
    }

    private static void generateTextualForModerationPolicy(PrintWriter writer, Object modPolicy) {
        String name = safe(getFeatureValue(modPolicy, "name"));
        Object mode = getFeatureValue(modPolicy, "mode");
        Object decision = getFeatureValue(modPolicy, "decision");
        String trigger = safe(getFeatureValue(modPolicy, "trigger"));

        String modeStr = mode != null ? String.valueOf(mode) : "MANUAL";
        String decisionStr = decision != null ? String.valueOf(decision) : "FLAGGED";

        writer.println("Moderation policy " + name);
        writer.println("  Mode: " + modeStr);
        writer.println("  Decision: " + decisionStr);
        if (!trigger.isEmpty()) writer.println("  Trigger: " + trigger);
        writer.println();
    }

    private static void generateTextualForValidationRule(PrintWriter writer, Object valRule) {
        String name = safe(getFeatureValue(valRule, "name"));
        Object kind = getFeatureValue(valRule, "kind");
        Object severity = getFeatureValue(valRule, "severity");
        String expression = safe(getFeatureValue(valRule, "expression"));

        String kindStr = kind != null ? String.valueOf(kind) : "AUTOMATIC";
        String severityStr = severity != null ? String.valueOf(severity) : "WARNING";

        writer.println("Validation rule " + name);
        writer.println("  Kind: " + kindStr);
        writer.println("  Severity: " + severityStr);
        if (!expression.isEmpty()) writer.println("  Expression: " + expression);
        writer.println();
    }

    private static void generateTextualForAutomationRule(PrintWriter writer, Object autoRule) {
        String name = safe(getFeatureValue(autoRule, "name"));
        String trigger = safe(getFeatureValue(autoRule, "trigger"));
        String condition = safe(getFeatureValue(autoRule, "condition"));
        String actionDesc = safe(getFeatureValue(autoRule, "actionDescription"));

        writer.println("Automation rule " + name);
        writer.println("  Trigger: " + trigger);
        if (!condition.isEmpty()) writer.println("  Condition: " + condition);
        if (!actionDesc.isEmpty()) writer.println("  Action: " + actionDesc);
        writer.println();
    }

    // ==================== HELPER METHODS ====================

    private static String safe(Object obj) {
        if (obj == null) return "";
        String str = String.valueOf(obj);
        return "null".equals(str) ? "" : str;
    }

    private static boolean ensureParentDirectory(String filePath) {
        java.nio.file.Path parent = java.nio.file.Paths.get(filePath).getParent();
        if (parent == null) {
            return true;
        }
        try {
            java.nio.file.Files.createDirectories(parent);
            return true;
        } catch (IOException e) {
            System.err.println("Error creating output directory: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    private static boolean toBoolean(Object value) {
        return value instanceof Boolean && (Boolean) value;
    }

    private static boolean isEClass(Object obj, String className) {
        if (obj == null) return false;
        Object eClass = invokeMethod(obj, "eClass");
        Object name = invokeMethod(eClass, "getName");
        return className.equals(String.valueOf(name));
    }

    @SuppressWarnings("unchecked")
    private static List<Object> getObjectList(Object owner, String featureName) {
        Object value = getFeatureValue(owner, featureName);
        if (value instanceof List<?>) {
            return (List<Object>) value;
        }
        return new java.util.ArrayList<>();
    }

    private static Object getFeatureValue(Object owner, String featureName) {
        Object eClass = invokeMethod(owner, "eClass");
        Object feature = invokeMethod(eClass, "getEStructuralFeature", featureName);
        if (feature == null) return null;
        return invokeMethod(owner, "eGet", feature);
    }

    private static Object invokeMethod(Object target, String methodName, Object... args) {
        if (target == null) return null;
        Method method = findCompatibleMethod(target.getClass(), methodName, args);
        if (method == null) return null;
        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    private static Method findCompatibleMethod(Class<?> type, String methodName, Object[] args) {
        for (Method method : type.getMethods()) {
            if (!method.getName().equals(methodName) || method.getParameterCount() != args.length) continue;
            Class<?>[] paramTypes = method.getParameterTypes();
            boolean compatible = true;
            for (int i = 0; i < paramTypes.length; i++) {
                if (!isCompatible(paramTypes[i], args[i])) {
                    compatible = false;
                    break;
                }
            }
            if (compatible) return method;
        }
        return null;
    }

    private static boolean isCompatible(Class<?> paramType, Object arg) {
        if (arg == null) return !paramType.isPrimitive();
        Class<?> expectedType = paramType.isPrimitive() ? toWrapper(paramType) : paramType;
        return expectedType.isAssignableFrom(arg.getClass());
    }

    private static Class<?> toWrapper(Class<?> primitiveType) {
        if (primitiveType == boolean.class) return Boolean.class;
        if (primitiveType == byte.class) return Byte.class;
        if (primitiveType == short.class) return Short.class;
        if (primitiveType == int.class) return Integer.class;
        if (primitiveType == long.class) return Long.class;
        if (primitiveType == float.class) return Float.class;
        if (primitiveType == double.class) return Double.class;
        if (primitiveType == char.class) return Character.class;
        return primitiveType;
    }
}




