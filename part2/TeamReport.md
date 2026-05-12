# ENORM Part 2 - Team Report (DSL and Code Generation)

**Course:** MEI - ENORM (2025/26)  
**Deliverable:** Team report for the team tasks of Part 2 (Activities 1, 2, 4, 5 and team integration tasks of Activity 6) defined in the assignment ([diagrams/enunciado/part2/enunciado-p2.md](../diagrams/enunciado/part2/enunciado-p2.md)).  
**Repository root:** project root containing `part2/`, `diagrams/`, and tool-specific subprojects.

---

## 1. Team composition and tool assignment

| Member            | Primary tool (individual implementation)                                                              | Tool report (.md) |
|-------------------|-------------------------------------------------------------------------------------------------------|-------------------|
| Guilherme Cunha   | **JetBrains MPS** - projectional/textual DSL and generator implementation (`part2/tool1-mps/`, `part2/tool1-mps/languages/`) | [tool1-mps/readme.md](tool1-mps/readme.md) |
| Pedro Vilarinho   | **Eclipse Xtext** - textual DSL, validation, generator (`part2/tool2-xtext/`)                         | [tool2-xtext/readme.md](tool2-xtext/readme.md) |
| Francisco Peixoto | **Eclipse Sirius** - graphical views / Viewpoint Specification (`part2/tool3-sirius/`)                | [tool3-sirius/readme.md](tool3-sirius/readme.md) |

The team works with a **single domain metamodel (REF)** and three **reference scenarios** (YouTube, Amazon, Reddit). Each member implements the required artifacts in the assigned tool. **This document** focuses on **team-level** Part 2 decisions: concrete syntax design, common backend features, commonality/variability analysis, code generation design, and cross-tool compatibility of generated applications.

Tool-specific implementation details remain in each individual tool report.

---

## 2. Activity 1 - Design Concrete Syntax for the DSL

### 2.1 Graphical notation
The Sirius editor is used to provide a single overview diagram for each REF model instance. The diagram is centered on 
the `RefModel` root and shows the model as a navigable canvas with typed nodes, labeled connectors, and visual grouping by concern.
The goal is to make the model readable for a domain expert without exposing implementation details. Each metamodel element
is represented with a compact shape, a clear label, and a small set of visual cues for type and relationship semantics.

#### Diagram structure
- The root element is `RefModel`, shown as a large container node with the model name and version in its title.
- The remaining elements are displayed as typed nodes placed around the root and organized by functional area: actors, structure, feedback, and governance/behavior.
- Relationships are drawn as directed edges between typed nodes. Containment and optional references use different line styles so the meaning is visible at a glance.
- Enumerated properties are rendered inside the node label or as a short secondary line, instead of creating separate nodes.

#### Visual mapping by metamodel element
| Metamodel element | Graphical representation in Sirius |
|---|---|
| `RefModel` | Large root container / overview frame titled with `<name> (v<version>)`. It acts as the diagram entry point and groups all other elements. |
| `UserType` | Square node with a blue actor-style accent. Label shows the user type name; `kind` is shown as a short property line when needed. |
| `ContextType` | Square node used as a context container, with a neutral gray fill. Label shows the context name and `kind`. |
| `ResourceType` | Square node with orange accent to represent domain entities. Attributes are displayed inside the same node as a compartment-style list. |
| `Attribute` | Small row/line inside the owning `ResourceType` node using `name : type` plus markers such as `required` and `multiValued`. |
| `ResourceRelation` | Directed edge between two `ResourceType` nodes. The edge label shows the relation name and cardinalities; containment and recursion are rendered with edge decoration or line style. |
| `FeedbackType` | Square node with green accent to identify feedback families such as comments, reviews, votes, or reports. |
| `FeedbackDefinition` | Distinct node linked to its `FeedbackType`, author, and subject. The label shows the feedback name; policy and rating data are shown as short inline details. |
| `FeedbackPolicy` | Small attached node or inline property panel on the `FeedbackDefinition` node. The status is shown directly as `enabled` or `disabled`. |
| `RatingPolicy` | Small attached node or inline property panel on the `FeedbackDefinition` node, showing the rating range as `min..max`. |
| `AuthorizationRule` | Square node with a blue governance accent. The label includes the allowed action, and edges connect it to the actor, context, resource, and optional feedback target. |
| `ValidationRule` | Square node with a green validation accent. The label shows the rule name and severity; optional links indicate the affected resource, feedback, and invoking automation. |
| `ModerationPolicy` | Square node with a yellow moderation accent. The node label shows the policy name, and edges connect the monitored resource, monitored feedback, executor, and optional context. |
| `AutomationRule` | Square node with a light-purple behavior accent. The label includes the rule name and trigger event; nested `Condition` and `Action` nodes are shown as owned children. |
| `Condition` | Small child node inside an `AutomationRule`, rendered with a light-yellow background. The label shows the condition name and operator. |
| `ConditionValue` | Leaf child node under `Condition`, used when a condition has nested values or a value tree. |
| `Action` | Small child node inside an `AutomationRule`, rendered with a light-yellow background. The label shows the action name and result kind. |
| `VerificationPolicy` | Square node with a cyan verification accent. The label shows the policy name and the verification mode. |
| `SortingPolicy` | Square node with a light-blue sorting accent. The label shows the policy name together with the criterion and direction. |

#### Relationship notation
- Solid arrows represent mandatory typed references, such as a feedback definition pointing to its type or author.
- Dashed arrows represent optional references, such as optional context, optional feedback targets, or optional subject links.
- Containment uses a stronger composite visual treatment, especially for owned `Attribute`, `Condition`, and `Action` elements.
- Self-relations and recursive relations are drawn with explicit labels so the reader can distinguish hierarchy from recursion.
- Edges are color-coded by concern: actor/security links, structure links, feedback links, moderation/validation links, and automation/sorting links.

#### How this supports the domain expert
The editor keeps the same vocabulary as the metamodel, but the diagram removes most technical noise. A domain expert can 
scan the model by reading the main nodes first, then inspect the connectors to understand who can act, what is being 
described, and which rules govern the scenario. This makes the Sirius diagram suitable both for validation sessions and 
for scenario comparison across YouTube, Amazon, and Reddit models.


### 2.2 Textual notation

### Scope and Intent
 
This section specifies the proposed textual concrete syntax for REF in Part 2.
The design is aligned with the REF metamodel v3 used in the project and explicitly includes the concepts shown in the MPS model instances (for example: `SortingPolicy`, `Condition`, `Action`, `TriggerEvent`, `FeedbackPolarity`, and `VerificationRequirement`).
 
Two equivalent textual views are supported in the report:
 
- A canonical SME-oriented syntax with section headers, minimal repeated keywords, and indentation (no braces).
- A projection-compatible syntax (properties/children/references) matching MPS exports.

### Design Principles
 
The goal is simple. A domain expert should read and validate a model without developer help.

"Close to natural language" here means familiar keywords and clear structure. It does not mean full prose sentences.

The notation uses one declaration per line, keyword-based properties, and indentation under section headers. Braces are optional and omitted in the SME view. This keeps models easy to read and review.
 
The following principles were adopted:
 
- Keep the metamodel semantics unchanged from REF v3.
- Use domain words close to natural language (for example: `authorize`, `moderation`, `automation`, `verification`).
- Keep strong typing through explicit enum tokens and typed references.
- Reduce noise through optional defaults and keyword modifiers.
- Keep models readable in code review and version control.

### Global Document Structure
 
The full model is organized in named sections so users can navigate by domain concern.
 
```refdsl
ref "ModelName" version "1.0.0"

users:
  ...

resources:
  ...

contexts:
  ...

relations:
  ...

feedback-types:
  ...

feedback-definitions:
  ...

sorting-policies:
  ...

authorizations:
  ...

validations:
  ...

moderations:
  ...

automations:
  ...

verifications:
  ...
```
 
In the automation section, behavior detail is represented with nested conditions and actions.

### Textual Representation for Each Metamodel Element
 
| Metamodel element | Textual representation in editor |
|---|---|
| RefModel | `ref "<name>" version "<semver>"` followed by section headers `<section>:` |
| UserType | In `users:` section: `<Name> kind <UserKind> [extends <UserTypeName>(, ...)]` |
| ContextType | In `contexts:` section: `<Name> kind <ContextKind> [contains <ResourceTypeName>(, ...)]` |
| ResourceType | In `resources:` section: `<Name> [media] [extends <ResourceTypeName>(, ...)] fields <attr>(, ...)` |
| Attribute | In `fields` list: `<name>: <PrimitiveType> [required] [list]` |
| ResourceRelation | In `relations:` section: `<Name> from <ResourceType> [<sourceCard>] to <ResourceType> [<targetCard>] [containment] [recursive]` |
| FeedbackType | In `feedback-types:` section: `<Name> kind <FeedbackKind> [scope <FeedbackSubjectScope>] [rating] [recursive] [media] [text] [polarity <FeedbackPolarity>]` |
| FeedbackDefinition | In `feedback-definitions:` section: `<Name> type <FeedbackType> author <UserType> [on resource <ResourceType> \| on feedback <FeedbackDefinition>] [parent <FeedbackDefinition>] [verified-context] [verification <VerificationRequirement>] [unique-per-author-target]` |
| FeedbackPolicy | Under a feedback definition: `policy status <FeedbackStatus>` |
| RatingPolicy | Under a feedback definition: `rating min <number> max <number> [step <number>] [scale <RatingScaleKind>]` |
| ValidationRule | In `validations:` section: `<Name> kind <ValidationKind> [severity <RuleSeverity>] [expr "<expression>"] [impl "<id>"] [applies-resource <ResourceType>] [applies-feedback <FeedbackDefinition>] [applies-user <UserType>] invoked-by <AutomationRule>` |
| ModerationPolicy | In `moderations:` section: `<Name> mode <ModerationMode> [trigger <TriggerEvent>] [decision <ModerationDecision>] monitors resource <ResourceType> feedback <FeedbackDefinition> executed-by <UserType> [context <ContextType>]` |
| AuthorizationRule | In `authorizations:` section: `<ActionKind> actor <UserType> [context <ContextType>] resource <ResourceType> [feedback <FeedbackDefinition>]` |
| AutomationRule | In `automations:` section: `<Name> trigger <TriggerEvent> on feedback <FeedbackDefinition> [resource <ResourceType>] [context <ContextType>] uses <ValidationRule>` with nested `conditions:` and `actions:` blocks |
| Condition | In `conditions:` block: `<Name> field <AttributeName> op <ConditionOperator> value "<value>"` |
| Action | In `actions:` block: `<Name> kind <ActionResultKind> [message "<message>"]` |
| VerificationPolicy | In `verifications:` section: `<Name> mode <ValidationKind> when <TriggerEvent> verifies <FeedbackDefinition>` |
| SortingPolicy | In `sorting-policies:` section: `<Name> criterion <SortCriterion> direction <SortDirection> [applies-resource <ResourceType>] [applies-feedback <FeedbackDefinition>] [context <ContextType>]` |
 
## Enum Token Notation
 
All enum literals are written as uppercase keywords to preserve type safety and align with the existing P1 model vocabulary.
 
- UserKind: `GENERIC`, `BUYER`, `SELLER`, `CREATOR`, `MODERATOR`
- ContextKind: `GLOBAL`, `COMMUNITY`, `CHANNEL`, `CATALOG`
- PrimitiveType: `TEXT`, `NUMBER`, `BOOLEAN`, `DATE`, `DATETIME`, `IMAGE`, `VIDEO`, `URL`
- FeedbackKind: `COMMENT`, `REVIEW`, `REACTION`, `VOTE`, `REPORT`, `SUBSCRIPTION`
- FeedbackSubjectScope: `RESOURCE_ONLY`, `FEEDBACK_ONLY`, `RESOURCE_OR_FEEDBACK`
- FeedbackPolarity: `NONE`, `LIKE_DISLIKE`, `UP_DOWN`
- FeedbackStatus: `ENABLED`, `DISABLED`
- VerificationRequirement: `NONE`, `OPTIONAL`, `REQUIRED`
- RatingScaleKind: `NUMERIC`, `ORDINAL`, `PERCENTAGE`
- ValidationKind: `AUTOMATIC`, `MANUAL`
- RuleSeverity: `INFO`, `WARNING`, `ERROR`
- ModerationMode: `AUTOMATIC`, `MANUAL`, `HYBRID`
- ModerationDecision: `APPROVED`, `FLAGGED`, `HIDDEN`, `REMOVED`, `BLOCKED`, `REJECTED`
- ActionKind: `READ`, `CREATE`, `UPDATE`, `DELETE`, `COMMENT`, `RATE`, `VOTE`, `REPORT`, `SUBSCRIBE`, `MODERATE`, `VALIDATE`
- TriggerEvent: `ON_RESOURCE_CREATE`, `ON_RESOURCE_UPDATE`, `ON_RESOURCE_DELETE`, `ON_FEEDBACK_CREATE`, `ON_FEEDBACK_UPDATE`, `ON_FEEDBACK_DELETE`, `ON_REPORT_SUBMITTED`, `ON_REPORT_THRESHOLD`, `ON_MANUAL_REQUEST`
- ConditionOperator: `CONTAINS_KEYWORDS`, `NOT_CONTAINS_KEYWORDS`, `MATCH_REGEX`, `NOT_MATCH_REGEX`, `HAS_PROPERTY`, `NOT_HAS_PROPERTY`, `HAS_SPECIFIC_PROPERTY`, `NOT_HAS_SPECIFIC_PROPERTY`
- ActionResultKind: `DISPLAY_MESSAGE`, `FLAG_CONTENT`, `HIDE_CONTENT`, `REMOVE_CONTENT`, `BLOCK_SUBMISSION`, `NOTIFY_MODERATOR`, `AUTO_APPROVE`, `AUTO_REJECT`
- SortCriterion: `DATE`, `VALUE`, `RELEVANCE`
- SortDirection: `ASC`, `DESC`



### End-to-End Textual Example
 
```refdsl
ref "AmazonRef" version "1.0.0"

users:
  Reviewer kind GENERIC
  Buyer kind BUYER extends Reviewer
  Seller kind SELLER
  Moderator kind MODERATOR

resources:
  Product fields Id:TEXT required, Name:TEXT required, Description:TEXT required, CreatedAt:DATE
  Order fields Id:TEXT required, Date:DATE required
  OrderItem fields Quantity:NUMBER required
  CommentReview media fields Id:TEXT required, Text:TEXT required, CreatedAt:DATE required

contexts:
  CatalogContext kind CATALOG contains Product, Order, OrderItem, CommentReview
  ModerationContext kind CATALOG contains Product
  SearchContext kind CATALOG contains Product

relations:
  OrderContainsOrderItem from Order [1] to OrderItem [2]
  OrderItemTargetsProduct from OrderItem [2] to Product [1]
  ProductContainsComment from Product [1] to CommentReview [2] containment

feedback-types:
  ReviewType kind REVIEW scope RESOURCE_ONLY rating media text polarity NONE
  HelpfulVoteType kind VOTE scope RESOURCE_ONLY polarity UP_DOWN

feedback-definitions:
  ProductReview type ReviewType author Reviewer on resource Product verification OPTIONAL unique-per-author-target
    policy status ENABLED
    rating min 1 max 5 step 1 scale NUMERIC
  HelpfulVoteOnComment type HelpfulVoteType author Buyer on resource CommentReview verification OPTIONAL
    policy status ENABLED

sorting-policies:
  ProductListingSort criterion VALUE direction DESC applies-resource Product context CatalogContext
  ProductSearchSort criterion DATE direction DESC applies-resource Product
  CommentSortByDate criterion DATE direction DESC applies-resource CommentReview context CatalogContext
  CommentSortByRating criterion DATE direction DESC applies-resource CommentReview context CatalogContext

validations:
  ReviewValidationRule kind AUTOMATIC severity ERROR expr "rating_in_range_and_non_empty_text" impl "amazon_review_validation" applies-resource Product applies-feedback ProductReview applies-user Reviewer invoked-by ReviewGuardAutomation

automations:
  ReviewGuardAutomation trigger ON_FEEDBACK_CREATE on feedback ProductReview resource Product context ModerationContext uses ReviewValidationRule
    conditions:
      LOl field Description op CONTAINS_KEYWORDS value "g"
    actions:
      FlagReview kind FLAG_CONTENT message "Content Restricted"

moderations:
  ReviewModerationPolicy mode HYBRID trigger ON_REPORT_THRESHOLD decision FLAGGED monitors resource Product feedback ProductReview executed-by Moderator context ModerationContext

authorizations:
  CREATE actor Reviewer context CatalogContext resource Product feedback ProductReview
  MODERATE actor Moderator context ModerationContext resource Product feedback ProductReview
  VOTE actor Buyer context CatalogContext resource CommentReview feedback HelpfulVoteOnComment

verifications:
  ProductReviewVerificationAuto mode AUTOMATIC when ON_FEEDBACK_CREATE verifies ProductReview
  ProductReviewVerificationManual mode MANUAL when ON_MANUAL_REQUEST verifies ProductReview
```
 
### Adaptations Relative to P1 and Justification
 
The metamodel itself is preserved. The adaptations are concrete syntax decisions to improve usability for SMEs.
 
1. Section headers remove repeated concept keywords (for example, under `users:` the entry is just `Buyer kind BUYER`, not `user Buyer ...`). Indentation replaces braces in the SME view.
2. Trigger values are typed with `TriggerEvent` instead of free text. This prevents invalid event names at parse time.
3. `AutomationRule` includes explicit `conditions` and `actions` blocks. This captures richer behavior needed in moderation workflows and keeps trigger and rule body clearly separated.
4. `SortingPolicy` is first-class in the syntax as a named `sorting-policies` section. This captures ordering behavior that is central to Amazon, Reddit, and YouTube-like scenarios.
5. Feedback semantics include `allowsText`, `polarity`, and `verificationRequirement` as explicit optional tokens. This supports vote and reaction differences and verification strictness without workarounds.
6. Projection helper concepts (`ContextResourceTypeLink`, `UserTypeSuperType`) are rendered as inline modifiers (`contains`, `extends`) instead of named declarations. This hides implementation details from the surface notation and keeps the abstract syntax tree traceable.

### 2.3 Adaptations from P1 metamodel and justification

TODO

---

## 3. Activity 2 - Specify Common Features for Applications of the Domain

### 3.1 Target language, frameworks, and platform

The reference backend platform for generated REF applications is Java 21 with Spring Boot 3. The stack was selected because it supports a direct implementation of the REF concepts as layered, strongly typed application artifacts:

- Spring Web for JSON REST APIs and controller generation.
- Spring Data JPA with Hibernate for generated repositories and persistence mappings.
- H2 for lightweight prototype execution and repeatable tests.
- Jakarta Bean Validation for request-level constraints derived from resource attributes, rating policies, and required fields.
- Spring Security with JWT for prototype-level authentication and authorization checks derived from REF user types and authorization rules.
- Maven as the build tool for standalone backend prototypes.

Generated applications should be normal Spring Boot applications so that generated code can be compiled, tested, and executed without depending on the modeling tools at runtime. Scenario-specific prototypes can then instantiate this common platform with the concrete resources, feedback definitions, rules, and authorization policies of each REF model.

### 3.2 Architecture of generated backend applications

Generated backend applications follow a layered architecture:

- **Domain layer:** JPA entities for REF `ResourceType`, feedback instances, context/policy concepts, and user types.
- **Repository layer:** Spring Data repositories for generated CRUD access and query methods.
- **Service layer:** application use cases, validation, verification, moderation, and business rules.
- **Web layer:** REST controllers and DTOs for external API contracts.
- **Security layer:** authentication and role-based authorization based on REF `UserType` and `AuthorizationRule`.

The implementation applies the Generation Gap pattern. Generated/common artifacts are placed under `generated` packages, while handwritten extension points use the same package level without the `generated` segment. For example, `GeneratedProductReview` contains the common JPA mapping and `ProductReview` is the manual extension class. The same split is used for repositories, services, and controllers.

The common feedback flow is:

1. An authorized actor submits feedback for a resource or for another feedback item.
2. The service validates the feedback payload against the relevant `FeedbackDefinition`, `RatingPolicy`, and `ValidationRule`.
3. The verification policy decides whether validation is automatic, manual, optional, or required.
4. Moderation and automation rules may update the feedback status or trigger additional actions.
5. Read endpoints expose the resulting feedback, resource summaries, and sorted/aggregated views where the REF model requires them.

### 3.3 Common code/artifacts to be generated

The common generator output should include:

- JPA entity base classes for resources, feedback, contexts, policies, automation rules, validation rules, and verification rules.
- Spring Data repository interfaces with scenario-specific query methods where the REF model implies them.
- DTOs for create/update/read operations, including nested references for target resources and media attachments.
- Command objects used by services to decouple controllers from business logic.
- Services implementing common submission, validation, sorting, verification, and aggregation behavior.
- REST controllers exposing resource, feedback, and policy endpoints.
- Security configuration mapping user types and authorization rules to endpoint access.
- Consistent API error handling.
- Integration tests for the generated use cases.

For each concrete scenario, these generated artifacts are instantiated from the REF model. A marketplace scenario may generate products, orders, reviews, verified purchase checks, and star averages. A community scenario may generate posts, comments, votes, reports, and moderation actions. A media platform scenario may generate channels, videos, comments, reactions, subscriptions, and content moderation rules. The generator should therefore treat these as variations of the same REF concepts rather than as unrelated applications.

### 3.4 Extensibility points for manual code

Manual code is expected for scenario-specific behavior that cannot be safely inferred from the metamodel alone. The main extension points are:

- Manual entity subclasses for domain-specific helper methods or invariants.
- Manual repository interfaces for additional derived queries.
- Service hooks for scenario-specific rules, such as context verification, duplicate vote prevention, reputation checks, ownership checks, or platform-specific moderation decisions.
- Manual controller subclasses or extra endpoints when a scenario needs a more ergonomic REST shape.
- Security and authorization refinements when generated rules need to be adapted to framework-level route matching.

This pattern keeps the generated layer reusable while allowing each scenario to implement rules that depend on external state or domain-specific interpretation. The generated service should define common algorithms and protected hooks; the manual service should override only the parts that are genuinely scenario-specific.

### 3.5 Prompts for backend generation

Use this prompt as a scenario-independent template for backend generation. The placeholders are filled from the REF model being processed.

```
Generate a complete backend for the <SCENARIO_NAME> scenario of the ENORM/REF DSL.
Stack: Java 21, Spring Boot 3, Maven, JPA/Hibernate, H2 file-backed DB.
Architecture: Generation Gap (Generated* base classes + manual subclasses).
Requirements: REST API, JWT authentication, role-based authorization, validation, consistent API error responses, and basic integration tests.
Domain model:
- User types: <USER_TYPES>
- Resource types and attributes: <RESOURCE_TYPES>
- Context types and relations: <CONTEXTS_AND_RELATIONS>
- Feedback types and feedback definitions: <FEEDBACK_DEFINITIONS>
- Rating, verification, sorting, validation, moderation, authorization, and automation policies: <POLICIES>
Endpoints:
- Authentication endpoints when the scenario has user-based actions.
- Resource CRUD/read endpoints derived from `ResourceType`.
- Feedback submission/read endpoints derived from `FeedbackDefinition`.
- Aggregation endpoints derived from `RatingPolicy` or `SortingPolicy`.
- Policy/administration endpoints where the prototype needs runtime inspection or configuration.
Deliverables: entities, DTOs, repositories, services, controllers, security config, sample data seeding, and tests. Ensure extensibility with manual override points.
```

---

## 4. Activity 3 - Implement Prototypes of Applications of the Domain

### 4.1 Prototype goals and scope

TODO

### 4.2 Prototype summary by tool

TODO

### 4.3 Inputs for code generation design

TODO

---

## 5. Activity 4 - Identify Commonality and Variability in the Code

### 5.1 Common parts in the prototypes

TODO

### 5.2 Variable parts in the prototypes

TODO

### 5.3 Mapping of variability to metamodel elements

TODO

---

## 6. Activity 5 - Design and Implement Code Generation

### 6.1 Generation rules and templates

TODO

### 6.2 Common parts generation

TODO

### 6.3 Variable parts generation

TODO

### 6.4 Notes per implementation tool

TODO

---

## 7. Activity 6 - Generate Applications

### 7.1 Generation of the three REF scenarios

TODO

### 7.2 Manual extension integration

TODO

### 7.3 Cross-tool compatibility tests

TODO

### 7.4 Model evolution and migration proposal

TODO
