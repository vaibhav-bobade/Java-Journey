import java.util.*;
public class Javafactorial{
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
           f=(f*i);
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial :");
        int n = sc.nextInt();
        System.out.print("The Factorial of the "+n+" is:"+ factorial(n));
        sc.close();
    }
}