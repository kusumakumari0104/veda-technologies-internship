# Build a Multithreaded Number Processor

## Description
This project demonstrates how to process a large numerical task using Java multithreading. It compares the execution time of a single-threaded implementation with a multithreaded implementation.

## Objective
To understand basic multithreading, concurrent execution, and performance comparison in Java.

## Technologies Used
- Java
- Java Threads
- ExecutorService
- Future
- System.nanoTime()

## Features
- Performs numerical processing using a single thread.
- Divides a large task into independent ranges.
- Uses multiple threads to process the ranges concurrently.
- Calculates and combines partial results.
- Measures execution time for both implementations.
- Compares the results to verify correctness.
- Demonstrates thread safety by avoiding shared mutable state.

## Program Logic
1. Initialize the number range.
2. Calculate the sum of squares using a single thread.
3. Divide the number range into smaller independent ranges.
4. Submit each range to a thread pool.
5. Calculate partial sums concurrently.
6. Combine the partial sums into the final result.
7. Measure and compare execution times.

## How to Run

### Step 1: Save the file
Save the Java source code as `MultithreadedNumberProcessor.java`.

### Step 2: Compile the program
```bash
javac MultithreadedNumberProcessor.java
```

### Step 3: Execute the program
```bash
java MultithreadedNumberProcessor
```

## Sample Output
```text
Number Processor Results
------------------------
Single-threaded sum: 333333383333335000000
Single-threaded time: [execution time] ms

Multithreaded sum: 333333383333335000000
Multithreaded time: [execution time] ms

Both results are correct and equal.
```

*Note: Execution times and the final performance comparison depend on your computer.*

## Concepts Learned
- Multithreading and concurrency
- Thread pools using `ExecutorService`
- Task results using `Future`
- Dividing work into independent ranges
- Measuring execution time
- Avoiding shared mutable state
- Comparing sequential and concurrent processing

## Conclusion
This project demonstrates how Java multithreading can divide a large numerical task among multiple threads. It verifies that both implementations produce the same result and compares their execution times to understand the performance benefits and limitations of concurrent processing.
