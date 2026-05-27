# Domain field mapping from Ref v3

This mapping is the source of truth for the generated domain fields.

## UserType

- `name` -> class name
- `kind` -> `UserKind kind`
- generated auth fields -> `username`, write-only `password`
- backend-profile fields only when configured -> examples: `registrationDate`, `verifiedBuyer`

## ResourceType

- `attribute` -> scalar field, scalar collection, or `@Embedded` attribute value wrapper
- `superType` -> generated superclass clause
- `supportsMedia` -> backend-profile media fields/helpers when the target backend needs them
- `ResourceRelation` involving the resource -> JPA association fields when cardinality is usable

## FeedbackDefinition

- `subjectResource` -> `@ManyToOne` runtime resource field
- `subjectFeedback` -> `@ManyToOne` runtime feedback field
- `author` -> `@ManyToOne` runtime user field
- `feedbackType.kind`, `subjectScope`, `polarity` -> generated feedback metadata or backend-specific enum/value field
- `feedbackPolicy.status` -> generated status field
- `ratingPolicy.minValue/maxValue/step` -> generated rating field with `@Min`/`@Max`
- `requiresVerifiedContext`, `verificationRequirement`, `uniquePerAuthorTarget` -> generated scalar/enum fields
- `allowsText`, `allowsMedia`, `recursive` -> generate text/media/parent fields according to backend-profile names

## Policies

- `SortingPolicy`: `name`, `criterion`, `direction`, `appliesToResource`, `appliesToFeedback`, `context`
- `ValidationRule`: `name`, `kind`, `severity`, `expression`, `implementationId`, `appliesToResource`, `appliesToFeedback`, `appliesToKind`, `appliesInContext`, `invokedBy`
- `ModerationPolicy`: `name`, `mode`, `trigger`, `decision`, `monitorsResource`, `monitorsFeedback`, `executedByKind`, `context`
- `AuthorizationRule`: `name`, `allowedAction`, `actorKind`, `resourceTarget`, `feedbackTarget`, `context`
- `AutomationRule`: `name`, `trigger`, `contextResource`, `onFeedback`, `context`, `usesValidation`, `conditions`, `actions`
- `VerificationPolicy`: `name`, `mode`, `appliesWhen`, `verifiesFeedback`

## Context

- `ContextType.name` -> unique `name`
- `ContextType.contextKind` -> `ContextKind kind`
- `ContextType.resourceTypeLink` -> `ContextResource` children
- `ContextResourceTypeLink.resourceType` -> `resourceName`
