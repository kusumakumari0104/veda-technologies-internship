
# Student Management System (Java)

## Description
The Student Management System is a Java-based application designed to manage student records, subjects, marks, grades, and academic performance. It allows users to add, view, search, update, and delete student information.

## Objective
- To understand Java fundamentals, classes, and objects.
- To implement ArrayList for storing student records.
- To perform CRUD operations.
- To calculate student grades automatically.
- To understand methods, loops, and conditional statements.
- To develop a menu-driven Java application.

## Features
- Add new student records.
- View all student details.
- Search students using Student ID.
- Update student information and marks.
- Delete student records.
- Calculate total marks.
- Calculate percentage automatically.
- Generate grades based on percentage.
- Display student performance summaries.

## Technologies Used
- Java
- JDK
- ArrayList
- Scanner Class
- IntelliJ IDEA / Eclipse / VS Code
- Git and GitHub

## Classes Used
1. **Student Class:** Stores student ID, name, age, and subject details.
2. **Subject Class:** Stores subject names and marks.
3. **Grade Class:** Calculates grades based on percentage.
4. **StudentManagementSystem Class:** Handles all menu-driven operations.

## Grade Calculation

| Percentage | Grade |
|---|---|
| 90–100 | A+ |
| 80–89 | A |
| 70–79 | B |
| 60–69 | C |
| 50–59 | D |
| Below 50 | F |

## How to Run the Project

### Step 1: Install Java JDK

### Step 2: Save the file
`StudentManagementSystem.java`

### Step 3: Compile the program
```bash
javac StudentManagementSystem.java
```

### Step 4: Run the program
```bash
java StudentManagementSystem
```

## Sample Output

```text
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Performance Summary
7. Exit

Enter Your Choice: 1

Enter Student ID: 101
Enter Student Name: Kusuma
Enter Age: 20
Enter Number of Subjects: 3

Enter Subject Name: Java
Enter Marks (0-100): 90

Enter Subject Name: Python
Enter Marks (0-100): 85

Enter Subject Name: SQL
Enter Marks (0-100): 95

Student added successfully!
```

## Concepts Covered
- Classes and Objects
- Constructors
- Methods
- ArrayList Collection
- Conditional Statements
- Loops
- Switch Case
- Exception Handling
- CRUD Operations
- Grade Calculation

## Deliverables
- Java source code
- Student management functionality
- Grade calculation module
- Search and update functionality
- Performance summary
- README documentation

## Future Enhancements
- Store student records permanently using files or a database.
- Add a graphical user interface (GUI).
- Generate student report cards.
- Add login authentication.
- Export student reports to PDF.

## Conclusion
The Student Management System is a simple Java application that helps manage student academic records efficiently. This project improves understanding of Java programming, object-oriented concepts, collections, and basic application development.

---
**Project Name:** Student Management System

**Language:** Java

**Author:** Kusuma
