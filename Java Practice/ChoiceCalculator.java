import java.util.Scanner;

public class ChoiceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulo (%)");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + ((double) a / b));
                } else {
                    System.out.println("Error! Division by zero not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result = " + (a % b));
                } else {
                    System.out.println("Error! Modulo by zero not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}
