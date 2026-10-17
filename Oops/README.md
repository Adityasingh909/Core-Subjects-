# Java OOPs — Learning & Practice

A structured repository for learning **Object-Oriented Programming (OOP) in Java**, with small runnable examples, topic-wise notes, and practice problems.

## Topics covered

- [ ] Classes and Objects
- [ ] Constructors (`default`, `parameterized`, constructor overloading)
- [ ] `this` and `super`
- [ ] Encapsulation
- [ ] Inheritance
- [ ] Polymorphism (compile-time and runtime)
- [ ] Method overloading and overriding
- [ ] Abstraction (abstract classes)
- [ ] Interfaces
- [ ] Access modifiers
- [ ] `static` and `final`
- [ ] Exception handling
- [ ] Packages and imports
- [ ] Object class basics (`toString`, `equals`)
- [ ] Practice programs

## Repository structure

```text
java-oops-learning/
├── README.md
├── .gitignore
├── basics/
│   ├── ClassesAndObjects.java
│   └── Constructors.java
├── encapsulation/
│   └── BankAccount.java
├── inheritance/
│   └── InheritanceDemo.java
├── polymorphism/
│   └── PolymorphismDemo.java
├── abstraction/
│   └── AbstractionDemo.java
├── interfaces/
│   └── InterfaceDemo.java
├── keywords/
│   └── ThisSuperStaticFinalDemo.java
├── exceptions/
│   └── ExceptionHandlingDemo.java
└── practice/
    └── README.md
```

## Requirements

- JDK 17 or newer recommended
- A terminal or an IDE such as IntelliJ IDEA or VS Code with Java extensions

Check Java installation:

```bash
java -version
javac -version
```

## Run an example

From the repository root, compile and run a file. For example:

```bash
javac basics/ClassesAndObjects.java
java -cp basics ClassesAndObjects
```

For another example:

```bash
javac inheritance/InheritanceDemo.java
java -cp inheritance InheritanceDemo
```

Each example is intentionally kept in a separate folder and uses no external dependencies.

## Suggested learning order

1. Classes and objects
2. Constructors, `this`, and `super`
3. Encapsulation and access modifiers
4. Inheritance
5. Overloading vs. overriding
6. Polymorphism
7. Abstraction and interfaces
8. `static` and `final`
9. Exception handling
10. Practice programs without looking at the solution

## Practice workflow

For every topic:

1. Read the example and predict its output.
2. Run it locally.
3. Change one thing and observe what happens.
4. Write a similar example from scratch.
5. Add your own problem and solution to `practice/`.

## Learning progress

Use the checklist above to track topics you have completed. Add notes, examples, and solved problems as you learn.

## Goals

- Build a clear understanding of Java OOP concepts.
- Practice writing small, readable Java programs.
- Keep code organized for revision and interview preparation.

---

**Note:** This is a learning repository. Examples prioritize clarity over production-level architecture.
