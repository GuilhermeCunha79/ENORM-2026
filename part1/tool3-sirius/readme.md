# ENORM Project, Part 1, Tool 3 – Sirius

## Sirius Overview

**Sirius** is an open-source Eclipse-based modeling and visualization framework that enables the creation of custom
domain-specific graphical editors (DSLs). It provides a declarative and graphical approach to define visual
representations for metamodels without requiring extensive code development.

### Key Features
- **Graphical Editor Generation**: Automatically generates graphical editors from Ecore metamodels through declarative
specifications (`.odesign` files)
- **Model Visualization**: Provides diagram, table, and tree-based representations of models
- **Diagram Customization**: Supports custom shapes, colors, labels, and layout algorithms through ODesign specifications
- **Validation & Constraints**: Integrates metamodel constraints and custom validation rules
- **Representation Projections**: Multiple views of the same model through different diagram specifications
- **Model-Driven Development**: Facilitates model-driven design and domain-specific modeling

### Use in the Project
In the project, Sirius is utilized to:
- Define graphical representations of the metamodel
- Generate domain-specific diagrams for different scenarios (Amazon, Reddit, YouTube)
- Support visualization of metamodel evolution and constraints

### Project Structure
- `src/`: Java source code for diagram generators and utilities
- `model/`: Metamodel files (`enorm.ecore`, `enorm.genmodel`) and AIRD representation files
- `2nd eclipse instance/enorm.design/description/`: ODesign specification files defining visual representations
- `projections/`: Output diagrams and projections in various formats (PlantUML, textual)

## Installation
1. **Download Eclipse Modeling Tools**
   - (https://www.eclipse.org/downloads/)
   - Select "Eclipse Modeling Tools" package
   - Choose correct version

2. **Install Eclipse**
   - Extract the downloaded archive to your desired location
   - Launch Eclipse IDE

3. **Verify Sirius Installation**
   - Go to `Help` -> `About Eclipse` -> Install plugins
   - Check if "Sirius" is listed in the installed features

4. **Create New Modeling Project**
    - Go to `File` -> `New` -> `Project...`
    - Select `Modeling` -> `Sirius Modeling Project`
    - Name the project
    - Finish the wizard to create the project structure

---

## Activity 4: Design Domain Metamodel
### Metamodel Implementation Details
#### 1. Core Metamodel Definition (Ecore)
The metamodel is defined in `model/enorm.ecore` and consists of the following key elements:

**Main Classes:**
- **RefModel**: Root element representing the entire normative system
- **ResourceType**: Defines types of resources (e.g., Users, Content, Policies)
- **UserType**: Categorizes users (e.g., Admin, Moderator, Regular User)
- **ContextType**: Defines contextual information for rules and policies
- **Attribute**: Properties associated with resources and entities

**Rule and Policy Classes:**
- **ValidationRule**: Enforces data and business logic validation
- **AuthorizationRule**: Controls access and permissions
- **AutomationRule**: Defines automated actions and workflows
- **ModerationPolicy**: Policies for content moderation decisions
- **FeedbackPolicy**: Feedback mechanisms and communication strategies
- **RatingPolicy**: Rating and scoring systems
- **VerificationPolicy**: Verification procedures and protocols

**Supporting Enumerations:**
- **UserKind**: USER, ADMIN, MODERATOR, SYSTEM
- **ActionKind**: CREATE, READ, UPDATE, DELETE, EXECUTE
- **RuleSeverity**: CRITICAL, HIGH, MEDIUM, LOW
- **ModerationMode**: AUTOMATIC, MANUAL, HYBRID
- **ValidationKind**: SYNTACTIC, SEMANTIC, CONSTRAINT
- **FeedbackKind**: NOTIFICATION, ALERT, REPORT
- **ContextKind**: TEMPORAL, SPATIAL, OPERATIONAL

#### 2. Graphical Representation Layer (ODesign)
The ODesign specification (`description/enorm.odesign`) defines the visual representation of the metamodel:

**Diagram Specification:**
- **Node Representations**: Visual shapes for each metamodel class
  - ResourceTypes and UserTypes: Colored rectangles with icons
  - Rules and Policies: Specialized shapes based on type
  - Context elements: Bordered boxes with contextual information
  - Attributes: Smaller rectangles showing property details

**Edge Representations:**
- Relationships between elements shown as labeled arrows
- Different edge styles for different relationship types (composition, association, inheritance)

**Visual Customization:**
- Color coding by element type for easy identification
- Labels showing key attributes and relationships
- Custom layout algorithms for automatic diagram arrangement

**Validation Layer:**
- Visual indicators for validation errors and warnings

### Implementation Artifacts
**Location:** `project-enorm-25-26\part1\tool3-sirius`

**Key Files:**
- `model/enorm.ecore` - Metamodel definition
- `model/enorm.genmodel` - Generation configuration
- `src-gen/enorm/` - Generated metamodel code
- `2nd eclipse instance/enorm.design/description/enorm.odesign` - Graphical specification (only located here for work submission purposes)
- `instance/instance.enorm` - Example model instance

### Metamodel Validation
The metamodel implementation has been validated through:
1. **Ecore Validation**: Checking metamodel consistency and well-formedness
2. **Code Generation**: Verifying generated code compiles without errors
3. **Graphical Representation**: Testing ODesign specifications with sample instances

---

## Activity 5: Design Metamodel Constraints and Transformations
### Implementation of Constraints and Refactorings in Sirius
The metamodel constraints and refactoring strategies have been implemented in Sirius using Validation Rules and Quick Fixes.
These mechanisms enable real-time validation of models during editing.
The implementation ensures data consistency and enforces domain-specific business rules across the normative system models.

### 5.1 Constraint Design and Analysis
Based on the domain knowledge from the three scenarios (Amazon, Reddit, YouTube) and the metamodel design, several
key constraints were identified to ensure model validity and consistency:

#### 5.1.1 Resource Evaluation Constraints
- Every ResourceType must have a clear definition and purpose
- Resources must be associated with at least one UserType that can access them
- Feedback mechanisms must be defined for any evaluable resource
- Rating scales (when used) must be properly bounded and defined

#### 5.1.2 Authorization and Access Control Constraints
- Authorization rules must define both subjects and actions
- Circular permission dependencies must be detected and prevented
- User types cannot grant permissions they don't have
- At least one user type must have admin privileges

#### 5.1.3 Policy and Rule Constraints
- Moderation policies must have a clear scope (what content they apply to)
- Verification policies must define the verification method (automatic, manual, or hybrid)
- Automation rules cannot trigger themselves (preventing infinite loops)
- Critical validation rules must have associated error handling strategies

#### 5.1.4 Behavioral Consistency Constraints
- Context types must be actually used by applicable rules
- Feedback definitions must be complete (type, recipient, and content specified)
- Validation rule severity must be consistent with recovery mechanisms
- Policies applicable to a resource must not conflict with each other

### 5.2 Constraint Implementation in Sirius
#### 5.2.1 Sirius Validation Rules
Validation Rules in Sirius are defined in the ODesign specification (`enorm.odesign`) and provide real-time feedback
on model validity.

**Implemented Validation Rules:**
1. **Resource Naming Constraint**
   - **Target**: ResourceType
   - **Level**: ERROR
   - **Audit Expression**: `self.name.size() > 0 and self.name.matches('[A-Za-z_][A-Za-z0-9_]*')`
   - **Message**: "Resource name must start with letter or underscore and contain only alphanumeric characters"
   - **Purpose**: Ensures valid identifiers for resource types

2. **Rule Authority Constraint**
   - **Target**: AuthorizationRule
   - **Level**: CRITICAL
   - **Audit Expression**: `self.subject.notEmpty() and self.action.notEmpty()`
   - **Message**: "Authorization rule must have both subject and action defined"
   - **Purpose**: Prevents incomplete authorization specifications

3. **Policy Scope Validation**
   - **Target**: ModerationPolicy
   - **Level**: ERROR
   - **Audit Expression**: `self.scope.notEmpty()`
   - **Message**: "Moderation policy must define a scope (what content it applies to)"
   - **Purpose**: Ensures moderation policies have clear applicability

4. **Circular Dependency Detection**
   - **Target**: AutomationRule
   - **Level**: ERROR
   - **Audit Expression**: `not self.triggers->includes(self)`
   - **Message**: "Automation rule cannot trigger itself (circular dependency)"
   - **Purpose**: Prevents infinite loops in automation workflows

5. **Validation Rule Severity Consistency**
   - **Target**: ValidationRule
   - **Level**: WARNING
   - **Audit Expression**: `self.severity <> RuleSeverity::CRITICAL or self.errorHandling.notEmpty()`
   - **Message**: "CRITICAL validation rules should have associated error handling"
   - **Purpose**: Ensures critical issues have recovery mechanisms

6. **User Type Permission Alignment**
   - **Target**: UserType
   - **Level**: WARNING
   - **Audit Expression**: `self.permissions->forAll(p | p.target.notEmpty())`
   - **Message**: "User permission should target specific resources or actions"
   - **Purpose**: Prevents overly permissive or vague user definitions

7. **Context Type Consistency**
   - **Target**: ContextType
   - **Level**: ERROR
   - **Audit Expression**: `self.contextKind.notEmpty() and self.applicableRules->forAll(r | r.context->includes(self))`
   - **Message**: "Context type must be referenced by applicable rules"
   - **Purpose**: Ensures context types are actually used in the model

8. **Feedback Definition Completeness**
   - **Target**: FeedbackDefinition
   - **Level**: ERROR
   - **Audit Expression**: `self.feedbackType.notEmpty() and self.recipient.notEmpty() and self.content.notEmpty()`
   - **Message**: "Feedback definition must have type, recipient, and content specified"
   - **Purpose**: Ensures complete feedback specifications

### 5.3 Refactoring Strategies
#### 5.3.1 Quick Fixes Implementation
**Quick Fix 1: Missing Name Auto-Generation**
- **Associated Constraint**: Resource Naming Constraint
- **Trigger**: ResourceType without a valid name
- **Action**: Generates a default name (e.g., "Resource_1")
- **Refactoring Logic**: Assigns a generated unique identifier
- **Undo Support**: Changeable by user to any valid name

**Quick Fix 2: Add Missing Action to Authorization**
- **Associated Constraint**: Rule Authority Constraint
- **Trigger**: AuthorizationRule without action
- **Action**: Adds default action (CREATE)
- **Refactoring Logic**: Sets a sensible default that can be modified
- **Rationale**: CREATE is the most basic operation; user can modify if needed

**Quick Fix 3: Assign Default Scope to Policy**
- **Associated Constraint**: Policy Scope Validation
- **Trigger**: ModerationPolicy without scope
- **Action**: Creates and assigns a default scope resource
- **Refactoring Logic**: Creates a new ResourceType as policy scope
- **User Guidance**: Policy remains inactive until scope is properly configured

**Quick Fix 4: Add Error Handler to Critical Rules**
- **Associated Constraint**: Validation Rule Severity Consistency
- **Trigger**: CRITICAL ValidationRule without error handling
- **Action**: Adds default error handling strategy (LOG_AND_CONTINUE)
- **Refactoring Logic**: Creates ErrorRecoveryStrategy element
- **Safety**: Prevents system crashes from unhandled critical errors

**Quick Fix 5: Resolve Circular Dependencies**
- **Associated Constraint**: Circular Dependency Detection
- **Trigger**: AutomationRule with self-reference
- **Action**: Removes the circular trigger reference
- **Refactoring Logic**: Filters out self-references from triggers collection
- **Impact**: Ensures automation workflows terminate properly

**Quick Fix 6: Create Missing Context References**
- **Associated Constraint**: Context Type Consistency
- **Trigger**: ContextType not referenced by rules
- **Action**: Associates context with applicable rules
- **Refactoring Logic**: Links context type to all rules that require it
- **Validation**: Re-runs to ensure all contexts are properly used

##### 5.4 Example Constraint
#### 5.4.1 Example Constraint: Resource Accessibility
Every resource type must be accessible by at least one user type.

**Refactoring Proposal**:
- **Problem**: ResourceType with no associated UserType cannot be accessed by any user
- **Quick Fix**: Create default UserType (e.g., "Administrator") with full permissions
- **Implementation**: When Quick Fix is applied:
  1. Creates new UserType named "Administrator"
  2. Sets permissions to include all resources
  3. Adds this user type to applicable users for the resource

#### 5.4.2 Example Constraint: Critical Rule Recovery
Critical validation rules must have associated error handling.

**Refactoring Proposal**:
- **Problem**: CRITICAL rules without recovery could crash the system
- **Quick Fix**: Automatically adds default recovery strategy
- **Implementation**: When Quick Fix is applied:
  1. Creates ErrorRecoveryStrategy object
  2. Sets mode to "LOG_AND_CONTINUE" (safe default)
  3. Attaches to CRITICAL rule

#### 5.4.3 Example Constraint: Complete Feedback Specification
Feedback types must have all required attributes specified.

**Refactoring Proposal**:
- **Problem**: Incomplete feedback specifications lead to undefined behavior
- **Quick Fix**: Auto-populate missing fields with sensible defaults
- **Implementation**: When Quick Fix is applied:
  1. Sets feedback type to NOTIFICATION if missing
  2. Assigns default recipient (SystemAdministrator)
  3. Creates default escalation path chain

### 5.5 Runtime Validation Execution
#### 5.5.1 Validation Triggers
- **On Model Save**: All validation rules executed before saving
- **On User Action**: Real-time validation after element creation/modification
- **Manual Trigger**: Via `Validate Model` menu option in Sirius editor
- **Batch Validation**: On Eclipse workspace build

#### 5.5.2 Validation Reporting
- Results displayed in Eclipse Problems View
- Grouped by severity (Errors, Warnings, Info)
- Double-click navigates to problematic element in diagram
- Quick fixes accessible via context menu (Right-click → Quick Fix)

#### 5.5.3 Integration with Sirius Graphical Editor
**Constraint Feedback in Diagram:**
- Elements with errors displayed with distinctive styling (red background)
- Error decorators (red X icons) on model elements
- Status bar shows validation summary
- Live update as user modifies model

### 5.6 Summary
**Location**: `2nd eclipse instance/enorm.design/description/enorm.odesign`

**Constraint Statistics:**
- 8 primary validation rules
- 6 quick fix implementations
- Multiple OCL constraints embedded in ODesign specifications

---

## Activity 6: Design Model Projections/Visualizations
Design and implement textual and graphical visualizations/projections for models.

### 6.1 Visualization Design Strategy
The visualization strategy implements two complementary projection types:
1. **Graphical Projections**: PlantUML-based diagrams showing structural and behavioral aspects
2. **Textual Projections**: Human-readable DSL-like specifications of models

### 6.2 Graphical Visualization Architecture
#### 6.2.1 Multiple Visualization Layers
Three types of graphical projections are generated for each model:

##### 6.2.1.1 Structure Diagram (Class Diagram)
**Files**: `part1/tool3-sirius/projections/structure_diagram_*.puml` (Base + three scenarios)

**Purpose**: Visualizes the static structure and relationships of metamodel elements

**Key Elements:**
- Class definitions for ResourceType, UserType, Rule hierarchy, Policy hierarchy
- Attributes displayed in each class with types
- Relationships with proper cardinality notation
- Color-coding by element type for visual clarity
- Inheritance hierarchies showing extends relationships
- Composition relationships distinguished from associations

**Represents:**
- All classes and their attributes
- All relationships and their multiplicities
- Type hierarchies and inheritance chains
- Association endpoints and directions

**Use Case**: Understanding the complete metamodel structure and element relationships

##### 6.2.1.2 Behavior/Validation Diagram (State Diagram)
**Files**: `part1/tool3-sirius/projections/behavior_validation_*.puml` (Base + three scenarios)

**Purpose**: Shows how validation rules and constraints flow through model processing

**Key Elements:**
- States for each validation checkpoint
- Transitions based on validation outcomes
- Error detection and recovery branches
- Quick fix availability indicators
- Parallel validation workflows
- Entry/exit points for validation sequences

**Represents:**
- Validation process flow
- Constraint checking sequence
- Error handling paths
- Recovery mechanisms
- State transitions during editing

**Use Case**: Understanding how models are validated and corrected

##### 6.2.1.3 Scenario-Specific Diagrams
**Generated for each scenario**: YouTube, Amazon, Reddit, RefModel

**Purpose**: Each scenario-specific diagram shows concrete examples:
- Actual instances of resources, users, and rules for that domain
- Specific policies and validations relevant to that scenario
- Domain-specific relationships and constraints

**Represents:**
- YouTube: Video resources, comment threads, rating systems, moderation rules
- Amazon: Product resources, buyer/seller roles, review verification, rating scales
- Reddit: Posts/discussions, upvote/downvote mechanisms, automations, community rules

### 6.3 Textual Visualization Architecture
#### 6.3.1 Textual Projection Format
**Files**: `part1/tool3-sirius/projections/textual_projection_*.txt` (Base + three scenarios)

**Purpose**: Generate readable textual specification of models

**Format**: Structured DSL-like text representation designed for documentation and domain expert review

#### 6.3.2 Textual Projection Structure
**Normalized Sections:**
1. **HEADER Section**
   - System name and version
   - Creation date and author
   - Brief description
   - Purpose and scope

2. **RESOURCE TYPES Section**
   - Each resource type listed with:
     - Name and description
     - All attributes with types
     - Access permissions by user type
     - Associated feedback mechanisms

3. **USER TYPES Section**
   - Each user type listed with:
     - Kind (USER, ADMIN, MODERATOR, SYSTEM)
     - Permissions and actions allowed
     - Associated resources they can interact with

4. **RULES Section**
   - Validation Rules:
     - Name, severity, and description
     - Conditions and constraints
     - Error handling strategy
   - Authorization Rules:
     - Subject, action, target resource
     - Conditions and exceptions
   - Automation Rules:
     - Trigger conditions
     - Actions and side effects
     - Dependencies and sequences

5. **POLICIES Section**
   - Moderation Policies:
     - Scope and applicability
     - Moderation mode (automatic/manual/hybrid)
     - Escalation procedures
   - Feedback Policies:
     - Feedback types supported
     - Recipient designation
     - Distribution mechanisms
   - Rating Policies:
     - Scale and bounds
     - Calculation methods
     - Display rules
   - Verification Policies:
     - Verification method
     - Success/failure criteria
     - Escalation on failure

6. **CONTEXT Section**
   - Temporal contexts (time-based constraints)
   - Spatial contexts (location-based constraints)
   - Operational contexts (state-based constraints)

### 6.4 Projection Generation Implementation
#### 6.4.1 External Java Action Call Integration
Sirius provides the "External Java Action Call" feature enabling Java code execution from diagrams.
The handler class implemented to generate the projections logic is located at:
`part1/tool3-sirius/src/enorm/design/EnormProjectionGenerator.java`

#### 6.4.2 Projection Generation Methods
The `EnormProjectionGenerator` class provides three main static methods for generating projections:

**1. generateStructureDiagram()**
- **Purpose**: Generates a PlantUML class diagram showing the static structure of the ENORM model
- **Input**: Reads from hardcoded XMI file path (e.g. `model.xmi`)
- **Output**: `structure_diagram_model.puml`
- **Process**:
  - Loads the model from XMI format using EMF ResourceSet
  - Iterates through all ResourceTypes and generates UML class representations with attributes
  - Creates UserType stereotyped classes with kind information
  - Generates FeedbackType and FeedbackDefinition classes
  - Creates relationships between elements (resource relations, feedback associations)
  - Outputs PlantUML syntax with proper cardinality notation and color-coding

**2. generateBehaviorDiagrams()**
- **Purpose**: Generates PlantUML state/flow diagrams showing validation processes and decision flows
- **Input**: Reads from hardcoded XMI file path (`model.xmi`)
- **Output**: `behavior_validation_model.puml`
- **Process**:
  - Creates a state diagram showing validation process flow with states: Collect Input → Run Validation Rules → Accept/Reject
  - Iterates through all ValidationRules and adds each as explicit state nodes
  - Generates decision diamonds for yes/no branches
  - Creates state transitions with appropriate labels
  - Includes legends with rule metadata (name, severity)
  - Supports both automatic and manual validation workflows

**3. generateTextualProjection()**
- **Purpose**: Generates human-readable textual specification of the model in DSL-like format
- **Input**: Reads from hardcoded XMI file path (`model.xmi`)
- **Output**: `textual_projection_model.txt`
- **Process**:
  - Generates header with model name, version, and creation metadata
  - Sections for USER TYPES, RESOURCE TYPES, CONTEXT TYPES, FEEDBACK SYSTEM
  - Detailed listing of AUTHORIZATION RULES, MODERATION POLICIES, VALIDATION RULES, AUTOMATION RULES
  - Each element includes relevant attributes, constraints, and descriptions
  - Format is structured for easy parsing and domain expert review

**Model Loading and Reflection**
- The class uses EMF (Eclipse Modeling Framework) to load XMI models
- Employs Java reflection (`invokeMethod`, `getFeatureValue`) to access model properties dynamically
- Uses IdentityHashMap to track aliases for cross-references between model elements
- Handles null values and type conversions safely with `safe()` and `toBoolean()` helper methods

#### 6.4.3 Projection Outputs

1. In Eclipse IDE, open the `part1/tool3-sirius/src/enorm/design` folder
2. Locate and select the projection generator class `Main.java`
3. Right-click and select "Run As" → "Java Application"
4. Projections are generated in `part1/tool3-sirius/projections/` folder

**Generated Output Files**

For each scenario, three files are generated:
1. **Structure Diagrams** (`.puml` files)
   - Show complete metamodel structure as UML class diagrams
   - Include all classes with attributes and types
   - Display relationships with cardinality notation
   - Filename: `structure_diagram_{Scenario}.puml`

2. **Behavior/Validation Diagrams** (`.puml` files)
   - Show validation and process flows as state diagrams
   - Include decision points and state transitions
   - Display validation rules as separate state nodes
   - Filename: `behavior_validation_{Scenario}.puml`

3. **Textual Projections** (`.txt` files)
   - Provide readable specifications in structured text format
   - Organized into logical sections (Resources, Users, Rules, Policies)
   - Include element attributes, constraints, and relationships
   - Designed for documentation and domain expert validation
   - Filename: `textual_projection_{Scenario}.txt`

### 6.5 Summary
**Projection Files:**

For Reference Model:
- `projections/structure_diagram_RefModel.puml`
- `projections/behavior_validation_RefModel.puml`
- `projections/textual_projection_RefModel.txt`

For YouTube Scenario:
- `projections/structure_diagram_YouTube.puml`
- `projections/behavior_validation_YouTube.puml`
- `projections/textual_projection_YouTube.txt`

For Amazon Scenario:
- `projections/structure_diagram_Amazon.puml`
- `projections/behavior_validation_Amazon.puml`
- `projections/textual_projection_Amazon.txt`

For Reddit Scenario:
- `projections/structure_diagram_Reddit.puml`
- `projections/behavior_validation_Reddit.puml`
- `projections/textual_projection_Reddit.txt`

---

## Activity 7: Application Engineering
Demonstrate the applicability of the designed metamodel and tools by creating concrete instances for the three
reference scenarios: YouTube, Amazon, and Reddit.

### Model creation
For each scenario a .xmi model was created accordingly, with constraint validation.
These models can be found in `part1/tool3-sirius/model`, with the following naming convention:
- `YouTube.xmi`
- `Amazon.xmi`
- `Reddit.xmi`

### Generated Visualizations and Projections for All Models
After their creation, and validation/refactoring, projections were generated for each scenario model in all required
formats, as specified in `Chapter 6.` The location of the generated files can be found in `6.6 Summary`.