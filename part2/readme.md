# ENORM Project, Part 2 - Team Report

This document summarizes the team work for Part 2 of the ENORM project in the REF domain.
 
## Graphical Representation

TODO

## Textual Representation

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
| RefModel | `ref [name] version [semver]` followed by section headers `[section]:` |
| UserType | In `users:` section: `user [Name] kind: [UserKind] extends [UserTypeName], ...` |
| ContextType | In `contexts:` section: `[Name] with [ContextKind] kind, contains [ResourceTypeName], ...` |
| ResourceType | In `resources:` section: `[Name] [ supports media [bool] ], extends [ResourceTypeName], ... with fields: [Attribute], ...` |
| Attribute | In `fields` list: `- [name] is a required: [bool] and multi valued [bool] [PrimitiveType]` |
| ResourceRelation | In `relations:` section: `[Name] from [ResourceType] [[srcCard]] to [ResourceType] [[tgtCard]], containment: [bool], recursive: [bool]` |
| FeedbackType | In `feedback-types:` section: `[Name] kind: [FeedbackKind] applies on [FeedbackSubjectScope] , has rating: [bool], recursive: [bool], allows media: [bool], allows text: [bool], with polarity: [FeedbackPolarity])` |
| FeedbackDefinition | In `feedback-definitions:` section: `[Name] authored by [UserType] [ on resource [ResourceType] or feedback [FeedbackDefinition] ] requires a verified context: [bool], verification requirement: [VerificationRequirement], unique per author target: [bool], feedback policy: [FeedbackPolicyName] policy status [FeedbackStatus], [ rated between [min] and [max] with [step] step ]` |
| FeedbackPolicy | Named policy under a feedback definition: `[Name] policy status [FeedbackStatus]` (inline with FeedbackDefinition) |
| RatingPolicy | Inline under a feedback definition: `rated between [min] and [max] with [step] step` |
| ValidationRule | In `validations:` section: `[Name] kind [ValidationKind] severity [RuleSeverity] expr "[expression]" impl [implementationId] appliesToResource [ResourceType] appliesToFeedback [FeedbackDefinition] invokedBy [AutomationRule]` |
| ModerationPolicy | In `moderations:` section: `[Name] mode [ModerationMode] trigger [TriggerEvent] decision [ModerationDecision] monitors resource [ResourceType] on feedback [FeedbackDefinition] executed by [UserType] in context [ContextType]` |
| AuthorizationRule | In `authorizations:` section: `[AuthName] for [ActionKind] performed by [UserType] in context of [ContextType] on resource [ResourceType] \| on feedback ( [FeedbackDefinition]` |
| AutomationRule | In `automations:` section: `[Name] trigger [TriggerEvent] on feedback [FeedbackDefinition] on resource [ResourceType] in context [ContextType] uses [ValidationRule]` with nested `conditions:` and `actions:` blocks |
| Condition | In `conditions:` block: `[Name] field [AttributeName] op [ConditionOperator] value "[value]"` |
| Action | In `actions:` block: `[Name] kind [ActionResultKind] message "[message]"` |
| VerificationPolicy | In `verifications:` section: `[Name] mode [ValidationKind] when [TriggerEvent] verifies [FeedbackDefinition]` |
| SortingPolicy | In `sorting-policies:` section: `[Name] applies to resource [ResourceType] and/or applies to feedback [FeedbackDefinition] in context of [ContextType] sorted by [SortCriterion] with direction [SortDirection]` |
 
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
  user Reviewer kind: GENERIC
  user Buyer kind: BUYER extends Reviewer
  user Seller kind: SELLER
  user Moderator kind: MODERATOR

resources:
  Product [ supports media false ], extends << ... >> with fields:
    - Id is a required: true and multi valued false TEXT
    - Name is a required: true and multi valued false TEXT
    - Description is a required: true and multi valued false TEXT
    - CreatedAt is a required: false and multi valued false DATE
  Order [ supports media false ], extends << ... >> with fields:
    - Id is a required: true and multi valued false TEXT
    - Date is a required: true and multi valued false DATE
  OrderItem [ supports media false ], extends << ... >> with fields:
    - Quantity is a required: true and multi valued false NUMBER
  CommentReview [ supports media true ], extends << ... >> with fields:
    - Id is a required: true and multi valued false TEXT
    - Text is a required: true and multi valued false TEXT
    - CreatedAt is a required: true and multi valued false DATE

contexts:
  CatalogContext with CATALOG kind, contains Product, Order, OrderItem, CommentReview
  ModerationContext with CATALOG kind, contains Product
  SearchContext with CATALOG kind, contains Product

relations:
  OrderContainsOrderItem from Order [1] to OrderItem [2], containment: false, recursive: false
  OrderItemTargetsProduct from OrderItem [2] to Product [1], containment: false, recursive: false
  ProductContainsComment from Product [1] to CommentReview [2], containment: true, recursive: false

feedback-types:
  ReviewType kind: REVIEW applies on RESOURCE_ONLY , has rating: true, recursive: false, allows media: true, allows text: true, with polarity: NONE)
  HelpfulVoteType kind: VOTE applies on RESOURCE_ONLY , has rating: false, recursive: false, allows media: false, allows text: false, with polarity: UP_DOWN)

feedback-definitions:
  ProductReview authored by Reviewer [ on resource Product or feedback <no subjectFeedback> ] requires a verified context: false, verification requirement: OPTIONAL, unique per author target: true, feedback policy: ProductReviewPolicy policy status ENABLED, rated between 1 and 5 with 1 step
  HelpfulVoteOnComment authored by Buyer [ on resource CommentReview or feedback <no subjectFeedback> ] requires a verified context: false, verification requirement: OPTIONAL, unique per author target: false, feedback policy: HelpfulVotePolicy policy status ENABLED, <no ratingPolicy>

sorting-policies:
  ProductListingSort applies to resource Product and/or applies to feedback <no appliesToFeedback> in context of CatalogContext sorted by VALUE with direction DESC
  ProductSearchSort applies to resource Product and/or applies to feedback <no appliesToFeedback> in context of <no inContext> sorted by DATE with direction DESC
  CommentSortByDate applies to resource CommentReview and/or applies to feedback <no appliesToFeedback> in context of CatalogContext sorted by DATE with direction DESC
  CommentSortByRating applies to resource CommentReview and/or applies to feedback <no appliesToFeedback> in context of CatalogContext sorted by DATE with direction DESC

validations:
  ReviewValidationRule kind AUTOMATIC severity ERROR expr "rating_in_range_and_non_empty_text" impl "amazon_review_validation" appliesToResource Product appliesToFeedback ProductReview invokedBy ReviewGuardAutomation

automations:
  ReviewGuardAutomation trigger ON_FEEDBACK_CREATE on feedback ProductReview on resource Product in context ModerationContext uses ReviewValidationRule
    conditions:
      LOl field Description op CONTAINS_KEYWORDS value "g"
    actions:
      FlagReview kind FLAG_CONTENT message "Content Restricted"

moderations:
  ReviewModerationPolicy mode HYBRID trigger ON_REPORT_THRESHOLD decision FLAGGED monitors resource Product on feedback ProductReview executed by Moderator in context ModerationContext

authorizations:
  BuyerCanCreateReview for CREATE performed by Reviewer in context of CatalogContext on resource Product | on feedback ( ProductReview
  ReviewerCanCreateReview for CREATE performed by Reviewer in context of CatalogContext on resource Product | on feedback ( ProductReview
  ModeratorCanModerateReviews for MODERATE performed by Moderator in context of ModerationContext on resource Product | on feedback ( ProductReview
  BuyerCanVoteHelpful for VOTE performed by Buyer in context of CatalogContext on resource CommentReview | on feedback ( HelpfulVoteOnComment

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
 