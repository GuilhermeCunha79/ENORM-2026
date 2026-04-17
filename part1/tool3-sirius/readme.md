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
- `description/`: ODesign specification files defining visual representations
- `instance/`: Sample models and instances for testing visualizations
- `projections/`: Output diagrams and projections in various formats (PlantUML, textual)

## Installation
1. **Download Eclipse Modeling Tools**
   - (https://www.eclipse.org/downloads/packages/)
   - Select "Eclipse Modeling Tools" package
   - Choose correct version

2. **Install Eclipse**
   - Extract the downloaded archive to your desired location
   - Launch Eclipse IDE

3. **Verify Sirius Installation**
   - Go to `Help` -> `About Eclipse` -> Instal pluggins
   - Check if "Sirius" is listed in the installed features

4. **Create New Modeling Project**
    - Go to `File` -> `New` -> `Project...`
    - Select `Modeling` -> `Sirius Modeling Project`
    - Name the project
    - Finish the wizard to create the project structure
   
---

## Activity 4: Design Domain Metamodel
### Metamodel Implementation in Sirius
#### Metamodel Implementation Details
##### 1. Core Metamodel Definition (Ecore)
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

##### 2. Graphical Representation Layer (ODesign)
The ODesign specification (`description/enorm.odesign`) defines the visual representation of the metamodel:

**Diagram Specification:**
- **Node Representations**: Visual shapes for each metamodel class
  - ResourceTypes and UserTypes: Colored rectangles with icons
  - Rules and Policies: Specialized shapes based on type
  - Context elements: Bordered boxes with contextual information

**Edge Representations:**
- Relationships between elements shown as labeled arrows
- Different edge styles for different relationship types (composition, association, inheritance)

**Visual Customization:**
- Color coding by element type for easy identification
- Labels showing key attributes and relationships
- Custom layout algorithms for automatic diagram arrangement

**Validation Layer:**
- Visual indicators for validation errors and warnings
- Real-time constraint checking during model editing


#### Implementation Artifacts
**Location:** `project-enorm-25-26\part1\tool3-sirius`

**Key Files:**
- `model/enorm.ecore` - Metamodel definition
- `model/enorm.genmodel` - Generation configuration
- `src-gen/enorm/` - Generated metamodel code
- `2nd eclipse instance/enorm.design/description/enorm.odesign` - Graphical specification
- `instance/instance.enorm` - Example model instance

#### Testing and Validation
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

#### Constraint Implementation Strategy
##### 1. Sirius Validation Rules
Validation Rules in Sirius are defined in the ODesign specification (`enorm.odesign`) and provide real-time feedback on model validity.

**Key Validation Rules Implemented:**
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

##### 2. Quick Fixes Implementation
Quick Fixes are remediation actions presented to users when validation errors are detected.
Each validation rule can have associated Quick Fixes that automatically correct common issues.

**Implemented Quick Fixes:**
1. **Missing Name Quick Fix**
   - **Associated Constraint**: Resource Naming Constraint
   - **Trigger**: ResourceType without a valid name
   - **Action**: Generates default name (e.g., "Resource_1")
   - **Code**: 
     ```
     self.name = if self.name.isEmpty() then 'Resource_' + self.id else self.name endif
     ```

2. **Add Missing Action Quick Fix**
   - **Associated Constraint**: Rule Authority Constraint
   - **Trigger**: AuthorizationRule without action
   - **Action**: Adds default action (CREATE)
   - **Code**:
     ```
     self.action = ActionKind::CREATE
     ```

3. **Assign Default Scope Quick Fix**
   - **Associated Constraint**: Policy Scope Validation
   - **Trigger**: ModerationPolicy without scope
   - **Action**: Creates and assigns default content scope
   - **Code**:
     ```
     self.scope = new ResourceType { name = 'DefaultScope' }
     ```

4. **Add Error Handler Quick Fix**
   - **Associated Constraint**: Validation Rule Severity Consistency
   - **Trigger**: CRITICAL ValidationRule without error handling
   - **Action**: Adds default error handling strategy
   - **Code**:
     ```
     self.errorHandling = new ErrorRecoveryStrategy { mode = 'LOG_AND_CONTINUE' }
     ```

5. **Resolve Circular Dependency Quick Fix**
   - **Associated Constraint**: Circular Dependency Detection
   - **Trigger**: AutomationRule with self-reference
   - **Action**: Removes the circular trigger reference
   - **Code**:
     ```
     self.triggers = self.triggers->select(r | r <> self)
     ```

6. **Create Missing Context Reference Quick Fix**
   - **Associated Constraint**: Context Type Consistency
   - **Trigger**: ContextType not referenced by rules
   - **Action**: Associates context with applicable rules
   - **Code**:
     ```
     self.applicableRules->forEach(r | r.context->add(self))
     ```

##### 3. Visual Validation Feedback in ODesign
The ODesign specification includes visual indicators for validation errors:

**Error Indicator Customization:**
- **Error Markers**: Red underlines on elements with critical errors
- **Warning Markers**: Yellow underlines on elements with warnings
- **Tooltips**: Hover information showing validation messages
- **Problem Panels**: Eclipse Problems view displays all validation issues with navigation

##### 4. Constraint Definitions and Refactoring Logic
**Example Constraint: Resource Type Must Have At Least One User Type**

Formal Definition (OCL):
```ocl
context ResourceType
inv: self.userTypes->size() > 0
```

Refactoring Proposal:
- **Problem**: ResourceType with no associated UserType cannot be accessed by any user
- **Quick Fix**: Create default UserType (e.g., "Administrator") with full permissions
- **Implementation**: When Quick Fix is applied, creates UserType and associates it

**Example Constraint: Validation Rules Must Have Compatible Severity and Recovery**

Formal Definition:
```ocl
context ValidationRule
inv CriticalRulesNeedRecovery:
  self.severity = RuleSeverity::CRITICAL implies 
  self.errorHandling->size() > 0
```

Refactoring Proposal:
- **Problem**: CRITICAL rules without recovery could crash the system
- **Quick Fix**: Automatically adds default recovery strategy based on rule type
- **Implementation**: Inserts ErrorRecoveryStrategy with appropriate handling

**Example Constraint: Policy Coverage Check**

Formal Definition:
```ocl
context RefModel
inv: let allResourceTypes = self.resources in
     let allPolicies = self.policies->collect(p | p.applicableResources) in
     allResourceTypes->forAll(r | allPolicies->includes(r))
```

Refactoring Proposal:
- **Problem**: Resources without applicable policies may operate without regulation
- **Quick Fix**: Creates default policy covering uncovered resources
- **Implementation**: Generates ModerationPolicy for each uncovered ResourceType

##### 5. Runtime Validation Execution
**Validation Triggers:**
1. **On Model Save**: All validation rules executed before saving
2. **On User Action**: Real-time validation after element creation/modification
3. **Manual Trigger**: Via `Validate Model` menu option in Sirius editor
4. **Batch Validation**: On Eclipse workspace build

**Validation Reporting:**
- Results displayed in Eclipse Problems View
- Grouped by severity (Errors, Warnings, Info)
- Double-click navigates to problematic element in diagram
- Quick fixes accessible via context menu

##### 6. Integration with Sirius Graphical Editor
**Constraint Feedback in Diagram:**
- Elements with errors displayed with distinctive styling
- Error decorators (icons) on model elements
- Status bar shows validation summary
- Live update as user modifies model

**Quick Fix Workflow:**
1. Validation detects error
2. Light bulb icon appears on element
3. Right-click and select "Quick Fix" or "Fixes..."
4. List of applicable fixes displayed
5. Select fix and apply - model automatically corrected
6. Validation re-runs to confirm fix resolved issue

#### Implementation Artifacts
**Key Files:**
- `2nd eclipse instance/enorm.design/description/enorm.odesign` - Validation rules and quick fixes
- `instance/instance.enorm` - Test model for validation

**Constraints Count:**
- 8 primary validation rules
- 6 quick fix implementations
- 15+ OCL constraints embedded in ODesign

---

## Activity 6: Design Model Projections/Visualizations
Multiple visualization and projection layers have been implemented to provide domain experts with diverse views of the metamodel.
The implementation includes graphical diagrams generated via PlantUML, textual projections for documentation, 
and interactive Sirius diagram representations.

#### Visualization Architecture
##### External Java Action Call Integration
Sirius provides the "External Java Action Call" feature enabling Java code execution from diagrams.
Handler class implemented to generate the projections logic:
`part1/tool3-sirius/src/enorm/design/EnormProjectionGenerator.java`

**PlantUMLGenerator Class:**
- `generateStructureDiagram(RefModel, View)`: Creates class diagram
- `generateBehaviorDiagram(RefModel, View)`: Creates state diagram
- `generateScenarioDiagram(RefModel, String, View)`: Domain-specific diagrams

**TextualProjectionGenerator Class:**
- `generateProjection(RefModel)`: Generates full textual specification
- `formatResource(ResourceType)`: Formats resource sections
- `formatUser(UserType)`: Formats user type sections
- `formatRule(Rule)`: Formats rule sections
- `formatPolicy(Policy)`: Formats policy sections
- `formatContext(ContextType)`: Formats context sections

###### 1. Structure Diagram
**Location**: `projections/structure_diagram.puml`
**Purpose**: Visualizes the static structure and relationships of metamodel elements

**Key Elements:**
- Class definitions for ResourceType, UserType, Rule hierarchy, Policy hierarchy
- Attributes displayed in each class
- Relationships with proper cardinality notation
- Color-coding by element type (Resources, Rules, Policies)
- Inheritance hierarchies (extends relationships)

###### 2. Behavior Validation Diagram
**Location**: `projections/behavior_validation.puml`
**Purpose**: Shows how validation rules flow through model processing

**Key Elements:**
- States for each validation checkpoint
- Transitions based on validation outcomes
- Error detection and recovery branches
- Quick fix availability indicators
- Parallel validation workflows

###### 3. Textual Projection Implementation
**Location**: `projections/textual_projection.txt`
**Purpose**: Generate human-readable textual specification of models
**Format**: Custom DSL-like text representation with structured sections

**Example Sections:**
- **NORMATIVE SYSTEM Header**: System name, version, description
- **RESOURCES Section**: Resource types with attributes and relationships
- **USERS Section**: User types with kinds and permissions
- **RULES Section**: Validation, Authorization, and Automation rules with constraints
- **POLICIES Section**: Moderation, Feedback, Rating, and Verification policies
- **CONTEXT Section**: Temporal, spatial, and operational context types

**Content Mapping:**
- Each metamodel element gets its own entry
- Attributes listed with types
- Relationships indicated with references
- Rules display constraints and severity levels
- Policies show applicable resources and behavior

#### Usage Instructions
**Generating Projections:**
1. Open ENORM model file in Eclipse IDE
2. Go to `part1/tool3-sirius/src/enorm/design/Main.java`
3. Right click and select "Run As" -> "Java Application"
4. The three projections appear in `part1/tool3-sirius/projections` folder