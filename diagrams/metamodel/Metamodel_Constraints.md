# REF Metamodel – Essential Constraints and Refactorings

This document specifies the **essential constraints** (invariants) and refactorings for the REF DSL metamodel (`ref-metamodel-v2`), using pseudo-code notation.

Only constraints that are **critical for model validity** are included.

---

## 1. RefModel

### C1.1 Name must not be empty

```pseudo
if refModel.name is null or refModel.name.length == 0:
    ERROR("RefModel name must not be empty")
```

**Refactoring:** None.

---

### C1.2 Name should start with uppercase

```pseudo
if refModel.name[0].isLowerCase():
    WARNING("RefModel name should start with uppercase")
```

**Refactoring:**
```pseudo
refModel.name = refModel.name[0].toUpperCase() + refModel.name.substring(1)
```

---

## 2. UserType

### C2.1 Name must be unique

```pseudo
names = [u.name for u in refModel.userTypes]
if hasDuplicates(names):
    ERROR("UserType names must be unique")
```

**Refactoring:** None.

---

### C2.2 SuperTypes must not contain self

```pseudo
if userType in userType.superTypes:
    ERROR("UserType cannot be its own supertype")
```

**Refactoring:**
```pseudo
userType.superTypes.remove(userType)
```

---

### C2.3 SuperTypes must not form a cycle

```pseudo
function hasCycle(userType, visited):
    if userType in visited:
        return true
    visited.add(userType)
    for parent in userType.superTypes:
        if hasCycle(parent, visited):
            return true
    return false

if hasCycle(userType, {}):
    ERROR("Cycle detected in UserType hierarchy")
```

**Refactoring:** None (user must break cycle manually).

---

## 3. ResourceType

### C3.1 Name must be unique

```pseudo
names = [r.name for r in refModel.resourceTypes]
if hasDuplicates(names):
    ERROR("ResourceType names must be unique")
```

**Refactoring:** None.

---

### C3.2 Attribute names must be unique within ResourceType

```pseudo
for resourceType in refModel.resourceTypes:
    attrNames = [a.name for a in resourceType.attributes]
    if hasDuplicates(attrNames):
        ERROR("Attribute names must be unique within ResourceType")
```

**Refactoring:** None.

---

## 4. FeedbackType

### C4.1 Name must be unique

```pseudo
names = [f.name for f in refModel.feedbackTypes]
if hasDuplicates(names):
    ERROR("FeedbackType names must be unique")
```

**Refactoring:** None.

---

## 5. FeedbackDefinition

### C5.1 Must have at least one target according to subjectScope

```pseudo
scope = feedbackDefinition.type.subjectScope

if scope == RESOURCE_ONLY:
    if feedbackDefinition.subjectResource is null:
        ERROR("Must have subjectResource when scope is RESOURCE_ONLY")

if scope == FEEDBACK_ONLY:
    if feedbackDefinition.subjectFeedback is null:
        ERROR("Must have subjectFeedback when scope is FEEDBACK_ONLY")

if scope == RESOURCE_OR_FEEDBACK:
    if feedbackDefinition.subjectResource is null and feedbackDefinition.subjectFeedback is null:
        ERROR("Must have at least one target (resource or feedback)")
```

**Refactoring:** None.

---

### C5.2 Must have an author

```pseudo
if feedbackDefinition.author is null:
    ERROR("FeedbackDefinition must have an author")
```

**Refactoring:**
```pseudo
if refModel.userTypes.size() > 0:
    feedbackDefinition.author = refModel.userTypes.first()
```

---

### C5.3 Cannot be its own parent

```pseudo
if feedbackDefinition.parent == feedbackDefinition:
    ERROR("FeedbackDefinition cannot be its own parent")
```

**Refactoring:**
```pseudo
feedbackDefinition.parent = null
```

---

## 6. RatingPolicy

### C6.1 Can only exist when FeedbackType.hasRating is true

```pseudo
if feedbackDefinition.rating is not null:
    if feedbackDefinition.type.hasRating == false:
        ERROR("RatingPolicy requires FeedbackType.hasRating = true")
```

**Refactoring:**
```pseudo
feedbackDefinition.type.hasRating = true
```

---

### C6.2 minValue must be less than maxValue

```pseudo
if ratingPolicy.minValue >= ratingPolicy.maxValue:
    ERROR("minValue must be less than maxValue")
```

**Refactoring:**
```pseudo
swap(ratingPolicy.minValue, ratingPolicy.maxValue)
```

---

## 7. ValidationRule

### C7.1 Must target at least one element

```pseudo
if validationRule.appliesToResource is null and validationRule.appliesToFeedback is null:
    ERROR("ValidationRule must target at least one element")
```

**Refactoring:** None.

---

### C7.2 Expression required when kind is AUTOMATIC

```pseudo
if validationRule.kind == AUTOMATIC:
    if validationRule.expression is null or validationRule.expression.length == 0:
        ERROR("Automatic ValidationRule must have an expression")
```

**Refactoring:** None.

---

## 8. ModerationPolicy

### C8.1 Must have executedBy when mode is MANUAL or HYBRID

```pseudo
if moderationPolicy.mode in [MANUAL, HYBRID]:
    if moderationPolicy.executedBy is null:
        ERROR("MANUAL/HYBRID moderation must have executedBy")
```

**Refactoring:**
```pseudo
moderator = refModel.userTypes.find(u => u.kind == MODERATOR)
if moderator is not null:
    moderationPolicy.executedBy = moderator
```

---

## 9. AuthorizationRule

### C9.1 Must have an actor

```pseudo
if authorizationRule.actor is null:
    ERROR("AuthorizationRule must have an actor")
```

**Refactoring:**
```pseudo
if refModel.userTypes.size() > 0:
    authorizationRule.actor = refModel.userTypes.first()
```

---

### C9.2 Must have at least one target

```pseudo
if authorizationRule.resourceTarget is null and authorizationRule.feedbackTarget is null:
    ERROR("AuthorizationRule must have at least one target")
```

**Refactoring:** None.

---

## 10. AutomationRule

### C10.1 Trigger must not be empty

```pseudo
if automationRule.trigger is null or automationRule.trigger.length == 0:
    ERROR("AutomationRule trigger must not be empty")
```

**Refactoring:** None.

---

### C10.2 ActionDescription must not be empty

```pseudo
if automationRule.actionDescription is null or automationRule.actionDescription.length == 0:
    ERROR("AutomationRule actionDescription must not be empty")
```

**Refactoring:** None.

---

## 11. EvolutionRule

### C11.1 fromVersion must be different from toVersion

```pseudo
if evolutionRule.fromVersion == evolutionRule.toVersion:
    ERROR("fromVersion must be different from toVersion")
```

**Refactoring:** None.

---

### C11.2 Must have at least one RefactoringOperation

```pseudo
if evolutionRule.applies.size() == 0:
    ERROR("EvolutionRule must have at least one operation")
```

**Refactoring:** None.

---

## Summary Table

| ID | Element | Constraint | Refactoring |
|----|---------|------------|-------------|
| C1.1 | RefModel | name not empty | — |
| C1.2 | RefModel | name uppercase | Capitalize |
| C2.1 | UserType | name unique | — |
| C2.2 | UserType | no self in superTypes | Remove self |
| C2.3 | UserType | no cycle in superTypes | — |
| C3.1 | ResourceType | name unique | — |
| C3.2 | ResourceType | attribute names unique | — |
| C4.1 | FeedbackType | name unique | — |
| C5.1 | FeedbackDefinition | target matches scope | — |
| C5.2 | FeedbackDefinition | author required | Add first UserType |
| C5.3 | FeedbackDefinition | no self parent | Set parent=null |
| C6.1 | RatingPolicy | only when hasRating=true | Set hasRating=true |
| C6.2 | RatingPolicy | min < max | Swap values |
| C7.1 | ValidationRule | at least one target | — |
| C7.2 | ValidationRule | expression for AUTOMATIC | — |
| C8.1 | ModerationPolicy | executedBy for MANUAL/HYBRID | Add moderator |
| C9.1 | AuthorizationRule | actor required | Add first UserType |
| C9.2 | AuthorizationRule | at least one target | — |
| C10.1 | AutomationRule | trigger not empty | — |
| C10.2 | AutomationRule | actionDescription not empty | — |
| C11.1 | EvolutionRule | fromVersion ≠ toVersion | — |
| C11.2 | EvolutionRule | at least one operation | — |

---

## References

- Enunciado P1: Section 3.3 (Metamodel Constraints) and Section 3.4 (Model Transformations)
- Metamodel: `diagrams/metamodel/ref-metamodel-v2.puml`
