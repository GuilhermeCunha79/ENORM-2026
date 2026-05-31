# ENORM Part 2 — Tool 2 (Xtext / REF DSL)

**Author:** Pedro Vilarinho
**Tool:** Eclipse Xtext
**Repository paths:** `part1/tool2-xtext/` (DSL plugins + generator), `part2/tool2-xtext/` (this individual report + generated evidence)

**Generated evidence in repo:** `part2/tool2-xtext/runtime-RefGen/RefGenTest/src-gen/generated-backend/{amazon,reddit,youtube}/`

---

## Mapping to the P2 individual tasks (enunciado §2.4)

| Enunciado task | Where it is addressed |
|----------------|-----------------------|
| **A1** — Implement the designed notation in the tool + describe adaptations | [Activity 1](#activity-1--concrete-syntax-textual-notation) |
| **A5** — Implement the code-generation templates/rules; generate all 3 applications | [Activity 5](#activity-5--code-generation) |
| **A6** — Generate the 3 REF models; support manual code; test; report issues; model evolution | [Activity 6](#activity-6--generate-applications) |
| **A2 requirement** — generated code supports manual extension (SME extensibility) | [Generation Gap](#manual-extension--generation-gap-a2-requirement) |
| **Team task** — code from different tools is compatible (mix/combine) | [Cross-tool compatibility](#cross-tool-compatibility-team-task) |

---

## Activity 1 — Concrete syntax (textual notation)

Only the **textual** concrete syntax is implemented (Xtext supports the textual notation; the graphical notation is Sirius — see `part2/TeamReport.md` §2.1).

### Implementation

| Asset | Path |
|-------|------|
| Grammar | `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext` |
| Derived metamodel | `generate refDsl "http://www.example.org/refdsl"` → Ecore metamodel auto-derived from the grammar (REF v3) |
| Validator | `.../validation/RefDslValidator.java` |
| Quick fixes | `pt.isep.enorm.refdsl.ui/.../RefDslQuickfixProvider.java` |
| Editor | RefDsl Editor on `.refdsl` files (runtime Eclipse: syntax highlighting, content assist, validation) |

### Adaptations for Xtext (and why)

1. **Braced blocks + commas** instead of indentation-only SME view — required by ANTLR/Xtext for unambiguous parsing.
2. **Explicit type keywords** (`UserType`, `ResourceType`, …) — better content assist and clearer error messages.
3. **Typed enums** (`TriggerEvent`, `UserKind`, `ConditionOperator`, …) — parse-time validation instead of free text (supports the "strongly typed" aim, §1.2.2).
4. **`ConditionValue`** in the grammar matches the Ecore v3 name (the team SME notation may say `ConditionKeywords`).
5. **Metamodel v3 preserved** — changes are concrete-syntax only, not domain semantics.

The full element-by-element mapping (team SME notation ↔ Xtext grammar) is kept in `part2/TeamReport.md` §2.2.

---

## Activity 5 — Code generation

### Pipeline (how it works)

The grammar defines the language; `generate refDsl` derives the EMF metamodel; on every **save** of a `.refdsl` file the Xtext builder runs: **parse → EMF model (AST) → link cross-references → validate → generate**. The generation step calls `doGenerate`, which runs the Xtend templates.

| Class | Role |
|-------|------|
| `generator/RefDslGenerator.xtend` | Entry point (`AbstractGenerator.doGenerate`); emits text/PlantUML projections and delegates the backend to `RefBackendGenerator` |
| `generator/RefBackendGenerator.xtend` | All Spring Boot templates — the heart of the generator |
| `generator/RefBackendNaming.xtend` | Package name (`pt.isep.enorm.ref`), Java type mapping, REST collection paths, ports |

### Output

For each `RefModel` a complete, compilable **Maven / Spring Boot 3.4.5 (Java 21)** project is produced under `src-gen/generated-backend/<scenario>/`, plus the P1 projections `projections/<Model>.{txt,puml}`.

**Target platform of the generated code:** Spring Boot Web + Spring Data JPA + Spring Security (JWT, JJWT 0.12.6) + H2 (file). Base package `pt.isep.enorm.ref` (the **same** root used by the Sirius and MPS tools — see compatibility section).

### Common parts (always generated, independent of the model)

- `pom.xml`, `application.properties` (`open-in-view=true`), `*BackendApplication.java`
- **Security stack:** `JwtService`, `JwtAuthenticationFilter`, `SecurityConfiguration`, `UserTypeDetailsService`
- **Authentication:** `AuthenticationController` (`POST /api/auth/register`, `POST /api/auth/login`) + `AuthenticationService` + DTOs (`RegisterRequest`, `LoginRequest`, `AuthenticationResult`)
- **User entity** `UserType` + repository (Generation Gap pair) + `domain/enums/Role.java` (literals from `UserType.kind`)
- **Error handling:** `web/error/ResourceNotFoundException`, `ApiError`, `ApiExceptionHandler`
- Smoke test (`*ApplicationTests`) + acceptance tests (see [Testing](#testing))

### Variable parts (driven by the model)

| REF element in the model | Generated artifacts |
|--------------------------|---------------------|
| each `ResourceType` (Product, Post, Video, …) | JPA entity + repository + service + REST controller — full **CRUD** (`GET` list, `GET /{id}`, `POST`, `PUT /{id}`, `DELETE /{id}`) |
| each `FeedbackDefinition` (ProductReview, …) | feedback entity + stack; `grade` field if a `RatingPolicy` exists; `author`/`subject`/`parentFeedback` links; uniqueness check if `uniquePerAuthorTarget` |
| `supportsMedia` / `allowsMedia` = true | `XMediaReference` entity + repository |
| each `AuthorizationRule` | a `hasRole("<actor>")` rule in `SecurityConfiguration` (JWT-protected endpoints) |
| `ContextType` / `ContextResource` | context entities + repository + `ContextController` + `ContextService` |
| `ValidationRule` / `ModerationPolicy` / `VerificationPolicy` / `SortingPolicy` | governance entities + `/api/policies/...` endpoints |
| `SortingPolicy` | the `?sortBy=&direction=` query parameters on resource `GET` |
| `ModerationPolicy` | **moderation engine**: `ModerationController` (`POST /api/moderation/simulate`) + `ModerationService` |
| `AutomationRule` (+ `Condition`/`Action`) | **automation engine**: `AutomationRuleController` (`/api/policies/automation-rules`) + `AutomationEngineService` + `AutomationController` (`POST /api/automation/evaluate`) |

> **Traceability example (model → code):** `AuthorizationRule name BuyerThreadAuth allowedAction COMMENT actor Buyer …` in `amazon.refdsl` becomes `requestMatchers(HttpMethod.POST, "/api/top-thread-comments").hasRole("BUYER")` in the generated `SecurityConfiguration.java`. No Java was written by hand for this — it is generated from the model.

---

## Activity 6 — Generate applications

### 1. Generated scenarios (repository evidence)

| Scenario | Input model | Output folder | Port | `mvn test` |
|----------|-------------|---------------|------|-----------|
| Amazon | `amazon.refdsl` → `RefModel Amazon` | `src-gen/generated-backend/amazon/` | 8081 | BUILD SUCCESS |
| Reddit | `reddit.refdsl` → `RefModel Reddit` | `src-gen/generated-backend/reddit/` | 8083 | BUILD SUCCESS |
| Youtube | `youtube.refdsl` → `RefModel Youtube` | `src-gen/generated-backend/youtube/` | 8082 | BUILD SUCCESS |

Also generated: `projections/Amazon.{txt,puml}`, `Reddit.*`, `Youtube.*`.

### Manual extension — Generation Gap (A2 requirement)

The enunciado (A2) requires that the generated code lets the SME's software engineer add manual logic in the base language, integrated with the generated code. This is implemented with the **Generation Gap pattern**, applied uniformly:

- Every concept is split into `GeneratedX` (`@MappedSuperclass` / abstract / interface, in a `generated/` sub-package) and a manual `X` subclass in the parent package.
- `GeneratedX` files are **overwritten on every save**; manual `X` files are **created once and never overwritten** (`writeManualOnce`).
- This makes `domain/` and `domain/generated/` symmetric (entities, repositories, services, controllers).

**To demonstrate:** add a method to `service/ProductService.java`, save `amazon.refdsl` again → `service/generated/GeneratedProductService.java` is refreshed, but the manual `ProductService.java` keeps the edit.

### 2. Testing

- **`mvn test`** on the three backends → BUILD SUCCESS.
- **Acceptance tests** (black-box over the real HTTP API on a random port, in-memory H2): `AmazonAcceptanceTests` (7), `RedditAcceptanceTests` (5), `YoutubeAcceptanceTests` (6) — **18 tests, 0 failures**. They exercise: JWT register/login, role-based authorization (e.g. `GET /api/product-reviews` allowed to BUYER, forbidden to SELLER), resource CRUD + sorting, governance policy endpoints and the automation engine (a rule is posted and `/api/automation/evaluate` fires its action).

```powershell
mvn -f "<base>\amazon\pom.xml"  -Dtest=AmazonAcceptanceTests  test
mvn -f "<base>\reddit\pom.xml"  -Dtest=RedditAcceptanceTests  test
mvn -f "<base>\youtube\pom.xml" -Dtest=YoutubeAcceptanceTests test
```

### 3. Issues found during tests

| ID | Issue | Status |
|----|-------|--------|
| I1 | `description` collided with a grammar keyword (`no viable alternative`) | **Fixed** — added to `EString`, re-ran MWE2 |
| I2 | H2 reserved words (`value`, `trigger`, `context`) broke DDL | **Fixed** — mapped to `vote_value`, `trigger_event`, `context_name`, etc. |
| I3 | `GET` of an aggregate (e.g. `AutomationRule`) failed to serialize lazy collections with `open-in-view=false` | **Fixed** — template now generates `open-in-view=true` |
| I4 | `register` throws `NullPointerException` if the JSON omits `role` | **Known** — workaround: always send a valid `role`; could be hardened to return `400` |
| I5 | Output lands under `src-gen/`, not the project root; needs `F5` refresh | Low — documented in the workflow |
| I6 | `toPascalCase` edge cases on compound names | Low — handled for the current models |

### 4. Model evolution and migration

**Strategy:** the grammar and `.refdsl` models are versioned in Git. A metamodel/grammar change is: edit `RefDsl.xtext` → run **MWE2** (`GenerateRefDsl.mwe2`) → **Project → Clean** → migrate `.refdsl` files → re-validate in the editor → save to regenerate.

| Change type | Example | Migration effort |
|-------------|---------|------------------|
| Additive optional field | `description` on `RefModel` | old models stay valid (no change needed) |
| New enum literal | new `TriggerEvent` | add only to models that use it |
| Syntax rename | section headers → blocks | search/replace + validate |
| Breaking delete | remove an attribute | edit every model |

**Demonstration (v3.0 → v3.1, optional `description` on `RefModel`):** since the change is *additive optional*, the previous models parse unchanged and new models may add `description "…"`. This shows the DSL is **evolvable** (§1.2.5) and that additive evolution needs no automatic migrator.

---

## Cross-tool compatibility (team task)

The team task requires that code generated by different tools is compatible (mix/combine). The three tools (Xtext, Sirius, MPS) all generate into the **same base package** `pt.isep.enorm.ref`, which is the enabler.

**Verified swap:** `web/error/ResourceNotFoundException` is contract-identical across the three tools (byte-identical Xtext↔Sirius; identical modulo comment/formatting in MPS). Replacing the Xtext backend's class with the **MPS-generated** one and running the Amazon acceptance suite → **7/7 still pass**. A class generated by one tool runs inside another tool's backend.

This shows two levels of compatibility:
1. **Class level** — `ResourceNotFoundException` is swappable (same package + contract).
2. **API-contract level** — all three expose the same REST contract (`/api/auth/login`, `/api/products`, …) under the same package, so a single Postman collection works as a client against any of the backends. Compatibility means a *shared contract*, not byte-identical code.

Classes that are **not** swappable (and why): `JwtService` (different internal APIs per tool), `SecurityConfiguration` (rules derived from each model's `AuthorizationRule`s), domain entities (Sirius uses value objects), `UserDetailsService` (different names). Details in `part2/TeamReport.md` §6.

---

## Appendix — Commands

### Eclipse development (Host workspace)

1. Import: `pt.isep.enorm.ref`, `pt.isep.enorm.refdsl`, `pt.isep.enorm.refdsl.ui`, `pt.isep.enorm.refdsl.ide`
2. After `.xtend` changes → **Project → Clean**
3. After `.xtext` changes → **Run As → MWE2 Workflow** on `GenerateRefDsl.mwe2`

### Runtime generation (RefGen)

1. **Run As → Eclipse Application** (launches a second Eclipse with the REF DSL plugin)
2. Project `RefGenTest` with `amazon.refdsl`, `reddit.refdsl`, `youtube.refdsl`
3. **Ctrl+S** each model → the builder regenerates `src-gen/generated-backend/<scenario>/` → **F5** to refresh

### Maven (generated backends)

```powershell
$base = "C:\Users\Utilizador\Documents\isep-dei-mei-enorm-25-26-project-enorm-25-26-m1a-4\part2\tool2-xtext\runtime-RefGen\RefGenTest\src-gen\generated-backend"

mvn -f "$base\amazon\pom.xml" test
mvn -f "$base\amazon\pom.xml" spring-boot:run     # http://localhost:8081
```

| Scenario | Port |
|----------|------|
| Amazon | 8081 |
| Reddit | 8083 |
| Youtube | 8082 |

### Sample requests (Amazon, port 8081)

```http
POST http://localhost:8081/api/auth/register
Content-Type: application/json
{ "username": "alice", "password": "secret", "role": "BUYER" }

POST http://localhost:8081/api/auth/login
Content-Type: application/json
{ "username": "alice", "password": "secret" }

GET  http://localhost:8081/api/products
Authorization: Bearer <token>
```

> H2 console: `http://localhost:8081/h2-console` — JDBC `jdbc:h2:file:./data/amazonappdb`, user `sa`, no password.

---

## Related documents

- Team report: `part2/TeamReport.md`
- Generation design: `part2/tool2-xtext/generation-design.md`
- Per-activity Xtext notes: `part2/tool2-xtext/atividades-xtext-p2.md`
- Scenario models: `part1/tool2-xtext/scenarios-a7/*.refdsl`
- Manual prototype (Activity 3 reference): `part2/amazon-backend/`
