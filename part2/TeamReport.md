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

The team works with a **single domain metamodel (REF)** and three **reference scenarios** (YouTube, Amazon, Reddit). Each member implements the required artifacts in the assigned tool. This report covers the team-level Part 2 decisions: concrete syntax design, common backend features, commonality/variability analysis, code generation design, and cross-tool compatibility of generated applications.

Tool-specific implementation details remain in each individual tool report.

---

## 2. Activity 1 - Design Concrete Syntax for the DSL

### 2.1 Graphical notation
The Sirius editor is used to provide a single overview diagram for each REF model instance. The diagram is centered on
the `RefModel` root and shows the model as a navigable canvas with typed nodes, labeled connectors, and visual grouping by concern.
The notation is meant to make the model readable for a domain expert without exposing implementation details. Each metamodel element
uses a compact shape, a clear label, and a small set of visual cues for type and relationship semantics.

#### Diagram structure
- The root element is `RefModel`, shown as a large container node with the model name and version in its title.
- The remaining elements are displayed as typed nodes placed around the root and organized by functional area: actors, structure, feedback, and governance/behavior.
- Relationships are drawn as directed edges between typed nodes. Containment and optional references use different line styles so the meaning is visible at a glance.
- Enumerated properties are rendered inside the node label or as a short secondary line, instead of creating separate nodes.

#### Visual mapping by metamodel element
| Metamodel element | Graphical representation in Sirius |
|---|---|
| `RefModel` | Large root container / overview frame titled with `<name> (v<version>)`. It acts as the diagram entry point and groups all other elements. |
| `UserType` | Square node with a blue actor-style accent. The label shows the user type name, with `kind` as a short property line when needed. |
| `ContextType` | Square node used as a context container, with a neutral gray fill. Label shows the context name and `kind`. |
| `ResourceType` | Square node with orange accent to represent domain entities. Attributes are displayed inside the same node as a compartment-style list. |
| `Attribute` | Small row/line inside the owning `ResourceType` node using `name : type` plus markers such as `required` and `multiValued`. |
| `ResourceRelation` | Directed edge between two `ResourceType` nodes. The edge label shows the relation name and cardinalities. Containment and recursion use edge decoration or line style. |
| `FeedbackType` | Square node with green accent to identify feedback families such as comments, reviews, votes, or reports. |
| `FeedbackDefinition` | Distinct node linked to its `FeedbackType`, author, and subject. The label shows the feedback name, with policy and rating data as short inline details. |
| `FeedbackPolicy` | Small attached node or inline property panel on the `FeedbackDefinition` node. The status is shown directly as `enabled` or `disabled`. |
| `RatingPolicy` | Small attached node or inline property panel on the `FeedbackDefinition` node, showing the rating range as `min..max`. |
| `AuthorizationRule` | Square node with a blue governance accent. The label includes the allowed action, and edges connect it to the actor, context, resource, and optional feedback target. |
| `ValidationRule` | Square node with a green validation accent. The label shows the rule name and severity. Optional links indicate the affected resource, feedback, and invoking automation. |
| `ModerationPolicy` | Square node with a yellow moderation accent. The node label shows the policy name, and edges connect the monitored resource, monitored feedback, executor, and optional context. |
| `AutomationRule` | Square node with a light-purple behavior accent. The label includes the rule name and trigger event. Nested `Condition` and `Action` nodes are shown as owned children. |
| `Condition` | Small child node inside an `AutomationRule`, rendered with a light-yellow background. The label shows the condition name and operator. |
| `ConditionKeywords` | Leaf child node under `Condition`, used to represent each keyword checked by keyword-based condition operators. |
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
described, and which rules govern the scenario. The Sirius diagram can be used in validation sessions and for scenario
comparison across YouTube, Amazon, and Reddit models.


### 2.2 Textual notation

### Scope and Intent

This is the proposed textual concrete syntax for REF in Part 2.
It follows the REF metamodel v3 used in the project and includes the concepts shown in the MPS model instances, such as `SortingPolicy`, `Condition`, `ConditionKeywords`, `Action`, `TriggerEvent`, `FeedbackPolarity`, and `VerificationRequirement`.

Two equivalent textual views are supported in the report:

- A canonical SME-oriented syntax with section headers, minimal repeated keywords, and indentation (no braces).
- A projection-compatible syntax (properties/children/references) matching MPS exports.

### Design Principles

A domain expert should be able to read and validate a model without developer help.

"Close to natural language" here means familiar keywords and clear structure. It does not mean full prose sentences.

The notation uses one declaration per line, keyword-based properties, and indentation under section headers. Braces are optional and omitted in the SME view. This keeps models easy to read and review.

The syntax follows these principles:

- Keep the syntax traceable to REF v3, including the `ConditionKeywords` child elements used by automation conditions.
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

feedback types:
  ...

feedback definitions:
  ...

sorting policies:
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
| RefModel | `ref [name] version [semver]` followed by section headers `[section]:` |
| UserType | In `users:` section: `user [Name] with [UserKind] kind extends [UserTypeName], ...` |
| ContextType | In `contexts:` section: `[Name] with [ContextKind] kind, contains [ResourceTypeName], ...` |
| ResourceType | In `resources:` section: `[Name] [ supports media [bool] ] , extends [ResourceTypeName], ... with fields: [Attribute], ...` |
| Attribute | In `fields` list: `- [name] is a required: [bool] and multi valued : [bool] , [PrimitiveType]` |
| ResourceRelation | In `relations:` section: `[Name] from [ResourceType] [[srcCard]] to [ResourceType] [[tgtCard]], containment: [bool], recursive: [bool]` |
| FeedbackType | In `feedback types:` section: `[Name] kind: [FeedbackKind] applies on [FeedbackSubjectScope] , has rating: [bool], recursive: [bool], allows media: [bool], allows text: [bool], with polarity: [FeedbackPolarity]` |
| FeedbackDefinition | In `feedback definitions:` section: `[Name] authored by [UserType] on resource [ResourceType] or feedback [FeedbackDefinition] requires a verified context: [bool], verification requirement: [VerificationRequirement], unique per author target: [bool], feedback policy: [FeedbackPolicyName] policy status [FeedbackStatus], [ rated between [min] and [max] with [step] step ]` |
| FeedbackPolicy | Named policy under a feedback definition: `[Name] policy status [FeedbackStatus]` (inline with FeedbackDefinition) |
| RatingPolicy | Inline under a feedback definition: `rated between [min] and [max] with [step] step` |
| ValidationRule | In `validations:` section: `[Name] with [ValidationKind] and severity [RuleSeverity] for expression [expression] , was invoked by [UserType] in context of [ContextType] with implementation id [implementationId] and applies to resource [ResourceType] \| applies to feedback [FeedbackDefinition]` |
| ModerationPolicy | In `moderations:` section: `[Name] in [ModerationMode] mode set to [ModerationDecision] when trigger [TriggerEvent] on resource [ResourceType] \| feedback [FeedbackDefinition] executed by [UserType] in [ContextType] context` |
| AuthorizationRule | In `authorizations:` section: `[AuthName] for [ActionKind] performed by [UserType] in [ContextType] context , on resource [ResourceType] \| on feedback [FeedbackDefinition]` |
| AutomationRule | In `automations:` section: `[Name] trigger [TriggerEvent] in [ContextType] context on feedback [FeedbackDefinition] \| resource [ResourceType] using [ValidationRule] when condition(s) :` followed by nested conditions, `then :`, and nested actions |
| Condition | In an automation condition list: `- [Name] should check if [AttributeName] field [ConditionOperator] as :` followed by nested `ConditionKeywords` entries |
| ConditionKeywords | In a condition keyword list: `- [word]` |
| Action | In an automation action list: `- [Name] should [ActionResultKind] with message [message]` |
| VerificationPolicy | In `verifications:` section: `[Name] in [ValidationKind] mode is applied on [TriggerEvent]` |
| SortingPolicy | In `sorting policies:` section: `[Name] applies to resource [ResourceType] \| applies to feedback [FeedbackDefinition] in [ContextType] context , sorted by [SortCriterion] with [SortDirection] direction` |

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
ref AmazonRef version 1.0.0

users:
  user Reviewer with GENERIC kind extends << ... >>
  user Buyer with BUYER kind extends << ... >>
  user Seller with SELLER kind extends << ... >>
  user Moderator with MODERATOR kind extends << ... >>

resources:
  Product [ supports media false ] , extends Order with fields:
    - Id is a required: true and multi valued : false , TEXT
    - Name is a required: true and multi valued : false , TEXT
    - Description is a required: true and multi valued : false , TEXT
    - CreatedAt is a required: false and multi valued : false , DATE
  Order [ supports media false ] , extends << ... >> with fields:
    - Id is a required: true and multi valued : false , TEXT
    - Date is a required: true and multi valued : false , DATE
  OrderItem [ supports media false ] , extends << ... >> with fields:
    - Quantity is a required: true and multi valued : false , NUMBER
  CommentReview [ supports media true ] , extends << ... >> with fields:
    - Id is a required: true and multi valued : false , TEXT
    - Text is a required: true and multi valued : false , TEXT
    - CreatedAt is a required: true and multi valued : false , DATE

contexts:
  CatalogContext with CATALOG kind, contains Product, Order, OrderItem, CommentReview
  ModerationContext with CATALOG kind, contains Product
  SearchContext with CATALOG kind, contains Product
  RecommendationContext with CATALOG kind, contains Product

relations:
  OrderContainsOrderItem from Order [1] to OrderItem [2], containment: false, recursive: false
  OrderItemTargetsProduct from OrderItem [2] to Product [1], containment: false, recursive: false
  ProductContainsComment from Product [1] to CommentReview [2], containment: true, recursive: false

feedback types:
  ReviewType kind: REVIEW applies on RESOURCE_ONLY , has rating: true, recursive: false, allows media: true, allows text: true, with polarity: NONE
  HelpfulVoteType kind: VOTE applies on RESOURCE_ONLY , has rating: false, recursive: false, allows media: false, allows text: false, with polarity: UP_DOWN

feedback definitions:
  ProductReview authored by Reviewer on resource Product or feedback <no subjectFeedback> requires a verified context: false, verification requirement: OPTIONAL, unique per author target: true, feedback policy: ProductReviewPolicy policy status ENABLED, rated between 1 and 5 with 1 step
  HelpfulVoteOnComment authored by Buyer on resource CommentReview or feedback <no subjectFeedback> requires a verified context: false, verification requirement: OPTIONAL, unique per author target: false, feedback policy: HelpfulVotePolicy policy status ENABLED, <no ratingPolicy>

sorting policies:
  ProductListingSort applies to resource Product | applies to feedback <no appliesToFeedback> in CatalogContext context , sorted by VALUE with DESC direction
  ProductSearchSort applies to resource Product | applies to feedback <no appliesToFeedback> in <no inContext> context , sorted by DATE with DESC direction
  CommentSortByDate applies to resource CommentReview | applies to feedback <no appliesToFeedback> in CatalogContext context , sorted by DATE with DESC direction
  CommentSortByRating applies to resource CommentReview | applies to feedback <no appliesToFeedback> in CatalogContext context , sorted by VALUE with DESC direction

authorizations:
  BuyerCanCreateReview for CREATE performed by Reviewer in CatalogContext context , on resource Product | on feedback ProductReview
  ReviewerCanCreateReview for CREATE performed by Reviewer in CatalogContext context , on resource Product | on feedback ProductReview
  ModeratorCanModerateReviews for MODERATE performed by Moderator in ModerationContext context , on resource Product | on feedback ProductReview
  BuyerCanVoteHelpful for VOTE performed by Buyer in CatalogContext context , on resource CommentReview | on feedback HelpfulVoteOnComment

validations:
  ReviewValidationRule with AUTOMATIC and severity ERROR for expression rating_in_range_and_non_empty_text , was invoked by Reviewer in context of CatalogContext with implementation id amazon_review_validation and applies to resource Product | applies to feedback ProductReview

moderations:
  ReviewModerationPolicy in HYBRID mode set to FLAGGED when trigger ON_REPORT_THRESHOLD on resource Product | feedback ProductReview executed by Moderator in ModerationContext context

automations:
  ReviewGuardAutomation trigger ON_FEEDBACK_CREATE in ModerationContext context on feedback ProductReview | resource Product using ReviewValidationRule when condition(s) :
    - DescriptionCheck should check if Description field CONTAINS_KEYWORDS as :
      - WAR
    then :
      - FlagReview should FLAG_CONTENT with message Content Restricted

verifications:
  ProductReviewVerificationAuto in AUTOMATIC mode is applied on ON_FEEDBACK_CREATE
  ProductReviewVerificationManual in MANUAL mode is applied on ON_MANUAL_REQUEST
```

### Adaptations Relative to P1 and Justification

The syntax is projection-compatible with REF v3 and documents the current `ConditionKeywords` structure used by automation conditions.

1. Section headers remove repeated concept keywords (for example, under `users:` the entry is just `Buyer kind BUYER`, not `user Buyer ...`). Indentation replaces braces in the SME view.
2. Trigger values are typed with `TriggerEvent` instead of free text. This prevents invalid event names at parse time.
3. `AutomationRule` includes explicit condition and action lists. A `Condition` owns one or more `ConditionKeywords` entries instead of a single free-text value.
4. `SortingPolicy` is first-class in the syntax as a named `sorting policies` section. This captures ordering behavior that is central to Amazon, Reddit, and YouTube-like scenarios.
5. Feedback semantics include `allowsText`, `polarity`, and `verificationRequirement` as explicit optional tokens. This supports vote and reaction differences and verification strictness without workarounds.
6. Projection helper concepts (`ContextResourceTypeLink`, `UserTypeSuperType`) are rendered as inline modifiers (`contains`, `extends`) instead of named declarations. This hides implementation details from the surface notation and keeps the abstract syntax tree traceable.

### 2.3 Adaptations from P1 metamodel and justification

The Part 2 assignment requires the team to keep using the P1 metamodel, while allowing adaptations when necessary, as long as they are justified in the report. In practice, the transition from P1 to the current REF v3 metamodel required refining the language so that both graphical and textual editors could represent not only resources and feedback, but also governance and behavioral concepts such as sorting, validation, moderation, automation, and verification in a first-class way.

From the Sirius/tooling perspective, the most relevant metamodel adaptations were the following:

- `SortingPolicy` was promoted as an explicit concept, because ordering behavior is central in the three reference scenarios and needs to be visible in the graphical editor rather than being hidden in generated code or documentation.
- `AutomationRule`, `Condition`, `ConditionKeywords`, and `Action` were kept as explicit model elements so that the DSL can capture executable moderation/automation intent instead of relying only on free-text notes.
- Governance concepts such as `AuthorizationRule`, `ValidationRule`, `ModerationPolicy`, and `VerificationPolicy` were treated as first-class nodes, which makes the DSL more complete and better aligned with the assignment goal of generating most of the backend structure from the model.
- Some concrete-syntax helper constructs used in tools, such as inline `contains` and `extends` views, were intentionally kept as presentation choices rather than as extra domain concepts, so the metamodel remains stable while editors stay readable for domain experts.

These adaptations are justified by the assignment requirements for a DSL that is simple, strongly typed, complete, flexible, and evolvable. They also improve Sirius modeling usability, because the diagram can show high-level domain structure together with policy and automation concerns without forcing users to encode important semantics outside the model.

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

Generated applications should behave like normal Spring Boot applications. The generated code is compiled, tested, and executed without depending on the modeling tools at runtime. Scenario-specific prototypes instantiate this common platform with the concrete resources, feedback definitions, rules, and authorization policies of each REF model.

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

For each concrete scenario, the generator instantiates these artifacts from the REF model. A marketplace scenario may generate products, orders, reviews, verified purchase checks, and star averages. A community scenario may generate posts, comments, votes, reports, and moderation actions. A media platform scenario may generate channels, videos, comments, reactions, subscriptions, and content moderation rules. The generator should treat these as variations of the same REF concepts rather than as unrelated applications.

### 3.4 Extensibility points for manual code

Manual code is expected for scenario-specific behavior that cannot be safely inferred from the metamodel alone. The main extension points are:

- Manual entity subclasses for domain-specific helper methods or invariants.
- Manual repository interfaces for additional derived queries.
- Service hooks for scenario-specific rules, such as context verification, duplicate vote prevention, reputation checks, ownership checks, or platform-specific moderation decisions.
- Manual controller subclasses or extra endpoints when a scenario needs a more ergonomic REST shape.
- Security and authorization refinements when generated rules need to be adapted to framework-level route matching.

The Generation Gap keeps the generated layer reusable while allowing each scenario to implement rules that depend on external state or domain-specific interpretation. The generated service defines the common algorithms and protected hooks. The manual service only overrides the parts that are scenario-specific.

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

Each team member implemented one Spring Boot REF backend prototype following Activity 2 (Java 21, Spring Boot 3, JPA/H2, Generation Gap). Prototypes are reference implementations for Activity 4–5 and are **not** overwritten by DSL generation.

### 4.2 Prototype summary by tool

| Tool | Member | Prototype | Path |
|------|--------|-----------|------|
| Xtext | Pedro Vilarinho | Amazon | `part2/amazon-backend` |
| MPS | Guilherme Cunha | Reddit | `part2/reddit-backend` |
| Sirius | Francisco Peixoto | YouTube | `part2/youtube-backend` |

### 4.3 Inputs for code generation design

The three prototypes supply concrete examples of common vs variable code (entities, feedback flows, policies, manual services). Xtext generation (`RefBackendGenerator`) targets the same architecture; see `part2/tool2-xtext/readme.md`.

---

## 5. Activity 4 - Identify Commonality and Variability in the Code

This compares the three Spring Boot prototypes (`part2/amazon-backend`, `part2/reddit-backend`, `part2/youtube-backend`) against the REF metamodel in [`diagrams/metamodel/ref-metamodel-v3.puml`](../diagrams/metamodel/ref-metamodel-v3.puml). The comparison treats the prototypes as **instances** of the same generation architecture described in Section 3 (Generation Gap, layered backend).

### 5.1 Common parts in the prototypes

These parts are **shared in structure and technology** across Amazon, Reddit, and YouTube backends, even when class names differ.

- **Platform and build:** Java 21, Spring Boot 3, Maven, JPA/Hibernate, H2 (including console-friendly security headers where applicable), consistent package layering (`domain`, `repository`, `service`, `web`, `security`, `config`).
- **Generation Gap pattern:** For each major persistent concept there is a `generated.Generated*` mapped superclass or base type and a thin manual subtype (`Product`, `Post`, `Video`, …) that exists primarily as an **extension point** (often empty today, but reserved for scenario-specific logic).
- **Security baseline:** Password hashing, JWT issuance/filtering, stateless sessions, role literals carried on the user entity and mirrored in Spring Security (`Role` enum aligned with `UserKind` values used in each scenario).
- **Cross-cutting web concerns:** Shared patterns for REST controllers, JSON bodies bound directly to JPA-backed types or DTOs in the same shape, and centralized API error handling (`ApiExceptionHandler`, `ApiError`).
- **Governance primitives present in all three:** Persistent `SortingPolicy`, `ValidationRule` (or a renamed variant with the same responsibility), and moderation-related types (either a reusable `ModerationPolicy` entity as in Amazon, or **moderation check** records attached to posts/videos/comments in Reddit/YouTube that materialize moderation outcomes).
- **Feedback-shaped domain services:** Dedicated services for primary feedback flows (comments, votes/likes, reports, subscriptions) following the same use-case style: load actor, authorize, validate, persist, expose.
- **Policy administration surface:** A `PolicyService` / `PolicyController` pair (manually or generated) listing and mutating policy-like aggregates scoped to a **context root** (catalog/subreddit/channel), even when the underlying tables differ.

These commonalities match the team decision in Activity 2: one reference generator target (Spring/JPA/JWT) with scenario-specific **slots** filled from the REF model.

### 5.2 Variable parts in the prototypes

Variability appears at three levels: **domain vocabulary**, **persistence shape of the same REF concept**, and **behavior encoded outside generated entities**.

| Variability area | Amazon | Reddit | YouTube |
|---|---|---|---|
| **Core resources** | `Product`, `Order`, `OrderItem`, `CommentReview`, … | `Subreddit`, `Post`, `Comment`, … | `Channel`, `Video`, `Comment`, … |
| **Context (`ContextType`)** | Explicit `ContextType` + `ContextResource` linking resources to catalog/search/moderation contexts | `Subreddit` as the community container, with policies scoped to it | `Channel` as the channel container, with channel-scoped permission rows |
| **Authorization (`AuthorizationRule`)** | First-class `AuthorizationRule` JPA aggregate with `ActionKind`, actor role, optional `ContextType`, string targets for resource/feedback | No `AuthorizationRule` entity. **Participation** is modeled as `ParticipationPolicy` (`PermissionAction`, `PermissionAudience`) + **hard-coded** HTTP method/path rules in `SecurityConfiguration` | Same split as Reddit using `ChannelPermissionPolicy` + `SecurityConfiguration` |
| **Automation (`AutomationRule`, `Condition`, `Action`)** | Full persistent automation model (`AutomationRule`, `AutomationCondition`, `AutomationAction`) close to the metamodel | No automation tables. Rule-like behavior is distributed in services or omitted | No automation tables |
| **Verification (`VerificationPolicy`)** | Persistent `VerificationPolicy` CRUD via policy service | Not modeled as the same entity. Verification behavior appears in service logic when needed | Same as Reddit |
| **Votes vs reactions** | `HelpfulVote` on comments (up/down style) | `Vote` + `VoteHistory` on posts | `Like` + `LikeHistory` on videos (like/dislike style enums) |
| **Extra domain concepts** | Order-based “verified buyer” checks, review media references | `CommunityRule`, `ParticipationPolicy`, post/comment moderation check entities | `ChannelPermissionPolicy`, `ContentValidationRule` naming, `CommentSettingsChange` |
| **Manual extensions (Activity 2)** | Example: `ProductEvaluationService` overrides generated verification to combine **role flag** and **order history** (`OrderItemRepository`) | Overrides expected in vote/report services for thresholds, duplicate votes, subreddit membership | Overrides expected for like toggling, channel ownership, video publication rules |

**Structural governance** (automation + declarative authorization + verification policies) is **richest in Amazon** and **thinner in Reddit/YouTube**, where equivalent concerns are split between **smaller policy tables** and **imperative security/service code**. This matters for the generator because not every REF construct is always emitted as the same kind of artifact (entity vs configuration vs Java code).

### 5.3 Mapping of variability to metamodel elements

The next tables map **every metamodel type and enumeration** from REF v3 to **variable or fixed parts** of the three codebases (Java packages, artifacts, or non-code artifacts). “Manual” marks places where the team expects handwritten completion per Activity 2.

#### 5.3.1 Metamodel classes and relationships

| Metamodel element | Amazon (`amazon-backend`) | Reddit (`reddit-backend`) | YouTube (`youtube-backend`) | Notes / manual completion |
|---|---|---|---|---|
| `RefModel` | Scenario identity implied by package `...ref`, `pom.xml` artifactId, and seed data | Package `...ref.reddit`, artifactId, and seed data | Package `...ref`, artifactId, and seed data | No single `RefModel` entity. It could be generated as metadata or documentation |
| `UserType` | `AmazonUser` + `Role` enum | `RedditUser` + `Role` | `YoutubeUser` + `Role` | Subtype is manual extension point on `Generated*` user |
| `ContextType` | `ContextType`, `ContextResource` | `Subreddit` (community container) | `Channel` | Different REF `ContextKind` realizations |
| `ResourceType` | `Product`, `Order`, `OrderItem`, `CommentReview`, … | `Post`, `Comment`, … | `Video`, `Comment`, … | Each scenario’s resource set |
| `Attribute` | Fields inside each `Generated*` mapped superclass | Same | Same | Types map from `PrimitiveType` to Java/Hibernate types |
| `ResourceRelation` | JPA associations on generated entities (e.g., order lines, product containment) | Associations on `Post`, `Comment`, `Vote`, … | Associations on `Video`, `Like`, … | Cardinality/containment in annotations |
| `FeedbackType` | Implicit in distinct entities/services (`ProductReview`, `HelpfulVote`) | Implicit (`Comment`, `Vote`, `Report`, `Subscription`) | Implicit (`Comment`, `Like`, `Report`, `Subscription`) | Could be generated as type codes or separate metadata tables |
| `FeedbackDefinition` | Composite of review + rating + verification hooks in services | Composite of comment/vote/report models + policies | Same as Reddit | Much behavior in **service overrides** (manual) |
| `FeedbackPolicy` | Carried on review/feedback entities and service checks | Status enums on entities (`CommentStatus`, `ContentStatus`, …) | Same style | Often **manual** if not extracted to entities |
| `RatingPolicy` | Star ratings on reviews (fields + validation) | N/A for core Reddit prototype focus | N/A for likes | Variable: only some scenarios use numeric ratings |
| `FeedbackDefinition.uniquePerAuthorTarget` | Enforced in `ProductEvaluationService` / review repository constraints | Enforced in vote/comment services | Enforced in like/comment services | **Manual** hook in generated service template |
| `ValidationRule` | `ValidationRule` entity + `ValidationKind`, `RuleSeverity`, `expression`, `implementationId` | `ValidationRule` (+ Reddit-specific `CommunityRule` as extra domain) | `ContentValidationRule` (same role, different name) | `implementationId` → pluggable Java validators (**manual** classes) |
| `ModerationPolicy` | `ModerationPolicy` entity | Moderation split into `PostModerationCheck`, `CommentModerationCheck` rows | `VideoModerationCheck`, `CommentModerationCheck` | Same REF concept, **different persistence projection** |
| `AuthorizationRule` | `AuthorizationRule` entity + policy CRUD | **Not** a dedicated entity. Approximated by `ParticipationPolicy` + `SecurityConfiguration` rules | `ChannelPermissionPolicy` + `SecurityConfiguration` | Reddit/YouTube variability: **rules split** between data and code |
| `AutomationRule` | `AutomationRule` + nested conditions/actions | Absent as persisted model | Absent | Generator may omit or emit stubs. Execution is **manual** if present |
| `Condition` | `AutomationCondition` | — (no direct type) | — | Amazon-only in current prototypes |
| `ConditionKeywords` | `ConditionKeyword` / keyword list owned by `AutomationCondition` | — | — | Amazon-only |
| `Action` (governance action) | `AutomationAction` | — | — | Amazon-only |
| `VerificationPolicy` | `VerificationPolicy` entity | Not as separate aggregate | Not as separate aggregate | Reddit/YouTube may need **manual** service/policy classes to reach parity |
| `SortingPolicy` | `SortingPolicy` | `SortingPolicy` | `SortingPolicy` | Good example of **identical** metamodel → entity mapping |

#### 5.3.2 Metamodel enumerations

| Metamodel enum | Code mapping (all backends unless noted) |
|---|---|
| `UserKind` | `Role` literals (`GENERIC`, `BUYER`, `SELLER`, `CREATOR`, `MODERATOR`, …) on the user entity. Each scenario uses its own subset |
| `ContextKind` | `ContextKind` enum (Amazon) or implied by root entity (`Subreddit`, `Channel`) |
| `PrimitiveType` | Field types in generated entities (`String`, `BigDecimal`, `boolean`, `Instant`, …) |
| `FeedbackKind` | Packages/services: comment, vote/like, report, subscription class names |
| `FeedbackSubjectScope` | Service methods that accept either resource id or parent feedback id |
| `FeedbackPolarity` | `VoteValue`, `LikeValue`, or vote direction fields |
| `FeedbackStatus` | Enabled/disabled gates in services or enums on feedback |
| `VerificationRequirement` | Amazon: verification toggles on review flow. Others: **manual** parity |
| `ValidationKind`, `RuleSeverity` | `ValidationKind`, `ValidationSeverity` enums in domain |
| `ModerationMode`, `ModerationDecision`, `TriggerEvent` | Present in Amazon. Reddit/YouTube include a partial mirror in moderation check enums |
| `ActionKind` | Amazon: `ActionKind`. Reddit/YouTube: `PermissionAction` + Spring Security `requestMatchers` |
| `ConditionOperator` | Amazon: `ConditionOperator` on `AutomationCondition` |
| `ActionResultKind` | Amazon: result kind on `AutomationAction` |
| `SortCriterion`, `SortDirection` | Shared enums under `domain/enums` in each backend |

#### 5.3.3 Coverage of “every metamodel part” and gaps

- **Fully materialized in all three:** sorting, validation (under different names), core persistence of resources and feedback-shaped aggregates, JWT security shell, Generation Gap entity/repository/service/controller layout.
- **Fully materialized only in Amazon today:** `AutomationRule` subtree (`Condition`, `ConditionKeywords`, `Action`), first-class `AuthorizationRule`, `VerificationPolicy`, richer `ContextType` linking.
- **Metamodel concepts mainly realized as manual Java in Reddit/YouTube:** large parts of `AuthorizationRule` (HTTP-level authorization matrix), some `FeedbackPolicy` / `VerificationPolicy` semantics, and any future `AutomationRule` execution.

This matches the Activity 2 requirement: the generator should emit **stable generated bases** plus **narrow override points** (subclasses, `@Override` service methods, optional `implementationId` classes) so teams can extend behavior where the DSL cannot express fine details.

---

## 6. Activity 5 - Design and Implement Code Generation

### 6.1 Generation rules and templates

The code generation strategy is based on a deterministic pipeline from REF model to Spring Boot backend artifacts.

**Generation pipeline**

1. Parse and validate the REF model (Xtext/MPS/Sirius source) into a normalized in-memory representation.
2. Build a `GenerationPlan` with scenario name, packages, resources, feedback definitions, policies, and endpoint matrix.
3. Execute templates in dependency order (domain -> repository -> service -> web -> security -> config/tests/docs).
4. Write generated artifacts under `generated` packages and preserve manual extension classes (Generation Gap).
5. Run formatting and compile checks.

**Template catalog implemented by the team**

- **Project templates:** `pom.xml`, `application.properties`, `README.md`, boot application class, H2 configuration.
- **Domain templates:** `Generated<Entity>` mapped superclasses, enums, and manual subclasses per entity.
- **Repository templates:** `Generated<Entity>Repository` + manual repository interfaces.
- **Service templates:** `Generated<Entity>Service` CRUD/use-case skeletons + manual services for scenario rules.
- **Web templates:** `Generated<Entity>Controller` REST endpoints + manual controllers.
- **Security templates:** user details service, JWT service/filter, security configuration with role mapping.
- **Error/API templates:** `ApiError`, `ApiExceptionHandler`, common response style.
- **Test templates:** application context test and scenario smoke tests.

**Generation rules (high level)**

- For each `ResourceType`, generate one persistent entity, repository, service, and controller stack.
- For each `FeedbackDefinition`, generate dedicated entity and endpoints bound to its subject scope.
- For each `SortingPolicy`, generate repository query strategy and public read endpoint ordering options.
- For each `AuthorizationRule`, generate route-level security matchers and service-level ownership checks.
- For each `ValidationRule`, generate validation hook method and bind to `implementationId` extension point.
- For each `ModerationPolicy` and `AutomationRule`, generate policy storage/handler artifacts when modeled; otherwise generate no-op hooks in services.

### 6.2 Common parts generation

The following artifacts are always generated for every REF application, independent of scenario content.

- **Build/runtime baseline:** Maven project, Spring Boot dependencies, Java 21 config, H2 persistence setup.
- **Core architecture:** package structure (`domain`, `repository`, `service`, `web`, `security`, `config`) and Generation Gap split (`generated` + manual subclasses).
- **Authentication baseline:** user entity/repository, password hashing, JWT issuance and filter chain.
- **Cross-cutting web layer:** consistent exception mapping, error payload shape, and JSON REST conventions.
- **Base CRUD infrastructure:** generic create/read/list/update/delete scaffolding for generated entities.
- **Testing baseline:** context startup test plus generated API smoke checks for core flows.

These common parts are generated unconditionally because they implement team decisions from Activity 2 (single Spring/JPA/JWT target architecture).

### 6.3 Variable parts generation

Variable parts are generated from model values. The generator reads concrete REF elements and activates templates conditionally.

| Model-driven variability | Trigger in model | Generated output | Generation condition |
|---|---|---|---|
| Scenario identity | `RefModel.name`, `RefModel.version` | Package names, artifactId, app title, README header | Always |
| Roles/actors | `UserType.kind` values | `Role` enum literals and auth checks | Only literals present in model are generated |
| Resource data model | `ResourceType` + `Attribute` | Entity fields, DTO fields, validation annotations | One field per attribute, mapped by `PrimitiveType` |
| Media capabilities | `ResourceType.supportsMedia` or feedback media flags | Media reference fields/endpoints | Generated only when media is enabled |
| Feedback operations | `FeedbackDefinition`, `FeedbackType`, `FeedbackSubjectScope` | Comment/review/vote/report/subscription entities + endpoints | Generated per feedback definition |
| Rating behavior | `FeedbackType.hasRating` + `RatingPolicy` | Numeric rating constraints, aggregation endpoints | Generated only when rating is enabled |
| Verification flow | `VerificationRequirement`, `VerificationPolicy` | Required/optional verification guards, policy service hooks | Generated when verification is present |
| Authorization matrix | `AuthorizationRule` + actor/context/targets | Route policies + service guards | Generated per rule; if missing, defaults are deny-by-default except auth endpoints |
| Sorting/read views | `SortingPolicy` | Sort enums, query methods, controller parameters | Generated per sorting policy |
| Moderation and automation | `ModerationPolicy`, `AutomationRule`, `Condition`, `Action` | Policy entities/handlers or moderation check artifacts | Generated only when those elements exist |

**How generation is decided**

- The generator first computes feature flags from the model (for example: `hasRatings`, `hasSubscriptions`, `hasAutomation`).
- Templates are organized by feature; each template has a clear activation predicate.
- Generated service methods include protected hooks for behavior that depends on external data (manual override point).
- Existing manual classes are never overwritten; only generated classes are replaced on regeneration.

### 6.4 Notes per implementation tool

Each tool contributes to Activity 5 using the same metamodel semantics and target architecture.

- **Tool 1 (MPS):** projectional definitions emit structured model instances and can generate backend code through model-to-text templates; useful for strict model editing and immediate generator feedback.
- **Tool 2 (Xtext):** textual DSL parsing/validation drives deterministic generation templates; best suited for versioned model files and CI-friendly regeneration.
- **Tool 3 (Sirius):** graphical editor creates/updates EMF instances that feed the same generation pipeline after model serialization/export.

To keep cross-tool compatibility, generation uses a normalized intermediate representation independent of source notation (graphical/textual/projectional). This allows the same rules to generate Amazon, Reddit, and YouTube backends with scenario-specific variability.

For the Sirius contribution specifically, the graphical editor does not directly compete with textual generators; instead, it provides a model-authoring and inspection front-end for the same EMF instance consumed by downstream generation steps. This is aligned with the assignment, which states that Sirius is the tool selected for the graphical notation, while Xtext and MPS support textual or projectional notations over the same domain concepts.

Within this team architecture, Sirius contributes in four concrete ways:

- It offers a visual overview of all REF concepts in one navigable diagram, which is useful for domain review sessions and for checking whether a model is complete before generation.
- It exposes typed properties through node labels and property views, reducing visual clutter while still preserving the strongly typed structure expected by the assignment.
- It helps validate cross-reference consistency at the model level, since users can visually inspect links among actors, resources, feedback definitions, and governance rules before code generation starts.
- It produces EMF model instances that can be serialized and handed to the same generation pipeline used by the other tools, which supports the team goal of notation-independent generation.


---

## 7. Activity 6 - Generate Applications

### 7.1 Generation of the three REF scenarios

The team generated or prepared the three reference applications corresponding to the scenarios used throughout Part 2: Amazon, Reddit, and YouTube. These scenarios exercise different subsets of the REF metamodel and therefore act as complementary validation cases for both syntax design and backend generation.

At team level, Activity 6 is understood as the point where the common generation architecture is instantiated with concrete REF models and verified against the expected scenario behavior. The generated applications share the same target platform and architectural conventions described earlier in the report, but differ in the resources, feedback flows, policies, and automation features activated by each model.

A concise view of the scenario coverage is shown below.

| Scenario | Main modeled focus | Representative generated/backend concerns |
|---|---|---|
| Amazon | Product evaluation and verified review flows | Products, orders, reviews, helpful votes, rating constraints, verification checks, moderation and automation support. |
| Reddit | Community discussion and moderation | Subreddits, posts, threaded comments, voting, reports, participation policies, community moderation. |
| YouTube | Media publication and audience feedback | Channels, videos, comments, likes/dislikes, subscriptions, validation rules, moderation checks, channel permission policies. |

These three cases are important because they demonstrate that the DSL is not restricted to a single application style; instead, it covers e-commerce, discussion-community, and media-feedback scenarios using the same REF metamodel family.

### 7.2 Manual extension integration

The assignment explicitly requires support for manual adaptations or extensions in the generated code, so that software engineers can complete the remaining behavior that is not practical to derive automatically from the DSL. The team addressed this through the Generation Gap strategy already described in Sections 3 and 6, where generated classes provide the stable base and handwritten classes provide controlled extension points.

In practical terms, manual extension integration follows these principles:

- Regeneration only replaces artifacts under `generated` packages; handwritten subclasses, additional repositories, and specialized services are preserved.
- Scenario-specific logic that depends on external state or richer domain interpretation is implemented in manual services or controllers, not by editing generated classes directly.
- `implementationId`-style hooks and protected service methods are used as integration points for validation, moderation, verification, and authorization refinements that cannot be fully inferred from the model.
- This separation allows the team to regenerate the backend when the REF model evolves, while minimizing merge conflicts and preserving custom logic.

This solution matches the project brief, which states that some generated-code aspects should allow user extension in the base programming language and be integrated with the generated solution.

### 7.3 Cross-tool compatibility tests

Cross-tool compatibility means that the same REF concepts can be edited with different concrete syntaxes or tools, while still producing semantically equivalent model instances for generation. This is especially important in this project because each team member used a different tool, but all tools had to target the same domain metamodel and overall application family.

The team compatibility strategy is based on a shared EMF/Ecore metamodel and on the normalization of model contents before generation. Under this approach, Sirius contributes the graphical notation, Xtext contributes a textual notation, and MPS contributes a projectional/textual notation, but all of them ultimately describe the same REF structures.

At report level, the main compatibility checks are the following:

- The same scenario concepts can be represented in each tool without introducing tool-specific semantic elements.
- Core relationships such as resource containment, feedback targets, authorization links, and policy ownership remain consistent after serialization/export.
- The generated backend architecture remains stable regardless of whether the model originated in Sirius, Xtext, or MPS, because generation is driven by normalized model semantics rather than editor-specific syntax.
- Scenario-level differences are caused by the REF model itself, not by the concrete syntax tool used to create it.

For the Sirius part in particular, compatibility depends on keeping the graphical notation close to the metamodel and avoiding editor-only modeling shortcuts that would make exported models diverge from the common team interpretation.

### 7.4 Model evolution and migration proposal

Model evolution is an explicit project concern, since the assignment characterizes the DSL as evolvable and allows justified adaptations to the metamodel across project stages. The team therefore treats evolution not as an exception but as a normal part of refining the REF language and its generators.

The proposed migration strategy is incremental:

1. Preserve the Ecore metamodel as the single source of truth for structural concepts and enumerations.
2. When a new concept is added, first update the metamodel, then align the concrete syntaxes (Sirius, Xtext, MPS), and only after that adapt generators and prototypes.
3. Prefer additive changes, such as introducing new optional concepts or enum literals, over breaking renames/removals whenever possible.
4. When breaking changes are necessary, provide model transformation or migration rules so older scenario models can still be upgraded consistently.
5. Preserve manual code through the Generation Gap so that model evolution mainly affects generated artifacts and controlled extension contracts, rather than handwritten business logic.

From the Sirius viewpoint, this proposal is especially important because viewpoint specifications, mappings, and property views depend directly on the metamodel structure. Keeping metamodel evolution disciplined reduces editor breakage and makes it easier to update diagram mappings while preserving existing model instances and scenario diagrams.

---

## 8. Final compliance summary for the Part 2 assignment

This section complements the previous team report content with a direct mapping between the Part 2 assignment activities
and the artifacts currently present in the repository. It does not replace the preceding sections; it records the final
state reached by the team after the implementation and test iterations.

### 8.1 Activity-to-artifact mapping

| Assignment activity | Required team/individual outcome | Repository evidence |
|---|---|---|
| Activity 1 - Concrete syntax | Graphical and textual notations; tool-specific implementations. | Team syntax design in Sections 2.1 and 2.2; Sirius VSM in `part2/eclipse_sirius_2nd_Instance/enorm.design/description/enorm.odesign`; individual tool reports under `tool1-mps`, `tool2-xtext`, and `tool3-sirius`. |
| Activity 2 - Common application features | Common language, framework, architecture, generated baseline, and manual extension strategy. | Spring Boot/JPA/H2/JWT-oriented backend architecture described in Sections 3 and 6; generated project templates in `generate.mtl`; manual extension strategy through generated/manual class split. |
| Activity 3 - Prototypes | Manual/example REF backend applications used to understand code to generate. | Scenario backends and generated counterparts for Amazon, Reddit, and YouTube under `part2/` and `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen`. |
| Activity 4 - Commonality and variability | Mapping between metamodel parts and variable/generated code. | Section 5 tables mapping REF classes/enums to generated domain, repository, service, controller, policy, and manual hook code. |
| Activity 5 - Code generation | Templates/rules; common parts always generated; variable parts generated from model values. | Acceleo generator in `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/generate.mtl`; generated app outputs in `scr-gen`. |
| Activity 6 - Generate applications | Each tool can generate all three scenarios; generated code supports manual additions; tests and issues are reported. | Three `.enorm` scenario models, generated Spring Boot apps, Maven tests, acceptance tests, and individual report issue sections. |

### 8.2 Final common backend architecture

The generated backend target selected by the team is a Java Spring Boot REST application using:

- Spring Web for REST controllers;
- Spring Data JPA for persistence;
- H2 in-memory database for runtime demonstration;
- Maven as build system;
- generated domain/repository/service/web/security/config packages;
- a Generation Gap style split between generated bases and manual extension classes;
- `ApiError` and `ApiExceptionHandler` for consistent JSON error responses;
- JUnit/MockMvc acceptance tests for API-level verification.

All generated applications use H2 memory URLs, for example:

```properties
spring.datasource.url=jdbc:h2:mem:amazon;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.jpa.hibernate.ddl-auto=update
```

Therefore, data is persisted only while the backend process is running and is intentionally lost after the app stops. This
keeps the demos reproducible and avoids committing persistent local database state as part of the generated application.

### 8.3 Final model coverage for the three scenarios

The team maintains explicit REF models for the three required scenarios. In the Sirius/EMF instance set, the final coverage
is:

| Scenario model | Resource types | Feedback definitions | Authorization rules | Validation rules | Moderation policies | Automation rules | Verification policies | Sorting policies |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Amazon | 20 | 2 | 4 | 1 | 1 | 1 | 1 | 2 |
| Reddit | 15 | 7 | 9 | 3 | 3 | 3 | 1 | 3 |
| YouTube | 15 | 5 | 11 | 4 | 3 | 4 | 2 | 3 |

This demonstrates that the models cover not only structural resources but also feedback, authorization, validation,
moderation, automation, verification, and sorting concerns, as required by the assignment.

### 8.4 Common parts that are always generated

The final generator emits the following common artifacts for every generated backend:

| Common generated part | Purpose |
|---|---|
| Maven project and README | Build, dependency, and usage baseline. |
| Boot application class | Spring Boot entry point. |
| `application.properties` | H2, JPA, server port, and runtime configuration. |
| Domain package structure | Persistent entities and generated mapped superclasses. |
| Repository package structure | Spring Data repositories for generated entities. |
| Service package structure | CRUD/use-case services and generated service bases. |
| Web package structure | REST controllers and generated controller bases. |
| Security stubs | JWT service/filter, user details service, and security configuration shell. |
| API error handling | `ApiError` and `ApiExceptionHandler`. |
| Tests | `AcceptanceTest`, test properties, and context/test scaffolding. |

### 8.5 Variable parts generated from model values

Variable generation is controlled by the REF model contents:

| Model element/value | Generated variability |
|---|---|
| `RefModel.name` | Package names, artifact identifiers, app class names, H2 database name, response model name. |
| `ResourceType` | Entity/repository/service/controller stacks, except conceptual resources intentionally skipped. |
| `Attribute` | Entity fields or flexible attribute maps, depending on the selected scenario template. |
| `FeedbackDefinition` and feedback kind | Review/comment/vote/like/report/subscription endpoints and services. |
| `RatingPolicy` | Rating validation and product average rating support where applicable. |
| `AuthorizationRule` and user kinds | Security and permission artifacts, sometimes completed manually in scenario services. |
| `ValidationRule.implementationId` | Hook for Java-side validation logic that cannot be fully expressed in the DSL. |
| `ModerationPolicy` and `AutomationRule` | Moderation checks, simulation endpoints, rule models, and scenario-specific automation behavior. |
| `SortingPolicy` | Sorting policy entities and read-order metadata. |
| `VerificationPolicy` | Verification entities or service hooks, especially in the Amazon review scenario. |

This satisfies the assignment requirement to explain both what is generated unconditionally and what is generated only
when specific model values are present.

### 8.6 Manual extension support

The team addressed the new Part 2 requirement for manual adaptations by adopting a Generation Gap approach:

- generated files are placed under `generated` packages or named with a `Generated*` prefix;
- handwritten classes extend or wrap generated bases;
- regeneration can replace generated code while preserving manual classes;
- scenario logic that is too specific for the DSL is implemented in manual services/controllers;
- `implementationId` and protected methods act as stable hooks for validation, moderation, authorization, and automation logic.

Examples include moderation services, product evaluation behavior, authorization/security decisions, and validation behavior
that depends on Java code rather than only on model data.

### 8.7 Generated application test evidence

The generated applications were checked with Maven after the final generator and model updates:

| Generated backend | Command | Result |
|---|---|---|
| Amazon | `mvn test` | Passed |
| Reddit | `mvn test` | Passed |
| YouTube | `mvn test` | Passed |

The generated `AcceptanceTest` classes use `MockMvc` and validate:

- registration through `POST /api/auth/register`;
- login through `POST /api/auth/login`;
- reachability of a generated collection endpoint;
- JSON API error handling for missing resources through `ApiExceptionHandler`.

### 8.8 Issues found during integration tests

The main integration issues found and corrected were:

- inconsistent user entity naming across models and templates (`RedditUser`/`YoutubeUser` versus the shared `UserType`);
- generated Amazon automation controller code calling child-linking methods that were not generated in the domain classes;
- generated test expectation mismatch for the exact YouTube model name capitalization;
- the need to keep conceptual resources such as shared content abstractions out of concrete entity generation while still
  preserving their semantic role in the model.

These issues were useful because they confirmed that Activity 6 must test the generated code, not only inspect templates.

### 8.9 Cross-tool compatibility conclusion

The team compatibility objective is achieved at the semantic and architectural levels:

1. all tools target the same REF concepts and metamodel vocabulary;
2. generated applications share the same Spring Boot/JPA/H2 architecture;
3. manual extension points follow the same generated/manual split;
4. the three scenario models exercise the same family of features across tools;
5. generated code can be compared and combined because package structure, entity/service/controller layering, and API
   conventions are intentionally aligned.

The main limitation is that each tool still has tool-specific authoring mechanics, so perfect interchangeability of editor
artifacts is less important than preserving semantic equivalence of the REF model and compatibility of generated code.

### 8.10 Model evolution and migration plan

The final team migration plan is:

1. version the Ecore metamodel and scenario models;
2. prefer additive metamodel changes where possible;
3. when breaking changes are necessary, define an explicit migration step for existing REF instances;
4. update Sirius `.odesign`, Xtext grammar, MPS language concepts, and generators in the same change set;
5. regenerate the three scenario backends;
6. run the generated acceptance tests as regression checks;
7. preserve handwritten Java extensions through the Generation Gap structure.

This provides a realistic path for the evolvable DSL requirement in the assignment and uses Amazon, Reddit, and YouTube
as regression scenarios for future language changes.
