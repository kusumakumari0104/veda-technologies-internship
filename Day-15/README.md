# Create a Payment System Using Interfaces

## Description
Design a payment application using a Java interface implemented by multiple payment methods such as Card, UPI, and Wallet.

## Objective
- Understand Java interfaces.
- Learn loosely coupled design.
- Implement multiple payment methods.
- Understand method overriding and runtime polymorphism.
- Validate payment amounts.

## Tools Used
- Java
- JDK
- VS Code / IntelliJ IDEA / Eclipse

## Features
- Payment interface
- Card payment implementation
- UPI payment implementation
- Wallet payment implementation
- Payment processing method
- Payment amount validation

## Program Structure

| Class / Interface | Description |
|---|---|
| `Payment` | Defines the common payment method |
| `CardPayment` | Implements card payment |
| `UPIPayment` | Implements UPI payment |
| `WalletPayment` | Implements wallet payment |
| `PaymentSystem` | Executes the payment program |

## How to Run

**Step 1:** Save the Java code as `PaymentSystem.java`.

**Step 2:** Compile the program.

```bash
javac PaymentSystem.java
```

**Step 3:** Run the program.

```bash
java PaymentSystem
```

## Sample Output

```text
Processing Card Payment...
Payment of Rs. 1500.0 completed using Card.

Processing UPI Payment...
Payment of Rs. 1500.0 completed using UPI.

Processing Wallet Payment...
Payment of Rs. 
