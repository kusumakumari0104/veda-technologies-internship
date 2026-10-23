# Student Record Management System

## 📌 Description
A Java-based application that stores student records in a text file and allows users to add, read, search, and update student information.

## 🎯 Objective
To learn Java file handling and persistent storage by managing student records using file input and output operations.

## 🛠️ Technologies Used
- Java
- File Handling
- `FileReader` and `FileWriter`
- `BufferedReader` and `BufferedWriter`
- Exception Handling
- Scanner Class

## ✨ Features
- Add new student records.
- Display all student records.
- Search for a student by ID.
- Update existing student details.
- Store student data permanently in a file.
- Handle missing files and input/output errors.
- Provide a menu-driven interface.

## 📂 Project Structure

```text
StudentRecordManagement/
├── StudentRecordManagement.java
├── students.txt
└── README.md
```

## ▶️ How to Run

### Step 1: Compile the Program

```bash
javac StudentRecordManagement.java
```

### Step 2: Execute the Program

```bash
java StudentRecordManagement
```

## 📋 Menu Options

1. Add Student
2. Read All Students
3. Search Student
4. Update Student
5. Exit

## 💻 Sample Output

```text
=== Student Record Management ===
1. Add Student
2. Read All Students
3. Search Student
4. Update Student
5. Exit

Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Ravi
Enter Student Marks: 85
Student record added successfully!
```

## 📄 File Storage Format

Student records are stored in `students.txt` in the following format:

```text
101,Ravi,85
102,Sita,90
```

Each line contains the student ID, name, and marks, separated by commas.

## 📚 Learning Outcomes
- Understand Java file input/output operations.
- Learn to use buffered character streams.
- Implement adding, reading, searching, and updating records.
- Handle exceptions during file operations.
- Understand persistent data storage.

## ✅ Conclusion
The Student Record Management System demonstrates the use of Java file handling to manage student information. It provides a simple way to maintain records and introduces the fundamentals of file-based data storage.

---
**Language:** Java  
**Project Type:** File Handling  
**Storage:** Text File (`students.txt`)
