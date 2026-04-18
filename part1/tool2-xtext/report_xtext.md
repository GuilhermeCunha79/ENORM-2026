# ENORM Project, Part 1, Tool 2 – Xtext / RefDSL

This document describes the **textual DSL toolchain** based on **Xtext** for **RefDSL**: grammar, alignment with the **REF** Ecore metamodel, **semantic validation**, **quick fixes**, and **projections** (textual + PlantUML). It mirrors the report structure used for Tool 3 (Sirius) and supports team and individual sections for **Activities 4–7**.

---

## Xtext / RefDSL Overview

**Xtext** is an open-source framework (Eclipse ecosystem) for building **textual domain-specific languages (DSLs)**. From a **grammar** (`.xtext`), it generates a **parser**, **serializer**, **Eclipse editor** (syntax highlighting, content assist), **EMF integration**, and extension points for **validation** and **code generation**.

### Key Features

- **Declarative Grammar**: `RefDsl.xtext` defines the concrete syntax of `.refdsl` files mapped to EMF types (`RefModel`, `UserType`, `FeedbackDefinition`, …).
- **MWE2 Workflow**: `GenerateRefDsl.mwe2` regenerates `src-gen` (ANTLR parser, EMF model aligned with the grammar) after grammar changes.
- **Semantic Validation**: `RefDslValidator.java` — many `@Check` methods with stable issue codes (`INVALID_*`, `MC_G*`).
- **Quick Fixes**: `RefDslQuickfixProvider.java` — `@Fix(issueCode)` semantic refactorings (`Ctrl+1` in the editor).
- **Projections Generator**: `RefDslGenerator.xtend` — emits **textual** (`.txt`) and **PlantUML** (`.puml`) views; optional variants may include `*_structure.puml` and `*_feedback.puml` for readability.
- **Runtime Testing**: A second Eclipse instance (**Run → Eclipse Application**) loads the DSL plugins without polluting the development workspace.

### Use in the Project

In the project, Xtext / RefDSL is used to:

- Author **normative scenario models** (Amazon, YouTube, Reddit) as **`.refdsl`** files.
- Enforce **REF domain constraints** (naming, feedback policies, moderation, authorization contexts, rating bounds, …).
- Produce **reporting artifacts**: valid models, **Problems** view screenshots, **Quick Fix** captures, and files under **`src-gen/projections/`**.

### Project Structure

**Location (repository):** `part1/tool2-xtext/` (EMF metamodel project: `part1/eclipse/pt.isep.enorm.ref/`)

| Path | Role |
|------|------|
| `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext` | Grammar — concrete syntax of RefDSL. |
| `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/GenerateRefDsl.mwe2` | MWE2 workflow — regenerate Xtext artifacts. |
| `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/validation/RefDslValidator.java` | Semantic constraints (`@Check`). |
| `pt.isep.enorm.refdsl.ui/.../quickfix/RefDslQuickfixProvider.java` | Quick fixes (`@Fix`). |
| `pt.isep.enorm.refdsl/src/.../generator/RefDslGenerator.xtend` | Text + PlantUML projections. |
| `pt.isep.enorm.refdsl/model/generated/RefDsl.ecore` | Ecore derived from the grammar (editor-facing). |
| `amazon.refdsl`, `youtube.refdsl`, `reddit.refdsl`, `activity6_modelo_completo.refdsl` | Sample / scenario models. |
| `RefDslGenerator.v2.for-ref-metamodel.xtend` | Reference generator when **v2** uses `pt.isep.enorm.ref.ref.RefModel` instead of `pt.isep.enorm.refdsl.refDsl.RefModel`. |

**Eclipse plug-ins:** `pt.isep.enorm.ref`, `pt.isep.enorm.refdsl`, `pt.isep.enorm.refdsl.ui`, `pt.isep.enorm.refdsl.ide`.

---

## Installation

1. **Download Eclipse Modeling Tools**
   - [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
   - Select the **Eclipse Modeling Tools** package (or Eclipse + **Xtext SDK**).

2. **Install Eclipse**
   - Extract and launch the IDE.

3. **Verify Xtext**
   - `Help` → `About Eclipse` → `Installation Details` → confirm **Xtext** (and **Xtend**) features are present.

4. **Import the workspace projects**
   - `File` → `Import` → `Existing Projects into Workspace`
   - Select `pt.isep.enorm.ref`, `pt.isep.enorm.refdsl`, `pt.isep.enorm.refdsl.ui`, `pt.isep.enorm.refdsl.ide`.

5. **After grammar changes**
   - Right-click `GenerateRefDsl.mwe2` → **Run As** → **MWE2 Workflow**
   - **Project** → **Clean…** on the RefDSL projects.

6. **Runtime (second Eclipse)**
   - **Run** → **Run Configurations…** → **Eclipse Application**
   - Enable plug-ins: `pt.isep.enorm.ref`, `pt.isep.enorm.refdsl*`
   - **Run** — test `.refdsl` files in a runtime project (e.g. `RefDslRuntimeTest`).

---

## Activity 4: Design Domain Metamodel

### Metamodel assets and links (REF)

| Asset | Repository path |
|-------|-------------------|
| **Ecore** | [`../eclipse/pt.isep.enorm.ref/model/ref.ecore`](../eclipse/pt.isep.enorm.ref/model/ref.ecore) |
| **Genmodel** | [`../eclipse/pt.isep.enorm.ref/model/ref.genmodel`](../eclipse/pt.isep.enorm.ref/model/ref.genmodel) |
| **Metamodel diagram (PlantUML)** | [`../../diagrams/metamodel/ref-metamodel-v2.puml`](../../diagrams/metamodel/ref-metamodel-v2.puml) |
| **Constraint specification (team doc)** | [`../../diagrams/metamodel/Metamodel_Constraints.md`](../../diagrams/metamodel/Metamodel_Constraints.md) |

**Note:** If you use **`pt.isep.enorm.refdsl.v2`** with imports from **`pt.isep.enorm.ref.ref`**, regenerate **`pt.isep.enorm.ref`** from the group’s `ref.ecore` and align **`RefDslGenerator.xtend`** with the generated API (e.g. `AutomationRule` may expose `conditions` / `actions` collections instead of legacy string attributes).

### Metamodel Implementation in Xtext

#### 1. Core Metamodel (Ecore) and Grammar

The **domain** is defined in **`ref.ecore`** (`pt.isep.enorm.ref`). The **RefDSL** grammar **`RefDsl.xtext`** provides a **concrete syntax** for the same concepts: keywords, block structure, cross-references, and enumerations.

**Main concepts (excerpt):**

- **RefModel** (root), **UserType**, **ResourceType**, **Attribute**, **ContextType**, **ResourceRelation**
- **FeedbackType**, **FeedbackDefinition**, **FeedbackPolicy**, **RatingPolicy**
- **AuthorizationRule**, **ValidationRule**, **ModerationPolicy**, **AutomationRule**, **VerificationPolicy**

**Representative enumerations** (see `RefDsl.xtext` / `ref.ecore`):  
`UserKind`, `ContextKind`, `PrimitiveType`, `FeedbackKind`, `FeedbackSubjectScope`, `ActionKind`, `ValidationKind`, `RuleSeverity`, `ModerationMode`, `ModerationDecision`, …

#### 2. Relationship: Ecore vs Grammar vs Validator

| Layer | Responsibility |
|-------|----------------|
| **Ecore (`ref.ecore`)** | Domain structure and types shared across tools. |
| **Grammar (`RefDsl.xtext`)** | **Syntax** of `.refdsl` files and generated EMF API under `refdsl.refDsl`. |
| **Validator (`RefDslValidator`)** | **Semantic** rules beyond pure parsing (business / normative constraints). |

### Implementation Artifacts

**Location:** `part1/tool2-xtext/`

**Key files:**

- `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext` — Grammar
- `part1/eclipse/pt.isep.enorm.ref/model/ref.ecore` — Shared REF metamodel
- `pt.isep.enorm.refdsl/model/generated/RefDsl.ecore` — Grammar-derived Ecore

### Metamodel Validation

The stack is validated by:

1. **Ecore consistency** — EMF tooling / genmodel generation for `pt.isep.enorm.ref`.
2. **Xtext generation** — MWE2 completes without errors; `src-gen` compiles.
3. **Sample models** — `.refdsl` files parse and validate in the runtime workbench.

---

## Activity 5: Design Metamodel Constraints and Transformations

### Implementation of Constraints and Refactorings in Xtext

Constraints and refactorings are implemented in **Java** (not ODesign):

- **`RefDslValidator`**: `@Check` methods call `error(...)` / `warning(...)` with **issue codes** matching **`@Fix`** entries.
- **`RefDslQuickfixProvider`**: applies **semantic modifications** to the EMF model (capitalize names, fix `FeedbackType` scopes, add default `RatingPolicy`, repair context links for G10–G12, …).

The normative requirements are documented in **`Metamodel_Constraints.md`** (repository: `diagrams/metamodel/`).

### 5.1 Constraint Design and Analysis

Representative **constraint families** implemented in `RefDslValidator`:

| Area | Examples |
|------|-----------|
| **RefModel** | Non-empty name, minimum length, optional SemVer warning on `version`. |
| **Naming & uniqueness** | `UserType`, `ResourceType`, `ContextType`, `FeedbackType`, `FeedbackDefinition`, `ResourceRelation`, … |
| **Inheritance** | No self-supertype; no cycles in `UserType` / `ResourceType` supertype graphs. |
| **Feedback typing** | e.g. `REVIEW` requires `RESOURCE_ONLY`; `REACTION`/`VOTE` restrictions; recursive vs `subjectScope`. |
| **Rating** | `RatingPolicy` only when `hasRating`; min/max ordering; positive step; G1/G3 rules. |
| **Cross-cutting (G8–G12)** | Verified context vs `VerificationPolicy`; unique-per-author single target; authorization / moderation / automation context membership. |

### 5.2 Quick Fixes

Quick fixes are registered with **`@Fix(RefDslValidator.SOME_CODE)`**. Examples include:

- Capitalize **RefModel** / **UserType** / **ResourceType** / **FeedbackType** names.
- Set default **version** to `1.0.0` (SemVer warning).
- **G2 / G3 / G4 / G5** normalizations on `FeedbackType`.
- Create default **RatingPolicy** (G1).
- Add missing **VerificationPolicy** (G8).
- Adjust **context** / **contains** for authorization, moderation, automation (G10–G12).

### 5.3 Runtime Validation Workflow

1. Open `.refdsl` in the **RefDSL** editor (runtime Eclipse).
2. **Window** → **Show View** → **Problems**.
3. Introduce a deliberate semantic violation → save.
4. Select issue → **Ctrl+1** → apply fix → save.

**Important:** Parser errors (“no viable alternative”, …) are **not** suitable to demonstrate **semantic** quick fixes; use validator-driven warnings/errors.

### Summary (Activity 5)

| Artifact | Path |
|----------|------|
| Validator | `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/validation/RefDslValidator.java` |
| Quick fixes | `pt.isep.enorm.refdsl.ui/src/pt/isep/enorm/refdsl/ui/quickfix/RefDslQuickfixProvider.java` |
| Constraint doc | `diagrams/metamodel/Metamodel_Constraints.md` |

---

## Activity 6: Design Model Projections / Visualizations

Design and implement **textual** and **graphical** projections for RefDSL models.

### 6.1 Visualization Strategy

Two complementary projections:

1. **Textual** — human-readable dump of the model (sections for user types, resources, feedback, rules, policies).
2. **Graphical (PlantUML)** — class-style diagram with associations (`RefDslGenerator.xtend`).

Optional **split views** (if enabled in the generator): **`_structure.puml`** (structural slice) and **`_feedback.puml`** (governance / feedback slice) to reduce clutter in reports.

### 6.2 Implementation

**Class:** `RefDslGenerator` (`RefDslGenerator.xtend`)  
**Entry point:** `doGenerate(Resource, IFileSystemAccess2, IGeneratorContext)`  
**Output folder (relative to the project that contains the `.refdsl` file):** `src-gen/projections/` (or `projections/` depending on build — default pattern is `projections/<basename>.txt` and `.puml`).

**Typical outputs per model basename `<name>`:**

| File | Purpose |
|------|---------|
| `<name>.txt` | Textual projection |
| `<name>.puml` | Full PlantUML diagram |
| `<name>_structure.puml` | Optional structural view |
| `<name>_feedback.puml` | Optional feedback/governance view |

### 6.3 How to Generate

1. Save the `.refdsl` file in the runtime project (**Ctrl+S**).
2. Refresh the project (**F5**).
3. Inspect `src-gen/projections/` (or the configured output path).

Export **PNG/PDF** using PlantUML (VS Code extension, Eclipse PlantUML, or `plantuml` CLI).

### Summary (Activity 6)

**Generator:** `pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/generator/RefDslGenerator.xtend`  

**Repository examples:** `activity6_modelo_completo.refdsl`, scenario files `amazon.refdsl`, `youtube.refdsl`, `reddit.refdsl`.

---

## Activity 7: Application Engineering

Demonstrate the **REF** metamodel and RefDSL tooling using **concrete models** for the three reference scenarios: **Amazon**, **YouTube**, and **Reddit**.

### Team tasks (design)

- Produce **scenario designs** (e.g. object-style or domain diagrams) as required by the course.
- Link designs to the REF metamodel and team report.

**Domain reference diagrams (repository):**

- [`../../diagrams/Scenario Amazon/Amazon_DomainModel.puml`](../../diagrams/Scenario%20Amazon/Amazon_DomainModel.puml)
- [`../../diagrams/Scenario Youtube/Youtube_DomainModel.puml`](../../diagrams/Scenario%20Youtube/Youtube_DomainModel.puml)
- [`../../diagrams/Scenario Reddit/Reddit_DomainModel.puml`](../../diagrams/Scenario%20Reddit/Reddit_DomainModel.puml)

### Individual tasks (tooling)

1. **Implement** scenario models as **`.refdsl`** — versioned examples: `amazon.refdsl`, `youtube.refdsl`, `reddit.refdsl`.
2. For **each** model: show **constraint-detected issues** and **quick fixes** (semantic).
3. **Generate projections** for **all** models (`.txt` / `.puml` — plus optional split diagrams if used).

### Model creation

Scenario models are **textual** `.refdsl` files (not XMI). In the **runtime** workbench, place them in a test project (e.g. `RefDslRuntimeTest`) alongside generated `src-gen/projections/`.

### Generated visualizations and projections

After validation and refactoring, projections are produced by saving each `.refdsl`. File names follow the **basename** of the file (e.g. `amazon.refdsl` → `amazon.txt`, `amazon.puml`, …).

### Example: local runtime workspace (not in Git)

A typical **Eclipse runtime** workspace path (adjust to your machine):

`C:\Users\Utilizador\OneDrive - Instituto Superior de Engenharia do Porto\Documents\runtime-RefDslv2Runtime`

**Observed layout:**

- Project: `RefDslRuntimeTest`
- Generated files under: `RefDslRuntimeTest/src-gen/projections/`
- Examples: `amazon*`, `youtube*`, `reddit*`, `modelo*` (`.txt`, `.puml`, optional `*_structure.puml`, `*_feedback.puml`)

To version evidence in Git, copy selected projection files into e.g. `part1/tool2-xtext/runtime-evidence/projections/` (avoid committing full `.metadata`).

---

## Glossary

| Term | Meaning |
|------|---------|
| **REF / `ref.ecore`** | Shared EMF domain metamodel. |
| **RefDSL / `.refdsl`** | Xtext concrete syntax for REF-shaped models. |
| **MWE2** | Workflow that regenerates Xtext artifacts. |
| **Projection** | Derived view (text or PlantUML). |
| **Quick fix** | Automated semantic repair bound to a validation issue code. |

---

## File reference checklist
- [ ] Grammar: `RefDsl.xtext`
- [ ] Validator: `RefDslValidator.java`
- [ ] Quick fixes: `RefDslQuickfixProvider.java`
- [ ] Generator: `RefDslGenerator.xtend`
- [ ] Metamodel: `part1/eclipse/pt.isep.enorm.ref/model/ref.ecore`
- [ ] Diagram: `diagrams/metamodel/ref-metamodel-v2.puml`
- [ ] Constraints: `diagrams/metamodel/Metamodel_Constraints.md`
- [ ] Scenarios: `amazon.refdsl`, `youtube.refdsl`, `reddit.refdsl`

---
