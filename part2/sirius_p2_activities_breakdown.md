# P2 Activities Breakdown for Sirius

You need to complete **all six P2 activities**, but because your tool is **Sirius**, your individual work is specifically 
the **graphical notation/editor** and the **Sirius-side implementation of generation support**, while still participating 
in the shared team design decisions across the whole process. The PDF also makes clear that P2 is divided into **team tasks** 
and **individual tasks**, and that Sirius supports the **graphical notation** side only, while MPS/Xtext cover textual notation.

## Overall flow

The project expects the team to proceed through six activities, usually in sequence: design syntax, decide common backend 
features, manually prototype applications, analyze commonality/variability, design and implement code generation, and 
finally generate and test the applications. The final DSL must support REF-style backends for scenarios similar to 
**YouTube, Amazon, and Reddit**, and it should cover **structure, authorization, and behaviour**, including extensibility 
and evolution support. 

For you as a Sirius student, the core mindset is:
- In **Activity 1**, you own the **graphical notation implementation**. 
- In **Activities 3, 5, and 6**, you still do individual technical work, but always consistent with the **team’s shared 
architecture and code-generation decisions**. 
- In **Activities 2 and 4**, the tasks are team-centered, but you still actively contribute with Sirius/EMF implications 
and repository/report material. 

## Activity 1

### Team tasks

The team must design both the **graphical syntax** and the **textual syntax** for the DSL, specifying for each metamodel 
element how it will be represented in an editor. The PDF also says you should continue using the P1 metamodel, although 
you may adapt it if needed, as long as you justify those changes in the report. 

Step by step, as a team:
1. Reopen the **P1 metamodel** and list all concepts, attributes, references, and constraints that need concrete notation. 
2. Decide which concepts appear as **graphical nodes**, which appear as **edges/links**, and which are shown only in 
**properties panels or labels** to avoid clutter. The PDF explicitly recommends intuitive graphical elements and moving 
detail into property windows when needed. 
3. Define the **textual notation** too, even though you personally will not implement it in Sirius, because the team report 
must include both graphical and textual designs. 
4. Record both designs in the **team section of the report**. 

### Individual tasks

For Sirius, you must implement the **designed graphical notation** in your selected tool, because the PDF explicitly says 
Sirius supports the graphical notation and each tool supports only one notation. You also need to document the implementation 
and any adaptations required by Sirius in the **individual section** of the report. 


Step by step, for you:
1. Ensure your REF metamodel is available as an **Ecore/EMF metamodel**, since the PDF notes that Sirius is EMF-based 
and can use an Ecore metamodel. 
2. Create a **Sirius Viewpoint Specification Model**.
3. Create one or more **representations/diagrams** for the REF DSL.
4. Map each chosen metamodel concept to Sirius elements:
- Containers for aggregate/domain elements.
- Nodes for concepts like Resource, Post, Review, Comment, Topic, Rule, Role, etc.
- Edges for non-containment references such as moderation links, permissions, or associations. 
5. Define labels, styles, icons, colors, and compartments so the notation remains readable and intuitive. 
6. Use **properties views** for detailed attributes instead of overloading the diagram, because the PDF explicitly 
recommends this to avoid clutter. 
7. Test whether a user can create a valid REF model graphically.
8. In your individual report, describe:
- What you implemented in Sirius.
- Any changes from the original design.
- Why Sirius required those changes. 

## Activity 2

### Team tasks

The team must decide the **common features** of the applications that the DSL will generate, because this is a **generation approach**, 
not an interpreted one, and the generated output must support the REST backend of REF applications. The PDF says the team 
should choose the implementation language, the architecture of the generated code, and the common code/features that will always exist. 

Step by step, as a team:
1. Choose the **base programming language** for generated code, for example Java if that fits your team. 
2. Choose the **backend architecture**, such as layered REST services with controllers, services, repositories, DTOs, entities, and validations. 
3. Decide which frameworks and infrastructure are common, such as web framework, persistence approach, database style, 
validation mechanism, and testing approach. 
4. Identify the **always-generated/common code**, meaning code that exists regardless of model variation, such as base 
entities, error handling, common REST config, or a core moderation framework. 
5. Decide how to support **manual adaptations/extensions**, because the PDF adds this as an important new requirement. 
The generated code should let users add logic in the base language while remaining integrated with generated code. 
6. Write all those decisions in the **team report section**. 

### What you should do inside the team

Even though Activity 2 is not listed as an individual task, you should contribute the Sirius angle:
1. Check whether the chosen architecture maps cleanly to your **metamodel concepts**. 
2. Identify which parts of the future code generation can be driven directly from Sirius models.
3. Help define extension mechanisms that fit later model-to-code generation, such as:
- Generated abstract classes plus manual subclasses.
- Interfaces plus handwritten implementations.
- Hook points for custom moderation or validation logic. 

## Activity 3

### Individual tasks

Each student must manually implement an **example REF backend application** using the decisions made in Activity 2. 
The PDF says this prototype should be executable and follow the chosen architecture, and that it will later be used to 
discover what kind of code the DSL needs to generate. 

Step by step, for you:
1. Pick one REF-style scenario to prototype, likely inspired by the P1 examples and aligned with the target cases such 
as YouTube, Amazon, or Reddit. 
2. Use the team’s chosen language/framework/architecture from Activity 2. 
3. Implement a **manual backend prototype**, not generated yet.
4. Make sure the prototype includes the three required dimensions the project emphasizes:
- **Structure**: entities and relationships. 
- **Authorization**: users/roles and allowed actions. 
- **Behaviour**: moderation, validation, verification, automation, sorting, reporting, or similar processes. 
5. Include at least one **manual extension point** to reflect the new extensibility requirement from Activity 2. 
6. Keep your code organized so the team can later inspect it and identify common versus variable parts. 

A good prototype for you could be:
- Reddit-like: Topic, Post, Comment, Vote, Report, ModerationRule. 
- YouTube-like: Video, CommentThread, Reaction, Report, SortingRule. 
- Amazon-like: ProductReview, Rating, MediaAttachment, VerificationProcess. 

## Activity 4

### Team tasks

The team must analyze all manually built prototypes and identify the **common** and **variable** parts of the code. 
The PDF says the team must relate the variable code parts to the metamodel and ensure all metamodel parts map to some 
variable part of the code or another application artifact. 

Step by step, as a team:
1. Collect the three manually built prototypes from the team. 
2. Compare them file by file and concern by concern:
- Domain classes.
- REST endpoints.
- Services.
- Validation rules.
- Authorization logic.
- Moderation/automation behaviour. 
3. Mark which parts are **common**, meaning always generated.
4. Mark which parts are **variable**, meaning driven by model values or optional concepts. 
5. Create an explicit mapping from **metamodel element -> variable code artifact**. The PDF says all metamodel parts should be mapped this way. 
6. Mark which elements are best solved through **manual extension/handwritten code** rather than full DSL generation, because the PDF explicitly allows that. 
7. Add these findings to the **team report section**. 

### What you should especially contribute

As the Sirius student, you should help ensure the mapping is model-centric:
1. For each REF metamodel concept, identify what Sirius model element will trigger which code artifact. 
2. Help the team express variability in a way that is easy to generate from model instances.
3. Flag any places where the metamodel may still need refinement so the future generator can work cleanly. 

## Activity 5

### Team tasks

The team must design the **templates/rules for code generation**, specify the common parts that are always generated, 
and specify the variable parts that are generated based on model contents. The report must describe these findings. 

Step by step, as a team:
1. Use the Activity 4 mapping as the base.
2. Define **generation rules**, such as:
- If model contains `Post`, generate post entity/service/controller.
- If model enables threaded comments, generate parent-child comment structure.
- If model uses star ratings, generate scale-specific validation and API support. 
3. Define **common templates**, meaning files/modules always generated regardless of model variation. 
4. Define **variable templates**, meaning code fragments or whole files generated conditionally based on model elements and values. 
5. Define how extension points appear in generated code, since the PDF requires support for manual user-added logic in the base language. 
6. Write the design in the **team report**. 

### Individual tasks

Each student must implement the code-generation templates/rules in their own tool, and all tools should be able to generate 
all applications in the domain. 

Step by step, for you in Sirius:
1. Choose your Sirius-compatible generation approach, typically model-to-text based on the EMF model behind the Sirius editor.
2. Implement the generation rules so your graphical model can produce backend code files.
3. Separate generation into:
- Always-generated code.
- Conditional/generated-per-model code.
- Protected/manual extension areas. 
4. Ensure the generator can work for all required REF application scenarios, not just your own prototype. 
5. Verify that generated artifacts follow the shared team architecture, naming, packaging, and compatibility conventions. 

## Activity 6

### Individual tasks

Each student must generate code for the **three REF models/applications described in Activity 7 of P1** using their tool. 
They must also support manual code addition, test the modeling and generation, report issues found, and explore how their 
tool supports **model evolution/migration** when the DSL metamodel changes. 

Step by step, for you:
1. Create or load the **three REF models** corresponding to the required scenarios from P1. 
2. Model those applications in your **Sirius graphical editor**. 
3. Run your generator and produce backend code for all three. 
4. Confirm that your generated code still supports **manual additions/extensions**, as required by Activity 2 and repeated here. 
5. Test the generated applications:
- Does the model validate?
- Does generation complete?
- Does the code compile?
- Does the backend structure reflect the intended scenario? 
6. Record all issues found during testing and place them in the **individual report section**. 
7. Explore **model evolution** in Sirius/EMF:
- What happens if the metamodel changes?
- How will old models be migrated?
- What migration strategy can you demonstrate? 
8. Report a concrete proposal and demonstrate it, because the PDF explicitly requires this. 

### Team tasks

The team must ensure that code generated by different tools is **compatible**, meaning it should be possible to mix/combine
code generated from DSLs implemented in different tools. The team must test this combination and report issues found. 

Step by step, as a team:
1. Align naming conventions, folder structure, package structure, and API contracts across Sirius, Xtext, and MPS outputs. 
2. Generate code independently from each tool for equivalent REF models.
3. Try mixing outputs, for example combining modules or replacing one generated area with another tool’s output. 
4. Check whether everything still compiles and behaves consistently.
5. Record incompatibilities and fixes in the **team report section**. 

## What Sirius changes for you

The PDF is explicit that **Sirius supports graphical notation**, while MPS and Xtext support textual notation, and that 
Sirius is **EMF-based** and can use an **Ecore metamodel**. That means your special responsibility is not to invent a 
textual DSL, but to make the **graphical modeling experience** strong and then connect that model to generation and testing. 

So your Sirius-specific focus across the activities is:
- Activity 1: graphical editor and notation. 
- Activity 3: manual prototype aligned with metamodel concepts. 
- Activity 5: generation from EMF/Sirius models. 
- Activity 6: graphical modeling of the three scenarios, generation, testing, and migration proposal. 

## Deliverables split

Here is the clean split of what belongs where:

| Activity | Team tasks | Your Sirius individual tasks |
|---|---|---|
| 1 | Design graphical + textual syntax; justify metamodel adaptations; add designs to team report  | Implement the graphical notation in Sirius; document implementation and Sirius-specific adaptations in individual report  |
| 2 | Decide language, frameworks, architecture, common code, extension strategy; write team report  | Contribute Sirius/EMF constraints and help ensure metamodel-to-code mapping will work  |
| 3 | None explicitly listed  | Manually build one REF backend prototype following Activity 2 decisions; use P1 examples as inspiration  |
| 4 | Analyze prototypes; identify common/variable code; map metamodel to code/artifacts; write team report  | Help express variability in model-driven terms and validate mappings against the Sirius metamodel  |
| 5 | Design generation templates/rules; define common and variable generated parts; write team report  | Implement generation rules/templates in your Sirius-based solution  |
| 6 | Test compatibility/mixing of code generated by different tools; write team report  | Generate the three REF apps with Sirius; support manual additions; test; report issues; propose and demonstrate model migration/evolution support  |

## Practical order for you

A practical Sirius-first order would be:
1. Finalize/refine the **Ecore metamodel** from P1. 
2. Help the team define syntax, but personally implement only the **graphical syntax in Sirius**. 
3. Agree on backend architecture as a team. 
4. Manually code one prototype backend. 
5. Analyze prototypes with the team and create metamodel-to-code mappings. 
6. Implement Sirius-side generation.
7. Model the three cases graphically and generate/test all outputs.
8. Add migration/evolution support proposal and report findings. 

## Report and evaluation

The report is inside the repository in Markdown, and for P2 it is divided into **team** and **individual** parts. 
The evaluation is also split into **Individual (60%)** and **Team (40%)**, and each student must be ready to explain and 
demonstrate both their individual work and the team work. 

Also remember:
- Deadline in the PDF: **Sunday, May 31, 23:59**. 
- All artifacts go into the team repository and then a copy is submitted in Moodle. 
- If you use external material or AI as research help, authorship and sources must be clearly identified, and the submitted
artifacts must still be your own work. 
