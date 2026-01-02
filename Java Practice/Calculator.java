import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of (a) :");
        int a = sc.nextInt();
        System.out.print("Enter the value of (b) :");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        double div = a/b;
        int mod = a%b;
        System.out.println("Addition is :" + add);
        System.out.println("Substraction is :"+ sub);
        System.out.println("Multiplication is :" + multi);
        
        if(b == 0){
            System.out.println("Invalid Division");
            System.out.println("Invalid Modulo");
        }
        else{
            System.out.println("Division is :" + div);
            System.out.println("Modulo is :" + mod);
        }
        sc.close();
    }
}