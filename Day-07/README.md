# Prime Number Analysis

## Description

This Java program determines whether a given number is a **prime number** and generates all prime numbers within a specified range.

It uses loops, conditional statements, methods, and mathematical logic to efficiently check prime numbers.

## Objective

- To understand prime numbers.
- To practice Java loops and conditional statements.
- To implement mathematical logic.
- To generate prime numbers within a given range.
- To improve algorithmic thinking.

## Features

- Checks whether a number is prime.
- Generates all prime numbers between two numbers.
- Handles numbers less than `2`.
- Uses an optimized prime-checking method.
- Validates the given range.

## Technologies Used

- **Programming Language:** Java
- **Concepts:** Methods, Loops, Conditional Statements, Scanner, Mathematical Logic

## Algorithm

### Prime Number Checking

1. Read a number from the user.
2. If the number is less than `2`, it is not prime.
3. Start checking divisibility from `2`.
4. Check divisors only up to the square root of the number.
5. If the number is divisible by any divisor, it is not prime.
6. Otherwise, it is a prime number.

### Range-Based Prime Generation

1. Read the starting number.
2. Read the ending number.
3. Check every number in the given range.
4. Use the `isPrime()` method for each number.
5. Display all prime numbers found.

## Source Code

Save the program as:

```text
PrimeNumberAnalysis.java
