# 🦆 Duck Behaviour

This project is a Java-based Duck Simulator implementing the **Strategy Design Pattern**. It models various duck types and their interchangeable behaviors for flying, quacking, and swimming.

## Overview

The goal of this project is to demonstrate how different types of ducks can share behaviors while maintaining flexibility through composition over inheritance.

## 📁 Directory Structure

```
src/
├── DecoyDuck.java
├── Duck.java
├── Floating.java
├── Fly.java
├── FlyBehaviour.java
├── Main.java
├── MallardDuck.java
├── MuteQuack.java
├── NoFly.java
├── Quack.java
├── QuackBehaviour.java
├── RedHeadDuck.java
├── RubberDuck.java
├── Squeak.java
├── SwimBehaviour.java
└── Swimming.java
```

## 🧠 Design Pattern: Strategy

This project utilizes the **Strategy Pattern** to define families of algorithms (behaviors) and make them interchangeable:

- **FlyBehavior**: `Fly.java`, `NoFly.java`
- **QuackBehavior**: `Quack.java`, `MuteQuack.java`, `Squeak.java`
- **SwimBehavior**: `Swimming.java`, `Floating.java`

Ducks like `MallardDuck`, `RubberDuck`, and `DecoyDuck` use these behaviors to define their unique traits.

## 🔧 How to Run

1. Navigate to the `src` directory:
   ```bash
   cd src
   ```

2. Compile all Java files:
   ```bash
   javac *.java
   ```

3. Run the simulator:
   ```bash
   java Main
   ```

## ✅ Features

- Implements the Strategy Pattern for flexible behavior composition
- Demonstrates clean object-oriented design
- Easy to extend: add new duck types or behaviors without modifying existing code
- Runtime behavior change support (if implemented)

## � Example Behavior (Conceptual)

```java
Duck mallard = new MallardDuck();
mallard.performFly();   // Output: I’m flying!
mallard.performQuack(); // Output: Quack!

Duck rubberDuck = new RubberDuck();
rubberDuck.performFly();   // Output: I can't fly.
rubberDuck.performQuack(); // Output: Squeak!
```

## 💻 Author

**Utkarsh Lakhani** 

---

Feel free to fork or extend the simulator!
