import java.util.Scanner;

public class TaxRate {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        float userIncome;
        
        System.out.println("Enter income amount: ");
        userIncome = scnr.nextFloat();

        if (userIncome > 0 && userIncome < 500) {
            System.out.println("Tax rate is 10%");
            System.out.print("Tax amount is " + (.1 * userIncome));
        } 
        else if (userIncome >= 500 && userIncome < 1500) {
            System.out.println("Tax rate is 15%");
            System.out.print("Tax amount is " + (.15 * userIncome));
        }
        else if (userIncome >= 1500 && userIncome < 2500) {
            System.out.println("Tax rate is 20%"))
            System.out.print("Tax amount is " + (.20 * userIncome));
        }
        else if (userIncome >= 2500) {
            System.out.println("Tax rate is 30%");
            System.out.print("Tax amount is " + (.3 * userIncome));
        }
        else {
            System.out.print("Error, please try again.");
            System.exit(1)
        }
    }