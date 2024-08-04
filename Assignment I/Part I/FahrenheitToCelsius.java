import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Enter a Fahrenheit temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Closing the scanner after reading input
        scanner.close();
        
        // Formula to convert Fahrenheit To Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        
        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.\n", fahrenheit, celsius);
    
    }
}
