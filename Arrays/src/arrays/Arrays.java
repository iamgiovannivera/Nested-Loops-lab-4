import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = new String[5];
        double[][] grades = new double[5][5];

        // Enter student names and grades
        for (int r = 0; r < 5; r++) {
            System.out.print("Enter the name of student " + (r + 1) + ": ");
            students[r] = input.nextLine();  

            System.out.println("Enter 5 grades for " + students[r] + ":");
            for (int c = 0; c < 5; c++) {
                grades[r][c] = input.nextDouble();
            }
            input.nextLine(); // Consume newline
        }

        // Display student names and grades
        System.out.println("\nStudent Grades:");
        System.out.println("Name\tGrade1\tGrade2\tGrade3\tGrade4\tGrade5\tAverage");

        for (int r = 0; r < 5; r++) {
            double totalGrades = 0;
            System.out.print(students[r] + "\t");

            for (int c = 0; c < 5; c++) {
                System.out.print(grades[r][c] + "\t");
                totalGrades += grades[r][c];
            }

            double average = totalGrades / 5;
            System.out.println(average);
        }

        input.close(); // Close scanner
    }
}
