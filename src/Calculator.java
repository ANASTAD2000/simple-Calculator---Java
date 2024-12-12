import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;
        int numForFactorial;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^) - Exponentiation");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Factorial (!)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt();

            if (choice != 8) {
                if (choice == 6) {
                    System.out.println("\nYou have chosen the Square Root operation.");
                    System.out.println("The square root of the number you provide will be calculated.");
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + squareRoot(num1));
                } else if (choice == 7) {
                    System.out.println("\nYou have chosen the Factorial operation.");
                    System.out.println("The factorial of the number you provide will be calculated.");
                    System.out.print("Enter a number for factorial: ");
                    numForFactorial = scanner.nextInt();
                    System.out.println("Result: " + factorial(numForFactorial));
                } else {
                    System.out.print("\nEnter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();

                    switch (choice) {
                        case 1:
                            System.out.println("\nResult: " + addition(num1, num2));
                            break;
                        case 2:
                            System.out.println("\nResult: " + subtraction(num1, num2));
                            break;
                        case 3:
                            System.out.println("\nResult: " + multiplication(num1, num2));
                            break;
                        case 4:
                            System.out.println("\nResult: " + division(num1, num2));
                            break;
                        case 5:
                            System.out.println("\nResult: " + power(num1, num2));
                            break;
                        default:
                            System.out.println("\nInvalid choice. Please try again.");
                    }
                }
            }

        } while (choice != 8);

        System.out.println("\nExiting the program... Thank you for using Simple Calculator!");
        scanner.close();
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("\nError: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("\nError: Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("\nError: Factorial is not defined for negative numbers.");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
