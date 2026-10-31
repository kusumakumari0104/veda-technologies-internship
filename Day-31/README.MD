# Employee Analytics System Using Java Streams

## About
The Employee Analytics System is a Java-based application that analyzes employee records using Java Streams and Collectors. It calculates average salary, identifies the highest-paid and lowest-paid employees, generates department-wise statistics, ranks employees based on salary, and produces a summary report.

## Objectives
- Apply Java Streams to a real-world business analytics problem.
- Calculate average employee salary.
- Find the highest-paid and lowest-paid employees.
- Generate department-wise salary statistics.
- Count employees in each department.
- Rank employees based on salary.
- Generate a complete summary report.

## Technologies Used
- Java
- Java 8 Streams
- Collectors
- Comparator
- List and Map

## Features
1. **Department-wise Statistics** – Calculates average salary for each department.
2. **Employee Count** – Displays the number of employees in each department.
3. **Salary Analysis** – Calculates average, highest, and lowest salaries.
4. **Employee Ranking** – Sorts employees in descending order of salary.
5. **Total Salary Expense** – Calculates total salary paid to all employees.
6. **Summary Report** – Displays overall employee analytics.

## Java Concepts Used
- Stream API
- `Collectors.groupingBy()`
- `Collectors.averagingDouble()`
- `Collectors.counting()`
- `Comparator.comparingDouble()`
- `max()` and `min()`
- `sorted()`
- `mapToDouble()`
- `sum()`

## Sample Employee Details

| ID | Name | Department | Salary |
|---|---|---|---:|
| 101 | Kusuma | IT | 50000 |
| 102 | Rahul | HR | 35000 |
| 103 | Priya | IT | 65000 |
| 104 | Arun | Finance | 45000 |
| 105 | Sneha | HR | 40000 |
| 106 | Vijay | Finance | 55000 |
| 107 | Anjali | IT | 75000 |
| 108 | Kiran | Marketing | 30000 |

## Sample Output

    ===== DEPARTMENT-WISE STATISTICS =====
    Finance : Average Salary = 50000.00
    HR : Average Salary = 37500.00
    IT : Average Salary = 63333.33
    Marketing : Average Salary = 30000.00

    ===== EMPLOYEE COUNT BY DEPARTMENT =====
    Finance : 2 employees
    HR : 2 employees
    IT : 3 employees
    Marketing : 1 employees

    ===== SALARY ANALYSIS =====
    Average Salary: 49375.00

    Highest Paid Employee: Anjali - 75000.00
    Lowest Paid Employee: Kiran - 30000.00

    Total Salary Expense: 395000.00

    Total Employees: 8
    Number of Departments: 4

    Employee Analytics Completed Successfully!

## How to Run the Program

1. Install Java JDK 8 or above.
2. Create a file named `EmployeeAnalyticsSystem.java`.
3. Copy and paste the Java source code into the file.
4. Open the terminal in the project folder.
5. Compile the program:

   ```bash
   javac EmployeeAnalyticsSystem.java
