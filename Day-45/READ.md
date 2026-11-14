
# Library Management System

## About
The Library Management System is a Java-based application designed to manage books, members, and library transactions. It allows users to add books, register members, issue and return books, track overdue books, search and sort book records, and store information using file handling.

## Objectives
- Learn practical object-oriented programming.
- Understand Java Collections.
- Implement file handling and exception handling.
- Perform searching and sorting operations.
- Develop transaction-based application logic.

## Technologies Used
- Java
- JDK
- IntelliJ IDEA / Eclipse
- Java Collections
- File I/O
- Git
- GitHub

## Features
1. Book Management
2. Member Management
3. Book Issue Functionality
4. Book Return Functionality
5. Overdue Tracking
6. Book Search by Title, Author, Category, or ISBN
7. Book Sorting
8. File-Based Persistence
9. Exception Handling

## Classes Used
- **Book:** Stores book details.
- **Member:** Stores member information.
- **Loan:** Maintains issue date, due date, and return date.
- **Library:** Manages books, members, and transactions.
- **LibraryException:** Handles custom exceptions.
- **LibraryManagementSystem:** Main class containing the menu-driven application.

## Concepts Implemented
- Object-Oriented Programming (OOP)
- ArrayList
- Serialization
- File Handling
- Exception Handling
- Comparator
- LocalDate
- Searching and Sorting
- Transaction Management

## How to Run

1. Install Java JDK.
2. Open IntelliJ IDEA or Eclipse.
3. Create a Java project.
4. Create a file named `LibraryManagementSystem.java`.
5. Copy and paste the Java code.
6. Compile and execute the program.

### Compilation

```bash
javac LibraryManagementSystem.java
```

### Execution

```bash
java LibraryManagementSystem
```

## Sample Menu

```text
===== LIBRARY MANAGEMENT SYSTEM =====

1. Add Book
2. Add Member
3. Display Books
4. Display Members
5. Issue Book
6. Return Book
7. Search Book
8. Sort Books
9. Overdue Tracking
10. Exit

Enter your choice:
```

## File Storage
The application uses `library.dat` to store books, members, and loan information.

Data is saved automatically whenever a book or member is added or a book is issued or returned.

## Expected Outcome
The application provides an efficient way to manage library operations. It reduces manual work, maintains book availability, tracks transactions, and stores records using file handling.

## Conclusion
This project demonstrates practical Java programming concepts, including object-oriented design, collections, file handling, exception handling, searching, sorting, and transaction-based application development.
