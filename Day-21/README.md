
# Day 21: Build a Stack-Based Undo System

## Description
Implement a simple text editor simulation in Java where recent text changes can be undone using a stack.

## Objective
Understand stack-based state management and learn how to implement undo functionality using a stack.

## Tools Used
- Java
- Deque
- ArrayDeque
- Scanner
- StringBuilder

## Features
- Add text to the editor
- View the current text
- Undo the most recent change
- Support multiple undo operations
- Handle invalid choices
- Display a message when there is nothing to undo

## How to Run

1. Save the program as `Day21.java`.
2. Compile the Java program:

   ```bash
   javac Day21.java
   ```

3. Run the program:

   ```bash
   java Day21
   ```

## Sample Output

```text
--- Text Editor ---
1. Add text
2. Undo
3. View text
4. Exit

Enter your choice: 1
Enter text to add: Hello
Text added successfully.

Enter your choice: 1
Enter text to add: World
Text added successfully.

Enter your choice: 3
Current text: HelloWorld

Enter your choice: 2
Undo successful.

Enter your choice: 3
Current text: Hello
```

## Concepts Learned
- Stack data structure
- LIFO (Last In, First Out)
- Java Deque interface
- ArrayDeque collection
- State management
- Undo functionality
- Exception handling

## Interview Questions

### 1. What is LIFO?
LIFO stands for Last In, First Out. The last element added to a stack is the first element removed.

### 2. Why can a stack implement undo functionality?
A stack stores previous states, allowing the most recent change to be undone first.

### 3. What is the difference between a stack and a queue?
A stack follows LIFO, whereas a queue follows FIFO (First In, First Out).

### 4. Why use Deque in Java?
Deque supports insertion and removal at both ends and can be used as a stack with `push()` and `pop()`.

## Conclusion
This project demonstrates how a stack can be used to implement undo functionality in a simple text editor. It helps develop an understanding of Java collections and stack-based state management.

---
**Day 21 completed — Java Programming Track**
