# Mapping configuration main

Existing root rules already in your generator can stay, but align package paths with this blueprint.

## Application / Config / Resources

- `RefModel -> pom`
- `RefModel -> BackendApplication`
- `RefModel -> application.properties`
- `RefModel -> H2ServerConfiguration`
- `RefModel -> InitialDataConfiguration`

`InitialDataConfiguration` should expand `SeedUserStatements`, `SeedAuthorizationRuleStatements`, and `SeedModerationPolicyStatements` from the corresponding RefModel children when present.

## Domain

- `ResourceType -> GeneratedResourceEntity`
- `ResourceType -> ResourceEntity`
- `FeedbackDefinition -> GeneratedFeedbackEntity`
- `FeedbackDefinition -> FeedbackEntity`
- `UserType -> GeneratedUserType`
- `UserType -> UserType`
- `ContextType -> GeneratedContextType`
- `ContextType -> ContextType`
- `ContextResourceTypeLink -> GeneratedContextResource`
- `ContextResourceTypeLink -> ContextResource`
- optional: `Attribute -> AttributeValueObject` when `useAttributeValueObjects=true`

## Policies

Generate both sides of the Generation Gap for each policy class supported by the model:

- `RefModel -> GeneratedSortingPolicy`
- `RefModel -> SortingPolicy`
- `RefModel -> GeneratedValidationRule`
- `RefModel -> ValidationRule`
- `RefModel -> GeneratedModerationPolicy`
- `RefModel -> ModerationPolicy`
- `RefModel -> GeneratedAuthorizationRule`
- `RefModel -> AuthorizationRule`
- `RefModel -> GeneratedAutomationRule`
- `RefModel -> AutomationRule`
- `RefModel -> GeneratedVerificationPolicy`
- `RefModel -> VerificationPolicy`

`FeedbackPolicy` and `RatingPolicy` are nested under `FeedbackDefinition`; map them into generated feedback fields instead of standalone JPA entities.

Optional automation helper mappings:

- `RefModel -> GeneratedAutomationAction`
- `RefModel -> AutomationAction`
- `RefModel -> GeneratedAutomationCondition`
- `RefModel -> AutomationCondition`
- `RefModel -> GeneratedConditionValue`
- `RefModel -> ConditionValue`

## Enums
- `RefModel -> UserKind`
- `RefModel -> ContextKind`
- `RefModel -> FeedbackKind`
- `RefModel -> FeedbackSubjectScope`
- `RefModel -> FeedbackPolarity`
- `RefModel -> FeedbackStatus`
- `RefModel -> VerificationRequirement`
- `RefModel -> ValidationKind`
- `RefModel -> RuleSeverity`
- `RefModel -> ModerationMode`
- `RefModel -> ModerationDecision`
- `RefModel -> ActionKind`
- `RefModel -> TriggerEvent`
- `RefModel -> ConditionOperator`
- `RefModel -> ActionResultKind`
- `RefModel -> SortCriterion`
- `RefModel -> SortDirection`
- `RefModel -> PrimitiveType`

## Repository

- `ResourceType -> GeneratedResourceRepository`
- `ResourceType -> ResourceRepository`
- `FeedbackDefinition -> GeneratedFeedbackRepository`
- `FeedbackDefinition -> FeedbackRepository`
- `UserType -> GeneratedUserRepository`
- `UserType -> UserRepository`
- `RefModel -> GeneratedSortingPolicyRepository`
- `RefModel -> SortingPolicyRepository`
- `RefModel -> GeneratedValidationRuleRepository`
- `RefModel -> ValidationRuleRepository`
- `RefModel -> GeneratedModerationPolicyRepository`
- `RefModel -> ModerationPolicyRepository`
- `RefModel -> GeneratedAuthorizationRuleRepository`
- `RefModel -> AuthorizationRuleRepository`
- `RefModel -> GeneratedAutomationRuleRepository`
- `RefModel -> AutomationRuleRepository`
- `RefModel -> GeneratedVerificationPolicyRepository`
- `RefModel -> VerificationPolicyRepository`

Each policy repository is a concrete template, not one shared generic policy template.

## Service

- `ResourceType -> GeneratedResourceService`
- `ResourceType -> ResourceService`
- `FeedbackDefinition -> GeneratedFeedbackService`
- `FeedbackDefinition -> FeedbackService`
- `RefModel -> GeneratedAuthenticationService`
- `RefModel -> AuthenticationService`
- `RefModel -> AuthenticationResult`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> GeneratedModerationModel`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> GeneratedModerationService`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> ModerationService`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> ModerationSimulationResult`
- `RefModel -> GeneratedPolicyService`
- `RefModel -> PolicyService`

Moderation mappings should materialize the DSL values into `GeneratedModerationModel.POLICIES`: each generated `PolicySpec` contains mode, trigger, decision, target names, moderator kind, and a list of generated `AutomationRuleSpec` entries. Each `AutomationRuleSpec` contains its own condition and action lists. The generated service then simulates the process from request to decision without loading a DSL file at runtime.

Macro shape: use a file-level `if` on `refModel.moderationPolicy->notEmpty()`, a loop macro for `PolicySpecList` over `ModerationPolicy`, a nested loop macro for `AutomationRuleSpecList` over the rules linked to or selected for the current policy, a nested loop macro for `AutomationRule.conditions`, a nested loop macro for each condition's values, and a nested loop macro for `AutomationRule.actions`.

## Web

- `ResourceType -> GeneratedResourceController`
- `ResourceType -> ResourceController`
- `FeedbackDefinition -> GeneratedFeedbackController`
- `FeedbackDefinition -> FeedbackController`
- `RefModel -> GeneratedAuthenticationController`
- `RefModel -> AuthenticationController`
- `RefModel -> ResourceNotFoundException`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> GeneratedModerationController`
- optional when `RefModel.moderationPolicy` is not empty: `RefModel -> ModerationController`
- `RefModel -> GeneratedPolicyController`
- `RefModel -> PolicyController`

Business controllers that require model-specific routes should remain manual unless the DSL is extended.

## Security

- `RefModel -> SecurityConfiguration`
- `RefModel -> JwtAuthenticationFilter`
- `RefModel -> JwtService`
- `UserType -> UserDetailsService`
