import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;
        
        System.out.println("Enter 10 grades:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                System.out.print("Enter grade " + i + ": ");
                scanner.next();
            }
            
            double grade = scanner.nextDouble();
            
            sum += grade;
            
            if (grade > maximum) {
                maximum = grade;
            }
            
            if (grade < minimum) {
                minimum = grade;
            }
        }
        
        double average = sum / 10;
        
        System.out.println("\nClass Statistics:");
        System.out.println("* Average: " + average);
        System.out.println("* Maximum: " + maximum);
        System.out.println("* Minimum: " + minimum);
        
        scanner.close();
    }
}