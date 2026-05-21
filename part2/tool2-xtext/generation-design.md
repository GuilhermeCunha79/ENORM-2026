# Activity 5 - Code Generation Design (Tool 2 / Xtext)

This document captures the concrete code generation design used for Part 2 and aligned with the team report section in `part2/TeamReport.md`.

**Implementation:** `part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/generator/RefBackendGenerator.xtend` (invoked from `RefDslGenerator.xtend` on each `.refdsl` save).

## 1) Input and normalization

- Input: REF model instance from textual DSL (Xtext).
- Validation: syntax + semantic validation already available in the language.
- Normalization output: a `GenerationPlan` structure with:
  - model metadata (`name`, `version`)
  - actors/roles
  - resources/attributes/relations
  - feedback definitions and policies
  - governance (authorization, validation, moderation, automation, verification, sorting)

## 2) Template groups

- Project templates: Maven, properties, application bootstrap, README.
- Domain templates: `Generated*` mapped entities + manual subclasses.
- Repository templates: generated and manual interfaces.
- Service templates: generated base services + manual extension services.
- Web templates: generated base controllers + manual controllers.
- Security templates: JWT + stateless security config + role mapping.
- Error templates: API error payload and exception handler.
- Test templates: startup smoke and basic endpoint smoke tests.

## 3) Common (always-generated) artifacts

These parts are generated for all scenarios:

- Layered package layout and Generation Gap structure.
- Security baseline and authentication endpoints.
- Core CRUD scaffolding for generated entities.
- Common error handling and REST conventions.
- H2 + JPA baseline setup.

## 4) Variable (model-driven) artifacts

- `ResourceType` -> entity/repository/service/controller stack.
- `Attribute` and `PrimitiveType` -> field types and validation annotations.
- `FeedbackDefinition` + `FeedbackSubjectScope` -> feedback endpoints and relation mappings.
- `FeedbackType.hasRating` + `RatingPolicy` -> rating fields, range checks, aggregation endpoints.
- `AuthorizationRule` -> route and service authorization guards.
- `ValidationRule` + `implementationId` -> validator hooks and extension points.
- `SortingPolicy` -> query ordering options and list endpoint params.
- `ModerationPolicy` / `AutomationRule` -> policy entities/handlers when present.

## 5) Regeneration behavior

- Files under `generated/` are overwritten on regeneration.
- Manual extension classes are preserved.
- New model elements create new generated artifacts; removed elements delete only generated artifacts.

## 6) Output targets in this repository

- `part2/amazon-backend`
- `part2/reddit-backend`
- `part2/youtube-backend`

The three backends are scenario specializations of the same generator architecture.
