
# Implement HashMap-Based Employee Lookup

## Description
Build an employee lookup system using Java's `HashMap` data structure. Employee IDs are used as keys, and employee names are stored as values for fast retrieval.

## Objective
Understand key-value data structures and hashing in Java.

## Technologies Used
- Java
- HashMap
- Scanner
- Java Collections Framework

## Features
- Add Employee
- Search Employee by ID
- Update Employee
- Delete Employee
- Display All Employees
- Exit the application

## How It Works
The program uses `HashMap<Integer, String>` to store employee information.

- **Key:** Employee ID (`Integer`)
- **Value:** Employee Name (`String`)

The program checks whether an employee ID already exists before adding a new employee, ensuring that IDs are unique.

## Code Example

```java
HashMap<Integer, String> employees = new HashMap<>();

employees.put(101, "Kusuma");

System.out.println(employees.get(101));
```

### Output
```text
Kusuma
```

## How to Run

1. Install the Java Development Kit (JDK).
2. Save the program as `EmployeeLookup.java`.
3. Open a terminal in the project directory.
4. Compile the program:

   ```bash
   javac EmployeeLookup.java
   ```

5. Run the program:

   ```bash
   java EmployeeLookup
   ```

## Sample Output

```text
===== EMPLOYEE LOOKUP SYSTEM =====
1. Add Employee
2. Search Employee by ID
3. Update Employee
4. Delete Employee
5. Display All Employees
6. Exit

Enter your choice: 1
Enter Employee ID: 101
Enter Employee Name: Kusuma
Employee added successfully!

Enter your choice: 2
Enter Employee ID to search: 101
Employee Found: Kusuma
```

## Time Complexity

| Operation | Average Time Complexity |
|---|---|
| Add Employee | O(1) |
| Search Employee | O(1) |
| Update Employee | O(1) |
| Delete Employee | O(1) |
| Display Employees | O(n) |

*Note: HashMap operations are typically O(1) on average.*

## Interview Questions

1. What is a `HashMap` in Java?
2. How does `HashMap` work internally?
3. Can a `HashMap` contain duplicate keys?
4. What happens during a hash collision?
5. Why should employee IDs be unique?
6. What is the difference between `HashMap` and `HashSet`?

## Conclusion
This project demonstrates how Java's `HashMap` can be used to build a simple employee lookup system. It provides practical experience with key-value storage, hashing, searching, updating, and deleting employee records.
