import java.util.Scanner;

public class StudentMarks {

    // Method to calculate total marks
    static int calculateTotal(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Method to calculate percentage
    static double calculatePercentage(int total, int numberOfSubjects) {
        return (double) total / (numberOfSubjects * 100) * 100;
    }

    // Method to calculate grade
    static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Accept marks with validation
        for (int i = 0; i < n; i++) {

            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                int mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                }
            }
        }

        // Calculate total
        int total = calculateTotal(marks);

        // Calculate percentage
        double percentage = calculatePercentage(total, n);

        // Calculate grade
        char grade = calculateGrade(percentage);

        // Display result
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Total Marks: " + total + "/" + (n * 100));
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
