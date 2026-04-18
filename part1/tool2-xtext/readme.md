# ENORM Project, Part 1, Tool 2 – Xtext

## Description of the Tool

[Xtext](https://eclipse.dev/Xtext/index.html) is a framework integrated in the Eclipse IDE for developing domain-specific languages (DSLs). A DSL is a language tailored to a specific problem domain, offering domain experts a more intuitive and concise way of expressing solutions than general-purpose languages.

At a high level, Xtext provides:

- **Declarative grammar definition**: The syntax of a DSL is defined using a high-level grammar language. From this grammar, Xtext can infer the abstract syntax (EMF-based metamodel) and many supporting artifacts.
- **Automatic generation of tooling**: Given a grammar, Xtext generates a parser and an Eclipse-based editor with syntax highlighting, code completion, error markers and basic navigation.
- **Integration with EMF and Java**: Xtext is built on top of the Eclipse Modeling Framework (EMF) and integrates seamlessly with Java code. This allows extending the DSL with custom validation, code generation and other logic implemented in Java or Xtend.
- **Validation and quick fixes**: Xtext supports the definition of validation rules over models and corresponding quick fixes/refactorings that can automatically correct common modelling errors.
- **Code generation**: Using Xtend or Java, Xtext can transform DSL models into target artifacts (e.g. source code, configuration files, PlantUML diagrams), supporting model-driven development approaches.

In this ENORM project, Xtext will be used to build the textual tooling for the REF DSL (Resource Evaluation and Feedback), providing subject matter experts with an editor to specify applications in the domain of resource evaluation and feedback.

## How to Setup and Install

### Prerequisites

- Java Development Kit (JDK) installed  
- Eclipse IDE installed (preferably *Eclipse IDE for Java and DSL Developers*)

### Installing Xtext via update site

1. Download and install Eclipse using the official [installer](https://www.eclipse.org/downloads/packages/installer).
2. Start the Eclipse IDE.
3. Open the Xtext [download page](https://eclipse.dev/Xtext/download.html), right-click the `Releases` button and copy the update-site URL.
4. In Eclipse, go to `Help` → `Install New Software…`.
5. Click `Add…`, give a name to the update site (optional), paste the copied URL in the `Location` field and press `OK`.
6. In the `Work with` dropdown, select the Xtext update site you just added.
7. Select the `Xtext` feature and follow the wizard to complete the installation (restart Eclipse when requested).

### Installing Xtext via Eclipse Marketplace (alternative)

1. In Eclipse, go to `Help` → `Eclipse Marketplace…`.
2. In the search box, type `Xtext` and press Enter.
3. Locate `Eclipse Xtext x.xx.x` (latest version) and click `Install`.
4. Follow the installation wizard and restart Eclipse when requested.

### Creating and configuring a Xtext project

1. In Eclipse, select `File` → `New` → `Other…`.
2. Choose `Xtext` → `Xtext Project` or `Xtext Project from Existing Ecore Models` and click `Next`.
3. If using an existing Ecore metamodel, select the corresponding `EPackage` (use the `Add…` button if it is not listed).
4. Define the language name and file extension for the DSL (for example, `refdsl`).
5. Finish the wizard to generate the Xtext infrastructure.
6. Open the generated `.xtext` grammar file and adapt it to the metamodel and requirements of the REF DSL.

The following sections will be completed in later activities of P1.

## Activity 3 – Domain Knowledge (Amazon Scenario)

For Activity 3, the chosen application scenario is **Amazon**, focusing on the way the platform handles product evaluation and user feedback.

### Domain description

In this scenario, the main goal is to model how users evaluate products they buy and how these evaluations are managed:

- **Resources**: the primary resource is the **Product**, which can be evaluated and commented on by users.
- **Users and roles**:
  - A generic **User** represents anyone registered in the system.
  - A **Buyer** is a user who has purchased products and can create reviews that can be marked as "verified purchase".
  - A **Seller** is a user (or organization) that offers products for sale.
- **Feedback/Evaluations**:
  - A **ProductReview** represents a user’s evaluation of a product.
  - Each review contains a **rating** based on a five-star scale (1 to 5) and a **text** comment.
  - Reviews may include **media attachments** (photos and/or videos) that illustrate the user experience.
- **Verification and moderation**:
  - A **VerificationProcess** checks if a review is a **verified purchase** (i.e., the buyer actually bought the product).
  - Verification can be **automatic** (system rules) or **manual** (performed by moderators/support staff).
  - The system can flag suspicious or low-quality reviews for additional verification.

This domain focuses on the structural elements (products, users, reviews, attachments, verification) and on the basic behaviours related to creating, verifying and managing product evaluations.

### Domain model (PlantUML)

The domain model for the Amazon scenario is given as a **PlantUML class diagram**:

- **File:** `../../diagrams/amazon-domain-model.puml`

It includes:

- **User** (attributes: `id`, `name`, `email`) and subtypes **Buyer** and **Seller**.
- **Product** (id, name, description), linked to Seller; **Order** (id, date) and **OrderItem** (quantity), linking Buyer to Product.
- **ProductReview** (id, rating 1–5, text, creationDate, verifiedPurchase), with author (User), product (Product), and optional **MediaAttachment** (id, type, url) and **VerificationProcess** (id, type, status, timestamp, optional moderator User).

Relationships and cardinalities in the diagram match the structural view required for Activity 3. Notes in the diagram reference the domain rules R1–R6 (see below). This model can later be generalized and merged with the models for YouTube and Reddit to obtain the global REF metamodel.

*To view the diagram: open the `.puml` file in a PlantUML editor (e.g. VS Code with PlantUML extension, or [PlantUML online](https://www.plantuml.com/plantuml/uml)).*

### Example of domain rules and invariants

Some important rules for the Amazon scenario are:

- **R1 – Rating range**: the `rating` of a `ProductReview` must be an integer between 1 and 5.
- **R2 – Verified purchase consistency**: if a review is marked as `verifiedPurchase = true`, there must exist at least one `OrderItem` where the same `Buyer` bought the corresponding `Product` before the review’s `creationDate`.
- **R3 – Single verification per review**: a `ProductReview` can have at most one associated `VerificationProcess`.
- **R4 – Mandatory verification attributes**: when a `VerificationProcess` exists, its `type`, `status` and `timestamp` must be defined.
- **R5 – Manual verification moderator**: if the `VerificationProcess.type` is MANUAL, then a `moderator` user must be associated with the verification.
- **R6 – Non-empty review text**: the text of a `ProductReview` should not be empty and should have at least a minimal length (e.g. 10 characters) to be considered valid feedback.

These rules will be refined and, when appropriate, implemented later as **constraints** and **refactorings** (validation rules and quick fixes) in the Xtext-based tooling for the REF DSL.

## Implementation of the Metamodel

For the implementation of the metamodel in the Xtext/EMF ecosystem, the team metamodel described in the **Part 1 team report** (section *Design of the Metamodel*) was taken as reference. The core idea is to have a single root element (`RefModel`) that aggregates user types, resource types, feedback types/definitions and automation/validation rules, so that the same structure can represent the three scenarios (YouTube, Amazon, Reddit).

### Ecore metamodel (EMF)

In Eclipse, the metamodel should be implemented as an **Ecore model** with at least the following main EClasses and relationships:

- **RefModel**
  - `name : EString`
  - `userTypes : UserType [*]` (containment)
  - `resourceTypes : ResourceType [*]` (containment)
  - `feedbackTypes : FeedbackType [*]` (containment)
  - `feedbackDefinitions : FeedbackDefinition [*]` (containment)
  - `automationRules : AutomationRule [*]` (containment)

- **UserType**
  - `name : EString`
  - `superTypes : UserType [*]` (non-containment reference, to model role hierarchies)

- **ResourceType**
  - `name : EString`
  - `attributes : Attribute [*]` (containment)
  - `authorizationRules : AuthorizationRule [*]` (containment)

- **Attribute**
  - `name : EString`
  - `type : PrimitiveType` (EEnum)

- **PrimitiveType (EEnum)**
  - `TEXT`, `NUMBER`, `BOOLEAN`, `DATE`, `IMAGE`, `VIDEO`

- **FeedbackType**
  - `name : EString`
  - `hasRating : EBoolean`
  - `recursive : EBoolean`
  - `attributes : Attribute [*]` (containment, for additional fields like `text`, etc.)

- **FeedbackDefinition**
  - `name : EString`
  - `type : FeedbackType [1]` (reference)
  - `subject : ResourceType [1]` (reference)
  - `writers : UserType [*]` (reference – who can create this feedback)
  - `validationRules : ValidationRule [*]` (containment)

- **ValidationRule**
  - `name : EString`
  - `kind : ValidationKind` (EEnum)
  - `implementationId : EString` (identifier/name used later by validators or generators)

- **ValidationKind (EEnum)**
  - `AUTOMATIC`, `MANUAL`

- **AuthorizationRule**
  - `allowedAction : ActionKind` (EEnum)
  - `role : UserType [1]` (reference)

- **ActionKind (EEnum)**
  - `READ`, `WRITE`, `CREATE`, `UPDATE`, `DELETE`, `MODERATE`, `REPORT`, `VALIDATE`

- **AutomationRule**
  - `name : EString`
  - `trigger : EString`
  - `condition : EString`
  - `actionDescription : EString`
  - `usedValidationRules : ValidationRule [*]` (reference)

This Ecore metamodel is aligned with the PlantUML diagram in `diagrams/ref-metamodel.puml` and with the textual projection example from the assignment (USER TYPES, RESOURCE TYPE, FEEDBACK TYPE, FEEDBACK, VALIDATION, etc.). It is expressive enough to cover the Amazon case modelled in Activity 3 and to be extended for YouTube and Reddit.

### Steps followed in Eclipse (EMF)

In Eclipse, the implementation of this metamodel followed the usual EMF workflow:

1. Creation of an **EMF project** (e.g. `pt.isep.enorm.ref`) using the *Ecore Model* wizard.
2. Definition of the `RefModel` EClass as the root of the model and creation of the remaining EClasses, EEnums and references as listed above.
3. Setting the `containment` flag on references that represent composition (e.g. from `RefModel` to `UserType`, `ResourceType`, etc.).
4. Generation of the EMF model and edit code from the `.ecore` file to obtain the basic EMF editor.
5. Validation of the metamodel by manually creating simple instances in the EMF tree editor, representing simplified versions of the Amazon, YouTube and Reddit scenarios.

In the next activities (P1, Activities 5 and 6), this Ecore metamodel will be reused as the base for the Xtext DSL (using the "Xtext Project from Existing Ecore Models" wizard) and for implementing constraints, quick fixes and visualizations.

## Implementation of Constraints and Refactorings

The constraints and refactorings designed in the team report (section *Constraints and Refactorings*) are implemented in Xtext using **Validation Rules** and **Quick Fixes**, following the same approach as in the ETL example project.

### Validation Rules (Validator)

Xtext generates an abstract validator; the concrete validator extends it and defines custom checks with `@Check`. Each check can report `error` or `warning` on a specific EStructuralFeature, and uses a **constant issue code** (e.g. `INVALID_REF_MODEL_NAME`) so that the Quick Fix provider can attach a fix to that issue.

- **Location**: In the Xtext DSL project (e.g. `pt.isep.enorm.refdsl`), the validator is in the package `validation`, class `RefDslValidator` (or the name given by the Xtext wizard when generating from Ecore).
- **Pattern**: For each constraint that is not already guaranteed by the grammar/metamodel, add a method annotated with `@Check` that receives the EClass instance (e.g. `RefModel`, `UserType`), checks the condition, and calls `error(...)` or `warning(...)` with the feature and the issue code.

Example (conceptual; exact literals depend on your Ecore package name):

```java
public static final String INVALID_REF_MODEL_NAME = "invalidRefModelName";
public static final String INVALID_REF_MODEL_NAME_LENGTH = "invalidRefModelNameLength";

@Check
public void checkRefModelNameStartsWithCapital(RefModel model) {
    if (model.getName() != null && !model.getName().isEmpty()
            && !Character.isUpperCase(model.getName().charAt(0))) {
        warning("RefModel name should start with a capital letter.",
                RefPackage.Literals.REF_MODEL__NAME,
                INVALID_REF_MODEL_NAME);
    }
}

@Check
public void checkRefModelNameLength(RefModel model) {
    if (model.getName() != null && model.getName().length() <= 2) {
        error("RefModel name must have more than 2 characters.",
                RefPackage.Literals.REF_MODEL__NAME,
                INVALID_REF_MODEL_NAME_LENGTH);
    }
}
```

Similar methods are added for **UserType** (name uniqueness, capital letter, no self in superTypes), **ResourceType** (name uniqueness, length, capital), **Attribute** (name uniqueness within container), **FeedbackType**, **FeedbackDefinition**, **ValidationRule** (implementationId length), and **AutomationRule** (name present and capital), using the issue codes defined as constants in the validator.

### Quick Fixes (QuickfixProvider)

The Quick Fix provider lives in the **UI project** (e.g. `pt.isep.enorm.refdsl.ui`), in the package `quickfix`, class `RefDslQuickfixProvider`. It extends `DefaultQuickfixProvider` and defines one method per fix, annotated with `@Fix(Validator.ISSUE_CODE)`.

- **Pattern**: `acceptor.accept(issue, "Label", "Description", "icon.png", new ISemanticModification() { ... })`. In `apply(EObject element, IModificationContext context)`, cast `element` to the concrete EClass and modify it (e.g. set the name to the capitalized string, or add a default child).

Example for capitalizing the RefModel name:

```java
@Fix(RefDslValidator.INVALID_REF_MODEL_NAME)
public void fixRefModelNameCapitalization(final Issue issue, IssueResolutionAcceptor acceptor) {
    acceptor.accept(issue,
        "Capitalize the RefModel name",
        "Set the first letter of the RefModel name to uppercase.",
        "upcase.png",
        new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                if (element instanceof RefModel) {
                    RefModel model = (RefModel) element;
                    String name = model.getName();
                    if (name != null && !name.isEmpty()) {
                        model.setName(name.substring(0, 1).toUpperCase() + name.substring(1));
                    }
                }
            }
        });
}
```

Other refactorings implemented in the same way include: capitalizing **UserType**, **ResourceType**, **FeedbackType** and **AutomationRule** names; adding a default writer to **FeedbackDefinition** when writers is empty; and padding **ValidationRule.implementationId** when too short. Constraints that cannot be fixed automatically (e.g. cycle in UserType superTypes, or uniqueness) have no quick fix and only show a validation message.

### Summary of implemented constraints and refactorings (Xtext)

| Constraint (issue code pattern) | Quick fix |
|----------------------------------|-----------|
| RefModel name capital / length | Capitalize name |
| UserType name unique / capital | Capitalize name |
| UserType superTypes no self | Remove self from superTypes |
| ResourceType name unique / length / capital | Capitalize name |
| Attribute name unique in container | — |
| FeedbackType name unique / capital | Capitalize name |
| FeedbackDefinition at least one writer | Add first UserType as default writer |
| ValidationRule implementationId length | Pad with default prefix |
| AutomationRule name present / capital | Capitalize name |

The exact list of issue code constants and the corresponding `@Fix` methods are defined in `RefDslValidator.java` and `RefDslQuickfixProvider.java` in the Xtext workspace, following the same structure as the ETL example (`EtlProcessDslValidator`, `EtlProcessDslQuickfixProvider`).

## Implementation of the Visualizations

## Implementation of Models (instances)

## Execution of Constraints and Refactorings

## Generation/Execution of Visualizations
