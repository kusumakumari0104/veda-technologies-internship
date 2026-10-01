import java.util.Scanner;
public class Calculator {
    // Addition
    static double add(double a, double b) {
        return a + b;
    }
    // Subtraction
    static double subtract(double a, double b) {
        return a - b;
    }
    // Multiplication
    static double multiply(double a, double b) {
        return a * b;
    }
    // Division
    static double divide(double a, double b) {
        return a / b;
    }
    // Modulus
    static double modulus(double a, double b) {
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Command-Line Calculator =====");
        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.println("\nChoose an operation:");
            System.out.println("+  Addition");
            System.out.println("-  Subtraction");
            System.out.println("*  Multiplication");
            System.out.println("/  Division");
            System.out.println("%  Modulus");
            System.out.print("Enter operation: ");
            char operator = sc.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("Result = " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result = " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result = " + multiply(num1, num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result = " + divide(num1, num2));
                    }
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot find modulus with zero.");
                    } else {
                        System.out.println("Result = " + modulus(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
            }
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        }
        sc.close();
    }
}
