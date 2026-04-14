package Exception_Handling;

import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Starts.");
        try {
            System.out.println("Enter Number for Numerator: ");
            int a =  sc.nextInt();
            System.out.println("Enter Number for Denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result is: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Enter non zero number in denominator");
        }
        System.out.println("Program Ends.");
    }
}
/*
Output
1.
Program Starts.
Enter Number for Numerator:
1000
Enter Number for Denominator:
10
Result is: 100
Program Ends.

2.
Program Starts.
Enter Number for Numerator:
        100
Enter Number for Denominator:
        0
Enter non zero number in denominator
Program Ends.
*/
