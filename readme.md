# ENORM REF DSL Project

This repository contains the 2025/26 ENORM team project for the MEI program at ISEP. The project defines and implements **REF**, a domain-specific language for **Resource Evaluation and Feedback** applications.

REF models systems where users create resources, publish feedback, rate, report, validate, moderate, automate actions, verify content and sort visible results. The same language concepts are implemented with three language engineering tools and used to generate Java/Spring Boot REST backends for Amazon, Reddit and YouTube-inspired scenarios.

The project follows a model-to-code approach: instead of starting by writing each backend directly in Java, the relevant domain concepts are first captured in a high-level REF model. That model describes the application structure, user roles, resources, feedback mechanisms, policies and behavioural rules. The generators then translate those models into executable backend projects, producing entities, repositories, services, controllers, configuration files and extension points for manual business logic.

This makes the repository a practical comparison of three DSL implementation strategies. MPS, Xtext and Sirius each provide a different way to create and edit models, but all of them target the same idea: use a precise model as the source of truth and derive most of the repetitive backend code from it.

## Project Scope

- Shared REF metamodel for users, contexts, resources, attributes, relations, feedback, ratings, authorization, validation, moderation, automation, verification and sorting.
- Concrete syntaxes implemented with JetBrains MPS, Eclipse Xtext and Eclipse Sirius.
- Model-to-text generation of Java 21 / Spring Boot / Maven / JPA / H2 backend applications.
- Generated backend examples for Amazon, Reddit and YouTube scenarios.
- Manual extension support through a Generation Gap style, keeping generated code separate from handwritten code.
- PlantUML diagrams, tool reports, generated prototypes and Postman acceptance material.

## Team

| Member | Tool | Main responsibility |
|---|---|---|
| Guilherme Cunha | JetBrains MPS | Projectional/textual syntax and MPS code generator |
| Pedro Vilarinho | Eclipse Xtext | Textual grammar, validation and Xtend backend generator |
| Francisco Peixoto | Eclipse Sirius | Graphical notation, EMF models and Acceleo backend generator |

## Repository Layout

| Path | Description |
|---|---|
| `part1/` | Part 1 work, including the initial REF metamodel, Eclipse/EMF work and Xtext projects. |
| `part2/TeamReport.md` | Team-level Part 2 report with the common design, backend architecture and traceability. |
| `part2/tool1-mps/` | JetBrains MPS language, editors, generator and generated Spring Boot prototypes. |
| `part2/tool2-xtext/` | Xtext Part 2 report, examples, generation notes and generated projections. |
| `part2/tool3-sirius/` | Sirius/EMF metamodel, graphical editor assets and individual report. |
| `part2/eclipse_sirius_2nd_Instance/` | Sirius runtime workspace and Acceleo generated backend output. |
| `part2/ai-generated-backends-prototypes/` | Reference backend prototypes used during commonality and variability analysis. |
| `part2/postman/` | Postman collections and endpoint documentation for generated moderation/API checks. |
| `diagrams/` | PlantUML source diagrams and assignment reference material. |
| `build.gradle` | Gradle task configuration for PlantUML diagram generation. |

## Tool Implementations

| Tool | Concrete syntax | Generator | Main evidence |
|---|---|---|---|
| MPS | Projectional/textual editors over typed MPS concepts | MPS Generator and `PlainTextGenerator` | `part2/tool1-mps/readme.md` |
| Xtext | Parser-based textual DSL over `.refdsl` files | Xtend templates | `part2/tool2-xtext/readme.md` |
| Sirius | Graphical notation over an EMF/Ecore metamodel | Acceleo templates | `part2/tool3-sirius/readme.md` |

## Generated Backend Locations

| Tool | Amazon | Reddit | YouTube |
|---|---|---|---|
| MPS | `part2/tool1-mps/prototypes/amazon-prototype` | `part2/tool1-mps/prototypes/reddit-prototype` | `part2/tool1-mps/prototypes/youtube-prototype` |
| Xtext | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/amazon` | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/reddit` | `part1/tool2-xtext/runtime-New_configuration/TestRef/src-gen/generated-backend/youtube` |
| Sirius | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/amazon-backend` | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/reddit-backend` | `part2/eclipse_sirius_2nd_Instance/org.eclipse.acceleo.module.sample/scr-gen/youtube-backend` |

The Part 2 Xtext projection outputs are also available under `part2/tool2-xtext/runtime-RefGen/RefGenTest/src-gen/projections/`.

## Generated Backend Architecture

The generated applications follow a common architecture:

- Java 21 and Maven
- Spring Boot Web REST API
- Spring Data JPA persistence
- H2 database for demos and tests
- generated domain, repository, service and web/controller layers
- security/authentication support where generated by the tool
- generated error handling and API response structures
- generated/manual separation using `generated` packages or `Generated*` classes

The shared package root used by the generated Java code is `pt.isep.enorm.ref`.

## Requirements

- JDK 21
- Maven
- Gradle wrapper included in this repository
- JetBrains MPS, if editing or regenerating the MPS language/prototypes
- Eclipse with Xtext, EMF and Sirius support, if editing or regenerating the Xtext/Sirius tools
- Postman or Newman, optional, for the acceptance collections under `part2/postman/`

## Common Commands

Generate PlantUML diagrams from the `diagrams/` folder:

```powershell
.\gradlew.bat plantUml
```

On Linux/macOS:

```bash
./gradlew plantUml
```

Run tests for a generated backend, replacing the path with the backend you want to check:

```powershell
mvn -f part2/tool1-mps/prototypes/amazon-prototype/pom.xml test
```

Run a generated Spring Boot backend:

```powershell
mvn -f part2/tool1-mps/prototypes/amazon-prototype/pom.xml spring-boot:run
```

Sirius generated backends use scenario-specific ports in their current configuration:

| Scenario | Port |
|---|---:|
| Amazon | 8081 |
| YouTube | 8082 |
| Reddit | 8083 |

The current MPS prototypes use port `8081`, so run one at a time or change `server.port` in the corresponding `application.properties`.

## API and Acceptance Material

The `part2/postman/` directory contains generated Postman collections and moderation acceptance requests for the three scenarios:

- `amazonref-generated-moderation.postman_collection.json`
- `redditref-generated-moderation.postman_collection.json`
- `youtuberef-generated-moderation.postman_collection.json`
- YAML request collections under `part2/postman/postman/collections/`
- Endpoint notes in `part2/postman/endpoints.md`

## Main Documentation

- Team report: `part2/TeamReport.md`
- MPS report: `part2/tool1-mps/readme.md`
- Xtext report: `part2/tool2-xtext/readme.md`
- Sirius report: `part2/tool3-sirius/readme.md`
- Metamodel diagrams: `diagrams/metamodel/`
- Assignment references: `diagrams/enunciado/`

## Project Status

This is an academic language engineering prototype. The generated applications are intended to demonstrate DSL-driven backend generation, cross-tool compatibility and manual extension points, not to serve as production-ready services.
