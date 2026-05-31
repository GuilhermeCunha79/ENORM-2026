# ENORM Project, Part 2, Tool 3 - Sirius (Meta Programming System)

In this folder you should add **all** artifacts developed for part 2 of the ENORM Project, related to tool 3.

---

## 1. Tool context and scope

This individual report documents the Part 2 work developed with **Eclipse Sirius** for Tool 3 of the ENORM project. 
In the team organization, Sirius is the tool responsible for the **graphical concrete syntax** of the REF DSL and for 
supporting model creation and inspection over the shared EMF metamodel used by the three tools.

The scope of this report follows the individual tasks defined in the assignment for Part 2: implement the designed notation 
in the selected tool, support generation for the three REF scenarios, test the modeling/code-generation flow, report issues 
found, and discuss how the tool can support DSL evolution and model migration.

The work described here focuses on the Sirius-side contribution: the viewpoint specification, graphical mappings for the 
REF metamodel, compatibility with the common metamodel and scenarios, and the role of Sirius models as valid inputs to the 
shared generation strategy used by the team.

## 2. Activity 1 - Sirius implementation of the graphical notation

### 2.1 Goals of the graphical editor

The main goal of the Sirius editor is to provide a **single overview diagram** for each REF model instance, centered on 
the `RefModel` root and showing the most relevant structural, feedback, and governance concepts in a form that can be read 
by a domain expert with minimal technical friction. This directly answers the assignment requirement that the graphical 
syntax should be simple, intuitive, and should avoid clutter by pushing excessive detail into labels or property views 
instead of overloading the canvas.

The implemented editor therefore privileges: clear typed nodes, explicit labeled links, visual grouping by concern, and 
a limited number of shapes and accents. The idea is not to mirror every EMF detail visually, but to present the REF model 
as a readable graph whose elements still remain traceable to the metamodel.

### 2.2 Sirius project structure

The Sirius solution is organized around a **Viewpoint Specification Model (VSM)** that references the REF Ecore metamodel 
and defines the representation description used to create REF diagrams. The VSM contains the mapping rules for nodes, edges, 
containers, labels, tools, and style customizations for the metamodel concepts that need to be exposed in the diagram editor.

At implementation level, the Sirius project includes at least the following kinds of artifacts:

- A `.odesign` file containing the viewpoint, representation description, mappings, tools, and style rules.
- The shared REF Ecore metamodel imported from the project’s common modeling assets.
- Example `.aird` and model instance files used to validate the notation on the three required scenarios.
- Supporting Eclipse project configuration required for running the Sirius runtime and testing the editor behavior.

This organization follows the usual Sirius workflow: the metamodel defines the semantics, while the `.odesign` file defines 
how those semantics become editable graphical representations.

### 2.3 Implemented element mappings

The implemented diagram follows the design recorded in the team report, which maps each important REF metamodel concept 
to a dedicated graphical representation. The implemented Sirius mappings are summarized below.

| Metamodel element | Sirius implementation                                                                                    |
|---|----------------------------------------------------------------------------------------------------------|
| `RefModel` | Main diagram/container root showing model name and version in the title.                                 |
| `UserType` | Actor-oriented square node with label and `kind` summary.                                                |
| `ContextType` | Context node/container with neutral styling and visible `kind`.                                          |
| `ResourceType` | Main domain node with attribute information rendered inside the node.                                    |
| `Attribute` | Child/compartment-style textual line inside `ResourceType` nodes.                                        |
| `ResourceRelation` | Directed edge between resource nodes, labeled with name and cardinality.                                 |
| `FeedbackType` | Dedicated node family for comments, reviews, votes, reports, subscriptions, and related feedback families. |
| `FeedbackDefinition` | Node linked to type, author, and subject target, with summary information in the label.          |
| `AuthorizationRule`, `ValidationRule`, `ModerationPolicy`, `AutomationRule`, `VerificationPolicy`, `SortingPolicy` | Governance/behavior nodes rendered with distinct accent colors to separate concerns visually.            |
| `Condition`, `Action`, `ConditionKeywords` | Nested or subordinate representations inside automation-related structures.                     |

The main implementation decision was to preserve a **uniform node language**: most concepts are shown as rectangular or 
square-based nodes with controlled color variation instead of mixing many unrelated shapes. This makes the canvas more 
consistent and easier to learn for a first-time reader, which is aligned with the assignment’s concern for SME usability.

### 2.4 Edge semantics and visual reduction of clutter

One important Sirius design concern was the treatment of references. The REF metamodel contains a considerable number of 
typed links, and drawing all of them with the same visual style would make the diagrams difficult to inspect. To address 
this, the notation distinguishes at least three useful cases: mandatory typed references, optional references, and containment-oriented relations.

Mandatory references are represented with solid arrows, optional links with dashed arrows, and containment-related structures 
are reinforced visually either through containment layout or stronger ownership cues. This reduces ambiguity without 
requiring the user to inspect raw model properties for every link, which is exactly the kind of graphical clarity expected 
in the assignment’s guidance on graphical notation.

### 2.5 Sirius-specific adaptations

The assignment allows adaptations relative to the initial design when required by the selected tool, as long as they are 
explained in the individual report. In Sirius, the main practical adaptation is that not every metamodel concept is best 
represented as a top-level free-floating node. Some concepts are more readable as:

- compartment-like textual content inside a parent node,
- subordinate/nested nodes inside a governance structure,
- property-sheet information rather than first-class diagram elements.

This is especially true for `Attribute`, `ConditionKeywords`, and some policy details such as status or rating ranges. 
Representing them inline or as child content avoids overpopulating the diagram with tiny disconnected nodes, which would
conflict with the stated requirement to avoid clutter.

A second adaptation concerns layout density. Although the abstract design distinguishes several categories of nodes, the
Sirius implementation benefits from a limited style palette and compact labels, because the three target scenarios already
contain many model elements. The result is a diagram that remains semantically rich while still fitting the assignment’s
expectation of readability for domain experts.

## 3. Relationship with the P1 metamodel and required adaptations

Part 2 explicitly states that the work should continue using the P1 metamodel and all the work developed there, while 
allowing justified adaptations when needed. The Sirius work therefore starts from the common REF metamodel already 
established by the team and extends its practical use by providing a concrete graphical projection over it.

The main metamodel-related challenge in Tool 3 is that P2 introduces a stronger need to expose not only structure but also 
behavior and governance concerns. The assignment highlights that the DSL must support structural properties, authorization,
and behavior such as moderation and automation processes, and it also requires support for all three reference scenarios.
As a result, the graphical editor had to cover a broader set of metamodel elements than a minimal P1-style editor would normally expose.

The reportable adaptations relative to earlier work are therefore the following:

1. **Broader coverage of behavioral concepts.** The diagram now needs to visually represent `ValidationRule`, `ModerationPolicy`,
`AutomationRule`, `Condition`, `Action`, `VerificationPolicy`, and `SortingPolicy`, not only actors and resources.
2. **Explicit representation of feedback semantics.** Concepts such as `FeedbackType`, `FeedbackDefinition`, `FeedbackPolicy`, 
and `RatingPolicy` need visible support because they are central to the REF domain and vary across Amazon, Reddit, and YouTube.
3. **Support for scenario variability.** The notation must remain valid for marketplace, community, and media scenarios without 
being redesigned for each case, which favors typed generic mappings instead of scenario-specific symbols.
4. **Diagram simplification mechanisms.** Because Sirius is graphical and the metamodel is rich, some details are intentionally 
kept in labels or property views rather than expanded into separate visual elements, which is a justified adaptation to the tool and to the SME-oriented goal.

These adaptations do not change the shared semantics of the DSL. Instead, they make the P1 metamodel operational in a 
graphical editing setting suited to Part 2’s stronger emphasis on concrete syntax and scenario demonstration.

## 4. Activity 3 - Prototype alignment and Sirius contribution

Activity 3 requires each student to implement an example application prototype in the selected target architecture so that 
the team can later identify commonality and variability in the code. At team level, the Sirius-associated prototype is 
the **YouTube** scenario backend, which is used as the concrete application reference connected to Tool 3.

This does not mean Sirius itself generates the backend prototype directly in the same way a textual generator would. 
Instead, the Sirius contribution is to ensure that the YouTube model can be **correctly modeled, visualized, inspected, 
and maintained** through the graphical editor while remaining semantically compatible with the same common REF concepts 
later consumed by generation logic.

The YouTube scenario is particularly useful for Sirius because it exercises several central REF concerns at once: channels, 
videos, comments, like/dislike-style reactions, subscriptions, reports, validation rules, moderation checks, automation 
rules, and sorting policies.This gives a strong validation case for the graphical notation, since the scenario includes 
both structural and behavioral concepts and not only simple CRUD-style entities.

## 5. Activity 5 - Code generation role from the Sirius side

The assignment requires every tool to implement code-generation templates or rules and to be able to generate all the 
application scenarios of the domain. In the Sirius case, the crucial architectural decision is to separate **model editing** 
from **code generation mechanics** while keeping both connected through the same semantic model.

In practical terms, the Sirius editor produces or edits valid EMF instances of the REF metamodel. Those instances are then
suitable as inputs to a generation pipeline based on templates/rules over the normalized model, which is exactly the 
team-wide approach described in the team report. This means Sirius contributes to generation by ensuring that the graphical 
syntax produces complete and valid models for the three scenarios, and by keeping the graphical notation consistent with 
the same concepts used by the generator.

From the Tool 3 point of view, the relevant generation responsibilities are:

- Guarantee that every visually editable concept has a clear semantic counterpart in the metamodel.
- Ensure that mandatory references and core attributes needed by generation can be created and inspected from the graphical editor.
- Support the three reference scenarios without changing the generation architecture per scenario.
- Preserve compatibility with the common generation strategy: Spring Boot backend, layered architecture, and Generation Gap extension points.

This is important because Activity 5 is not only about producing text from templates; it is also about making sure the 
**models driving that text are complete, unambiguous, and stable**. That is a major part of the Sirius contribution.

## 6. Activity 6 - Generation of the three scenarios with Sirius models

### 6.1 Supported scenarios

The assignment requires each tool to support the three REF application scenarios already identified in the project: 
YouTube, Amazon, and Reddit. The Sirius editor was therefore designed as a **scenario-independent** visual editor over REF,
not as a notation specialized for a single case.

The three scenarios stress different parts of the language:

- **Amazon** emphasizes products, reviews, ratings, helpful votes, orders, verification, and moderation-related review workflows.
- **Reddit** emphasizes forums/subreddits, threaded comments, votes, reports, moderation, participation policies, and automations.
- **YouTube** emphasizes channels, videos, comments, reactions, subscriptions, validation checks, moderation checks, and sorting/read ordering.

Supporting all three in Sirius is important because the assignment does not ask for a diagram editor that works only for
one example. It asks for a DSL concrete syntax that remains valid across the family of target applications.

### 6.2 What was validated in the Sirius editor

Using the three `.enorm` scenarios as reference cases, the Sirius-side validation concentrated on the following points:

- The root `RefModel` representation can host all required categories of elements.
- Structural elements such as user types, resource types, contexts, and relations can be represented without notation changes between scenarios.
- Feedback-related concepts can represent scenario differences such as Amazon reviews, Reddit votes/reports, and YouTube 
- likes/subscriptions while still using common visual semantics.
- Governance concepts remain diagrammable even when one scenario is richer than another, especially in the areas of moderation, 
- validation, verification, sorting, and automation.

This gives confidence that the Sirius viewpoint is not overfitted to a single model and is adequate for the product-line 
orientation of the assignment.

## 7. Manual extension support and Sirius implications

Part 2 introduces an explicit new requirement: the generated code must support **manual adaptations/extensions** integrated
with the generated code, because some behavior cannot or should not be fully inferred from the DSL alone. Even though this
requirement is mainly visible in code generation, it also has implications for Tool 3.

From the Sirius perspective, the model must expose the concepts that drive those extension points. Examples include validation
rules with implementation identifiers, verification requirements, moderation triggers, and authorization structures whose 
final execution may rely partly on handwritten Java logic. If these concepts are not visible or editable in the graphical notation, then the Sirius models would be insufficient as inputs for a generation strategy based on Generation Gap and manual completion hooks.

Therefore, the Sirius editor contributes indirectly to extensibility by ensuring that the **extension-driving metadata** 
is present in the modeled artifact. The manual Java code belongs to the generated application side, but the need for that
code must still be modeled in REF.

## 8. Issues found during modeling and testing

The assignment requires each student to include the possible issues found during tests. The main issues observed or expected 
on the Sirius side are the following.

### 8.1 Diagram scalability

Large REF models can become visually dense, especially when many governance concepts and cross-references are displayed 
at once. This is most noticeable in scenarios like Reddit and YouTube, where comments, moderation checks, validation rules,
reports, and automations create many links.

**Mitigation:** prefer compact labels, keep some low-level details in compartments or property views, and organize the 
diagram around concern clusters instead of trying to show every detail as a top-level free node.

### 8.2 Balancing completeness and readability

The assignment requires the DSL to be complete enough to model structural and behavioral aspects of the domain, but 
graphical notation also has to remain simple and intuitive. In practice, these two goals can conflict when a single diagram 
tries to expose everything equally.

**Mitigation:** maintain a core overview representation in the main diagram and use the Sirius properties view or child 
labels for secondary detail. This preserves completeness at model level without forcing the diagram to become unreadable.

### 8.3 Tool-specific representation compromises

Some metamodel elements are naturally classes in Ecore but are not equally effective as separate visual nodes. `Attribute` 
and `ConditionKeywords` are good examples: they are semantically important, but turning all of them into detached graphical 
elements would reduce comprehension instead of improving it.

**Mitigation:** use Sirius mappings that represent these elements as contained text or nested children where appropriate,
and document these adaptations explicitly in the report, as required by the assignment.

### 8.4 Cross-tool semantic discipline

Because only Sirius provides the graphical syntax, there is a constant risk of letting visual convenience drift away from
the common metamodel or from the assumptions used by the textual/generation tools. This would hurt the Activity 6 requirement
that generated code from different tools should be compatible and combinable.

**Mitigation:** keep all Sirius mappings strictly grounded in the shared Ecore model and validate the notation against 
the same three scenarios used by the team.

## 9. Cross-tool compatibility from the Sirius side

Activity 6 requires the team to ensure that code generated by different tools is compatible and can be mixed or combined.
For Sirius, compatibility starts at the **model level**: the graphical editor must produce REF instances whose meaning is 
equivalent to the instances edited or generated through the other tools.

The main compatibility strategy is therefore:

1. Use the same shared REF metamodel as the semantic source of truth.
2. Keep Sirius as a concrete syntax layer only, without introducing Sirius-specific semantics into the model.
3. Validate the Sirius-created models against the same three domain scenarios used across the team.
4. Align the visually editable concepts with the same concepts expected by the generation architecture documented in the team report.

Under this approach, interoperability does not depend on identical editors; it depends on identical semantics. Sirius 
satisfies this by editing the same EMF model and by exposing the concepts that the generator and the other tools also rely on.

## 10. Model evolution and migration proposal

The assignment explicitly asks each student to explore how the tool can support model evolution, namely how to migrate
previous models when the DSL metamodel changes, and to report a proposal for solving that problem. This is especially 
relevant in Sirius because the tool depends both on the **metamodel** and on the **viewpoint mappings** defined in the `.odesign` file.

### 10.1 Evolution risks in Sirius

When the REF metamodel evolves, at least three kinds of breakage may occur:

- Existing model instances may no longer validate against the new metamodel.
- Sirius mappings may reference removed or renamed Ecore elements.
- Labels, tools, or creation rules may stop working because the expected features changed.

This means that model evolution for Tool 3 is not only a matter of updating Ecore. The Sirius viewpoint and, if needed, 
existing `.aird` representations must evolve as well.

### 10.2 Proposed migration strategy

A practical Sirius-compatible migration strategy is the following:

1. **Version the metamodel explicitly.** Keep an identifiable REF metamodel version so old and new model instances can be distinguished during migration.
2. **Apply EMF model migrations first.** When structural changes occur, migrate `.xmi`/model instances using EMF-based 
transformations or migration scripts before opening them in Sirius again.
3. **Update the `.odesign` mappings in lockstep.** Any renamed class, feature, or reference in Ecore must be reflected 
immediately in the Sirius viewpoint specification.
4. **Preserve backward-compatible mappings when possible.** When evolution is additive, keep the old mappings working and 
extend the representation gradually.
5. **Validate against the three scenario models after each metamodel change.** Amazon, Reddit, and YouTube should be used 
as regression cases to confirm that the graphical editor still supports the required family of applications.

### 10.3 Recommended demonstration approach

To demonstrate the solution, the most convincing workflow would be:

- start from an older REF model version,
- perform a small but realistic metamodel evolution such as the addition or refinement of a governance concept,
- migrate the model instance,
- open it in Sirius,
- show that the diagram still renders correctly and that the new concept is editable through the updated viewpoint.

This would satisfy the assignment’s requirement to explore and demonstrate a proposal for model evolution support.

## 11. Assessment of the Sirius contribution

The Sirius contribution fulfills the role expected from Tool 3 in Part 2: it implements the graphical concrete syntax of 
REF, keeps that syntax aligned with the shared metamodel, supports the three required scenarios, and contributes to the 
common generation architecture by producing semantically valid models for the rest of the toolchain.

Its main strength is usability for domain-oriented inspection and communication. While textual tools are naturally stronger 
for grammars and direct model-to-text generation, Sirius is the most appropriate tool for the assignment requirement of 
a graphical notation aimed at subject matter experts. The main challenge is scalability, which is addressed through 
careful reduction of diagram clutter, selective inline detail, and strict semantic alignment with the shared REF metamodel.

## 12. Final remarks

For Tool 3, the most important result of Part 2 is not just having a diagram that looks correct. It is having a **usable 
graphical concrete syntax** that remains faithful to the REF language, supports all three reference scenarios, and integrates 
cleanly into the team’s broader code-generation strategy.

In that sense, the Sirius work is a core part of the DSL engineering effort described in the assignment: it turns the 
abstract REF metamodel into something that a subject matter expert can inspect and discuss visually, while still preserving 
the precision needed for validation, generation, extensibility, and future evolution.

---

## 13. Final activity checklist and implementation evidence

This section completes the individual Tool 3 report against the activities explicitly requested in the Part 2 assignment.
It records the concrete artifacts that were implemented in the Sirius/EMF/Acceleo workspace and explains how they satisfy
the required individual work.

### 13.1 Activity 1 - Implemented graphical notation in Sirius

The Sirius notation is implemented in:

- `part2/eclipse_sirius_2nd_Instance/enorm.design/description/enorm.odesign`
- `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.aird`
- `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.enorm`

The implemented viewpoint is named `enorm` and contains a `RefModel Full Diagram` representation for the `enorm.RefModel`
root class. The diagram maps the main REF concepts to graphical elements:

| REF concept group | Sirius implementation evidence |
|---|---|
| Model root | `DiagramDescription` over `enorm.RefModel`, with title based on model name and version. |
| Actors and contexts | `UserType` and `ContextType` node mappings. |
| Resources and attributes | `ResourceType` container mapping with nested `Attribute` node mapping. |
| Structural relations | Edge mappings for resource supertypes, relation source, relation target, and context containment. |
| Feedback | `FeedbackType` node mapping and `FeedbackDefinition` container mapping with `FeedbackPolicy` and `RatingPolicy` children. |
| Authorization and governance | Node mappings for `AuthorizationRule`, `ValidationRule`, `ModerationPolicy`, `VerificationPolicy`, and `SortingPolicy`. |
| Automation behavior | `AutomationRule` container mapping with nested `Condition` and `Action` mappings, plus condition-attribute links. |

The `.odesign` also includes semantic validation rules that support the strongly typed and valid-by-construction goals of
the assignment. Examples include uniqueness checks, required target checks, feedback scope consistency, rating policy
constraints, authorization target checks, moderation executor checks, automation trigger checks, sorting constraints, and
basic evolution-rule validation.

### 13.2 Activity 3 - Prototype relationship

The team prototypes used to identify generated backend structure are the Spring Boot applications in `part2/amazon-backend`,
`part2/reddit-backend`, and `part2/youtube-backend`, together with the generated equivalents under:

- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/amazon-backend`
- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/reddit-backend`
- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/youtube-backend`

For Tool 3, the YouTube case is the most important graphical validation case because it exercises channels, videos,
comments, likes, subscriptions, reports, validation, moderation, sorting, and automation. The Amazon and Reddit models
were also maintained as Sirius `.enorm` instances to ensure that the graphical notation was not overfitted to one scenario.

### 13.3 Activity 5 - Code generation implemented from Sirius/EMF models

Although Sirius is the graphical notation tool, the submitted Tool 3 workspace also includes an Acceleo model-to-text
generator that consumes the same EMF model instances edited by Sirius:

- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/generate.mtl`

The generator creates complete Spring Boot REST backends. The most relevant template groups are:

| Template area | Generated artifacts |
|---|---|
| Project infrastructure | `pom.xml`, `README.md`, boot application class, `application.properties`, H2 configuration. |
| Domain | JPA entities, generated mapped superclasses, enums, value objects, scenario-specific domain overrides. |
| Persistence | Spring Data repositories and generated repository bases. |
| Services | CRUD services, moderation services, policy services, product evaluation service, generated/manual extension layers. |
| Web/API | REST controllers, authentication endpoints, generated controllers, `ApiError`, and `ApiExceptionHandler`. |
| Security | JWT service/filter stubs, security configuration, user details service. |
| Tests | `AcceptanceTest`, context smoke tests, and test `application.properties`. |

The generator was changed to minimize hard-coded app-specific lists where possible. It now derives most entity generation
from the `.enorm` `resourceTypes`, uses `UserType` consistently as the shared generated user class, and keeps app-specific
logic limited to behavior that genuinely differs among Amazon, Reddit, and YouTube.

### 13.4 Activity 6 - Generated applications and test results

The three scenario models are present as Sirius/EMF instances:

| Model | Resource types | Feedback definitions | Authorization rules | Validation rules | Moderation policies | Automation rules | Verification policies | Sorting policies |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Amazon | 20 | 2 | 4 | 1 | 1 | 1 | 1 | 2 |
| Reddit | 15 | 7 | 9 | 3 | 3 | 3 | 1 | 3 |
| YouTube | 15 | 5 | 11 | 4 | 3 | 4 | 2 | 3 |

The generated Spring Boot applications use an in-memory H2 database:

```properties
spring.datasource.url=jdbc:h2:mem:<scenario>;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.jpa.hibernate.ddl-auto=update
```

This means data is persisted while the backend process is running, but it is lost when the app stops, which is appropriate
for the MVP/demo setting described in the assignment.

The generated applications were tested with Maven:

| Generated backend | Verification command | Result |
|---|---|---|
| Amazon | `mvn test` | Passed |
| Reddit | `mvn test` | Passed |
| YouTube | `mvn test` | Passed |

The generated acceptance tests validate that the REST API starts, authentication endpoints accept generated `UserType`
payloads, generated collection endpoints are reachable, and missing resources are returned through the generated
`ApiExceptionHandler` as JSON API errors.

### 13.5 Issues found and corrections made

The main issues found during testing were generation consistency issues rather than Sirius diagram failures:

- Some generated Reddit/YouTube code still referred to `UserType` while the models previously named the concrete user
  resource `RedditUser` or `YoutubeUser`. The models and generator were standardized to use `UserType`.
- The Amazon `AutomationRuleController` initially emitted calls to child-linking methods that were not generated in the
  domain classes. The invalid generated calls were removed from the template.
- The first generated YouTube acceptance test expected `Youtube` while the model name is `YouTube`. The generated test
  strategy was kept model-driven by using the model name from the `.enorm` input.

These corrections reinforce the assignment requirement that the generated code should be valid and that models should be
usable as stable inputs to the generator.

### 13.6 Manual extension mechanism

The generated Java code follows a Generation Gap style:

- generated base artifacts are placed in `generated` packages or use `Generated*` class names;
- handwritten extension classes sit outside those generated packages;
- scenario-specific behavior is implemented in manual services/controllers where needed;
- validation and moderation metadata in the model can be connected to Java implementation hooks through identifiers such
  as `implementationId`.

This satisfies the Part 2 requirement that generated code must allow manual adaptations in the base programming language.

### 13.7 Model evolution demonstration proposal

For Sirius, model evolution must coordinate three assets: the Ecore metamodel, the `.odesign` viewpoint, and existing
`.enorm`/`.aird` scenario models. The recommended demonstration for evaluation is:

1. Start from one existing scenario, for example `YouTube.enorm`.
2. Add a small metamodel evolution, such as a new optional governance attribute or an additional validation severity.
3. Update `enorm.ecore` and regenerate/update EMF code if needed.
4. Update `enorm.odesign` mappings or labels only where the evolved concept should be visible.
5. Run a migration script or EMF transformation to add default values to older `.enorm` models.
6. Reopen the migrated model in Sirius and regenerate the backend with Acceleo.
7. Run the generated Maven tests again as regression validation.

This proposal gives a concrete migration path and uses the three scenario models as regression data, which directly
addresses the assignment requirement to explore model evolution and migration.
