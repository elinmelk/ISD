# ISD
Item Upgrade System

Overview

This project implements an Item Upgrade System in Java, where items have different rarities and can be upgraded based on defined rules. The inventory system allows managing items, performing upgrades, and displaying the inventory state.

Features

Item management with name, rarity, and upgrade tracking.

Upgrade mechanics following predefined rules.

Console-based inventory display.

Error handling for invalid upgrades.

Deliverables

1. Code

The Java source files should be provided in a GitHub repository.

2. README

This README includes:

Instructions on how to compile and run the program.

Assumptions and design choices made in the implementation.

3. Execution

The program can be executed via the command line or IDE.

Installation & Setup

Prerequisites

Java Development Kit (JDK) 8 or later

A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or command line terminal

Compiling the Program

If using the command line, navigate to the project directory and compile the source file:

javac ItemUpgradeSystem.java

Running the Program

To execute the program after compilation:

java ItemUpgradeSystem

If using an IDE, open the project and run the ItemUpgradeSystem class.

Assumptions & Design Choices

Assumptions

Items have a name and a rarity level.

An item can be upgraded only if enough matching items exist in the inventory.

The upgrade process removes used items and replaces them with the upgraded item.

The program runs as a console application with simple outputs.

Design Choices

OOP Principles:

The Item class encapsulates item details and upgrade logic.

The Inventory class manages item storage and upgrades.

Upgrade Rules:

3 Common → 1 Great

3 Great → 1 Rare

3 Rare → 1 Epic

Epic items follow a different upgrade path to Legendary.

Error Handling:

If an upgrade is attempted without sufficient items, an error message is displayed.

Example Output

Before Upgrade:

Iron Sword [RARE]
Iron Sword [RARE]
Iron Sword [RARE]

Upgrade Process:

Upgrade to Epic Successful!

After Upgrade:
