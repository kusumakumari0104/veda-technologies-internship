
# Implement Custom Exception Handling in Java

## Description
Create a simple banking system using Java custom exceptions to handle insufficient balance, invalid account numbers, and invalid transaction amounts.

## Objective
Learn Java exception handling and application-specific errors by creating and handling custom exceptions.

## Technologies Used
- Java
- Object-Oriented Programming
- Exception Handling

## Features
- Deposit money into a bank account.
- Withdraw money from a bank account.
- Handle insufficient balance exceptions.
- Validate account numbers.
- Reject invalid transaction amounts.
- Display meaningful error messages.
- Use `try-catch-finally` for exception handling.

## Custom Exception Classes
1. `InsufficientBalanceException` – Handles withdrawals that exceed the available balance.
2. `InvalidAccountException` – Handles invalid account numbers.
3. `InvalidAmountException` – Handles zero or negative transaction amounts.

## Concepts Used
- Custom exceptions
- `try-catch` blocks
- `throw` keyword
- `throws` keyword
- `finally` block
- Classes and objects

## How to Run

### Step 1: Save the Java File
Save the program as `CustomExceptionHandling.java`.

### Step 2: Compile the Program
```bash
javac CustomExceptionHandling.java
```

### Step 3: Run the Program
```bash
java CustomExceptionHandling
```

## Sample Output
```text
Account Number: 101
Current Balance: Rs. 5000.0
Deposited: Rs. 2000.0
Withdrawn: Rs. 1500.0
Error: Invalid account number: 999
Bank transaction completed.
```

## Expected Learning Outcomes
- Understand custom exceptions in Java.
- Validate banking transactions.
- Handle application-specific errors.
- Write reliable Java programs.
- Understand checked and unchecked exceptions.

## Interview Questions
1. What is a custom exception in Java?
2. What is the difference between checked and unchecked exceptions?
3. What is the purpose of the `finally` block?
4. What is the difference between `throw` and `throws`?
5. When should `RuntimeException` be used?

## Conclusion
This project demonstrates custom exception handling in a banking system using Java. It improves understanding of error handling, transaction validation, and program reliability.
