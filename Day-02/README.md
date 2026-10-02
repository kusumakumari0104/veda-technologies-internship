# Student Marks Calculator

## Description

The **Student Marks Calculator** is a Java program that accepts marks for multiple subjects and calculates the student's:

- Total marks
- Percentage
- Grade

The program also validates the entered marks to ensure that each mark is between **0 and 100**.

## Objective

The main objective of this program is to practice basic Java programming concepts such as:

- Variables
- Arrays
- Loops
- Conditional statements
- Methods
- User input using `Scanner`
- Input validation

## Features

- Accepts marks for multiple subjects
- Stores marks using an array
- Validates marks between 0 and 100
- Calculates total marks
- Calculates percentage
- Calculates grade
- Displays the final result

## Grade Criteria

| Percentage | Grade |
|------------|-------|
| 90–100 | A |
| 80–89 | B |
| 70–79 | C |
| 60–69 | D |
| 50–59 | E |
| Below 50 | F |

## Technologies Used

- **Programming Language:** Java
- **JDK:** Java Development Kit
- **Input:** `Scanner`

## Program Structure

### `calculateTotal()`

Calculates the total marks stored in the array.

### `calculatePercentage()`

Calculates the percentage using:

```text
Percentage = (Total Marks / Maximum Marks) × 100
