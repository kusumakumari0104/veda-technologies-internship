# Multithreaded File Search Tool

## About the Project

The **Multithreaded File Search Tool** is a Java application that searches multiple text files for a specified keyword using multiple worker threads. It displays matching lines with file names and line numbers and compares sequential and multithreaded execution times.

## Objective

- Search multiple text files for a given keyword.
- Apply multithreading to file processing.
- Display matching file names, line numbers, and text.
- Compare sequential and multithreaded execution times.
- Use a thread pool to manage worker threads efficiently.

## Technologies Used

- Java
- ExecutorService
- Callable and Future
- Java File I/O
- Collections Framework
- Multithreading and Concurrency

## Project Structure

```text
MultithreadedFileSearch/
├── MultithreadedFileSearch.java
├── README.md
└── searchfiles/
    ├── file1.txt
    └── file2.txt
```

## Features

- Accepts a keyword from the user.
- Searches all `.txt` files in the `searchfiles` directory.
- Performs case-insensitive keyword matching.
- Displays matching lines with file names and line numbers.
- Uses a fixed thread pool for concurrent processing.
- Compares sequential and multithreaded execution times.
- Handles missing directories and file-reading errors.

## How to Run

### Step 1: Verify Java Installation

```bash
java -version
javac -version
```

### Step 2: Create the Search Directory

Create a folder named `searchfiles` in the same directory as `MultithreadedFileSearch.java`.

Create the following sample files.

**file1.txt**

```text
Java is a programming language.
Multithreading improves performance.
Java supports concurrent programming.
```

**file2.txt**

```text
Python is also a programming language.
Java supports multithreading.
File searching is useful.
```

### Step 3: Compile the Program

```bash
javac MultithreadedFileSearch.java
```

### Step 4: Run the Program

```bash
java MultithreadedFileSearch
```

### Step 5: Enter a Keyword

```text
Enter keyword to search: Java
```

## Sample Output

```text
Enter keyword to search: Java

Files searched: 2
Worker threads: 2

Matching lines:
file1.txt | Line 1 | Java is a programming language.
file1.txt | Line 3 | Java supports concurrent programming.
file2.txt | Line 2 | Java
