import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking User Input
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your expected salary: ");
        double salary = sc.nextDouble();
        //Printing to Console with User Input
        System.out.println();
        System.out.println("User Profile");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Expected Salary: " + salary);
        sc.close();
    }
}