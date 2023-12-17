import java.util.Scanner;

public class CurrencyConverter {

    private static final double USD_TO_INR = 83.04;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }

        double usdAmount = scanner.nextDouble();

        double inrAmount = convertToRupees(usdAmount);
        System.out.println(usdAmount + " USD is equal to " + inrAmount + " INR");

        scanner.close();
    }

    private static double convertToRupees(double usdAmount) {
        return usdAmount * USD_TO_INR;
    }
}
