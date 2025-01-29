# 📌 Item Upgrade System

## 📝 Overview
The **Item Upgrade System** is a Java-based inventory management system that allows items to be upgraded based on predefined rules. Players can combine multiple items of the same type and rarity to create higher-tier items.

## 🚀 Features
✅ Manage inventory and store items with names and rarity levels.  
✅ Upgrade mechanics based on predefined item combinations.  
✅ Console-based interface for inventory management.  
✅ Error handling for invalid upgrade attempts.  

---

## 📦 Deliverables
### 1️⃣ Code
- The Java source files should be provided in a **GitHub repository**.

### 2️⃣ README
- Instructions on how to **compile and run** the program.
- Assumptions and **design choices** made in the implementation.

### 3️⃣ Execution
- The program can be executed via the **command line** or an **IDE**.

---

## ⚙️ Installation & Setup
### 📌 Prerequisites
- Java Development Kit (**JDK 8** or later)
- Java-compatible IDE (**IntelliJ IDEA, Eclipse, VS Code**) or a command line terminal

### 🔧 Compilation
If using the command line, navigate to the project directory and compile the source file:
```sh
javac ItemUpgradeSystem.java
```

### ▶️ Running the Program
To execute the program after compilation:
```sh
java ItemUpgradeSystem
```

If using an **IDE**, open the project and run the `ItemUpgradeSystem` class.

---

## 🎯 Assumptions & Design Choices
### 📌 Assumptions
- Each item has a **name** and a **rarity level**.
- An item can be **upgraded only if enough matching items** exist in the inventory.
- The upgrade process **removes used items** and **replaces** them with an upgraded item.
- The program is a **console-based** application.

### 🛠️ Design Choices
- **OOP Principles**:
  - `Item` class encapsulates item details and upgrade logic.
  - `Inventory` class manages item storage and upgrades.
- **Upgrade Rules**:
  - 3 **Common** → 1 **Great**
  - 3 **Great** → 1 **Rare**
  - 3 **Rare** → 1 **Epic**
  - Epic items follow a different upgrade path to **Legendary**.
- **Error Handling**:
  - If an upgrade is attempted without sufficient items, an **error message is displayed**.

---

## 📌 Example Output
### 🏆 Before Upgrade:
```
Iron Sword [RARE]
Iron Sword [RARE]
Iron Sword [RARE]
```

### 🔄 Upgrade Process:
```
Upgrade to Epic Successful!
```

### 🏆 After Upgrade:
```
Iron Sword [EPIC]
```

---

## 🚀 Future Enhancements
🔹 **Graphical UI**: Implement a **GUI** for a better user experience.  
🔹 **Persistence**: Save and load inventory from a **file or database**.  
🔹 **Random Item Generation**: Introduce **probabilities** for different rarities.  

## 🤝 Contribution
Want to contribute? Feel free to **fork the repository**, make changes, and submit a **pull request**! 🎉

---

## 📜 License
This project is open-source and available to everyone. 📝

