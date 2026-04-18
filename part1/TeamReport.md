# ENORM Project – Part 1 Modeling – Team Report

## Activity 1: Team Formation and Tool Research

### Tool Research and Comparison

This section presents a brief description of each tool available for implementing the REF (Resource Evaluation and Feedback) DSL metamodel.

---

## 1. MPS - Meta Programming System
### Overview
**MPS** (Meta Programming System) is a language workbench developed by JetBrains that enables the creation of domain-specific languages without being constrained by the syntax of a host language. It uses projectional editing, allowing developers to define multiple concrete syntaxes (textual and graphical) for the same abstract syntax.
- Website: https://www.jetbrains.com/mps/


### Key Characteristics
- **Language Workbench Approach**: MPS is a projectional editor that allows multiple notations for the same language
- **Structure Definition**: Uses a dedicated "Structure" concept to define the abstract syntax (metamodel)
- **Default Editor**: Automatically provides a default editor for the DSL
- **Constraints & Rules**: Supports "Checking Rules" and "Quick Fixes" for model validation and corrections
- **Code Generation**: Provides "TextGen" for generating code or other text-based projections
- **Intentions**: Allows implementation of custom behaviors and popup menu options through "Behaviors" and "Intentions"
- **Multi-Notation Support**: Can define multiple graphical and textual representations simultaneously

---

## 2. Xtext
### Overview
**Xtext** is an open-source framework for implementing domain-specific languages based on the Eclipse Modeling Framework (EMF). It is primarily focused on textual DSL development, allowing developers to define grammar rules that are automatically translated into metamodels and code generators.
- Website: https://www.eclipse.org/Xtext/

### Key Characteristics
- **Grammar-Based**: DSL definition starts with grammar rules in Xtext grammar language
- **EMF Integration**: Automatically generates an EMF/Ecore metamodel from the grammar definition
- **Wizard Support**: Provides "Xtext Project from Existing Ecore Models" wizard for creating DSLs based on pre-existing metamodels
- **Default Textual Representation**: Automatically generates a default textual representation
- **Validation Rules**: Supports custom validation rules for constraint implementation
- **Quick Fixes**: Provides mechanisms to implement quick fixes for detected errors
- **Code Generation**: Supports Xtend-based code generation for creating projections and other outputs
- **IDE Features**: Auto-completion, syntax highlighting, error reporting, and other standard IDE features

---

## 3. Sirius
### Overview
**Sirius** is an Eclipse project that allows developers to create graphical modeling workbenches. It is built on top of the Eclipse Modeling Framework (EMF) and enables the creation of custom graphical notations for domain-specific languages without coding.
- Website: https://www.eclipse.org/sirius/

### Key Characteristics
- **Graphical Focus**: Designed specifically for creating graphical representations of models
- **EMF Integration**: Works with EMF/Ecore metamodels as the foundation
- **Viewpoint-Based Architecture**: Uses "Viewpoints" to organize different representations of the same metamodel
- **Visual Representations**: Provides mapping between metamodel elements and graphical shapes
- **Validation Rules**: Supports custom validation rules for model constraints
- **Quick Fixes**: Allows implementation of quick fixes for detected errors
- **External Java Actions**: Supports "External Java Action Call" for executing custom Java code
- **Code Generation**: Often used with Acceleo for advanced code/text generation

---

## Team Tool Selection

Each team member selected randomly one of the three available tools. The distribution was as follows:
- **MPS**: Guilerme Cunha
- **XText**: Pedro Vilarinho
- **Siris**: Francisco Peixptp

---

# Specific Tool Setup
## MPS - Meta Programming System
### Tool Description

**MPS** (Meta Programming System) is a sophisticated language workbench developed by JetBrains designed for creating
domain-specific languages using projectional editing. Unlike traditional text-based parsers, MPS uses a projectional
approach where the editor directly manipulates an abstract syntax tree (AST), allowing multiple concrete syntaxes
to coexist for the same underlying model.

### Installation Steps:

TODO

### Setup Instructions

TODO

---

## Xtext
### Tool Description

**Xtext** is an open-source framework for implementing domain-specific languages (DSLs) based on the Eclipse Modeling
Framework (EMF). It provides a powerful grammar language that automatically generates parsers, metamodels, and editor
infrastructure from simple grammar rules. Xtext is particularly well-suited for textual DSL development and integrates
seamlessly with the Eclipse IDE.

### Installation Steps:

TODO

### Setup Instructions

TODO

---

## Sirius
### Tool Description

**Sirius** (System for Graphical Editing of Information System Representation) is an Eclipse project that enables the
creation of custom graphical editing workbenches without writing code. Built on the Eclipse Modeling Framework (EMF),
Sirius allows developers to define graphical representations of domain models through a declarative approach using
viewpoints and diagrams. It is particularly powerful for creating intuitive graphical notations for DSLs.

### Installation Steps:

TODO

### Setup Instructions
#### Initial Setup:

TODO

---


# Design Domain Metamodel
TODO

---

# Design Metamodel Constraints and Transformations
TODO

---

#  Design Model Projections/Visualizations
TODO

---

# Application Engineering
TODO

---