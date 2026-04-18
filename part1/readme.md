# ENORM Project, Part 1 - Team Report

## Domain Knowledge Obtained from Analyzing the Applications

## Justification of Domain Model Decisions

The domain models for **YouTube**, **Amazon** and **Reddit** were designed to keep two goals in balance: faithfully representing each platform and enabling a common abstraction that supports the REF DSL metamodel.

### Amazon

###TODO

### Reddit

| Domain decision in the model | Why this was modelled this way | Evidence/source (official) | What to verify/cite in the presentation |
|---|---|---|---|
| Separate user roles (`User`, `Moderator`) | Reddit has distinct user types with different responsibilities. Moderators have governance powers that regular users lack, so role separation is essential. | [Moderator guidelines](https://www.reddithelp.com/en/categories/reddit-101/moderators); [User privileges](https://www.reddithelp.com/en/categories/reddit-101/your-reddit-account) | Confirm moderator capabilities (rule enforcement, content removal, user management) and map to `AuthorizationRule`. |
| `Subreddit` as an aggregate that contains posts and community rules | Subreddits are the organizational unit in Reddit. Each community has its own rules, policies, and moderation team. | [Create/manage subreddit](https://www.reddithelp.com/en/categories/moderating/moderator-resources); [Subreddit design](https://reddit.fandom.com/wiki/Subreddit) | Cite that subreddits are the primary container for content and governance policies. |
| `Content` superclass with `Post` and `Comment` | Both posts and comments are subject to voting, reporting, and moderation in Reddit. A shared parent enables unified feedback handling. | [Voting system](https://www.reddithelp.com/en/categories/reddit-101/voting); [Report content](https://www.reddithelp.com/en/categories/reddit-101/reporting) | Justify why posts and comments share common feedback mechanisms (votes, reports). |
| Recursive `Comment` relationship (replies) | Reddit comments support threaded conversations where users reply directly to comments. Recursion is required for this nested structure. | [Comment threading](https://reddit.fandom.com/wiki/Comment#Threaded_Comments); [Community Guidelines](https://www.reddithelp.com/en/categories/reddit-101/rules-reporting) | Show that comment replies are core to Reddit's discussion format. |
| `Vote` with upvote/downvote semantics | Reddit's voting system uses upvotes and downvotes to rank content and express community sentiment. This is fundamental to content discovery. | [Upvote/downvote system](https://www.reddithelp.com/en/categories/reddit-101/voting); [Karma](https://www.reddithelp.com/en/categories/reddit-101/what-is-karma) | Cite voting as the primary feedback mechanism and its role in ranking and karma calculation. |
| `Report` with status tracking (PENDING, REVIEWED, DISMISSED) | Reporting is a core moderation workflow in Reddit where community members flag content and moderators review. Status tracking reflects the review process. | [Report content](https://www.reddithelp.com/en/categories/reddit-101/reporting); [Moderation tools](https://www.reddithelp.com/en/categories/moderating/moderator-resources) | Map report lifecycle to moderation queue and moderator actions. |
| `AutomationRule` with trigger and condition | Reddit subreddit moderators can set up automations (e.g. auto-remove low karma posts). This enables policy-driven moderation at scale. | [AutoModerator](https://www.reddit.com/r/AutoModerator/); [Moderation automation](https://reddit.fandom.com/wiki/AutoModerator) | Cite AutoModerator or similar tools; show trigger-condition-action pattern. |
| `CommunityRule` as explicit policy documents | Each subreddit defines rules that govern member behavior. These must be explicit, discoverable, and enforceable. | [Community rules](https://reddit.fandom.com/wiki/Rules); [Set subreddit rules](https://www.reddithelp.com/en/categories/moderating/moderator-resources) | Verify that community rules align with subreddit policies and are displayed to users. |
| `ParticipationPolicy` controlling POST, COMMENT, VOTE, REPORT actions | Reddit allows subreddit moderators to restrict participation (e.g. member-only posting, karma requirements for commenting). Policies make these controls explicit. | [Restricted posting](https://www.reddithelp.com/en/categories/moderating/moderator-resources); [Karma restrictions](https://reddit.fandom.com/wiki/Karma) | Cite specific participation restrictions (new user posting delay, karma thresholds). |
| `SortingPolicy` determining content order (DATE, VALUE, RELEVANCE) | Reddit provides multiple sorting options (new, hot, top, best, controversial). This is essential for content discovery and user experience. | [Sorting options](https://reddit.fandom.com/wiki/Sorting); [How sorting works](https://www.reddithelp.com/en/categories/reddit-101/posts) | Explain sorting algorithms and their role in content presentation. |
| `ContentValidationRule` targeting POST or COMMENT with severity | Reddit uses automated systems to detect and handle spam, offensive content, and rule violations. Separate rules per content type reflect different moderation signals. | [Community Guidelines](https://www.reddithelp.com/en/categories/reddit-101/rules-reporting); [Anti-spam measures](https://reddit.fandom.com/wiki/Spam) | Map content validation rules to specific policy violations (spam, harassment, etc.). |
| `PostModerationCheck` and `CommentModerationCheck` as distinct entities | Post and comment moderation may involve different checks (e.g. link verification, comment toxicity detection). Separate checks reflect these differences. | [Moderation tools](https://www.reddithelp.com/en/categories/moderating/moderator-resources); [Content removal](https://www.reddithelp.com/en/categories/reddit-101/rules-reporting) | Cite moderation workflows and tools specific to post vs. comment moderation. |
| `MediaAttachment` in comments | Reddit comments can include embedded images, GIFs, videos, and links. Media is a first-class element of comment content. | [Post media support](https://reddit.fandom.com/wiki/Formats); [Comment formatting](https://www.reddithelp.com/en/categories/reddit-101/formatting) | Verify media types supported and their handling in moderation. |

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

## Metamodel Graphical Representation

For later activities (especially visualizations), each element of the metamodel will need a concrete textual and graphical representation. A first draft of the mapping to PlantUML is the following:

Concept | Description | Example textual representation
------- | ----------- | ------------------------------
RefModel | Root of the REF specification; groups user types, resource types, feedback and automations | `REF MODEL MyApp`
UserType | User role that can participate in feedback and processes | `USER TYPES user, buyer IS user, seller`
ResourceType | Type of resource that can be evaluated | `RESOURCE TYPE product : name AS TEXT, description AS TEXT, image AS IMAGE`
Attribute | Named property of a resource or feedback type | `text AS TEXT`, `rating AS NUMBER`
FeedbackType | Structure of a feedback entity (fields, rating, recursive) | `FEEDBACK TYPE rateType : text AS TEXT, rate AS ONETOFIVE`
FeedbackDefinition | Definition that binds a feedback type to a resource and permissions | `FEEDBACK productReview : rateType, product, WRITE buyer, VALIDATION: automatic: automaticProductReviewVerification(...)`
ValidationRule | Named rule that must hold for models or feedback | `VALIDATION automatic: automaticProductReviewVerification(buyer, text, rate)`
AuthorizationRule | Permission of a user type to perform an action | `WRITE buyer`, `MODERATE moderator`
AutomationRule | Automatic process reacting to events (e.g. Reddit automation) | `AUTOMATION onNewReport(...) DO ...`

This table will be refined in Activity 6, when designing the concrete textual and graphical projections. For now, it documents how the metamodel elements relate to the example textual projection given in the assignment.

## Presentations of Models (instances)
