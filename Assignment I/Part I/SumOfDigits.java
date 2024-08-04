import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Enabling the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        
        // Closing the scanner after reading input
        scanner.close();
        
        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = number;
        
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit from number
        }
        
        
        System.out.println("The sum of digits in " + originalNumber + " is " + sum + ".");
    }
}
