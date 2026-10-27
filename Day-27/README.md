
# Implement a Thread-Safe Counter

## Description
Create a counter updated by multiple threads and demonstrate the difference between unsafe and thread-safe implementations in Java.

## Objective
Understand race conditions and synchronization in multithreaded programming.

## Tools and Technologies
- Java
- Threads
- synchronized keyword
- AtomicInteger

## Features
- Implements an unsafe counter.
- Implements a thread-safe counter using `synchronized`.
- Implements a thread-safe counter using `AtomicInteger`.
- Demonstrates race conditions.
- Compares the performance of different counter implementations.

## How It Works
1. Creates 10 threads.
2. Each thread increments the counter 100,000 times.
3. Calculates the expected count of 1,000,000.
4. Tests unsafe, synchronized, and atomic counters.
5. Displays the final counts and execution times.

## How to Run

### Compile the Program
```bash
javac ThreadSafeCounter.java
```

### Run the Program
```bash
java ThreadSafeCounter
```

## Sample Output
```text
Expected Count: 1000000

--- Counter Results ---
Unsafe Counter: (may be less than 1000000)
Synchronized Counter: 1000000
Atomic Counter: 1000000

--- Performance Comparison ---
Unsafe Counter: (varies) ms
Synchronized Counter: (varies) ms
Atomic Counter: (varies) ms
```

**Note:** The unsafe counter's result and execution times may vary on each run.

## Interview Questions

### 1. What is a race condition?
A race condition occurs when multiple threads access and modify shared data concurrently, potentially producing incorrect results.

### 2. What does `synchronized` do?
It allows only one thread at a time to execute a synchronized method on the same object.

### 3. What is `AtomicInteger`?
`AtomicInteger` is a Java class that provides thread-safe atomic integer operations.

### 4. When should atomic classes be used?
Atomic classes are useful for thread-safe updates to individual variables without explicit synchronization.

## Conclusion
This program demonstrates the importance of thread safety in concurrent applications. The synchronized and atomic implementations ensure correct counter updates, while the unsafe implementation may lose increments due to race conditions.
