import java.util.Scanner;

public class Main {

    // Function for addition
    public static double addition(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtraction(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiplication(double a, double b) {
        return a * b;
    }
    // Function for division
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return NaN (Not a Number) if division by zero
        }
        return a / b;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice != 5) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
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
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }

        } while (choice != 5);

        System.out.println("Exiting the program...");
        scanner.close();
    }
}
