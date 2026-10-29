# Day 29 – Build a Generic Data Repository
## Description
Create a reusable generic repository class in Java that can store, retrieve, update, and delete different types of objects using Java Generics and Collections.
## Objective
- Understand Java Generics.
- Build reusable and type-safe components.
- Implement CRUD (Create, Read, Update, Delete) operations.
- Store and manage different types of objects using a single repository class.
## Technologies Used
- Java
- Java Generics
- ArrayList
- Collections Framework
## Features
- Add objects to the repository.
- Retrieve all stored objects.
- Retrieve an object using its index.
- Update an existing object.
- Delete an object using its index.
- Support multiple data types, such as `String` and `Integer`.
- Validate indexes before updating or deleting objects.
## Program Structure
- `GenericRepository<T>` – A generic class that manages objects of any specified type.
- `add(T item)` – Adds an object to the repository.
- `getAll()` – Returns all stored objects.
- `get(int index)` – Retrieves an object by index.
- `update(int index, T item)` – Updates an object.
- `delete(int index)` – Removes an object.
- `GenericDataRepository` – The main class used to demonstrate the repository.
## How to Run
1. Install the Java Development Kit (JDK).
2. Save the program as `GenericDataRepository.java`.
3. Open a terminal in the folder containing the file.
4. Compile the program:
   ```bash
   javac GenericDataRepository.java
   ```
5. Run the program:
   ```bash
   java GenericDataRepository
   ```
## Sample Output
```text
Added: Kusuma
Added: Ravi
Added: Priya
Names: [Kusuma, Ravi, Priya]
First name: Kusuma
Updated successfully.
After update: [Kusuma, Rahul, Priya]
Deleted: Priya
After delete: [Kusuma, Rahul]
Added: 10
Added: 20
Added: 30
Numbers: [10, 20, 30]
Updated successfully.
After update: [100, 20, 30]
Deleted: 20
After delete: [100, 30]
```
## Advantages of Generics
- Provides compile-time type safety.
- Reduces unnecessary type casting.
- Promotes code reusability.
- Makes code easier to maintain.
- Allows one repository class to work with multiple object types.
## Interview Questions
### 1. What are Generics in Java?
Generics allow classes, interfaces, and methods to work with different data types while providing type safety.
### 2. Why are Generics useful?
They improve code reusability, reduce type casting, and help detect type errors at compile time.
### 3. What is type safety?
Type safety ensures that values are used according to their expected data types.
### 4. What is type erasure?
Type erasure is the process by which Java removes most generic type information during compilation.
### 5. What is CRUD?
CRUD stands for Create, Read, Update, and Delete.

## Conclusion
This project demonstrates how Java Generics can be used to create a reusable, type-safe data repository with CRUD operations for multiple data types.
