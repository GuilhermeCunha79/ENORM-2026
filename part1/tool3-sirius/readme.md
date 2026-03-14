
# EDOM Project, Part 1 – Tool 3 (Sirius)

In this folder you should add **all artifacts developed for part 1 of the ENORM Project**, related to **Tool 3 – Sirius**.

This document contains the **individual report for the Sirius tool**, describing installation, metamodel implementation, constraints, refactorings, visualizations, and model execution as required in **Part P1 (Modeling)** of the ENORM project.

---

# Description of the Tool

**Sirius** is an open‑source framework from the Eclipse ecosystem that allows developers to create **custom graphical modeling workbenches**.  
It is built on top of **Eclipse Modeling Framework (EMF)** and allows users to define graphical editors for domain‑specific languages (DSLs) without writing large amounts of UI code.

Instead of manually programming editors, Sirius allows developers to **describe how models should be visualized and manipulated** using configuration models called **Viewpoints**.

Main characteristics of Sirius:

- Built on top of **EMF (Eclipse Modeling Framework)**.
- Allows creation of **graphical modeling tools**.
- Uses **Ecore metamodels** to define domain concepts.
- Supports **diagram editors, validation rules, and quick fixes**.
- Enables generation of **custom DSL modeling environments**.
- Integrates with other Eclipse modeling tools.

In the context of the ENORM project, Sirius is used to:

- Implement the **REF DSL metamodel**
- Provide a **graphical editor**
- Implement **validation constraints**
- Provide **quick fixes (refactorings)**
- Generate **textual and graphical model projections**

---

# How to Setup and Install

## Requirements

Before installing Sirius, the following tools are required:

- Java JDK 11 or later
- Eclipse IDE for Modeling
- Internet connection for plugin installation

## Installation Steps

### 1. Install Eclipse Modeling Tools

Download Eclipse from:

https://www.eclipse.org/downloads/

Select:

**Eclipse IDE for Modeling Tools**

This distribution already includes several modeling frameworks such as:

- EMF
- Ecore Tools
- XMI support

### 2. Install Sirius Plugin

Inside Eclipse:

1. Go to **Help → Install New Software**

# Implementation of the Metamodel

The metamodel defines the **structure of the REF DSL**.  
In Sirius, the metamodel is implemented using **Ecore**.

## Steps

### 1. Create an EMF Project

```
File → New → Modeling Project
```

### 2. Create an Ecore Model

Example metamodel structure:

Entities defined for the REF DSL:

- User
- Resource
- Feedback
- Comment
- Evaluation
- Report
- Automation

### Example Ecore Classes

***

### Relationships

***

This metamodel supports the modeling of systems similar to:

- YouTube
- Amazon reviews
- Reddit discussions

---

# Implementation of Constraints and Refactorings

Constraints ensure that **models created with the DSL are valid**.

Sirius allows constraints to be implemented using **validation rules**.

## Example Constraints

### Constraint 1 – ***



## Refactorings (Quick Fixes)

Quick fixes automatically correct detected problems.


Problem: ***

Quick fix: ***


These quick fixes can be triggered directly in the Sirius modeling environment.

---

# Implementation of the Visualizations

Two types of visualizations were implemented:

1. **Graphical visualization**
2. **Textual projection**

## Graphical Visualization

Graphical visualization is implemented using **Sirius diagrams**.

***

These diagrams allow users to visually build models of REF applications.

## PlantUML Generation

Graphical projections can also be exported to **PlantUML diagrams**.

***

The PlantUML file can then be rendered to produce diagrams automatically.

## Textual Projection

The DSL models can also be exported to a textual representation.

***

Textual projections help inspect models without using the graphical editor.

---

# Implementation of Models (instances)

Example models were created to represent the three required scenarios:

- YouTube
- Amazon
- Reddit

## Example – YouTube Model

Users can upload videos and comment on them.

Example:

***

## Example – Amazon Model

Users review products using ratings and comments.

Example:

***

## Example – Reddit Model

Users create posts and discussions.

Example:

***


# Execution of Constraints and Refactorings

After models are created in the Sirius editor, the validation system checks for violations.

Execution:
***

This ensures models remain **consistent and valid**.

---

# Generation/Execution of Visualizations

The visualizations are generated through model traversal.

Steps:
***

Output artifacts:

- `.puml` PlantUML diagram
- `.txt` textual model projection

These projections allow users to view DSL models outside the modeling tool.

---

# Conclusion

Sirius provides a powerful environment for building **graphical DSL editors**.

In this project it allowed the implementation of:

- The REF DSL metamodel
- Graphical modeling diagrams
- Validation constraints
- Refactoring quick fixes
- Textual projections
- Graphical projections using PlantUML

These features support the **modeling of user feedback systems** similar to YouTube, Amazon, and Reddit.

Sirius significantly simplifies the development of modeling tools and enables rapid prototyping of DSL environments.
