# Acceleo generator

This module generates a minimal Java backend skeleton per ENORM RefModel.

## Entry template
- `src/org/eclipse/acceleo/module/sample/common/generate.mtl`
- Entry point: `generateElement(RefModel)`

## Output layout
Generated files are placed under `generated-backends/<appName>` in the chosen output folder.

## Run (Eclipse)
1. Right-click an `.enorm` model file.
2. Run As -> Acceleo Application.
3. Select `org.eclipse.acceleo.module.sample.common.generate` and the `generateElement` template.
4. Choose an output folder in your workspace.

This will generate one backend folder for each model run (Amazon, Reddit, YouTube).

## Individual report (Sirius)

This section summarizes the individual activities requested in `project_p2.txt`, focused on the Sirius-based graphical notation and the Acceleo generator. The descriptions align with the team decisions in `part2/TeamReport.md` (single REF metamodel, three scenarios, and a shared generation gap architecture for the backend).

### Activity 1 — Implement the designed notation (graphical)
- The graphical syntax is implemented with Sirius in `part2/eclipse_sirius_2nd_Instance/enorm.design/description/enorm.odesign`.
- The editor is bound to the metamodel in `part2/tool3-sirius/model/enorm.ecore` and the Sirius session in `part2/tool3-sirius/model/enorm.aird`.
- The viewpoint exposes the core concepts (resources, users, policies, rules), and uses contained nodes and edge mappings to represent containment vs. references, following the graphical design defined by the team.
- The diagram structure mirrors the team mapping in `TeamReport.md`: `RefModel` as the root container, with grouped nodes for actors, structure, feedback, and governance/behavior. Relationships are shown as directed edges with distinct styles for containment and optional references.
- Custom services that support label/behavior calculations are in `part2/eclipse_sirius_2nd_Instance/enorm.design/src/enorm/design/Services.java`.
- Instances for each scenario are maintained in `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/` (`Amazon.enorm`, `Reddit.enorm`, `YouTube.enorm`) with `.aird` sessions for the graphical editor.

Implementation notes and adaptations (Sirius constraints):
- Sirius diagrams are configured over EMF models, so all displayable values must come from EAttributes/EReferences in the metamodel. For compactness (SME-friendly diagrams), most information is rendered in labels/compartments instead of creating extra nodes for every property.
- Containment vs. reference is mapped to “inside container” vs. “edge between nodes” whenever possible:
	- Containment (e.g., `ResourceType` → `Attribute`, `AutomationRule` → `Condition`/`Action`) is shown as children/compartments.
	- Cross references (e.g., `AuthorizationRule`→ actor/context/target) are shown as edges.
- Optional references are visually distinguished (for example, by a different style), matching the team intent of making “mandatory vs optional” readable without exposing raw EMF details.

How to open and edit the diagrams (Eclipse):
1. Import the projects under `part2/eclipse_sirius_2nd_Instance/` into an Eclipse runtime instance.
2. Open one of the sessions in `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.aird`.
3. Use the Sirius viewpoint to create/update nodes and edges; the underlying model is stored in the paired `.enorm` file.

### Activity 3 — Prototype application (manual implementation)
- The team prototypes follow the shared Java 21 + Spring Boot 3 architecture (Generation Gap). In the Sirius tool, the closest “manual” prototype to analyze is the generated backend skeletons.
- Prototype backends are represented by the generated Java skeletons under `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src-gen/`.
- Each scenario (Amazon, Reddit, YouTube) produces a standalone package with:
	- `*Application.java` entry class,
	- `domain/generated/*` for model-based types,
	- `model/*` for resource/user containers,
	- `governance/*` and `runtime/RuleBodies.java` as extension points where manual logic can be added.
- These prototypes were used to validate the viability of the common architecture and to identify which parts must remain customizable by developers.

What was validated with this prototype (for Activity 4 input):
- The generator can consistently materialize the domain vocabulary of the three scenarios into a stable Java package layout.
- The “extension mechanism” requirement (Activity 2) is supported by reserving explicit classes for manual behavior (for example `runtime/RuleBodies.java`), so that regeneration doesn’t destroy handwritten logic.

Notes (scope limitation vs. a full Spring Boot prototype):
- The Acceleo output is a minimal skeleton and not meant to fully replace the hand-coded Spring Boot prototype mentioned in `TeamReport.md`. It is used to identify common/variable code *shapes* and to validate that the model captures enough information to drive generation.

### Activity 5 — Design and implement code generation
- The Acceleo templates and rules are in `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/generate.mtl`.
- The generation task wiring is defined in `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/tasks/generate.xml` and `generateTarget.xml`.
- Common code (base packages, enums, container classes) is always emitted; variable code is derived from model elements such as `ResourceType`, `FeedbackType`, `AuthorizationRule`, and `AutomationRule` (from `tool3-sirius/src-gen/enorm/*`).
- Manual extension hooks are intentionally separated into non-generated areas (e.g., `runtime/RuleBodies.java`) so developers can safely add behavior without regeneration overwrites.
- The generator follows the team’s “Generation Gap” decision: generated classes hold base structure; manual subclasses and service hooks are reserved for scenario-specific rules (e.g., moderation thresholds, duplicate vote checks).

What is “common” vs “variable” in this Sirius/Acceleo generator:
- Always generated (common):
	- Scenario application entry point (`AmazonApplication.java`, `RedditApplication.java`, `YouTubeApplication.java`).
	- Standard enum mirror of the metamodel enums under `domain/enums/` (e.g., `ActionKind`, `TriggerEvent`, `SortCriterion`, ...).
	- Scenario “model facades” under `model/` (`Users.java`, `Resources.java`, `Contexts.java`, `Relations.java`, `Feedback.java`) that group generated types.
	- A governance entry class per scenario (`*Governance.java`).
	- An explicit extension file (`runtime/RuleBodies.java`) meant for hand-written logic.
- Model-driven (variable):
	- Generated domain classes under `domain/generated/` for each modeled element (resource types, feedback definitions, rules/policies).
	- Cardinalities/containment rules are reflected in relations and containers (driven by `ResourceRelation` and contained lists).
	- Automation and validation artifacts are only produced if the `.enorm` instance includes `AutomationRule` / `ValidationRule` elements.

Entry points and glue code:
- The Acceleo Java launcher is in `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/Generate.java`.
- Plugin wiring is provided by `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/META-INF/MANIFEST.MF`.

### Activity 6 — Generate applications and test scenarios
- Models are available in `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/` (`Amazon.enorm`, `Reddit.enorm`, `YouTube.enorm`), with matching `.aird` sessions for the graphical editor.
- Running the Acceleo generator produces the scenario backends under `src-gen/amazon`, `src-gen/reddit`, and `src-gen/youtube`.
- Issues found during tests:
	- Regeneration overwrites only the generated packages; manual code must stay in explicit extension classes (documented above) to avoid loss.
	- Some validation rules currently rely on model correctness enforced by EMF/Sirius; additional constraints could be moved into generator checks if needed.
	- Cross-tool compatibility requires keeping package names and generated artifact shapes consistent with the team architecture (domain/repository/service/web/security layers).
- Model evolution proposal:
	- Version the metamodel (`enorm.ecore`) and keep migration scripts in the Sirius project (EMF model transformation or EcoreTools migration).
	- Use EMF Compare to detect breaking changes and provide a scripted migration (or an M2M transformation) for existing `.enorm` instances.
	- Re-run the generator after migration to obtain updated backend skeletons.

How generation is executed (Eclipse):
1. In the modeling runtime workspace, pick one of the instance models (for example `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/Amazon.enorm`).
2. Right-click the `.enorm` file → **Run As** → **Acceleo Application**.
3. Select module `org.eclipse.acceleo.module.sample.common.generate` and entry `generateElement`.
4. Choose an output folder. The generator writes the Java skeleton for that scenario.

Manual code integration (extensibility requirement from Activity 2):
- Add custom Java logic inside `runtime/RuleBodies.java` (and any other explicitly non-generated extension classes). This file is the intended location for hand-written rule implementations that are referenced by generated artifacts.
- Keep all manual code outside `domain/generated/` so that re-generation stays safe.

Demonstration of model evolution support (proposal):
- When `enorm.ecore` changes (new attributes, renames, enum literals), existing `.enorm` instances may become incompatible.
- Sirius/EMF-friendly migration path:
	1. Introduce a new metamodel version (new namespace URI) and keep the old one for migration tooling.
	2. Provide an EMF migration (M2M) transformation old→new (for example, an ATL/QVTo script) to update `.enorm` instances.
	3. Validate with EMF Compare (old vs migrated model) to ensure semantic equivalence.
	4. Re-run Acceleo generation to regenerate the skeletons for the migrated models.
