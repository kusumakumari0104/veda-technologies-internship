# Day 09 - Simple Banking Account Class

## Description
This project implements a simple banking account using Java. It allows users to view account details, deposit money, withdraw money, and check their current balance.

## Objectives
- Understand classes and objects.
- Learn about constructors and methods.
- Implement encapsulation using private variables.
- Apply conditional statements for transaction validation.

## Features
- Create a bank account.
- Store account number, holder name, and balance.
- Deposit money into the account.
- Withdraw money from the account.
- Display the current balance.
- Validate deposit and withdrawal amounts.

## Source Code

**File Name:** `Main.java`

```java
class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance >= 0 ? balance : 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("1234567890", "Kusuma", 5000);

        System.out.println("----- Bank Account Details -----");
        account.displayBalance();

        System.out.println("\n----- Deposit -----");
        account.deposit(2000);
        account.displayBalance();

        System.out.println("\n----- Withdrawal -----");
        account.withdraw(1500);
        account.displayBalance();
    }
}
```

## How to Execute

### Step 1: Compile the program

```bash
javac Main.java
```

### Step 2: Run the program

```bash
java Main
```

## Sample Output

```text
----- Bank Account Details -----
Account Number: 1234567890
Holder Name: Kusuma
Current Balance: Rs. 5000.0

----- Deposit -----
Deposited: Rs. 2000.0
Account Number: 1234567890
Holder Name: Kusuma
Current Balance: Rs. 7000.0

----- Withdrawal -----
Withdrawn: Rs. 1500.0
Account Number: 1234567890
Holder Name: Kusuma
Current Balance: Rs. 5500.0
```

## Concepts Covered
- Object-Oriented Programming (OOP)
- Classes and Objects
- Constructors
- Encapsulation
- Private Variables
- Methods
- Conditional Statements
- Input Validation

## Conclusion
This project demonstrates the basic principles of Java Object-Oriented Programming through a simple banking application. It provides deposit, withdrawal, and balance-checking operations with transaction validation.

---

**Track:** AI Adireddy - Java Programming Track

**Project:** Simple Banking Account Class

**Day:** 09
