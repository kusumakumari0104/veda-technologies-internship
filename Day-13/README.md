
# Implement Runtime Polymorphism in Java

## Description
Create a Java application where a common parent reference can hold different child objects and execute overridden behavior.

## Objective
- Understand runtime polymorphism.
- Learn method overriding.
- Understand dynamic method dispatch.
- Use parent class references for child objects.

## Tools
- Java
- JDK (Java Development Kit)
- VS Code or any Java IDE

## Deliverables
- Parent class (`Animal`)
- Multiple child classes (`Dog`, `Cat`, `Cow`)
- Overridden `sound()` methods
- Runtime polymorphism demonstration

## Program Output

```text
Dog barks
Cat meows
Cow moos
```

## How to Run

1. Save the program as `Main.java`.
2. Open the terminal.
3. Compile the program:

   ```bash
   javac Main.java
   ```

4. Run the program:

   ```bash
   java Main
   ```

## Concepts Covered

### 1. Inheritance
A child class inherits methods and properties from its parent class.

### 2. Method Overriding
A child class provides its own implementation of a method defined in the parent class.

### 3. Runtime Polymorphism
A parent class reference can refer to different child class objects and invoke their overridden methods.

### 4. Dynamic Method Dispatch
Java selects the appropriate overridden method at runtime based on the actual object.

## Interview Questions

1. What is polymorphism?
2. What is runtime polymorphism?
3. What is dynamic method dispatch?
4. What is method overriding?
5. Why do we use a parent class reference for child objects?

## Conclusion
This program demonstrates runtime polymorphism in Java using inheritance and method overriding. It explains how the same parent reference can execute different behaviors depending on the child object assigned to it.
