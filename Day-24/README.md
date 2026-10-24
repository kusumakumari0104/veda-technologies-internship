# Employee CSV File Processing

## Description
This Java project reads employee records from a CSV file, validates the data, calculates employee salary statistics, and generates a processed output CSV file. It handles invalid records without stopping the entire program.

## Objective
To practice file processing, CSV reading and writing, data validation, exception handling, and statistical calculations using Java.

## Technologies Used
- Java
- CSV (Comma-Separated Values)
- File I/O
- Exception Handling
- Collections Framework

## Features
- Reads employee records from a CSV file.
- Validates employee ID, name, department, and salary.
- Identifies missing fields and invalid salary values.
- Skips malformed or invalid records.
- Calculates total and average salary.
- Finds the highest and lowest salaries.
- Generates a processed CSV file containing valid employee records.

## Project Structure

```text
EmployeeCSVProcessing/
├── EmployeeCSVProcessor.java
├── employees.csv
└── processed_employees.csv
```

## Sample Input

Create a file named `employees.csv`.

```csv
ID,Name,Department,Salary
101,Ravi,IT,45000
102,Sita,HR,38000
103,Arun,Finance,52000
104,,Sales,30000
105,Kiran,IT,60000
106,Ram,HR,invalid
```

## How to Run

### Step 1: Compile the program

```bash
javac EmployeeCSVProcessor.java
```

### Step 2: Run the program

```bash
java EmployeeCSVProcessor
```

Ensure that `employees.csv` is in the same directory as the Java program.

## Sample Output

```text
Skipping invalid row 5: Missing field
Skipping invalid row 7: For input string: "invalid"

Employee CSV Processing Completed
---------------------------------
Total records processed: 6
Valid employees: 4
Invalid records: 2
Total salary: 195000.00
Average salary: 48750.00
Highest salary: 60000.00
Lowest salary: 38000.00
Output file: processed_employees.csv
```

## Sample Output CSV

The program generates `processed_employees.csv` with valid employee records.

```csv
ID,Name,Department,Salary
101,Ravi,IT,45000.0
102,Sita,HR,38000.0
103,Arun,Finance,52000.0
105,Kiran,IT,60000.0
```

## Validation Rules
- Employee ID must not be empty.
- Employee name must not be empty.
- Department must not be empty.
- Salary must be a valid, non-negative number.
- Malformed and invalid records are skipped.
- The program continues processing after encountering invalid records.

## Learning Outcomes
- Understand Java file handling.
- Read and write CSV files.
- Implement data validation.
- Handle exceptions and invalid records.
- Calculate employee salary statistics.
- Generate processed output files.

## Interview Questions
1. How would you process a large CSV file efficiently?
2. What problems can occur during CSV parsing?
3. How would you handle invalid rows?
4. Why is exception handling important in file processing?
5. How can CSV data validation be improved?

## Conclusion
This project demonstrates how Java can process employee data from CSV files, validate records, calculate salary statistics, and generate a clean output file while handling invalid data safely.
