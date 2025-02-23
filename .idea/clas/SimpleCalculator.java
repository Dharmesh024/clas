import java.util.Scanner;

// Step 1: Define Calculator class
class Calculator {
    // Step 2: Define Methods for Operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return Double.NaN; // Return NaN (Not a Number)
        }
        return a / b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        // Step 3: Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Step 4: Create an instance of Calculator
        Calculator calc = new Calculator();

        // Step 5: Take user input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Step 6: Perform operation using switch-case
        switch (operation) {
            case '+':
                result = calc.add(num1, num2);
                break;
            case '-':
                result = calc.subtract(num1, num2);
                break;
            case '*':
                result = calc.multiply(num1, num2);
                break;
            case '/':
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation! Please choose +, -, *, or /.");
                return; // Exit the program
        }

        // Step 7: Display the result
        System.out.println("Result: " + result);

        // Step 8: Close the scanner
        scanner.close();
    }
}
