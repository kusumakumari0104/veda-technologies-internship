# Implement Constructor Overloading in Java

## Description
This program demonstrates constructor overloading in Java by creating a class with multiple constructors. Each constructor initializes objects using different sets of information.

## Objective
- Understand constructors in Java.
- Learn the concept of constructor overloading.
- Create objects using different constructors.
- Initialize object properties with different values.

## Tools Used
- Java
- VS Code / IntelliJ IDEA / Eclipse

## Program Details
The `Student` class contains three constructors:

1. **Default Constructor:** Initializes the student with default values.
2. **Parameterized Constructor:** Initializes the student with a name and age.
3. **Parameterized Constructor with Three Arguments:** Initializes the student with a name, age, and course.

The `display()` method prints the student details.

## Sample Output

```text
Name: Unknown
Age: 0
Course: Not Assigned
-------------------
Name: Kusuma
Age: 20
Course: Not Assigned
-------------------
Name: Rahul
Age: 21
Course: Java
-------------------
```

## How to Run

1. Save the Java program as `Student.java`.
2. Open a terminal in the same folder.
3. Compile the program:

   ```bash
   javac Student.java
   ```

4. Execute the program:

   ```bash
   java Student
   ```

## Key Concepts
- Constructors
- Constructor overloading
- Default and parameterized constructors
- Object creation
- `this` keyword

## Interview Questions

### 1. What is a constructor?
A constructor is a special member of a class used to initialize objects.

### 2. What is constructor overloading?
Constructor overloading means defining multiple constructors in the same class with different parameter lists.

### 3. Can constructors be inherited?
No, constructors cannot be inherited in Java.

### 4. Can a constructor be private?
Yes, a constructor can be private to restrict object creation from outside the class.

## Conclusion
This program demonstrates how constructor overloading allows objects of the same class to be initialized with different sets of values.
