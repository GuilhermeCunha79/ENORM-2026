# ENORM Part 1 - Team Report (Modeling)

**Course:** MEI - ENORM (2025/26)  
**Deliverable:** Team report covering **team-level** activities (Activities 1 and 4-7) as defined in the assignment ([`diagrams/enunciado/enunciado.md`](../diagrams/enunciado/enunciado.md)).  
**Repository root:** project root containing `part1/`, `diagrams/`, and tooling subprojects.

---

## 1. Team composition and tool assignment

| Member            | Primary tool (individual implementation)                                                              | Tool report (.md) |
|-------------------|-------------------------------------------------------------------------------------------------------|-------------------|
| Guilherme Cunha   | **JetBrains MPS** - language workbench / projectional editor (`part1/tool1-mps/`, `part1/languages/`) | [tool1-mps/readme.md](tool1-mps/readme.md) |
| Pedro Vilarinho   | **Eclipse Xtext** - textual DSL, validation, generator (`part1/tool2-xtext/`)                         | [tool2-xtext/readme.md](tool2-xtext/readme.md) |
| Francisco Peixoto | **Eclipse Sirius** - graphical views / Viewpoint Specification (`part1/tool3-sirius/`)                | [tool3-sirius/readme.md](tool3-sirius/readme.md) |

The team works with a **single domain metamodel (REF)** and three **reference scenarios** (YouTube, Amazon, Reddit). Each member implemented the scenario in their assigned tool. **This document** focuses on the **team** work: tool comparison, metamodel rationale, constraints, projection design, and scenario-level application models.

---

## 2. Activity 1 - Team formation and tool research

### 2.1 Purpose (per assignment)

The team compared three representative **language workbenches / DSL ecosystems** and documented the rationale for the split of responsibilities.

### 2.2 JetBrains MPS

**JetBrains MPS** is a **language workbench** where you define **languages** (structure, editor, constraints, generators) and compose them in **solutions**. Editing is **projectional**: the user manipulates an AST through a tailored notation, which avoids many classes of syntactic errors and supports multiple notations for the same concept.

**Strengths:** strong separation of language aspects; reusable generators; good fit for **complex notations** and **multi-view** editing.  
**Trade-offs:** steeper learning curve; projectional editing can feel unfamiliar compared to free text.

**Project relevance:** MPS is used in this repository under `part1/tool1-mps/` and `part1/languages/` for the REF language and sandbox.

### 2.3 Eclipse Xtext

**Eclipse Xtext** is a framework for building **textual DSLs** on top of ANTLR-based parsers, integrated with **EMF**. A grammar drives both the **parser** and the **Ecore**-aligned AST; **validators**, **scoping**, **formatting**, and **code generation** (e.g. Xtend) are first-class.

**Strengths:** fast iteration for **textual** languages; excellent Eclipse integration; large ecosystem (EMF, Xtend, LSP).  
**Trade-offs:** grammar-metamodel alignment must be maintained; highly graphical or non-textual editing is not the primary focus.

**Project relevance:** the REF DSL implementation lives in `part1/tool2-xtext/pt.isep.enorm.refdsl/` with example models such as `amazon.refdsl`, `youtube.refdsl`, and `reddit.refdsl`.

### 2.4 Eclipse Sirius

**Eclipse Sirius** builds **graphical editors** and **diagrams** for EMF models using a **Viewpoint Specification Model (VSM)**: you define **viewpoints**, **representations** (diagrams, tables, trees), **mappings**, **tools**, and **styles** on top of an existing **Ecore** metamodel.

**Strengths:** strong **visualization** and **exploration** of large models; good for stakeholder-facing views; integrates with EMF/Eclipse.  
**Trade-offs:** depends on a stable metamodel; complex interactions may require Java services or Acceleo.

**Project relevance:** Sirius assets are under `part1/tool3-sirius/` (including `description/` and sample `model/` / `representations.aird` where present).

### 2.5 Team rationale for the split

- **MPS** handles **language definition** and **projectional** aspects where beneficial.  
- **Xtext** delivers a **canonical textual REF DSL** with validation and generation, aligned with the shared Ecore metamodel.  
- **Sirius** delivers **graphical projections** and exploration of REF models for communication and validation of structure.

This aligns with the assignment goal: one domain, **multiple notations**, and complementary strengths.

---

## 3. Activity 2 - Installation and setup (team summary)

Environment setup was primarily an **individual** deliverable (each member documented installation for their tool). At **team** level, this report records:

- **Shared baseline:** **Eclipse Modeling Tools** (or equivalent) for **EMF/Ecore**, **Xtext**, and **Sirius**; **JDK** compatible with the Eclipse stack; **JetBrains MPS** for the MPS track.  
- **Shared metamodel:** the canonical **Ecore** for REF is maintained under `part1/eclipse/pt.isep.enorm.ref/model/ref.ecore` (and generated/edit plugins alongside).  
- **Documentation:** Xtext workflow notes are in [`part1/tool2-xtext/readme.md`](tool2-xtext/readme.md) and [`part1/tool2-xtext/tutorial.md`](tool2-xtext/tutorial.md); MPS-specific notes appear under `part1/tool1-mps/` and `part1/languages/`; Sirius uses the Eclipse + Sirius perspective and the `tool3-sirius` project (see [`part1/tool3-sirius/readme.md`](tool3-sirius/readme.md) if present).

**Conclusion:** Each member completed tool-specific installation. **This team report** does not duplicate full installation logs; refer to the **individual reports** and the files above.

---

## 4. Activity 3 - Domain knowledge (team bridge)

Deep scenario analysis is **individual** (YouTube vs Amazon vs Reddit). Here, the **team** consolidates the **union** of domain concepts that motivated the **REF** metamodel.

### 4.1 Scenarios and goals

The assignment requires covering **structure**, **authorization**, and **behaviour** (including **automation**) for:

| Scenario | Focus (examples) |
|----------|------------------|
| **YouTube** | Channels, videos, comments (threading), likes, subscriptions, moderation/reporting |
| **Amazon** | Products, reviews, verified purchase, seller/buyer roles |
| **Reddit** | Posts, comments, voting, moderation, automoderator-style rules |

### 4.2 Evidence-backed justification tables

The team captured **why** modelling choices match **public platform documentation** in structured tables (official help / policy links) in **[`part1/readme.md`](readme.md)**. See the **YouTube**, **Amazon**, and **Reddit** sections. These tables support presentation and traceability from **domain facts** to **metamodel elements** (for example, mapping moderation and reporting to feedback and policy concepts).

### 4.3 From three products to one metamodel

Instead of three unrelated models, REF is a **generic** metamodel whose **instances** describe each platform: shared notions include **resources**, **user roles**, **feedback**, **validation**, **authorization**, and **automation**. Further details are in [`readme.md`](readme.md) ("Design of the Metamodel").

---

## 5. Activity 4 - Design of the domain metamodel (team)

### 5.1 Deliverables required by the assignment

- **Complete** metamodel covering the union of scenarios.  
- **Formal notation** documenting the design (UML class diagram or equivalent).  
- **Team report** section explaining entities, associations, attributes, multiplicities, and rationale.

### 5.2 Formal artefacts in the repository

| Artefact | Path | Role |
|----------|------|------|
| **Ecore (canonical)** | [`part1/eclipse/pt.isep.enorm.ref/model/ref.ecore`](eclipse/pt.isep.enorm.ref/model/ref.ecore) | EMF schema: packages, classifiers, references, enumerations |
| **GenModel** | [`part1/eclipse/pt.isep.enorm.ref/model/ref.genmodel`](eclipse/pt.isep.enorm.ref/model/ref.genmodel) | EMF generator configuration |
| **PlantUML (domain view)** | [`diagrams/metamodel/ref-metamodel-v3.puml`](../diagrams/metamodel/ref-metamodel-v3.puml) | Human-readable UML-style class diagram for reporting |
| **Sirius copy / tooling** | [`part1/tool3-sirius/model/enorm.ecore`](tool3-sirius/model/enorm.ecore) | Used by the Sirius viewpoint (aligned with the shared design) |
| **Xtext inferred model** | [`part1/tool2-xtext/pt.isep.enorm.refdsl/model/generated/RefDsl.ecore`](tool2-xtext/pt.isep.enorm.refdsl/model/generated/RefDsl.ecore) | Grammar-aligned Ecore (generated from the DSL workflow) |

### 5.3 Core concepts (summary)

The team’s **REF** metamodel is organized around:

- **`RefModel`**: root container for **user types**, **resource types**, **feedback** definitions, **authorization**, **validation**, **moderation/rating/verification** policies where applicable, **context** types, and **automation** rules.  
- **`UserType`**: roles with optional **superTypes** (role hierarchies).  
- **`ResourceType`** and **`Attribute`**: structured entities and primitive-typed fields (`PrimitiveType`: TEXT, NUMBER, BOOLEAN, DATE, IMAGE, VIDEO, etc.).  
- **`ResourceRelation`**: typed relationships between resource types (e.g. containment or references).  
- **`FeedbackType` / `FeedbackDefinition`**: kinds of feedback (ratings, comments, votes, reports) and **who** may create them on **which** resource, plus **validation** hooks.  
- **`ValidationRule`**: automatic vs manual validation, with `implementationId` for tooling and generators.  
- **`AuthorizationRule`**: **ActionKind** over resources or feedback definitions.  
- **`AutomationRule`**: trigger/condition/action descriptions for automated behaviour.  
- **Policies**: moderation, rating, verification, and feedback policies as first-class elements where the domain requires distinct treatment across scenarios.

This structure addresses the assignment’s **three dimensions**: **structure** (types and attributes), **authorization** (roles and actions), **behaviour** (validation, moderation workflows, automation).

### 5.4 Design decisions

Main decisions were: **generalization** across three platforms; **explicit** feedback definitions linking writers, subjects, and rules; **separation** of feedback *type* vs *definition*; and **policy** objects for moderation/rating/verification so YouTube/Amazon/Reddit differences are captured without forking the core metamodel. More details and examples are available in [`part1/readme.md`](readme.md) and in [`diagrams/metamodel/ref-metamodel-v3.puml`](../diagrams/metamodel/ref-metamodel-v3.puml).

---

## 6. Activity 5 - Constraints and refactorings (team)

### 6.1 Deliverables required by the assignment

- **Constraints** in **OCL** or **pseudo-code**, aligned with scenarios.  
- **Refactoring** proposals where automatic repair is reasonable.  
- **Team report** section documenting constraints and refactorings.

### 6.2 Repository documentation

The team maintains a **structured constraint catalogue** in:

- **[`diagrams/metamodel/Metamodel_Constraints.md`](../diagrams/metamodel/Metamodel_Constraints.md)**: extended tables for **RefModel**, **UserType**, **ResourceType**, **Attribute**, **FeedbackType**, **FeedbackDefinition**, **ValidationRule**, **AuthorizationRule**, **AutomationRule**, **ResourceRelation**, policies, and related elements; includes **OCL** and **pseudo-code** fragments and **refactoring** columns where applicable.

The **[`part1/readme.md`](readme.md)** “Constraints and Refactorings” section provides a **concise** subset and explicitly references **implementation** of constraints and quick fixes in the **Xtext** tool (see §7.3).

### 6.3 Examples of constraint families

- **Naming and completeness:** non-empty names, minimum length, capitalization conventions for identifiers.  
- **Uniqueness:** `UserType`, `ResourceType`, `FeedbackType` names within a `RefModel`; `Attribute` names within a type.  
- **Hierarchy safety:** no **self-inheritance**; **acyclic** `superTypes`.  
- **Consistency:** feedback definitions reference existing **FeedbackType**, **ResourceType**, and **writers**; authorization references existing **UserType**; validation rules require **kind** and sensible **`implementationId`** when used for generation.  
- **Automation:** non-empty **trigger**; naming conventions parallel other elements.

**Refactorings** include safe, local fixes such as **capitalize** first letter, **remove** self from `superTypes`, **pad** short implementation IDs, or **suggest** default writers. Exact behaviour is documented per constraint in the markdown tables and implemented where the toolchain supports it.

---

## 7. Activity 6 - Projections and visualizations (team)

### 7.1 Deliverables required by the assignment

- Survey **textual** and **graphical** projection notations.  
- For **each metamodel element**, provide a **textual** and a **graphical** representation (concrete examples).  
- **PlantUML** for graphical projections.

### 7.2 Three complementary kinds of projection

The team uses **three tools**, each with a different notion of “projection”:

| Tool | Projection idea | In this project |
|------|-----------------|-----------------|
| **Eclipse Xtext** | **Textual** concrete syntax: the user edits a **character stream** parsed into a model; the grammar is the projection specification. | Canonical **`.refdsl`** files and Eclipse editor (syntax highlighting, outline, validation, quick fixes, generator). |
| **JetBrains MPS** | **Projectional** editing: the user edits through **editor definitions** bound to the language **structure**; there is no separate "parse" step, and the view stays consistent with the AST. | REF language under [`part1/languages/Ref/`](languages/Ref/): **structure**, **editor**, **constraints**, **behavior**, **generator**; sandbox solutions. |
| **Eclipse Sirius** | **Graphical** (and table/tree) **views** over **EMF** models: mappings from metamodel elements to shapes, edges, and tools. | Viewpoint [`enorm.odesign`](tool3-sirius/2nd%20eclipse%20instance/enorm.design/description/enorm.odesign) on `.xmi` instances; optional **PlantUML** for static diagrams in reports. |

Together, these cover **textual**, **projectional**, and **diagrammatic** visualizations of the same REF domain.

### 7.3 Eclipse Xtext - textual projection

**Xtext** is the team’s primary vehicle for a **free-text DSL** that is easy to diff, store in Git, and integrate with standard editors.

- **Grammar / concrete syntax:** [`part1/tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext`](tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/RefDsl.xtext) defines keywords, nesting, and cross-references; the inferred **Ecore** is under [`model/generated/RefDsl.ecore`](tool2-xtext/pt.isep.enorm.refdsl/model/generated/RefDsl.ecore).  
- **Editor experience:** Eclipse (and LSP-capable clients where configured) provides **syntax highlighting**, **content assist**, **validation** ([`RefDslValidator`](tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/validation/RefDslValidator.java)), **quick fixes** ([`RefDslQuickfixProvider`](tool2-xtext/pt.isep.enorm.refdsl.ui/src/pt/isep/enorm/refdsl/ui/quickfix/RefDslQuickfixProvider.java)), and **outline** views; all of these are **projections** of the underlying AST in the IDE sense.  
- **Generation:** [`RefDslGenerator.xtend`](tool2-xtext/pt.isep.enorm.refdsl/src/pt/isep/enorm/refdsl/generator/RefDslGenerator.xtend) projects the model into **other artefacts** (e.g. documentation or downstream code), which is another form of **view** over the same specification.  
- **Examples:** [`amazon.refdsl`](tool2-xtext/amazon.refdsl), [`youtube.refdsl`](tool2-xtext/youtube.refdsl), [`reddit.refdsl`](tool2-xtext/reddit.refdsl).  
- **Concept → snippet mapping:** [`part1/readme.md`](readme.md) (“Metamodel Graphical Representation”) lists **example textual** fragments per metamodel concept (`REF MODEL`, `USER TYPES`, `RESOURCE TYPE`, …).

### 7.4 JetBrains MPS - projectional projection

**MPS** does not rely on a text parser for editing: **editor models** describe how language concepts are **shown** and **edited** (cells, layouts, substitutions). That is a **projection** in the language-workbench sense: multiple notations can target the same structure.

- **Language module:** [`part1/languages/Ref/`](languages/Ref/) - [`Ref.mpl`](languages/Ref/Ref.mpl) aggregates the language.  
- **Structure vs editor:** [`Ref.structure.mps`](languages/Ref/models/Ref.structure.mps) defines concepts and relationships; [`Ref.editor.mps`](languages/Ref/models/Ref.editor.mps) defines the **projectional editor** (how instances are rendered and manipulated). Auxiliary aspects include [`Ref.constraints.mps`](languages/Ref/models/Ref.constraints.mps), [`Ref.behavior.mps`](languages/Ref/models/Ref.behavior.mps), [`Ref.typesystem.mps`](languages/Ref/models/Ref.typesystem.mps), and [`Ref.intentions.mps`](languages/Ref/models/Ref.intentions.mps).  
- **Generator:** [`Ref/generator/templates/`](languages/Ref/generator/templates/) contains generator templates that **project** sandbox or user models into other forms.  
- **Sandbox:** [`part1/languages/Ref.sandbox/`](languages/Ref.sandbox/) holds sample models ([`Ref.sandbox.mps`](languages/Ref.sandbox/models/Ref.sandbox.mps)) used to exercise the language projections.  
- **Documentation:** [`part1/tool1-mps/readme.md`](tool1-mps/readme.md) supports onboarding for the MPS side.

This complements **Xtext**: both describe REF, but MPS emphasizes **custom notations** and **composition** of language aspects without a single linear text file as the source of truth.

### 7.5 Eclipse Sirius and PlantUML - graphical projections

- **Sirius:** The Viewpoint Specification Model is [`part1/tool3-sirius/2nd eclipse instance/enorm.design/description/enorm.odesign`](tool3-sirius/2nd%20eclipse%20instance/enorm.design/description/enorm.odesign). It **projects** EMF resources into diagrams and other representations, driven by the **VSM** (mappings, layers, tools, styles). Sample instances include [`part1/tool3-sirius/model/RefModel.xmi`](tool3-sirius/model/RefModel.xmi), [`Amazon.xmi`](tool3-sirius/model/Amazon.xmi), [`YouTube.xmi`](tool3-sirius/model/YouTube.xmi), and [`Reddit.xmi`](tool3-sirius/model/Reddit.xmi).  
- **Auxiliary textual views for diagrams:** [`part1/tool3-sirius/projections/RefModel_textual_projection.txt`](tool3-sirius/projections/RefModel_textual_projection.txt) and scenario files such as [`Amazon_textual_projection.txt`](tool3-sirius/projections/Amazon_textual_projection.txt), [`YouTube_textual_projection.txt`](tool3-sirius/projections/YouTube_textual_projection.txt), [`Reddit_textual_projection.txt`](tool3-sirius/projections/Reddit_textual_projection.txt) document **diagram-oriented** textual summaries.  
- **PlantUML (reports / metamodel):** static UML-style views such as [`diagrams/metamodel/ref-metamodel-v3.puml`](../diagrams/metamodel/ref-metamodel-v3.puml); scenario **object-style** diagrams are listed under §8. Further **behaviour** and **structure** `.puml` files under [`part1/tool3-sirius/projections/`](tool3-sirius/projections/) complement Sirius for submission and slides.

---

## 8. Activity 7 - Application engineering (team)

### 8.1 Deliverables required by the assignment

- **Design models** for each scenario (YouTube, Amazon, Reddit), analogous to **UML object diagrams** at the metamodel level.  
- Coverage of **structure**, **authorization**, and **behaviour** (including **automation**).  
- **Team report** section describing these designs.

### 8.2 Scenario artefacts (repository)

| Scenario | Primary PlantUML (domain / object-style view) | Folder |
|----------|-----------------------------------------------|--------|
| **Amazon** | [`Amazon_DomainModel.puml`](../diagrams/Scenario%20Amazon/Amazon_DomainModel.puml) | [`diagrams/Scenario Amazon/`](../diagrams/Scenario%20Amazon/) |
| **YouTube** | [`Youtube_DomainModel.puml`](../diagrams/Scenario%20Youtube/Youtube_DomainModel.puml) | [`diagrams/Scenario Youtube/`](../diagrams/Scenario%20Youtube/) |
| **Reddit** | [`Reddit_DomainModel.puml`](../diagrams/Scenario%20Reddit/Reddit_DomainModel.puml) | [`diagrams/Scenario Reddit/`](../diagrams/Scenario%20Reddit/) |

Additional **structure** and **behaviour** projection examples for tooling and reports live under [`part1/tool3-sirius/projections/`](tool3-sirius/projections/) (e.g. per-scenario textual projections and scenario-specific `.puml` diagrams).

These diagrams instantiate **instances** of REF concepts (as **object diagrams**): they show how the **same metamodel** describes each platform with different **configurations** of types, feedback, rules, and policies.

