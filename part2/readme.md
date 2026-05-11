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
 