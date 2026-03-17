# EDOM Project, Part 1, Tool 1

In this folder you should add **all** artifacts developed for part 1 of the ENORM Project, related to tool 1.

You should also include in this file the report for this part of the project (only for tool 1).

**Note:** If for some reason you need to bypass these guidelines please ask for directions with your teacher and **always** state the exceptions in your commits and issues in bitbucket.

Following there are examples of proposed sections for the report.

## Description of the Tool

[MPS (Meta Programming System)](https://www.jetbrains.com/mps/) is a language workbench developed by JetBrains that enables the design, implementation, and integration of domain-specific languages (DSLs). Its primary objective is to simplify the development of specialized programming languages tailored to particular problem domains.

Traditional programming languages rely on textual representations of code that must be processed by parsers. These parsers analyze the syntax of a given language and transform it into internal data structures that represent the program. However, since parsers are typically designed for a single language grammar, combining multiple languages or extending existing ones can become complex and difficult to maintain.

MPS addresses this limitation through an approach known as **projectional editing**, which is closely related to the concept of **language modularization**. Instead of relying on textual code that needs to be parsed, MPS directly represents programs as structured data in the form of an **Abstract Syntax Tree (AST)**. In this representation, code is composed of interconnected nodes, each containing a set of properties and relationships that define the structure and semantics of the program.

By eliminating the need for parsing, MPS enables the seamless composition of multiple languages within the same environment. This significantly improves the flexibility of language development and facilitates the creation of DSLs that are easier to use and maintain.

Furthermore, MPS provides mechanisms for defining **concepts**, **constraints**, and **generation rules**. Concepts define the fundamental building blocks of a language, constraints enforce structural and semantic correctness, and generation rules specify how models created with the DSL are transformed into executable source code. Through these mechanisms, developers can precisely control both the structure of the language and the behavior of the generated artifacts.

## How to Setup and Install

The installation and setup process of [MPS (Meta Programming System)](https://www.jetbrains.com/mps/) is straightforward and follows the standard distribution model used by JetBrains development tools. The following steps describe the recommended procedure for installing and configuring the environment.

### 1. Download the Tool

The first step consists of downloading the latest stable version of MPS from the official JetBrains website. The installation package is available for the major operating systems, including Windows, macOS, and Linux.

The tool can be obtained from the official download page:

- https://www.jetbrains.com/mps/

### 2. Install the Application

After downloading the installation package, the user should execute the installer and follow the instructions provided by the setup wizard. The process typically involves selecting the installation directory and confirming the default configuration options.

For Linux systems, the installation may involve extracting the provided archive and executing the application directly from the extracted directory.

### 3. Launching MPS

Once the installation process is completed, the application can be launched through the operating system’s application menu or by executing the MPS executable file located in the installation directory.

Upon startup, MPS initializes its development environment and prompts the user to either open an existing project or create a new one.

### 4. Creating a New Project

To begin using MPS, a new project must be created. This can be done by selecting the **“New Project”** option in the startup interface. The user will then be prompted to define a project name and select the desired project location (Figure 3.1).

![Figure 3.1 – Creating a new project in MPS](images/mpsNewProject.png)

During the project creation process, it is possible to select the option to **create a Sandbox Solution**. Enabling this option automatically generates a testing environment where instances of the domain-specific language can be created and evaluated (Figure 3.2).

![Figure 3.2 – Selecting the option to create a language and sandbox solution in MPS](images/mpsNewProjectLanguage.png)

A sandbox solution is particularly useful during language development, as it allows developers to experiment with language concepts and validate their behavior without affecting the core language implementation.

### 5. Implementing the DSL

After the project has been successfully created, the developer can begin implementing the domain-specific language. This process involves defining **language concepts**, specifying **constraints**, and configuring **generation rules** that determine how models created using the DSL are transformed into executable code.

The sandbox environment can then be used to create example models and test the behavior of the developed language.
## Implementation of the Metamodel

## Implementation of Constraints and Refactorings

## Implementation of the Visualizations

## Implementation of Models (instances)

## Execution of Constraints and Refactorings

## Generation/Execution of Visualizations
