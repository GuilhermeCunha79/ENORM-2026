# ENORM Project, Part 1 - Team Report

## Domain Knowledge Obtained from Analyzing the Applications

## Justification of Domain Model Decisions

The domain models for **YouTube**, **Amazon** and **Reddit** were designed to keep two goals in balance: faithfully representing each platform and enabling a common abstraction that supports the REF DSL metamodel.

### Amazon

###TODO

### Reddit

###TODO

### YouTube

| Domain decision in the model | Why this was modelled this way | Evidence/source (official) | What to verify/cite in the presentation |
|---|---|---|---|
| Separate user roles (`User`, `Creator`, `Moderator`) | YouTube has different responsibilities for content owners and moderation actors, so role separation makes permissions explicit. | [Channel permissions](https://support.google.com/youtube/answer/9481328); [Report content](https://support.google.com/youtube/answer/2802027) | Confirm role capabilities (manage channel, moderation/report handling) and map to `AuthorizationRule`. |
| `Channel` as an aggregate that contains videos | Channels are the publishing unit in YouTube and organize creator content. | [Create/manage channel](https://support.google.com/youtube/answer/1646861) | Cite that channels are the owner context for uploaded videos. |
| `Content` superclass with `Video` and `Comment` | Both videos and comments receive interactions and moderation, so a shared parent simplifies likes/reports/validation targeting. | [Comment and reply behavior](https://support.google.com/youtube/answer/6000976); [Community Guidelines](https://www.youtube.com/howyoutubeworks/policies/community-guidelines/) | Justify common lifecycle states and shared moderaton operations. |
| Recursive `Comment` relationship (replies) | YouTube comments support threaded replies. Recursion is required to represent this conversation structure. | [Comment and reply behavior](https://support.google.com/youtube/answer/6000976) | Show that replies-to-comments are native behavior, not an artificial design choice. |
| Explicit `Like` and `LikeHistory` entities | Engagement actions are distinct events over content. History supports auditability and behavior analysis over time. | [Like/dislike interactions](https://support.google.com/youtube/answer/6083270) | Verify if your scope requires persistent history; if not mandatory, classify as design extension. |
| `Subscription` between user and channel | Channel subscription is a core YouTube interaction and must be represented as a first-class feedback/engagement action. | [Subscribe to channels](https://support.google.com/youtube/answer/4489286) | Cite subscription as a direct user-to-channel relation. |
| `Report` with moderation status | Reporting harmful/inappropriate content is an explicit YouTube workflow with review outcomes. | [Report content](https://support.google.com/youtube/answer/2802027); [Community Guidelines](https://www.youtube.com/howyoutubeworks/policies/community-guidelines/) | Map report lifecycle states to moderation decisions in your metamodel. |
| `VideoModerationCheck` and `CommentModerationCheck` | YouTube combines automated and human review processes. Separate checks per target reflect different moderation signals and outcomes. | [Manage held comments](https://support.google.com/youtube/answer/9483359); [Fighting misinformation](https://www.youtube.com/howyoutubeworks/our-commitments/fighting-misinformation/) | Cite that moderation differs by content type and may involve automated systems. |
| `ChannelPermissionPolicy` and comment status changes | YouTube allows creators to configure interaction permissions (for example, comment behavior), so policy objects make governance explicit. | [Manage held comments](https://support.google.com/youtube/answer/9483359); [Channel permissions](https://support.google.com/youtube/answer/9481328) | Verify exact policy options used in your model and align enum values to documented settings. |
| `ContentValidationRule` abstraction | Platform policies (copyright, spam, community guidelines) are policy-driven constraints, so modelling them as reusable rules supports extensibility. | [Copyright policy basics](https://support.google.com/youtube/answer/2797466); [Community Guidelines](https://www.youtube.com/howyoutubeworks/policies/community-guidelines/) | Connect each rule type in the domain model to one policy family in YouTube docs. |

## Design of the Metamodel

The metamodel for the REF DSL (Resource Evaluation and Feedback) was designed as the **union and generalization** of the three target scenarios described in the assignment: **YouTube**, **Amazon** and **Reddit**. All three share common concepts:

- There are **resources** being evaluated (videos, products, posts).
- There are different **user types/roles** (viewers, buyers, sellers, moderators, etc.) with distinct permissions.
- There are several forms of **feedback** (ratings, comments, votes, reports).
- There are **behaviours/processes** around feedback (verification of reviews, moderation workflows, automations).

Instead of modelling YouTube, Amazon and Reddit separately, the metamodel introduces **generic concepts** that can be instantiated and combined to represent each platform:

- **RefModel** – the root of a REF specification. It aggregates all user types, resource types, feedback types/definitions and automation rules for a given application.
- **UserType** – represents a role or type of user in the application (e.g. `user`, `buyer`, `seller`, `moderator`). User types can form a hierarchy through a *superTypes* relationship (e.g. `buyer` is a `user`).
- **ResourceType** – represents a type of resource that can be evaluated (e.g. `video`, `product`, `post`, `comment`). Each resource type has a set of **attributes** that describe its structure (e.g. `title`, `description`, `image`, `price`).
- **Attribute** – represents a named property of a resource (or of feedback), with a **PrimitiveType** (TEXT, NUMBER, BOOLEAN, DATE, IMAGE, VIDEO). This is sufficient to cover typical fields in the three scenarios.
- **FeedbackType** – defines the structure of a specific kind of feedback (e.g. a 1–5 star rating with text, a comment, a vote). It indicates whether the feedback includes a star **rating** and whether it is **recursive** (e.g. comments that can reply to other comments).
- **FeedbackDefinition** – links a **FeedbackType** to the **ResourceType** it applies to and to the **UserType**(s) allowed to create that feedback. It also aggregates the **ValidationRule**(s) that must hold for that feedback (e.g. rules for “verified purchase”, content checks, etc.).
- **ValidationRule** – represents a domain rule that must hold for a model (e.g. rating within [1,5], verified purchase consistency, non-empty comment). Each rule has a **kind** (AUTOMATIC or MANUAL) and an `implementationId` that can be used later by code generators or validators to bind to concrete logic.
- **AuthorizationRule** – captures that a given **UserType** can perform a specific **ActionKind** over a **ResourceType** or **FeedbackDefinition** (e.g. `buyer` can WRITE a `productReview`, `moderator` can MODERATE `comment`).
- **AutomationRule** – abstracts automation mechanisms like Reddit’s automations and other automatic processes (e.g. auto-moderation, automatic verification). An automation rule has a `trigger`, an optional `condition` and an `actionDescription` describing what happens when it fires. It can reuse existing **ValidationRule**(s) to express conditions.

This design supports:

- The **structural aspects**: through `ResourceType`, `Attribute`, `UserType`, `FeedbackType` and `FeedbackDefinition`, we can represent the entities and their properties for all three scenarios.
- The **authorization aspects**: through `AuthorizationRule` and `ActionKind`, we can express which roles can create, read, moderate, validate or report each kind of feedback and resource.
- The **behavioural aspects**: through `ValidationRule` and `AutomationRule`, we can describe verification processes (like Amazon’s verified purchase), content checks, moderation rules and Reddit-like automations.

The result is a **concise but extensible** metamodel: new resource kinds, feedback forms or automation patterns can be added by defining additional instances of the existing concepts, without changing the core classes. A graphical view of the metamodel is provided in the PlantUML diagram in `../diagrams/ref-metamodel.puml`.

## Constraints and Refactorings

Constraints are rules that instances of the REF DSL must satisfy beyond what is enforced by the metamodel (e.g. multiplicities). For each constraint we indicate whether it is enforced by the **relationship** (cardinality in the metamodel), by **code** in the tool (Constraint), or by code with an associated **refactoring/quick fix** (Constraint & Refactoring). The design is aligned with the three scenarios (YouTube, Amazon, Reddit) and with the domain rules identified in Activity 3.

### RefModel

| Element | Rule | Type | Refactoring (when applicable) |
|--------|------|------|-------------------------------|
| name | Must be present | Constraint | — |
| name | Must have more than 2 characters | Constraint | — |
| name | Must start with a capital letter | Constraint & Refactoring | Capitalize first letter of `name` |
| userTypes, resourceTypes, feedbackDefinitions | At least one of these must be non-empty for a useful model | Constraint | — |

*OCL (example for name):*  
`context RefModel inv: name <> null and name.size() > 2 and name.substring(1,1).toUpper() = name.substring(1,1)`

### UserType

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| name | Must be unique within the RefModel | Constraint | — |
| name | Must start with a capital letter | Constraint & Refactoring | Capitalize first letter |
| superTypes | Must not contain self (no direct self-inheritance) | Constraint | Remove self from superTypes |
| superTypes | Must not form a cycle (A → B → A) | Constraint | — (no automatic fix; user must break cycle) |

*Pseudo-code (uniqueness):* For each other UserType in the same RefModel, `other.name <> self.name`.  
*Pseudo-code (cycle):* No path from self to self following superTypes.

### ResourceType

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| name | Must be unique within the RefModel | Constraint | — |
| name | Must have more than 2 characters | Constraint | — |
| name | Must start with a capital letter | Constraint & Refactoring | Capitalize first letter |
| attributes | Must have at least one attribute | Relationship / Constraint | — |

### Attribute

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| name | Must be unique within the containing ResourceType or FeedbackType | Constraint | — |
| type | Must be set (non-null) | Relationship | — |

### FeedbackType

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| name | Must be unique within the RefModel | Constraint | — |
| name | Must start with a capital letter | Constraint & Refactoring | Capitalize first letter |

### FeedbackDefinition

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| type | Must reference an existing FeedbackType | Relationship | — |
| subject | Must reference an existing ResourceType | Relationship | — |
| writers | Should have at least one writer when the definition is used for WRITE | Constraint | Add first UserType from model as default writer (Constraint & Refactoring) |

### ValidationRule

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| implementationId | Must be present when rule is used for code generation | Constraint | — |
| implementationId | Must have at least 3 characters | Constraint & Refactoring | Pad with default prefix to reach min length |
| kind | Must be set | Relationship | — |

### AuthorizationRule

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| allowedAction | Must be set | Relationship | — |
| role (UserType) | Must reference an existing UserType | Relationship | — |

### AutomationRule

| Element | Rule | Type | Refactoring |
|--------|------|------|--------------|
| name | Must be present | Constraint | — |
| name | Must start with a capital letter | Constraint & Refactoring | Capitalize first letter |
| trigger | Must be non-empty | Constraint | — |

These constraints and refactorings are implemented in the Xtext tool (Validation Rules and Quick Fixes) as described in the individual report for tool 2 (Xtext).

## Activity 6 - Model Projections/Visualizations (Team + Sirius)

For Activity 6, we designed and implemented two complementary projections for REF models:

- **Textual projection**: a deterministic canonical listing of model elements and key properties.
- **Graphical projection**: a generated PlantUML view aligned with the same semantic elements.

Team deliverable (notation design + mapping) and individual deliverable (Sirius implementation) are covered by the representation table below and by the Java generators in `part1/tool3-sirius/src/pt/isep/enorm/m1a4/ref/design/Services.java`.

### Representation mapping by metamodel element

| Metamodel element | Textual notation | PlantUML notation |
|---|---|---|
| `RefModel` | `REF MODEL <name> VERSION <version>` | Root object `<<RefModel>>` |
| `UserType` | `- <name> kind=<kind> extends [..]` | Object `<<UserType kind>>`; inheritance with `..|>` |
| `ContextType` | `- <name> kind=<kind> contains [..]` | Object `<<ContextType kind>>`; `contains` links to resources |
| `ResourceType` | `- <name> supportsMedia=<bool>` | Class `<<ResourceType>>` |
| `Attribute` | `* <name>: <type> required=<bool> multiValued=<bool>` | Class members in `ResourceType` |
| `ResourceRelation` | `- <name>: <src>[c1] -> <tgt>[c2] containment=<bool> recursive=<bool>` | Association with cardinalities and relation label |
| `FeedbackType` | `- <name> kind=<kind> scope=<scope> hasRating=<bool> ...` | Object `<<FeedbackType kind>>` + detail note |
| `FeedbackDefinition` | `- <name> type=<...> author=<...> subjectResource=<...> ...` | Object `<<FeedbackDefinition>>` + links to type/author/targets |
| `FeedbackPolicy` | `* policy status=<status>` | Composed object `<<FeedbackPolicy>>` |
| `RatingPolicy` | `* rating <min>..<max> step=<step>` | Composed object `<<RatingPolicy>>` |
| `ValidationRule` | `- <name> kind=<kind> severity=<severity> ...` | Object `<<ValidationRule kind>>` + applies-to links |
| `AuthorizationRule` | `- actor=<...> action=<...> context=<...> ...` | Object with stereotype `<<ActionKind>>` + actor/context/targets |
| `ModerationPolicy` | `- <name> mode=<...> decision=<...> trigger=<...>` | Object `<<Moderation mode>>` + monitor/executor/context links |
| `AutomationRule` | `- <name> trigger=<...> condition=<...> action=<...>` | Object `<<AutomationRule>>` + links to context/feedback/validation |
| `VerificationPolicy` | `- <name> mode=<...> appliesWhen=<...> verifies=<...>` | Object `<<VerificationPolicy mode>>` + verifies link |

### Sirius implementation detail (individual task)

Implemented export services:

- `exportPlantUml(EObject)` generates `<modelName>-plantuml.puml`.
- `exportTextProjection(EObject)` generates `<modelName>-text.txt`.

These services can be connected in Sirius tools through service calls (`service:exportPlantUml(self)`, `service:exportTextProjection(self)`) or through an **External Java Action Call** delegating to the same generator logic.

### Evidence and validation checklist

To validate this activity in the project delivery:

- Execute both exports from a `RefModel` in Sirius.
- Confirm generation of `*-plantuml.puml` and `*-text.txt` files.
- Confirm output is deterministic for unchanged model inputs.
- Confirm the PlantUML file renders correctly to PNG/SVG.
- Confirm all REF metamodel elements in the table are represented in both projections.

## Presentations of Models (instances)
