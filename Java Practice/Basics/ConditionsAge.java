import java.util.*;
public class ConditionsAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Age Validation for Voting ----");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("You are not Eligible to Vote");
        }
        else{
            System.out.println("You can Vote.");
        }
        sc.close();
    }
}
