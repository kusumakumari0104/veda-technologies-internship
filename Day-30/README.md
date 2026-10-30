# Day 30 - Process Employee Data Using Java Streams

## Description
This project demonstrates how to process employee data using the Java Stream API. It performs filtering, sorting, grouping, transformation, and aggregation operations on employee records.

## Objective
To learn functional-style data processing using Java Streams and Lambda Expressions.

## Technologies Used
- Java
- Java 8 Stream API
- Lambda Expressions
- Collections Framework
- Comparator
- Collectors

## Features
- Display all employee details.
- Filter employees based on salary.
- Sort employees by salary in descending order.
- Extract employee names using `map()`.
- Group employees by department.
- Count employees in each department.
- Calculate total employee salary.
- Calculate average salary.
- Find the highest-paid employee.
- Find the lowest-paid employee.
- Calculate average salary by department.
- Generate an employee summary report.

## Java Stream Methods Used
- `filter()` – Filters employee records.
- `map()` – Transforms employee data.
- `sorted()` – Sorts employee records.
- `collect()` – Collects stream results.
- `groupingBy()` – Groups employees by department.
- `counting()` – Counts employees.
- `sum()` – Calculates total salary.
- `average()` – Calculates average salary.
- `max()` – Finds the highest salary.
- `min()` – Finds the lowest salary.

## Sample Employee Data

| ID | Name | Department | Salary | Age |
|---|---|---|---:|---:|
| 101 | Alice | IT | 60000 | 25 |
| 102 | Bob | HR | 45000 | 30 |
| 103 | Charlie | IT | 75000 | 28 |
| 104 | David | Finance | 55000 | 35 |
| 105 | Emma | HR | 50000 | 26 |
| 106 | Frank | Finance | 80000 | 40 |
| 107 | Grace | IT | 65000 | 29 |

## How to Run the Program

**Step 1:** Save the Java file as:

`ProcessEmployeeDataUsingStreams.java`

**Step 2:** Compile the program:

```bash
javac ProcessEmployeeDataUsingStreams.java
```

**Step 3:** Run the program:

```bash
java ProcessEmployeeDataUsingStreams
```

## Expected Output

```text
===== ALL EMPLOYEES =====
ID: 101, Name: Alice, Department: IT, Salary: 60000.00, Age: 25
ID: 102, Name: Bob, Department: HR, Salary: 45000.00, Age: 30
ID: 103, Name: Charlie, Department: IT, Salary: 75000.00, Age: 28
ID: 104, Name: David, Department: Finance, Salary: 55000.00, Age: 35
ID: 105, Name: Emma, Department: HR, Salary: 50000.00, Age: 26
ID: 106, Name: Frank, Department: Finance, Salary: 80000.00, Age: 40
ID: 107, Name: Grace, Department: IT, Salary: 65000.00, Age: 29

Total Salary: 430000.0
Average Salary: 61428.57142857143

Highest Paid Employee:
ID: 106, Name: Frank, Department: Finance, Salary: 80000.00, Age: 40

Lowest Paid Employee:
ID: 102, Name: Bob, Department: HR, Salary: 45000.00, Age: 30
```

## Learning Outcomes
- Understand Java Stream API.
- Work with Lambda Expressions.
- Perform filtering and sorting operations.
- Group and aggregate employee information.
- Write clean and readable Java code.
- Understand functional-style programming.

## Conclusion
This project provides practical experience in processing employee records using Java Streams. It demonstrates how to perform data filtering, sorting, grouping, transformation, and aggregation efficiently using modern Java features.
