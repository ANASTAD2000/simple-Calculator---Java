import java.util.Scanner;

public class  Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice != 6) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                if (choice == 5) {
                    System.out.println("Power Operation: The first number will be raised to the power of the second number.");
                    System.out.print("Enter the second number (exponent): ");
                } else {
                    switch (choice) {
                        case 1:
                            System.out.println("Addition: The two numbers will be added.");
                            break;
                        case 2:
                            System.out.println("Subtraction: The second number will be subtracted from the first.");
                            break;
                        case 3:
                            System.out.println("Multiplication: The two numbers will be multiplied.");
                            break;
                        case 4:
                            System.out.println("Division: The first number will be divided by the second.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }
                    System.out.print("Enter the second number: ");
                }

                num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + addition(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtraction(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiplication(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + division(num1, num2));
                        break;
                    case 5:
                        System.out.println("Result: " + power(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } while (choice != 6);

        System.out.println("Exiting the program...");
        scanner.close();
    }

    // Addition function
    public static double addition(double a, double b) {
        return a + b;
    }

    // Subtraction function
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Multiplication function
    public static double multiplication(double a, double b) {
        return a * b;
    }

    // Division function
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    // Power function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
