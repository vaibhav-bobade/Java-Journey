import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number for Factorial: ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=number ; i++){
           factorial = factorial*i;
        }
        System.out.println("Factorial of Given Number is: "+ factorial);
        sc.close();
    }
}
