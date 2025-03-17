import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", 
                          "July", "August", "September", "October", "November", "December"};
        double[] temperatures = new double[12];

        System.out.println("Enter the average temperature for each month:");
        for (int i = 0; i < 12; i++) {
            System.out.print(months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        scanner.nextLine();

        while (true) {
            System.out.print("\nEnter a month name to view its temperature or 'year' for yearly summary (or 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (input.equalsIgnoreCase("year")) {
                displayYearlySummary(months, temperatures);
            } else {
                displayMonthTemperature(months, temperatures, input);
            }
        }
        
        scanner.close();
    }

    public static void displayMonthTemperature(String[] months, double[] temperatures, String monthName) {
        int monthIndex = -1;

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                monthIndex = i;
                break;
            }
        }
        
        if (monthIndex != -1) {
            System.out.println(months[monthIndex] + ": " + temperatures[monthIndex] + "°");
        } else {
            System.out.println("Month not found. Please enter a valid month name.");
        }
    }

    public static void displayYearlySummary(String[] months, double[] temperatures) {
        System.out.println("\nYearly Temperature Summary:");
        System.out.println("---------------------------");
        
        double sum = 0;
        double highest = temperatures[0];
        double lowest = temperatures[0];
        int highestMonth = 0;
        int lowestMonth = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + ": " + temperatures[i] + "°");
            sum += temperatures[i];
            
            if (temperatures[i] > highest) {
                highest = temperatures[i];
                highestMonth = i;
            }
            
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
                lowestMonth = i;
            }
        }
        
        double average = sum / 12;
        
        System.out.println("\nYearly Average: " + average + "°");
        System.out.println("Highest Monthly Average: " + months[highestMonth] + " (" + highest + "°)");
        System.out.println("Lowest Monthly Average: " + months[lowestMonth] + " (" + lowest + "°)");
    }
}