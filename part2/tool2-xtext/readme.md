# ENORM Part 2 — Tool 2 (Xtext / RefDSL)

**Author:** Pedro Vilarinho  
**Tool:** Eclipse Xtext  
**Repository paths:** `part1/tool2-xtext/` (DSL plugins), `part2/tool2-xtext/` (P2 individual report)

**Evidence exports in repo:** `part2/tool2-xtext/runtime-RefGen/RefGenTest/` (or `part1/tool2-xtext/runtime-New_configuration/TestRef/`)

---

## Activity 1 — Concrete syntax (individual / Xtext)

### Implementation

| Asset | Path |
|-------|------|
| Grammar | `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext` |
| Validator | `.../validation/RefDslValidator.java` |
| Quick fixes | `pt.isep.enorm.refdsl.ui/.../RefDslQuickfixProvider.java` |
| Editor | RefDsl Editor on `.refdsl` files (runtime Eclipse) |
| Metamodel | REF v3 — aligned with `diagrams/metamodel/ref-metamodel-v3.puml` and `part1/eclipse/pt.isep.enorm.ref/ model/ref.ecore` |

Only **textual** concrete syntax is implemented (no graphical editor). Graphical notation is team/Sirius (`part2/TeamReport.md` §2.1).

### Team design vs Xtext implementation

The team SME notation (`part2/TeamReport.md` §2.2) uses section headers and minimal keywords. Xtext uses **explicit type keywords** and **braced blocks** (ANTLR/Xtext requirement).

| Metamodel element | Team notation (§2.2) | Xtext (`RefDsl.xtext`) | Adaptation reason |
|-------------------|------------------------|-------------------------|-------------------|
| `RefModel` | `ref "Name" version "1.0.0"` + sections | `RefModel Name version "…" { … }` | Root keyword + EMF-compatible blocks |
| `UserType` | `users:` → `Buyer kind BUYER` | `userTypes { UserType Buyer kind BUYER, … }` | Typed list under `userTypes` |
| `ContextType` | `contexts:` + `contains` | `contextTypes { ContextType X kind CATALOG contains ( A, B ) }` | Same semantics, block syntax |
| `ResourceType` | `resources:` + `fields:` | `resourceTypes { ResourceType P supportsMedia true { attributes { … } } }` | Attributes nested in resource block |
| `Attribute` | `- name is required …` | `required true multiValued false Attribute name type TEXT` | Modifiers before `Attribute` keyword |
| `ResourceRelation` | `relations:` | `resourceRelations { ResourceRelation … source … target … }` | |
| `FeedbackType` | `feedback types:` | `feedbackTypes { FeedbackType … kind REVIEW … }` | |
| `FeedbackDefinition` | `feedback definitions:` | `FeedbackDefinition Name type … author … subjectResource …` | Cross-references `[Type\|EString]` |
| `FeedbackPolicy` | inline policy | `policy FeedbackPolicy status ENABLED` | |
| `RatingPolicy` | inline rating | `rating RatingPolicy min 1 max 5 step 1` | |
| `AuthorizationRule` | `authorizations:` | `authorizationRules { AuthorizationRule name … allowedAction READ … }` | |
| `ValidationRule` | `validations:` | `validationRules { ValidationRule … invokedBy … }` | |
| `ModerationPolicy` | `moderations:` | `moderationPolicies { ModerationPolicy … }` | |
| `AutomationRule` | `automations:` + nested conditions/actions | `automationRules { AutomationRule … conditions { … } actions { … } }` | |
| `Condition` | list under automation | `Condition Name operator HAS_PROPERTY attribute attr` | |
| `ConditionValue` | keyword list | `values { ConditionValue value "…", … }` | Team uses `ConditionKeywords`; Xtext uses `ConditionValue` (v3 Ecore name) |
| `Action` | `then:` list | `actions { Action Name kind DISPLAY_MESSAGE message "…" }` | |
| `VerificationPolicy` | `verifications:` | `verificationPolicies { VerificationPolicy … }` | |
| `SortingPolicy` | `sorting policies:` | `sortingPolicies { SortingPolicy … criterion VALUE direction DESC }` | |

### Adaptations for Xtext (summary)

1. **Braces and commas** instead of indentation-only SME view — required for unambiguous parsing.
2. **Explicit type keywords** (`UserType`, `ResourceType`, …) — better content assist and error messages.
3. **Typed enums** (`TriggerEvent`, `UserKind`, …) — parse-time validation instead of free text.
4. **Metamodel v3 preserved** — changes are concrete syntax only, not domain semantics.
5. **`ConditionValue`** in grammar matches Ecore v3 (team doc may say `ConditionKeywords`).

### Evidence (screenshot — add by author)

<!-- Replace with your screenshot after capture -->
![RefDsl Editor — Amazon model](screenshots/a1-editor-amazon.png)

*Capture: `amazon.refdsl` open in **RefDsl Editor** with syntax highlighting (runtime Eclipse).*

---

## Activity 5 — Code generation (individual)

### Overview

The Xtext generator produces:

1. **P1 projections:** `projections/<Model>.txt` and `.puml`
2. **P2 backends:** `generated-backend/<scenario>/` — Maven/Spring Boot project per `RefModel` name

| Class | Role |
|-------|------|
| `RefDslGenerator.xtend` | Entry point (`doGenerate`) |
| `RefBackendGenerator.xtend` | Spring Boot templates |
| `RefBackendNaming.xtend` | Package names, Java types, API paths |

See also `generation-design.md` and `part2/TeamReport.md` §6.

### Common parts (always generated)

- `pom.xml`, `application.properties`, `*BackendApplication.java`
- `domain/enums/Role.java` from `UserType.kind`
- User entity + repository (`Generated*` + manual subclass)
- `SecurityConfiguration` (permit-all MVP), auth register endpoint
- `ApiError`, `ApiExceptionHandler`, smoke test

### Variable parts (model-driven)

| REF element | Generated artifacts |
|-------------|---------------------|
| Each `ResourceType` | Entity, repository, service, REST controller stack |
| Each `FeedbackDefinition` | Same + `subjectResource` link; `grade` if `RatingPolicy` present |
| `Attribute` / `PrimitiveType` | JPA fields on resource entities |

**Generation Gap:** `**/generated/**` overwritten on save; manual classes in `domain/`, `service/`, etc. created once (`writeManualOnce`).

### How to run generation

See section **Appendix — Commands** below.

---

## Activity 6 — Generate applications (individual)

### 1. Generated scenarios (repository evidence)

| Scenario | Input model | Output folder | `mvn test` (verified) |
|----------|-------------|---------------|------------------------|
| Amazon | `amazon.refdsl` → `RefModel Amazon` | `src-gen/generated-backend/amazon/` | OK |
| Reddit | `reddit.refdsl` → `RefModel Reddit` | `src-gen/generated-backend/reddit/` | OK |
| Youtube | `youtube.refdsl` → `RefModel Youtube` | `src-gen/generated-backend/youtube/` | OK |

Reference export: `part2/tool2-xtext/runtime-RefGen/RefGenTest/src-gen/`

Also generated: `projections/Amazon.txt`, `Amazon.puml`, `Reddit.*`, `Youtube.*`

### 2. Manual extension (Generation Gap)

Example after first save of `amazon.refdsl`:

- Generated: `.../domain/generated/GeneratedProduct.java` — **overwritten** on each save
- Manual: `.../domain/Product.java` — **preserved** (empty subclass for custom logic)

To demonstrate: add a method to `ProductService.java`, save `amazon.refdsl` again → manual file unchanged, `GeneratedProductService.java` refreshed.

### 3. Issues found during testing

| ID | Issue | Severity | Workaround |
|----|-------|----------|------------|
| I1 | Output under `src-gen/`, not project root | Low | Document path; F5 refresh |
| I2 | Java names `Productreview` vs `ProductReview` | Low | Generator `toPascalCase` limitation |
| I3 | `subjectFeedback` not emitted in JPA (e.g. `ReplyComment`) | Medium | Manual entity extension or future generator fix |
| I4 | REF policies (`AuthorizationRule`, `AutomationRule`, …) not in generated Java | Medium | Use `part2/amazon-backend` prototype; hooks in manual services |
| I5 | Security is `permitAll()`, not JWT from DSL | Medium | Reference prototype in `part2/*-backend` |
| I6 | All feedback entities have `comment` field even for votes | Low | Accept as placeholder or override in manual service |
| I7 | Early `pom.xml` missing `spring-boot-starter-security` | Fixed | Template updated in `RefBackendGenerator.xtend` |

### 4. Screenshots (add by author)

| File | Content |
|------|---------|
| `screenshots/a1-editor-amazon.png` | RefDsl Editor + `amazon.refdsl` |
| `screenshots/a6-generated-tree.png` | Package Explorer: `src-gen/generated-backend/amazon` |
| `screenshots/a6-mvn-test.png` | Terminal `mvn test` BUILD SUCCESS |
| `screenshots/a6-rest-products.png` | `GET http://localhost:8081/api/products` |
| `screenshots/a6-manual-extension.png` | Manual `Product.java` vs `GeneratedProduct.java` |
| `screenshots/a6-evolution-after.png` | Migrated model, Problems view clean |

### 5. Comparison with manual prototype (Activity 3)

| Aspect | Generated `generated-backend/amazon` | Manual `part2/amazon-backend` |
|--------|--------------------------------------|-------------------------------|
| Purpose | DSL-driven skeleton (A5/A6) | Full REF behaviour reference (A3) |
| JWT / auth rules | No | Yes |
| Moderation / verification | Hooks only | Implemented |
| Libraries | Minimal Spring stack | Full team stack (JJWT, etc.) |

---

## Model evolution and migration (Activity 6)

### Strategy

1. **Version control** — grammar/Xtext projects and `.refdsl` models tagged in Git (e.g. v3.0, v3.1).
2. **Metamodel/grammar change** — edit `RefDsl.xtext` → run **MWE2** (`GenerateRefDsl.mwe2`) → **Project → Clean**.
3. **Model migration** — update `.refdsl` files (manual edit or script) to match new syntax.
4. **Re-validate** — open in RefDsl Editor; fix issues reported in **Problems**.
5. **Regenerate** — save model → projections + `generated-backend/` updated.

### Change types

| Type | Example | Migration effort |
|------|---------|------------------|
| Additive optional field | `description` on `RefModel` | Old models valid without change |
| New enum literal | New `TriggerEvent` | Add to models using new trigger |
| Syntax rename | Section headers vs blocks | Search/replace + validate |
| Breaking delete | Remove attribute | Edit all models |

### Demonstration: v3.0 → v3.1 (optional `description` on `RefModel`)

Files in `part2/tool2-xtext/examples/`:

| File | Role |
|------|------|
| `amazon-v3.0.refdsl` | Model before change (current syntax) |
| `amazon-v3.1.refdsl` | Model after adding `description "…"` |
| `GRAMMAR-PATCH-v3.1.txt` | Exact line to add in `RefDsl.xtext` |

**Steps (author must run in Eclipse):**

1. Apply patch from `examples/GRAMMAR-PATCH-v3.1.txt` to `RefDsl.xtext` (`RefModel` rule).
2. Run **MWE2** on `GenerateRefDsl.mwe2` → **Clean** `pt.isep.enorm.refdsl`.
3. Open `amazon-v3.0.refdsl` — should still parse (no `description`).
4. Open `amazon-v3.1.refdsl` — should parse with new optional property.
5. Screenshot Problems view (both valid).

No automatic `.refdsl` migrator is shipped; additive changes need one new line per model when desired.

---

## Appendix — Commands

### Eclipse development

1. Import: `pt.isep.enorm.ref`, `pt.isep.enorm.refdsl`, `pt.isep.enorm.refdsl.ui`, `pt.isep.enorm.refdsl.ide`
2. After `.xtend` changes: **Project → Clean**
3. After `.xtext` changes: **Run MWE2** on `GenerateRefDsl.mwe2`

### Runtime generation

1. **Run → Eclipse Application** (plugins `pt.isep.enorm.refdsl*`)
2. Project `RefGenTest` with `amazon.refdsl`, `reddit.refdsl`, `youtube.refdsl`
3. **Open With → RefDsl Editor** → **Yes** (Xtext project) → **Ctrl+S** each → **F5**

### Maven (generated Amazon backend)

```powershell
$base = "c:\Users\Utilizador\Documents\isep-dei-mei-enorm-25-26-project-enorm-25-26-m1a-4\part2\tool2-xtext\runtime-RefGen\RefGenTest\src-gen\generated-backend"

mvn -f "$base\amazon\pom.xml" test
mvn -f "$base\amazon\pom.xml" spring-boot:run
```

| Scenario | Port |
|----------|------|
| Amazon | 8081 |
| Reddit | 8083 |
| Youtube | 8082 |

```http
GET http://localhost:8081/api/products
POST http://localhost:8081/api/auth/register?username=demo&password=demo&role=BUYER
```

---

## Related documents

- Team report: `part2/TeamReport.md`
- Generation design: `part2/tool2-xtext/generation-design.md`
- Scenario models: `part1/tool2-xtext/scenarios-a7/*.refdsl`
- Manual prototype: `part2/amazon-backend/`
