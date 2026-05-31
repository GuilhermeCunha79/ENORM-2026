# ENORM Part 2 - Team Report

**Course:** MEI - ENORM (2025/26)  
**Deliverable:** Team report for Part 2 - DSL concrete syntax, backend generation and validation.
**Assignment reference:** [diagrams/enunciado/part2/enunciado-p2.md](../diagrams/enunciado/part2/enunciado-p2.md)

This report consolidates the team-level work for Part 2. It follows the assignment activities and uses the individual tool reports as supporting evidence:

- [Tool 1 - JetBrains MPS](tool1-mps/readme.md)
- [Tool 2 - Eclipse Xtext](tool2-xtext/readme.md)
- [Tool 3 - Eclipse Sirius](tool3-sirius/readme.md)

The team kept the same REF domain from Part 1 and extended it with concrete syntaxes and generators capable of producing REST backend applications for the Amazon, Reddit and YouTube scenarios.

---

## 1. Team Composition and Tool Assignment

| Member | Tool | Main responsibility |
|---|---|---|
| Guilherme Cunha | JetBrains MPS | Projectional/textual syntax and MPS code generator. |
| Pedro Vilarinho | Eclipse Xtext | Textual grammar, validation and Xtend backend generator. |
| Francisco Peixoto | Eclipse Sirius | Graphical notation, EMF instances and Acceleo backend generator. |

All tools describe the same REF concepts, but each one provides a different authoring experience:

- Sirius gives a graphical notation for domain review and model inspection.
- Xtext gives a parser-based textual DSL suited for versioned text files and CI-style generation.
- MPS gives a projectional textual notation with typed editors and direct model-to-text generation.

---

## 2. Assignment Scope and Traceability

| Assignment activity | Team outcome | Main repository evidence |
|---|---|---|
| Activity 1 - Concrete syntax | Graphical and textual notations for REF. | Sirius `.odesign`, Xtext grammar, MPS editors, and Section 3 of this report. |
| Activity 2 - Common backend features | Shared REST backend architecture and manual extension strategy. | Section 4 and generated backend structures. |
| Activity 3 - Prototypes | Reference backend prototypes used to identify generated code. | `part2/ai-generated-backends-prototypes/amazon-backend`, `part2/ai-generated-backends-prototypes/reddit-backend`, `part2/ai-generated-backends-prototypes/youtube-backend`. |
| Activity 4 - Commonality/variability | Mapping from REF model elements to generated artifacts and hooks. | Section 6 and individual generator reports. |
| Activity 5 - Code generation | Tool-specific template implementations for the common generation design. | MPS generator templates, Xtext Xtend generator, Sirius Acceleo generator. |
| Activity 6 - Generated applications | Generation of Amazon, Reddit and YouTube backends, manual extension support, tests/issues and evolution plan. | Section 8 and the individual reports. |

---

## 3. Activity 1 - Concrete Syntax Design

The Part 2 assignment required a concrete syntax for the DSL, including one graphical notation and textual/projectional notations. The team designed all notations around the same principles:

- keep REF concepts visible to domain experts;
- preserve strong typing for references, enums and model relationships;
- represent both structure and behavior, including feedback, validation, moderation, automation, verification and sorting;
- avoid tool-specific semantic shortcuts that would make the same model mean different things in different tools;
- keep the notation close enough to the metamodel to support generation without ambiguous interpretation.

### 3.1 Shared textual notation

The team textual notation is organized by domain concern. A model starts with a `RefModel` declaration and then declares users, resources, contexts, feedback, policies and behavior in named sections.

```refdsl
ref AmazonRef version "1.0.0"

users:
  user Reviewer kind GENERIC
  user Buyer kind BUYER
  user Moderator kind MODERATOR

resources:
  Product supports media false with fields:
    - Name is required true and multi valued false, TEXT
    - Description is required true and multi valued false, TEXT

feedback definitions:
  ProductReview authored by Reviewer on resource Product
    policy ENABLED
    rated between 1 and 5 step 1

moderations:
  ReviewModerationPolicy mode HYBRID decision FLAGGED
    trigger ON_REPORT_THRESHOLD on feedback ProductReview

automations:
  ReviewGuardAutomation trigger ON_FEEDBACK_CREATE on feedback ProductReview
    when:
      - DescriptionCheck field Description CONTAINS_KEYWORDS:
          - restricted
    then:
      - FlagReview FLAG_CONTENT message "Content restricted"
```

The textual syntax is intentionally close to natural language, but it is not free prose. Keywords, enum literals and references remain explicit so that tools can type-check models and generators can consume them deterministically.

### 3.2 Mapping from REF concepts to textual syntax

| REF concept | Textual representation |
|---|---|
| `RefModel` | Root declaration with model name and version. |
| `UserType` | Entry in `users:` with name and `UserKind`. |
| `ContextType` | Entry in `contexts:` with context kind and contained resources. |
| `ResourceType` | Entry in `resources:` with media support, optional supertype and fields. |
| `Attribute` | Field line with name, required flag, multi-valued flag and primitive type. |
| `ResourceRelation` | Relation line with source, target, cardinalities, containment and recursion flags. |
| `FeedbackType` | Feedback family declaration, such as review, comment, vote, report or subscription. |
| `FeedbackDefinition` | Concrete feedback relation between author, resource/feedback target and policies. |
| `RatingPolicy` | Inline rating range and step associated with a feedback definition. |
| `AuthorizationRule` | Rule connecting action, actor, context and target. |
| `ValidationRule` | Rule with kind, severity, expression and `implementationId` hook. |
| `ModerationPolicy` | Policy with mode, decision, trigger, executor and monitored target. |
| `AutomationRule` | Triggered behavior with nested `Condition` and `Action` entries. |
| `Condition` / `ConditionValue` | Typed condition over an attribute or target value, including keywords when needed. |
| `Action` | Generated moderation/automation result such as flag, hide, remove, notify or approve. |
| `VerificationPolicy` | Verification mode and trigger. |
| `SortingPolicy` | Sort target, context, criterion and direction. |

### 3.3 MPS projectional syntax

In MPS, the syntax is implemented with **Editors** instead of a parser. The root `RefModel` editor acts as the global editor and embeds child editors for users, resources, feedback definitions, moderation policies, automation rules and other elements.

The MPS notation keeps the model strongly typed while presenting it as readable text. For example, the `ResourceType` editor contains the resource name, media support, optional supertype and a list of attributes:

```text
{ name } [ supports media { supportsMedia } ] ,
extends (- % superType % /empty cell: <default> -)
with fields:
(- % attribute % /empty cell: <default> -)
```

The `Attribute` editor is a child editor reused inside resource declarations:

```text
{ name } is a required : { required }
and multi valued : { multiValued } , { type }
```

This gives domain users a textual view, while MPS still stores and validates a typed AST. The projectional approach also avoids parsing ambiguity and makes references explicit through editor cells.

### 3.4 Xtext textual syntax

The Xtext implementation uses an ANTLR-based grammar and therefore adapts the team notation where needed. The main adaptation is that some constructs use explicit keywords and braces so the parser can distinguish containment, references and optional sections reliably.

The Xtext implementation is documented in [tool2-xtext/readme.md](tool2-xtext/readme.md). The main grammar and generator are located under the Xtext project, including:

- `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext`
- `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/generator/RefDslGenerator.xtend`
- `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/generator/RefBackendGenerator.xtend`

The Xtext syntax preserves the same REF vocabulary and uses validation/quick fixes to catch model errors before generation.

### 3.5 Sirius graphical syntax

The graphical syntax is implemented with Eclipse Sirius. The main artifacts are:

- Ecore metamodel: `part2/tool3-sirius/model/enorm.ecore`
- generated EMF code: `part2/tool3-sirius/src-gen/enorm`
- viewpoint specification: `part2/eclipse_sirius_2nd_Instance/enorm.design/description/enorm.odesign`
- scenario instances: `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.enorm`

The Sirius diagram is centered on `RefModel` and shows typed nodes and edges:

| REF concept | Sirius representation |
|---|---|
| `RefModel` | Root container / overview diagram. |
| `UserType` | Actor node. |
| `ContextType` | Context node with contained resources. |
| `ResourceType` | Resource node with nested attributes. |
| `Attribute` | Nested row inside a resource node. |
| `ResourceRelation` | Directed edge between resources. |
| `FeedbackDefinition` | Feedback node linked to author and target. |
| `AuthorizationRule` | Governance node linked to actor, action context and target. |
| `ValidationRule` | Validation node with severity and affected target. |
| `ModerationPolicy` | Moderation node linked to monitored target and executor. |
| `AutomationRule` | Behavior node with nested conditions and actions. |
| `Condition` / `Action` | Child nodes inside automation rules. |
| `VerificationPolicy` / `SortingPolicy` | Policy nodes with labels and property views. |

The graphical view is intended for review and validation sessions. It makes structural links and governance rules easier to inspect than in a long textual file.

### 3.6 Adaptations from Part 1

Part 2 reused the Part 1 REF language direction but made it more generation-oriented. The main adaptations were:

- explicit representation of behavior concepts such as `AutomationRule`, `Condition`, `Action`, `ModerationPolicy`, `VerificationPolicy` and `SortingPolicy`;
- clearer distinction between resource structure, feedback definitions and policy behavior;
- use of typed trigger events and enum literals to avoid free-text behavior descriptions;
- addition of manual implementation hooks, especially through `implementationId`, for behavior that cannot be completely generated;
- tool-specific syntax adaptations without changing the shared model semantics.

---

## 4. Activity 2 - Common Backend Features

The team selected a Java/Spring backend architecture because it is familiar, testable and maps naturally to the REF model.

### 4.1 Target stack

| Concern | Team decision |
|---|---|
| Language | Java 21. |
| Build tool | Maven. |
| Runtime framework | Spring Boot. |
| REST API | Spring Web controllers returning JSON. |
| Persistence | Spring Data JPA. |
| Database | H2 database for generated demos and tests. |
| Validation/security hooks | Generated service checks plus manual extension points. |
| Tests | JUnit and MockMvc-style API tests where available. |

The generated applications are not intended to be production systems. They are demonstrators that show how a REF model can generate a useful REST backend skeleton with enough behavior to validate the modeled scenario.

### 4.2 Common architecture

Each generated backend follows the same package-level structure:

| Package/area | Purpose |
|---|---|
| `domain` / `domain.generated` | Entities, enums and generated domain structures. |
| `repository` / `repository.generated` | Spring Data repositories. |
| `service` / `service.generated` | Use-case logic, generated bases and manual extension classes. |
| `web` / `web.generated` | REST controllers and request/response endpoints. |
| `security` | Authentication, authorization or security stubs depending on the tool implementation. |
| `config` | Runtime configuration, seed data or generated Spring configuration. |
| `error` | API error models and exception handling. |

The common rule is that generated code provides the baseline and handwritten code completes the behavior that is scenario-specific or depends on external data.

### 4.3 Manual extension strategy

Part 2 explicitly asks for support for manual code adaptations. The team adopted a **Generation Gap** style:

- generated artifacts are placed in `generated` packages or named with a `Generated*` prefix;
- manual classes extend, wrap or call generated bases;
- regeneration replaces generated files but preserves manual classes;
- model fields such as `ValidationRule.implementationId` identify handwritten behavior hooks;
- complex authorization, moderation and validation logic can be implemented in Java without editing generated files directly.

This strategy is important because the REF DSL describes the shape and policy of an application, but not every business decision can be derived safely from a model.

---

## 5. Activity 3 - Reference Prototypes

Before implementing the generators, the team used scenario-specific backend prototypes to identify what should be common, what should vary, and what must remain manually extensible.

The reference prototypes are stored in:

| Scenario | Prototype path | Main focus |
|---|---|---|
| Amazon | `part2/ai-generated-backends-prototypes/amazon-backend` | Product reviews, rating constraints, helpful votes, verification and review moderation. |
| Reddit | `part2/ai-generated-backends-prototypes/reddit-backend` | Communities, posts, comments, voting, reports and community moderation. |
| YouTube | `part2/ai-generated-backends-prototypes/youtube-backend` | Channels, videos, comments, reactions, subscriptions and media moderation. |

These applications were used as reference material for the generation design. They helped the team identify repeated backend structures such as project setup, entities, repositories, CRUD services, controllers and error handling, as well as scenario-specific behavior such as review verification, voting, subscriptions and moderation workflows.

Each individual tool then used the same scenario family:

- MPS generated/compiled applications under `part2/tool1-mps/prototypes/amazon-prototype`, `part2/tool1-mps/prototypes/reddit-prototype` and `part2/tool1-mps/prototypes/youtube-prototype`.
- Xtext generates scenario backends under the Xtext runtime `src-gen/generated-backend/<scenario>` output when the models are saved. In this checkout, generated backend examples are present under the reused Xtext runtime workspace in `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend`, while Part 2 projection exports are present under `part2/tool2-xtext/runtime-RefGen/RefGenTest/src-gen/projections`.
- Sirius maintained `.enorm` scenario models and generated Spring Boot backends with Acceleo.

---

## 6. Activity 4 - Commonality and Variability

The commonality/variability analysis was done from the metamodel, the reference prototypes and the three scenario models.

### 6.1 Common parts generated for every backend

| Common part | Reason |
|---|---|
| Maven project files | Every generated backend must build independently. |
| Spring Boot application class | Common runtime entry point. |
| `application.properties` | Database, JPA and server configuration. |
| Domain package | Persistent representation of REF resources and feedback concepts. |
| Repository package | Standard persistence access for generated entities. |
| Service package | Shared CRUD and scenario behavior entry points. |
| Web/controllers package | REST API surface. |
| Error handling | Consistent JSON error responses. |
| Security/authentication baseline | Common user and permission infrastructure, even when simplified. |
| Test scaffolding | Smoke/acceptance tests for generated applications. |
| Manual extension structure | Preservation of handwritten code across regeneration. |

### 6.2 Variable parts generated from model values

| REF model element/value | Generated variability |
|---|---|
| `RefModel.name` and version | Artifact id, package names, application class name, response labels and H2 database name. |
| `UserType` | User roles, actor enums, ownership/authorization references and seed/test data. |
| `ContextType` | Context entities or service-level grouping, depending on the generator. |
| `ResourceType` | Entity, repository, service and controller stacks. |
| `Attribute` and primitive type | Entity fields, DTO fields, validation hints and generated accessor methods. |
| `ResourceRelation` | JPA relationships, link endpoints or service relation methods. |
| `FeedbackType` / `FeedbackDefinition` | Comment, review, vote, report, reaction or subscription endpoints and services. |
| `RatingPolicy` | Rating range checks, score fields and average/ranking helpers. |
| `AuthorizationRule` | Permission checks, generated guards and manual authorization hooks. |
| `ValidationRule` | Generated validation call sites and `implementationId` hooks. |
| `ModerationPolicy` | Moderation decisions, status fields and policy service methods. |
| `AutomationRule` | Triggered checks over conditions and actions. |
| `Condition` / `ConditionValue` | Keyword/attribute checks and generated rule descriptors. |
| `Action` | Generated moderation outcomes such as flag, hide, remove, notify, approve or reject. |
| `VerificationPolicy` | Verification checks, review gating and manual verification hooks. |
| `SortingPolicy` | Sorting metadata, query parameters or service sorting helpers. |

### 6.3 Manual-only or partially generated behavior

Some behavior is intentionally not fully generated:

| Behavior | Reason for manual support |
|---|---|
| Authentication provider integration | Real deployments depend on infrastructure outside the REF model. |
| Validation expressions with `implementationId` | The model names the rule, but Java implements the specific predicate. |
| Scenario-specific endpoints | Some APIs are convenience workflows rather than direct metamodel elements. |

This separation keeps the generated code useful while avoiding the false assumption that every application behavior can be inferred from the DSL.

---

## 7. Activity 5 - Code Generation Design and Implementation

The team generation design follows two rules:

1. common infrastructure is always generated;
2. scenario-specific code is generated only when the corresponding REF model element exists.

### 7.1 Shared generation workflow

Each tool performs the same conceptual pipeline:

1. read a REF model;
2. compute available features, such as resources, feedback definitions, moderation policies and automation rules;
3. generate common project infrastructure;
4. generate resource, feedback and policy code from model contents;
5. keep handwritten extension classes outside the overwritten generated area;
6. compile and test the generated backend.

### 7.2 Tool-specific generator implementations

| Tool | Generator implementation | Relevant details |
|---|---|---|
| MPS | `part2/tool1-mps/languages/Ref/generator/templates/Ref.generator.templates@generator.mps` | Uses the MPS Generator and `PlainTextGenerator`. `PlainTextGenerator` is used for text files such as `pom.xml` and `application.properties`. |
| Xtext | `RefDslGenerator.xtend`, `RefBackendGenerator.xtend`, `RefBackendNaming.xtend` | Uses Xtend templates from parsed textual models. Generates project structure, backend code and Part 1 projections. |
| Sirius | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/generate.mtl` | Uses Acceleo templates over EMF `.enorm` instances. Generates Spring Boot applications under `scr-gen`. |

### 7.3 MPS macro usage

The MPS generator uses macros to make code generation compact and maintainable:

| Macro type | Use in the generator |
|---|---|
| `LOOP` | Iterates over model collections such as `resourceType`, `feedbackDefinition`, `moderationPolicy`, `automationRule`, `conditions` and `actions`. |
| `IF` | Includes code only when a model feature exists, for example rating policies, feedback targets, moderation rules or automation blocks. |
| `Reference` (`->`) | Resolves references between model elements, such as a feedback definition pointing to its author/resource or an automation rule pointing to its validation rule. |
| `Property` | Injects model values into generated Java or configuration files, such as names, enum literals, flags, messages and numeric rating bounds. |

This is especially visible in generated moderation code. The input is a `RefModel`, and templates traverse policies, automation rules, conditions and actions to produce generated descriptors such as policy specs, rule specs, condition specs and action specs.

### 7.4 Generated artifact families

Across tools, the generators produce the following artifact families:

| Artifact family | Examples |
|---|---|
| Project/configuration | `pom.xml`, `application.properties`, Spring Boot entry point. |
| Domain | resource entities, feedback entities, enums and generated model descriptors. |
| Persistence | repositories for generated entities. |
| Services | CRUD services, feedback services, moderation services, validation hooks. |
| Web/API | controllers for resources, feedback and scenario operations. |
| Security | user/role structures, authentication endpoints or security configuration. |
| Tests | smoke tests, generated acceptance tests or scenario-specific API checks. |

---

## 8. Activity 6 - Generated Applications, Tests and Evolution

Activity 6 required generating the three applications, supporting manual code, testing the result, reporting issues and considering model evolution.

### 8.1 Generated application locations

| Tool | Amazon | Reddit | YouTube |
|---|---|---|---|
| MPS | `part2/tool1-mps/prototypes/amazon-prototype` | `part2/tool1-mps/prototypes/reddit-prototype` | `part2/tool1-mps/prototypes/youtube-prototype` |
| Xtext | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/amazon` | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/reddit` | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/youtube` |
| Sirius | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/amazon-backend` | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/reddit-backend` | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/youtube-backend` |

The MPS paths above contain the compiled/generated applications used by that tool. The Sirius outputs are generated from the `.enorm` models with Acceleo. The Xtext outputs are generated from textual REF models through the Xtext generator; the Part 2 Xtext report documents the equivalent runtime output convention as `src-gen/generated-backend/<scenario>`.

### 8.2 Scenario coverage

| Scenario | Main modeled focus | Representative generated concerns |
|---|---|---|
| Amazon | E-commerce reviews and verification. | Products, orders, reviews, helpful votes, rating bounds, review verification, moderation. |
| Reddit | Community discussion and moderation. | Subreddits, posts, comments, votes, reports, participation rules, moderation. |
| YouTube | Media publication and audience feedback. | Channels, videos, comments, likes/dislikes, subscriptions, validation and moderation. |

The three scenarios were selected because they exercise different REF features. Together they test structural resources, nested feedback, ratings, votes, reports, automation, verification and sorting.

### 8.3 Test evidence from individual reports

The individual reports provide the detailed test evidence. At team level, the relevant result is:

| Tool | Reported verification |
|---|---|
| MPS | Generated/compiled Spring Boot prototypes exist for Amazon, Reddit and YouTube under `part2/tool1-mps/prototypes`. Postman and moderation test material is available under `part2/postman`. |
| Xtext | The generated Amazon, Reddit and YouTube backends were checked with Maven tests according to the Xtext individual report. |
| Sirius | The generated Amazon, Reddit and YouTube backends were checked with Maven tests according to the Sirius individual report. |

The team also keeps Postman material for generated API and moderation acceptance checks under `part2/postman`.

### 8.5 Cross-tool compatibility

Cross-tool compatibility refers to the **generated Java backends**, not to exchanging the internal files of each generator or editor.

The generated Java code from MPS, Xtext and Sirius is compatible: the backends can be understood, built and used in the same way because they follow the same backend conventions:

- Spring Boot REST applications generated from the same REF scenario family;
- comparable domain, repository, service, controller, security/config and error-handling layers;
- equivalent mapping from REF resources, feedback definitions, policies and automation rules into Java artifacts;
- same generated/manual extension strategy, so handwritten Java code can be added without modifying generated bases;
- compatible runtime assumptions, such as Maven builds, Spring Data JPA and H2-based execution for demos/tests.

Because the tools are different by nature, the path used to generate the Java code is not identical. MPS uses projectional models and generator macros, Xtext uses parsed textual models and Xtend templates, and Sirius uses EMF graphical models and Acceleo templates. As a result, there can be small differences in how the generated code is written, such as class organization, helper classes, naming style or extension hook placement.

These are implementation-level differences only. They do not affect the final result: the generated Java applications are compatible for Part 2 because they implement the same REF scenario semantics using the same Java/Spring architectural style.

### 8.6 Model evolution and migration plan

The assignment asks the team to consider language evolution. The proposed team strategy is:

1. version the REF metamodel and scenario models;
2. prefer additive changes, such as optional attributes or new enum literals;
3. for breaking changes, define an explicit migration step for existing models;
4. update MPS concepts/editors/generators, Xtext grammar/validators/generators and Sirius Ecore/VSM/Acceleo templates in the same change set;
5. regenerate Amazon, Reddit and YouTube;
6. rerun Maven and acceptance tests;
7. preserve handwritten Java code through the Generation Gap structure.

Tool-specific migration mechanisms differ:

- MPS can use model migration scripts and editor/generator updates.
- Xtext can update the grammar and migrate textual models manually or with scripts.
- Sirius/EMF can update Ecore, regenerate EMF code and migrate `.enorm` instances.

The three reference scenarios act as regression models for future DSL changes.

---

## 9. Final Compliance Summary

| Requirement from Part 2 | Fulfilment |
|---|---|
| DSL with concrete syntax | Provided through Sirius graphical syntax, Xtext textual syntax and MPS projectional/textual syntax. |
| High-level language for domain experts | The notations use domain terms such as resources, feedback, moderation, automation, verification and sorting. |
| Strong typing | References, enum literals and typed properties are preserved in all tools. |
| Complete structural and behavioral coverage | The model covers users, contexts, resources, attributes, feedback, authorization, validation, moderation, automation, verification and sorting. |
| Common backend features | Java/Spring Boot/Maven/JPA/H2 architecture with REST controllers, services, repositories and error handling. |
| Prototypes before generation | Reference prototypes are stored under `part2/ai-generated-backends-prototypes`. |
| Commonality/variability mapping | Section 6 maps REF elements to common and variable generated artifacts. |
| Code generation in each tool | Implemented with MPS Generator/PlainTextGenerator, Xtext Xtend templates and Sirius Acceleo templates. |
| Manual code support | Generation Gap, generated packages/classes and manual hooks. |
| Generation of three scenarios | Amazon, Reddit and YouTube generated applications are present for the tools. |
| Testing and issue reporting | Individual reports document compilation/testing evidence and generator issues. |
| Model evolution | Team migration strategy defined in Section 8.6. |

---

## 10. Conclusion

Part 2 produced a complete DSL implementation path around the REF domain: concrete syntax in three tools, a shared backend generation target, reference prototypes, commonality/variability analysis, generators and generated applications for Amazon, Reddit and YouTube.

The strongest team decision was to keep the generated architecture common while allowing each tool to implement its own authoring and generation mechanics. This kept the work aligned with the assignment: the DSL remains high-level and strongly typed, generated code is useful but extensible, and future model evolution has a clear migration and regression-testing strategy.
