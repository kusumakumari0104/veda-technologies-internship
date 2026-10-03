# Number Guessing Game

## Description

The **Number Guessing Game** is a simple console-based Java application. The computer generates a random number between **1 and 100**, and the user tries to guess the number.

After each guess, the program provides a hint:

- If the guess is too low, it asks the user to try a higher number.
- If the guess is too high, it asks the user to try a lower number.
- If the guess is correct, the program displays a congratulatory message and the total number of attempts.

## Objective

The main objectives of this program are:

- Learn random number generation in Java.
- Understand `if-else` conditions.
- Learn how to use loops.
- Take user input using `Scanner`.
- Count the number of attempts.

## Tools / Technologies

- Java
- `Random`
- `Scanner`
- `if-else`
- `do-while` loop

## Features

- Random number generation between 1 and 100.
- User guessing mechanism.
- Higher/lower hints.
- Attempt counter.
- Game continues until the correct number is guessed.

## How It Works

1. The program generates a random number between 1 and 100.
2. The user enters a guess.
3. The program compares the guess with the random number.
4. If the guess is smaller, it displays **"Too low!"**.
5. If the guess is larger, it displays **"Too high!"**.
6. If the guess is correct, it displays **"Congratulations!"**.
7. The total number of attempts is displayed.

## Source Code

```java
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            }
            else if (guess > secretNumber) {
                System.out.println("Too high! Try a lower number.");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}
