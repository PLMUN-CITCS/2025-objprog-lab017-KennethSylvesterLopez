import java.util.Scanner;

public class StudentGradeCalculator {
    // Main method
    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();

        // Calculate the grade
        String grade = calculateGrade(score);

        // Display the result
        System.out.println("The calculated grade is: " + grade);
    }

    // Method to get the student's score
    public static double getStudentScore() {
        Scanner input = new Scanner(System.in);
        double score = -1;

        // Loop until valid input is provided
        while (true) {
            try {
                // Prompt the user to enter their score
                System.out.print("Enter your score: ");
                score = Double.parseDouble(input.nextLine());

                // Validate the score range
                if (score >= 0 && score <= 100) {
                    break; // Valid score, exit loop
                } else {
                    System.out.println("Please enter a valid score between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        
        return score;
    }

    // Method to calculate the grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
