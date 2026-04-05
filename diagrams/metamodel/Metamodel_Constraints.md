# REF Metamodel – Constraints and Refactorings

This document specifies the constraints (invariants) and refactorings (model transformations) for the REF DSL metamodel (`ref-metamodel-v2`), as required by Activity 5 of P1.

Each constraint is expressed in:
- **OCL** (Object Constraint Language) when possible;
- **Pseudo-code** as an alternative or complement.

For each constraint, when applicable, a **refactoring** (quick fix) is proposed to automatically correct the model error.

---

## Table of Contents

1. [Core – RefModel](#1-core--refmodel)
2. [Actors & Context – UserType, ContextType](#2-actors--context)
3. [Structure – ResourceType, Attribute, ResourceRelation](#3-structure)
4. [Feedback – FeedbackType, FeedbackDefinition, FeedbackPolicy, RatingPolicy](#4-feedback)
5. [Governance & Behavior – ValidationRule, ModerationPolicy, AuthorizationRule, AutomationRule, VerificationPolicy](#5-governance--behavior)
6. [Evolution – EvolutionRule, RefactoringOperation](#6-evolution)
7. [Generalized Naming Rule (Uppercase)](#7-generalized-naming-rule-uppercase)
8. [Cross-Property Semantic Constraints](#8-cross-property-semantic-constraints)
9. [Summary Table](#9-summary-table)

---

## 1. Core – RefModel

### C1.1 RefModel name must not be empty

**OCL:**
```ocl
context RefModel
inv nameNotEmpty:
  self.name <> null and self.name.size() > 0
```

**Pseudo-code:**
```
if refModel.name is null or refModel.name.length == 0:
    error("RefModel name must not be empty")
```

**Refactoring:** None (cannot infer a valid name automatically).

---

### C1.2 RefModel name should start with uppercase

**OCL:**
```ocl
context RefModel
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Pseudo-code:**
```
if refModel.name is not null and refModel.name.length > 0:
    if not refModel.name[0].isUpperCase():
        warning("RefModel name should start with uppercase")
```

**Refactoring:**
```
refModel.name = capitalize(refModel.name)

function capitalize(s):
    return s[0].toUpperCase() + s.substring(1)
```

---

### C1.3 RefModel name must have more than 2 characters

**OCL:**
```ocl
context RefModel
inv nameMinLength:
  self.name <> null implies self.name.size() > 2
```

**Pseudo-code:**
```
if refModel.name is not null and refModel.name.length <= 2:
    error("RefModel name must have more than 2 characters")
```

**Refactoring:** None (cannot infer valid characters).

---

### C1.4 RefModel version should follow semantic versioning pattern

**OCL:**
```ocl
context RefModel
inv versionFormat:
  self.version <> null implies
    self.version.matches('[0-9]+\\.[0-9]+\\.[0-9]+')
```

**Pseudo-code:**
```
if refModel.version is not null:
    if not regex_match(refModel.version, "^[0-9]+\.[0-9]+\.[0-9]+$"):
        warning("Version should follow semantic versioning (e.g., 1.0.0)")
```

**Refactoring:**
```
if refModel.version is null or refModel.version is empty:
    refModel.version = "1.0.0"
```

---

## 2. Actors & Context

### C2.1 UserType name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv userTypeNamesUnique:
  self.userTypes->isUnique(u | u.name)
```

**Pseudo-code:**
```
names = [u.name for u in refModel.userTypes]
if len(names) != len(set(names)):
    error("UserType names must be unique within the model")
```

**Refactoring:** None (cannot auto-rename without domain knowledge).

---

### C2.2 UserType name should start with uppercase

**OCL:**
```ocl
context UserType
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Pseudo-code:**
```
if userType.name is not null and userType.name.length > 0:
    if not userType.name[0].isUpperCase():
        warning("UserType name should start with uppercase")
```

**Refactoring:**
```
userType.name = capitalize(userType.name)
```

---

### C2.3 UserType superTypes must not contain self (no direct self-reference)

**OCL:**
```ocl
context UserType
inv noSelfInSuperTypes:
  not self.superTypes->includes(self)
```

**Pseudo-code:**
```
if userType in userType.superTypes:
    error("UserType cannot be its own supertype")
```

**Refactoring:**
```
userType.superTypes.remove(userType)
```

---

### C2.5 ContextType name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv contextTypeNamesUnique:
  self.contextTypes->isUnique(c | c.name)
```

**Pseudo-code:**
```
names = [c.name for c in refModel.contextTypes]
if len(names) != len(set(names)):
    error("ContextType names must be unique")
```

**Refactoring:** None.

---

### C2.6 ContextType name should start with uppercase

**OCL:**
```ocl
context ContextType
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
contextType.name = capitalize(contextType.name)
```

---

## 3. Structure

### C3.1 ResourceType name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv resourceTypeNamesUnique:
  self.resourceTypes->isUnique(r | r.name)
```

**Pseudo-code:**
```
names = [r.name for r in refModel.resourceTypes]
if len(names) != len(set(names)):
    error("ResourceType names must be unique")
```

**Refactoring:** None.

---

### C3.2 ResourceType name should start with uppercase

**OCL:**
```ocl
context ResourceType
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
resourceType.name = capitalize(resourceType.name)
```

---

### C3.3 ResourceType name must have more than 2 characters

**OCL:**
```ocl
context ResourceType
inv nameMinLength:
  self.name <> null implies self.name.size() > 2
```

**Refactoring:** None.

---

### C3.4 ResourceType superTypes must not contain self

**OCL:**
```ocl
context ResourceType
inv noSelfInSuperTypes:
  not self.superTypes->includes(self)
```

**Refactoring:**
```
resourceType.superTypes.remove(resourceType)
```

---

### C3.5 ResourceType superTypes must not form a cycle

**OCL:**
```ocl
context ResourceType
inv noCycleInSuperTypes:
  not self.allSuperTypes()->includes(self)
```

**Refactoring:** None (requires user decision).

---

### C3.6 Attribute name must be unique within its container (ResourceType)

**OCL:**
```ocl
context ResourceType
inv attributeNamesUnique:
  self.attributes->isUnique(a | a.name)
```

**Pseudo-code:**
```
for resourceType in refModel.resourceTypes:
    names = [a.name for a in resourceType.attributes]
    if len(names) != len(set(names)):
        error("Attribute names must be unique within ResourceType")
```

**Refactoring:** None.

---

### C3.7 Attribute name should start with lowercase (convention)

**OCL:**
```ocl
context Attribute
inv nameStartsWithLowercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toLower()
```

**Refactoring:**
```
attribute.name = attribute.name[0].toLowerCase() + attribute.name.substring(1)
```

---

### C3.8 ResourceRelation source and target must be different when recursive is false

**OCL:**
```ocl
context ResourceRelation
inv nonRecursiveSourceTargetDifferent:
  self.recursive = false implies self.source <> self.target
```

**Pseudo-code:**
```
if resourceRelation.recursive == false:
    if resourceRelation.source == resourceRelation.target:
        error("Non-recursive relation cannot have same source and target")
```

**Refactoring:**
```
resourceRelation.recursive = true
-- or prompt user to change source/target
```

---

### C3.9 ResourceRelation name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv resourceRelationNamesUnique:
  self.resourceRelations->isUnique(r | r.name)
```

**Refactoring:** None.

---

## 4. Feedback

### C4.1 FeedbackType name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv feedbackTypeNamesUnique:
  self.feedbackTypes->isUnique(f | f.name)
```

**Refactoring:** None.

---

### C4.2 FeedbackType name should start with uppercase

**OCL:**
```ocl
context FeedbackType
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
feedbackType.name = capitalize(feedbackType.name)
```

---

### C4.3 FeedbackDefinition must have at least one target (resource or feedback) according to subjectScope

**OCL:**
```ocl
context FeedbackDefinition
inv targetConsistentWithScope:
  let scope = self.type.subjectScope in
    (scope = FeedbackSubjectScope::RESOURCE_ONLY implies 
       self.subjectResource <> null and self.subjectFeedback = null)
    and
    (scope = FeedbackSubjectScope::FEEDBACK_ONLY implies 
       self.subjectFeedback <> null and self.subjectResource = null)
    and
    (scope = FeedbackSubjectScope::RESOURCE_OR_FEEDBACK implies 
       self.subjectResource <> null or self.subjectFeedback <> null)
```

**Pseudo-code:**
```
scope = feedbackDefinition.type.subjectScope

if scope == RESOURCE_ONLY:
    if feedbackDefinition.subjectResource is null:
        error("FeedbackDefinition with RESOURCE_ONLY scope must have subjectResource")
    if feedbackDefinition.subjectFeedback is not null:
        error("FeedbackDefinition with RESOURCE_ONLY scope cannot have subjectFeedback")

elif scope == FEEDBACK_ONLY:
    if feedbackDefinition.subjectFeedback is null:
        error("FeedbackDefinition with FEEDBACK_ONLY scope must have subjectFeedback")
    if feedbackDefinition.subjectResource is not null:
        error("FeedbackDefinition with FEEDBACK_ONLY scope cannot have subjectResource")

elif scope == RESOURCE_OR_FEEDBACK:
    if feedbackDefinition.subjectResource is null and feedbackDefinition.subjectFeedback is null:
        error("FeedbackDefinition must have at least one target")
```

**Refactoring:** None (requires domain knowledge to set correct target).

---

### C4.4 FeedbackDefinition name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv feedbackDefinitionNamesUnique:
  self.feedbackDefinitions->isUnique(fd | fd.name)
```

**Refactoring:** None.

---

### C4.5 FeedbackDefinition name should start with uppercase

**OCL:**
```ocl
context FeedbackDefinition
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
feedbackDefinition.name = capitalize(feedbackDefinition.name)
```

---

### C4.6 FeedbackDefinition must have an author (UserType)

**OCL:**
```ocl
context FeedbackDefinition
inv authorRequired:
  self.author <> null
```

**Refactoring:**
```
if feedbackDefinition.author is null and refModel.userTypes.size() > 0:
    feedbackDefinition.author = refModel.userTypes.first()
```

---

### C4.7 RatingPolicy can only exist when FeedbackType.hasRating is true

**OCL:**
```ocl
context FeedbackDefinition
inv ratingPolicyOnlyWhenHasRating:
  self.rating <> null implies self.type.hasRating = true
```

**Pseudo-code:**
```
if feedbackDefinition.rating is not null:
    if feedbackDefinition.type.hasRating == false:
        error("RatingPolicy can only be set when FeedbackType.hasRating is true")
```

**Refactoring:**
```
feedbackDefinition.type.hasRating = true
-- or remove the rating policy
```

---

### C4.8 RatingPolicy minValue must be less than maxValue

**OCL:**
```ocl
context RatingPolicy
inv minLessThanMax:
  self.minValue < self.maxValue
```

**Pseudo-code:**
```
if ratingPolicy.minValue >= ratingPolicy.maxValue:
    error("RatingPolicy minValue must be less than maxValue")
```

**Refactoring:**
```
if ratingPolicy.minValue >= ratingPolicy.maxValue:
    swap(ratingPolicy.minValue, ratingPolicy.maxValue)
```

---

### C4.9 RatingPolicy step must be positive and divide the range evenly

**OCL:**
```ocl
context RatingPolicy
inv stepPositiveAndDividesRange:
  self.step > 0 and
  (self.maxValue - self.minValue).mod(self.step) = 0
```

**Pseudo-code:**
```
if ratingPolicy.step <= 0:
    error("RatingPolicy step must be positive")
if (ratingPolicy.maxValue - ratingPolicy.minValue) % ratingPolicy.step != 0:
    warning("RatingPolicy step should divide the range evenly")
```

**Refactoring:**
```
if ratingPolicy.step <= 0:
    ratingPolicy.step = 1
```

---

### C4.10 FeedbackPolicy status DISABLED blocks new feedback creation (semantic constraint)

**OCL:**
```ocl
context FeedbackDefinition
inv disabledPolicyBlocksCreation:
  self.policy <> null and self.policy.status = FeedbackStatus::DISABLED implies
    -- runtime constraint: no new instances can be created
    true -- (documented as runtime behavior)
```

**Note:** This is a runtime/behavioral constraint, not a static model constraint. Documented for code generation.

**Refactoring:** None (policy decision).

---

### C4.11 FeedbackDefinition `subjectFeedback` must be of the same FeedbackType

**OCL:**
```ocl
context FeedbackDefinition
inv subjectFeedbackSameType:
  self.subjectFeedback <> null implies self.subjectFeedback.type = self.type
```

**Pseudo-code:**
```
if feedbackDefinition.subjectFeedback is not null:
    if feedbackDefinition.subjectFeedback.type != feedbackDefinition.type:
        warning("FeedbackDefinition subjectFeedback should be of the same FeedbackType")
```

**Refactoring:** None (requires user decision).

---

### C4.12 FeedbackDefinition cannot target itself via subjectFeedback

**OCL:**
```ocl
context FeedbackDefinition
inv noSelfSubjectFeedback:
  self.subjectFeedback <> self
```

**Refactoring:**
```
feedbackDefinition.subjectFeedback = null
```

---

## 5. Governance & Behavior

### C5.1 ValidationRule must target at least one element (ResourceType or FeedbackDefinition)

**OCL:**
```ocl
context ValidationRule
inv atLeastOneTarget:
  self.appliesToResource <> null or self.appliesToFeedback <> null
```

**Pseudo-code:**
```
if validationRule.appliesToResource is null and validationRule.appliesToFeedback is null:
    error("ValidationRule must target at least one element")
```

**Refactoring:** None (requires user to specify target).

---

### C5.2 ValidationRule name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv validationRuleNamesUnique:
  self.validationRules->isUnique(v | v.name)
```

**Refactoring:** None.

---

### C5.3 ValidationRule name should start with uppercase

**OCL:**
```ocl
context ValidationRule
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
validationRule.name = capitalize(validationRule.name)
```

---

### C5.4 ValidationRule implementationId must have at least 3 characters

**OCL:**
```ocl
context ValidationRule
inv implementationIdMinLength:
  self.implementationId <> null implies self.implementationId.size() >= 3
```

**Refactoring:**
```
if validationRule.implementationId.length < 3:
    validationRule.implementationId = "val_" + validationRule.implementationId
```

---

### C5.5 ValidationRule expression must not be empty when kind is AUTOMATIC

**OCL:**
```ocl
context ValidationRule
inv expressionRequiredForAutomatic:
  self.kind = ValidationKind::AUTOMATIC implies
    self.expression <> null and self.expression.size() > 0
```

**Refactoring:** None (requires user to provide expression).

---

### C5.6 ModerationPolicy name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv moderationPolicyNamesUnique:
  self.moderationPolicies->isUnique(m | m.name)
```

**Refactoring:** None.

---

### C5.7 ModerationPolicy must have executedBy

**OCL:**
```ocl
context ModerationPolicy
inv executedByRequired:
  self.executedBy <> null
```

**Pseudo-code:**
```
if moderationPolicy.executedBy is null:
    error("ModerationPolicy must have executedBy")
```

**Refactoring:**
```
-- Find a UserType with MODERATOR kind
moderator = refModel.userTypes.find(u => u.kind == MODERATOR)
if moderator is not null:
    moderationPolicy.executedBy = moderator
```

---

### C5.8 ModerationPolicy trigger must not be empty when mode is AUTOMATIC

**OCL:**
```ocl
context ModerationPolicy
inv triggerRequiredForAutomatic:
  self.mode = ModerationMode::AUTOMATIC implies
    self.trigger <> null and self.trigger.size() > 0
```

**Refactoring:** None.

---

### C5.9 AuthorizationRule must have an actor (UserType)

**OCL:**
```ocl
context AuthorizationRule
inv actorRequired:
  self.actor <> null
```

**Refactoring:**
```
if authorizationRule.actor is null and refModel.userTypes.size() > 0:
    authorizationRule.actor = refModel.userTypes.first()
```

---

### C5.10 AuthorizationRule must have both targets (resourceTarget and feedbackTarget)

**OCL:**
```ocl
context AuthorizationRule
inv bothTargetsRequired:
  self.resourceTarget <> null and self.feedbackTarget <> null
```

**Refactoring:** None.

---

### C5.11 AutomationRule name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv automationRuleNamesUnique:
  self.automationRules->isUnique(a | a.name)
```

**Refactoring:** None.

---

### C5.12 AutomationRule name should start with uppercase

**OCL:**
```ocl
context AutomationRule
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
    self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Refactoring:**
```
automationRule.name = capitalize(automationRule.name)
```

---

### C5.13 AutomationRule trigger must not be empty

**OCL:**
```ocl
context AutomationRule
inv triggerNotEmpty:
  self.trigger <> null and self.trigger.size() > 0
```

**Refactoring:** None.

---

### C5.14 AutomationRule actionDescription must not be empty

**OCL:**
```ocl
context AutomationRule
inv actionDescriptionNotEmpty:
  self.actionDescription <> null and self.actionDescription.size() > 0
```

**Refactoring:** None.

---

### C5.15 VerificationPolicy name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv verificationPolicyNamesUnique:
  self.verificationPolicies->isUnique(v | v.name)
```

**Refactoring:** None.

---

### C5.16 VerificationPolicy must verify a FeedbackDefinition

**OCL:**
```ocl
context VerificationPolicy
inv verifiesRequired:
  self.verifies <> null
```

**Refactoring:** None.

---

## 6. Evolution

### C6.1 EvolutionRule name must be unique within RefModel

**OCL:**
```ocl
context RefModel
inv evolutionRuleNamesUnique:
  self.evolutionRules->isUnique(e | e.name)
```

**Refactoring:** None.

---

### C6.2 EvolutionRule fromVersion must be different from toVersion

**OCL:**
```ocl
context EvolutionRule
inv fromVersionDifferentFromToVersion:
  self.fromVersion <> self.toVersion
```

**Pseudo-code:**
```
if evolutionRule.fromVersion == evolutionRule.toVersion:
    error("EvolutionRule fromVersion must be different from toVersion")
```

**Refactoring:** None.

---

### C6.3 EvolutionRule must have at least one RefactoringOperation

**OCL:**
```ocl
context EvolutionRule
inv atLeastOneOperation:
  self.applies->size() >= 1
```

**Refactoring:** None.

---

### C6.4 RefactoringOperation name must not be empty

**OCL:**
```ocl
context RefactoringOperation
inv nameNotEmpty:
  self.name <> null and self.name.size() > 0
```

**Refactoring:** None.

---

### C6.5 RefactoringOperation scriptId must have at least 3 characters

**OCL:**
```ocl
context RefactoringOperation
inv scriptIdMinLength:
  self.scriptId <> null implies self.scriptId.size() >= 3
```

**Refactoring:**
```
if refactoringOperation.scriptId.length < 3:
    refactoringOperation.scriptId = "ref_" + refactoringOperation.scriptId
```

---

## 7. Generalized Naming Rule (Uppercase)

To avoid duplication, all uppercase naming conventions can be expressed by a single reusable rule template.
The specific constraints C1.2, C2.2, C2.6, C3.2, C4.2, C4.5, C5.3 and C5.12 are instances of this generalized rule.

### GN.1 Generic rule: name starts with uppercase

**OCL template (for any metaclass with `name: String`):**
```ocl
context <NamedMetaclass>
inv nameStartsWithUppercase:
  self.name <> null and self.name.size() > 0 implies
  self.name.substring(1, 1) = self.name.substring(1, 1).toUpper()
```

**Pseudo-code template:**
```
function checkNameStartsWithUppercase(element, elementLabel):
  if element.name is not null and element.name.length > 0:
    if not element.name[0].isUpperCase():
      warning(elementLabel + " name should start with uppercase")
```

**Refactoring template:**
```
element.name = capitalize(element.name)

function capitalize(s):
  return s[0].toUpperCase() + s.substring(1)
```

**Implementation note (tooling):**
- **MPS:** if all named concepts implement `INamedConcept`, create a single checking rule on `INamedConcept` to validate uppercase naming once for all concrete concepts.
- **Xtext:** define the check on a common named supertype (e.g., `NamedElement`) and reuse it for all rules with a `name` feature.
- **Sirius:** define one validation rule on the common named EClass and apply it across all represented elements.

---

## 8. Cross-Property Semantic Constraints

These constraints are generic and scenario-agnostic.
They derive restrictions from metamodel properties and enum values, without hardcoding application names.

### G1 If `FeedbackType.hasRating` is true, `FeedbackDefinition.rating` is required

**Pseudo-code:**
```
for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.type.hasRating == true and feedbackDefinition.rating is null:
    error("FeedbackDefinition with hasRating=true must define a RatingPolicy")
```

**Refactoring:**
```
rating = new RatingPolicy()
rating.minValue = 1
rating.maxValue = 5
rating.step = 1
feedbackDefinition.rating = rating
```

---

### G2 `FeedbackKind.REVIEW` must target resources only

**Pseudo-code:**
```
for feedbackType in refModel.feedbackTypes:
  if feedbackType.kind == REVIEW and feedbackType.subjectScope != RESOURCE_ONLY:
    error("REVIEW feedback must use subjectScope=RESOURCE_ONLY")
```

**Refactoring:**
```
feedbackType.subjectScope = RESOURCE_ONLY
```

---

### G3 `FeedbackKind.REACTION` and `FeedbackKind.VOTE` cannot be rating-based or recursive

**Pseudo-code:**
```
for feedbackType in refModel.feedbackTypes:
  if feedbackType.kind in [REACTION, VOTE]:
    if feedbackType.hasRating == true or feedbackType.recursive == true:
      error("REACTION/VOTE must have hasRating=false and recursive=false")

for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.type.kind in [REACTION, VOTE] and feedbackDefinition.rating is not null:
    error("REACTION/VOTE feedback cannot define RatingPolicy")
```

**Refactoring:**
```
feedbackType.hasRating = false
feedbackType.recursive = false
feedbackDefinition.rating = null
```

---

### G4 `FeedbackKind.SUBSCRIPTION` must be resource-only and non-recursive

**Pseudo-code:**
```
for feedbackType in refModel.feedbackTypes:
  if feedbackType.kind == SUBSCRIPTION:
    if feedbackType.subjectScope != RESOURCE_ONLY or feedbackType.recursive == true:
      error("SUBSCRIPTION feedback must be RESOURCE_ONLY and non-recursive")
```

**Refactoring:**
```
feedbackType.subjectScope = RESOURCE_ONLY
feedbackType.recursive = false
```

---

### G5 Recursive feedback must support feedback targets

**Pseudo-code:**
```
for feedbackType in refModel.feedbackTypes:
  if feedbackType.recursive == true and feedbackType.subjectScope == RESOURCE_ONLY:
    error("Recursive feedback must allow FEEDBACK targets")
```

**Refactoring:**
```
feedbackType.subjectScope = RESOURCE_OR_FEEDBACK
```

---

### G6 `RESOURCE_ONLY` scope forbids `subjectFeedback`

**Pseudo-code:**
```
for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.type.subjectScope == RESOURCE_ONLY and feedbackDefinition.subjectFeedback is not null:
    error("RESOURCE_ONLY feedback cannot set subjectFeedback")
```

**Refactoring:**
```
feedbackDefinition.subjectFeedback = null
```

---

### G7 `FEEDBACK_ONLY` scope forbids `subjectResource`

**Pseudo-code:**
```
for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.type.subjectScope == FEEDBACK_ONLY and feedbackDefinition.subjectResource is not null:
    error("FEEDBACK_ONLY feedback cannot set subjectResource")
```

**Refactoring:**
```
feedbackDefinition.subjectResource = null
```

---

### G8 `requiresVerifiedContext=true` requires a `VerificationPolicy`

**Pseudo-code:**
```
for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.requiresVerifiedContext == true:
    hasPolicy = exists(vp in refModel.verificationPolicies where vp.verifies == feedbackDefinition)
    if hasPolicy == false:
      error("FeedbackDefinition requiring verified context must have a VerificationPolicy")
```

**Refactoring:**
```
vp = new VerificationPolicy()
vp.name = feedbackDefinition.name + "Verification"
vp.mode = MANUAL
vp.appliesWhen = "onCreate"
vp.verifies = feedbackDefinition
refModel.verificationPolicies.add(vp)
```

---

### G9 For `uniquePerAuthorTarget`, avoid dual target ambiguity

**Pseudo-code:**
```
for feedbackDefinition in refModel.feedbackDefinitions:
  if feedbackDefinition.uniquePerAuthorTarget == true:
    if feedbackDefinition.subjectResource is not null and feedbackDefinition.subjectFeedback is not null:
      error("uniquePerAuthorTarget requires a single target to avoid ambiguity")
```

**Refactoring:**
```
feedbackDefinition.subjectFeedback = null
```

---

### G10 `AuthorizationRule.context` must include `resourceTarget`

**Pseudo-code:**
```
for authorizationRule in refModel.authorizationRules:
  if authorizationRule.context is not null and authorizationRule.resourceTarget is not null:
    if authorizationRule.resourceTarget not in authorizationRule.context.contains:
      error("AuthorizationRule resourceTarget must belong to the selected context")
```

**Refactoring:**
```
authorizationRule.context.contains.add(authorizationRule.resourceTarget)
```

---

### G11 `ModerationPolicy.inContext` must include `monitorsResource`

**Pseudo-code:**
```
for moderationPolicy in refModel.moderationPolicies:
  if moderationPolicy.inContext is not null and moderationPolicy.monitorsResource is not null:
    if moderationPolicy.monitorsResource not in moderationPolicy.inContext.contains:
      error("ModerationPolicy monitorsResource must belong to the selected context")
```

**Refactoring:**
```
moderationPolicy.inContext.contains.add(moderationPolicy.monitorsResource)
```

---

### G12 `AutomationRule.inContext` must include `context` resource

**Pseudo-code:**
```
for automationRule in refModel.automationRules:
  if automationRule.inContext is not null and automationRule.context is not null:
    if automationRule.context not in automationRule.inContext.contains:
      error("AutomationRule context resource must belong to the selected context")
```

**Refactoring:**
```
automationRule.inContext.contains.add(automationRule.context)
```

---

## 9. Summary Table

| ID | Element | Constraint | Severity | Refactoring |
|----|---------|------------|----------|-------------|
| C1.1 | RefModel | name not empty | ERROR | — |
| C1.2 | RefModel | name starts with uppercase | WARNING | Capitalize |
| C1.3 | RefModel | name > 2 characters | ERROR | — |
| C1.4 | RefModel | version semantic format | WARNING | Set "1.0.0" |
| C2.1 | UserType | name unique | ERROR | — |
| C2.2 | UserType | name starts with uppercase | WARNING | Capitalize |
| C2.3 | UserType | superTypes no self | ERROR | Remove self |
| C2.4 | UserType | superTypes no cycle | ERROR | — |
| C2.5 | ContextType | name unique | ERROR | — |
| C2.6 | ContextType | name starts with uppercase | WARNING | Capitalize |
| C3.1 | ResourceType | name unique | ERROR | — |
| C3.2 | ResourceType | name starts with uppercase | WARNING | Capitalize |
| C3.3 | ResourceType | name > 2 characters | ERROR | — |
| C3.4 | ResourceType | superTypes no self | ERROR | Remove self |
| C3.5 | ResourceType | superTypes no cycle | ERROR | — |
| C3.6 | Attribute | name unique in container | ERROR | — |
| C3.7 | Attribute | name starts with lowercase | WARNING | Lowercase first |
| C3.8 | ResourceRelation | non-recursive src≠target | ERROR | Set recursive=true |
| C3.9 | ResourceRelation | name unique | ERROR | — |
| C4.1 | FeedbackType | name unique | ERROR | — |
| C4.2 | FeedbackType | name starts with uppercase | WARNING | Capitalize |
| C4.3 | FeedbackDefinition | target consistent with scope | ERROR | — |
| C4.4 | FeedbackDefinition | name unique | ERROR | — |
| C4.5 | FeedbackDefinition | name starts with uppercase | WARNING | Capitalize |
| C4.6 | FeedbackDefinition | author required | ERROR | Add first UserType |
| C4.7 | FeedbackDefinition | rating only when hasRating | ERROR | Set hasRating=true |
| C4.8 | RatingPolicy | min < max | ERROR | Swap values |
| C4.9 | RatingPolicy | step positive and divides range | WARNING | Set step=1 |
| C4.10 | FeedbackPolicy | DISABLED blocks creation | INFO | — (runtime) |
| C4.11 | FeedbackDefinition | subjectFeedback same type | WARNING | — |
| C4.12 | FeedbackDefinition | no self subjectFeedback | ERROR | Set subjectFeedback=null |
| C5.1 | ValidationRule | at least one target | ERROR | — |
| C5.2 | ValidationRule | name unique | ERROR | — |
| C5.3 | ValidationRule | name starts with uppercase | WARNING | Capitalize |
| C5.4 | ValidationRule | implementationId ≥ 3 chars | WARNING | Pad with prefix |
| C5.5 | ValidationRule | expression required for AUTOMATIC | ERROR | — |
| C5.6 | ModerationPolicy | name unique | ERROR | — |
| C5.7 | ModerationPolicy | executedBy required | ERROR | Add moderator |
| C5.8 | ModerationPolicy | trigger for AUTOMATIC | ERROR | — |
| C5.9 | AuthorizationRule | actor required | ERROR | Add first UserType |
| C5.10 | AuthorizationRule | both targets required | ERROR | — |
| C5.11 | AutomationRule | name unique | ERROR | — |
| C5.12 | AutomationRule | name starts with uppercase | WARNING | Capitalize |
| C5.13 | AutomationRule | trigger not empty | ERROR | — |
| C5.14 | AutomationRule | actionDescription not empty | ERROR | — |
| C5.15 | VerificationPolicy | name unique | ERROR | — |
| C5.16 | VerificationPolicy | verifies required | ERROR | — |
| C6.1 | EvolutionRule | name unique | ERROR | — |
| C6.2 | EvolutionRule | fromVersion ≠ toVersion | ERROR | — |
| C6.3 | EvolutionRule | at least one operation | ERROR | — |
| C6.4 | RefactoringOperation | name not empty | ERROR | — |
| C6.5 | RefactoringOperation | scriptId ≥ 3 chars | WARNING | Pad with prefix |
| GN.1 | Multiple elements with `name` | generic uppercase naming template | WARNING | Capitalize |
| G1 | FeedbackDefinition/RatingPolicy | hasRating=true requires rating policy | ERROR | Create default RatingPolicy |
| G2 | FeedbackType | REVIEW must be RESOURCE_ONLY | ERROR | Set subjectScope=RESOURCE_ONLY |
| G3 | FeedbackType/FeedbackDefinition | REACTION/VOTE cannot be rating-based or recursive | ERROR | Normalize hasRating/recursive/rating |
| G4 | FeedbackType | SUBSCRIPTION must be RESOURCE_ONLY and non-recursive | ERROR | Normalize subjectScope/recursive |
| G5 | FeedbackType | recursive=true must allow feedback targets | ERROR | Set subjectScope=RESOURCE_OR_FEEDBACK |
| G6 | FeedbackDefinition | RESOURCE_ONLY forbids subjectFeedback | ERROR | Set subjectFeedback=null |
| G7 | FeedbackDefinition | FEEDBACK_ONLY forbids subjectResource | ERROR | Set subjectResource=null |
| G8 | FeedbackDefinition/VerificationPolicy | requiresVerifiedContext=true requires policy | ERROR | Create default VerificationPolicy |
| G9 | FeedbackDefinition | uniquePerAuthorTarget cannot have both targets set | ERROR | Set subjectFeedback=null |
| G10 | AuthorizationRule/ContextType | context must include resourceTarget | ERROR | Add resourceTarget to context |
| G11 | ModerationPolicy/ContextType | inContext must include monitorsResource | ERROR | Add monitorsResource to context |
| G12 | AutomationRule/ContextType | inContext must include context resource | ERROR | Add context resource to inContext |

---

## Notes

- **ERROR** constraints block model validation and must be fixed before code generation.
- **WARNING** constraints are recommendations; the model is still valid but may cause issues.
- **INFO** constraints are documentation of runtime behavior.
- Refactorings marked with "—" require user intervention (cannot be auto-corrected safely).
- All refactorings should be offered as **Quick Fixes** in the DSL tooling.

---

## References

- Enunciado P1: `diagrams/enunciado/enorm_project-p1.pdf`, Section 3.3 (Metamodel Constraints) and Section 3.4 (Model Transformations)
- OCL 2.4 Specification: https://www.omg.org/spec/OCL/2.4
- Metamodel: `diagrams/metamodel/ref-metamodel-v2.puml`
