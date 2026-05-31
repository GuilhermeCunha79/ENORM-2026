# ENORM Part 2 - Individual Report - Tool 3: Eclipse Sirius

**Student:** Francisco Peixoto  
**Tool:** Eclipse Sirius

This document presents the individual contribution developed for Tool 3 in Part 2 of the ENORM project. The report is 
organized according to the activities defined in Section 2.4 of the assignment statement. Since Activities 2 and 4 are 
team-level activities, they are not discussed in detail in this individual report; the corresponding team decisions are 
documented in `part2/TeamReport.md`.

## Activity 1 - Implementation of the Graphical Concrete Syntax
### Objective
The objective of Activity 1 is to implement the graphical notation assigned to Tool 3. Eclipse Sirius was selected as 
the graphical concrete syntax framework over the shared REF EMF/Ecore metamodel. The resulting editor is intended to 
support model inspection and editing through a structured graphical representation of resources, feedback mechanisms, 
users, contexts, and governance rules.

The graphical syntax was designed to remain close to the REF metamodel while reducing the amount of technical detail exposed 
directly in the diagram. 

### Implemented Artifacts
The implementation is distributed across the modeling project and the second Eclipse runtime workspace:

| Artifact | Purpose |
|---|---|
| `part2/tool3-sirius/model/enorm.ecore` | REF Ecore metamodel used as the semantic basis of the editor. |
| `part2/tool3-sirius/src-gen/enorm` | Generated EMF Java model code. |
| `part2/eclipse_sirius_2nd_Instance/enorm.design/description/enorm.odesign` | Sirius Viewpoint Specification Model. |
| `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.enorm` | EMF scenario instances for Amazon, Reddit, YouTube, and the reference model. |
| `part2/eclipse_sirius_2nd_Instance/enorm.design/instances/*.aird` | Sirius representation files associated with the scenario models. |

The Sirius viewpoint is named `enorm` and defines a `RefModel Full Diagram` representation for the `enorm.RefModel` root class.

### Sirius-Specific Adaptations
The graphical design required adaptations to remain usable in Sirius. A direct one-to-one representation of every metamodel 
element as a top-level diagram node would produce diagrams with excessive visual density. The following adaptations were therefore introduced:

1. `Attribute`, `FeedbackPolicy`, `RatingPolicy`, `Condition`, and `Action` are represented as nested elements when this improves readability.
2. Cross-references are represented through edge mappings rather than through duplicated graphical nodes.
3. Detailed values are kept in labels or property views when a graphical element would not improve comprehension.
4. The same mappings are reused for Amazon, Reddit, and YouTube, avoiding scenario-specific graphical notation.

These adaptations preserve the semantics of the metamodel while improving the usability of the graphical editor for larger models.

## Activity 3 - Prototype Alignment
Activity 3 required the consideration of an example application prototype in order to support the later identification of 
generated code structures. For Tool 3, the main reference scenario was the YouTube backend. It has several relevant concepts:

- users and channels;
- videos as evaluated resources;
- comments and threaded feedback;
- likes, dislikes, and subscriptions;
- reports;
- validation, moderation, sorting, and automation rules.

This ensured that the selected scenario could be represented as a graphical EMF model and subsequently used as input for generation. 
The Amazon and Reddit scenarios were also maintained as `.enorm` model instances to verify that the graphical notation was not specialized for a single scenario.

The AI-generated reference backend prototypes used for comparison and generation alignment are stored in:

| Scenario | Reference backend path |
|---|---|
| Amazon | `part2/ai-generated-backends-prototypes/amazon-backend` |
| Reddit | `part2/ai-generated-backends-prototypes/reddit-backend` |
| YouTube | `part2/ai-generated-backends-prototypes/youtube-backend` |

## Activity 5 - Implementation of Code Generation Rules
### Generator Location
For this section was used Acceleo model-to-text generator, that consumes the same EMF models edited through Sirius:

`part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/src/org/eclipse/acceleo/module/sample/common/generate.mtl`

The generator reads `RefModel` instances and produces Spring Boot REST backend projects in the following directories:
- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/amazon-backend`
- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/reddit-backend`
- `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/youtube-backend`

### Generated Artifacts
The generator produces a complete backend. The main generated artifact categories are summarized below:

| Template area | Generated artifacts |
|---|---|
| Project setup | `pom.xml`, Spring Boot application class, and resource configuration. |
| Domain model | JPA entities, generated base classes, enums, value objects, and scenario-specific overrides. |
| Persistence | Spring Data repositories and generated repository bases. |
| Services | CRUD services, moderation services, policy services, and extension-oriented service layers. |
| Web/API | REST controllers, generated controllers, authentication endpoints, `ApiError`, and `ApiExceptionHandler`. |
| Security | JWT service/filter stubs, security configuration, and user details service. |
| Tests | Acceptance tests, moderation service tests, and test configuration. |

### Manual Extension Mechanism
The generated Java code follows a Generation Gap approach:

- generated base artifacts are placed in `generated` packages or use `Generated*` names;
- handwritten extension classes are placed outside the generated packages;
- scenario-specific behavior is implemented in service and controller wrappers where required;
- validation and moderation concepts may be connected to Java implementation hooks through fields such as `implementationId`.

This mechanism addresses the requirement that generated applications must support manual additions in the base programming language.

## Activity 6 - Generation and Validation of the Three Applications
### Scenario Models
These models demonstrate that the graphical notation supports the three scenario families required by the assignment:

- marketplace and product-review behavior in Amazon;
- community discussion, voting, reporting, and moderation in Reddit;
- media content, comments, reactions, subscriptions, and moderation in YouTube.

### Generated Applications
Each generated backend uses Spring Boot, Spring Data JPA, REST controllers, and H2 as the demonstration database.
The generated applications use scenario-specific ports:

| Backend | Port | 
|---|---:|
| Amazon | 8081 | 
| YouTube | 8082 |
| Reddit | 8083 |

The generated H2 configuration uses an in-memory database:

```properties
spring.datasource.url=jdbc:h2:mem:<scenario>;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.jpa.hibernate.ddl-auto=update
```
This configuration is suitable for demonstration purposes, since the data persists while the backend process is running and is reset between executions.

### Test Results
The generated applications were tested with Maven using JDK 21:

| Backend | Command | Result |
|---|---|---|
| Amazon | `$env:JAVA_HOME='C:\Program Files\Java\jdk-21.0.10'; mvn test` | Passed - 5 tests, 0 failures, 0 errors |
| Reddit | `$env:JAVA_HOME='C:\Program Files\Java\jdk-21.0.10'; mvn test` | Passed - 5 tests, 0 failures, 0 errors |
| YouTube | `$env:JAVA_HOME='C:\Program Files\Java\jdk-21.0.10'; mvn test` | Passed - 5 tests, 0 failures, 0 errors |

The acceptance tests verify that:

- the Spring Boot application context starts successfully;
- authentication endpoints accept generated `UserType` payloads;
- generated collection endpoints are reachable;
- missing resources are returned as JSON API errors through `ApiExceptionHandler`.

### Issues Identified During Testing
The main issues identified during testing were related to generation consistency rather than Sirius diagram execution:

2. The Amazon `AutomationRuleController` initially generated calls to child-linking methods that were not generated in 
the corresponding domain classes. These invalid calls were removed from the template.
3. An initial generated YouTube acceptance test expected `Youtube`, while the model name is `YouTube`. The generator 
now normalizes the Java class and project name while preserving the model name.
4. Maven required an explicit `JAVA_HOME` value in the local shell and access to the required Maven dependencies. 
After setting `JAVA_HOME` to JDK 21 and resolving dependencies, all generated projects passed their tests.

### Model Evolution and Migration Proposal
Model evolution in Sirius must coordinate three artifacts:

- the REF Ecore metamodel;
- the Sirius `.odesign` viewpoint;
- existing `.enorm` and `.aird` scenario models.

The proposed migration strategy is:
1. Version the metamodel explicitly so that old and new model instances can be distinguished.
2. Apply EMF model migrations before opening old models in Sirius.
3. Update `.odesign` mappings whenever classes, references, or features are renamed or removed.
4. Preserve backward compatibility for additive changes when possible.
5. Use Amazon, Reddit, and YouTube as regression models after each metamodel change.
6. Regenerate the backend with Acceleo after migration.
7. Execute the generated Maven tests again to validate the migration.

## Conclusion
The graphical notation was implemented in Eclipse Sirius, the three required REF scenarios were represented as EMF/Sirius models,
the Acceleo generator produced Spring Boot backends for all scenarios, and the generated applications were validated successfully.

Overall, the Sirius contribution provides a graphical modeling interface for the REF DSL while preserving compatibility 
with the shared EMF metamodel and the model-to-text generation pipeline.
