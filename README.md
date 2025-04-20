# 🐾 Java Animal Hierarchy Project

This project demonstrates inheritance, abstraction, and polymorphism using a hierarchy of animals in Java.  
It includes abstract classes, multiple inheritance levels, method overriding, and cloning logic.

---

## 📚 Project Description

The program defines an object-oriented structure of animals categorized by types such as **mammals**, **birds**, and **reptiles**, using a 3-level inheritance hierarchy.

### 🧬 Core Features

- **Base class:** `Animal` (abstract) with properties: `name`, `age`, and `color`
- **Mid-level categories:** e.g. `Mammal`, `Bird`, `Reptile`
- **Specific animal classes:** e.g. `Dog`, `Parrot`, `Snake`

### 🔁 Overridden Methods

- `eat()` – Defined uniquely for each animal type
- `sleep()` – Common to all animals
- `toString()` – Returns all animal details
- `equals(Object o)` – Compares animals by all attributes
- `clone()` – Returns a deep copy (including owner if applicable)

### 🧑‍🤝‍🧑 Owner Support

Some animals (e.g., pets) contain an `Owner` object, which includes:
- `ownerName`
- `phoneNumber`

Includes full support for:
- Constructors and initialization
- Getters and setters

---

## 🐾 Polymorphism Demo

The main program creates an `ArrayList<Animal>` representing an animal shelter or pet facility.  
It:
- Iterates through the list
- Calls shared methods (`eat`, `sleep`, `toString`)
- Identifies specific types and runs unique behavior like `fly()` or `crawl()`

---

## 🧪 Cloning & Ownership Test

- An animal with an owner is cloned.
- The cloned animal's owner's details are changed.
- Demonstrates that original animal's owner remains unchanged (deep copy success).

---

## 🛠 Technologies Used

- Language: **Java**
- Concepts: Inheritance, Abstract Classes, Method Overriding, Cloning, Polymorphism
- Collections: `ArrayList`

---

## 🚀 How to Run

1. Compile and run `Main.java`
2. Observe polymorphic behavior and cloning test output

---

## 👨‍💻 Author

Dvir Haham Pour

---

*Feel free to explore, experiment, and expand the animal kingdom! 🐕🦜🐍*
