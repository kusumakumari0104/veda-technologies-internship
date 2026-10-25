# Log File Analyzer

## Description
The Log File Analyzer is a Java application that reads an application log file and generates statistics for INFO, WARNING, and ERROR messages. It identifies malformed log lines and generates a report containing log-level counts and error details.

## Objective
- Practice file processing in Java.
- Learn string parsing and manipulation.
- Understand collections using HashMap and ArrayList.
- Handle file-related exceptions.
- Generate a log analysis report.

## Technologies Used
- Java
- File I/O
- HashMap
- ArrayList
- Exception Handling

## Features
- Reads log files line by line.
- Counts INFO, WARNING, and ERROR messages.
- Identifies malformed log entries.
- Collects error messages for the error summary.
- Generates a report in `log_report.txt`.
- Handles missing files and I/O errors.

## Project Structure

```text
LogFileAnalyzer/
├── LogFileAnalyzer.java
├── application.log
├── log_report.txt
└── README.md
```

## Sample Input

```text
[INFO] Application started
[INFO] User logged in
[WARNING] Disk space is low
[ERROR] Database connection failed
[INFO] Request processed
[ERROR] File not found
Invalid log entry
[WARNING] High memory usage
```

## Sample Output

```text
Log file analyzed successfully!
Total lines: 8
Malformed lines: 1
INFO: 3
WARNING: 2
ERROR: 2
Report saved to log_report.txt
```

## How to Run

### Step 1: Compile the Java Program

```bash
javac LogFileAnalyzer.java
```

### Step 2: Run the Program

```bash
java LogFileAnalyzer
```

### Step 3: View the Report

Open `log_report.txt` to see the analysis results.

## Concepts Learned
- File handling in Java
- Reading files line by line
- String parsing
- HashMap for counting log levels
- ArrayList for storing error messages
- Exception handling
- Report generation

## Conclusion
The Log File Analyzer is a beginner-friendly Java project that demonstrates how to process application logs, count message levels, detect malformed entries, and generate a summary report using file handling and collections.
