//Program for checking Prime Numbers by User Input

import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Checking Even or Odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number "+num+ " is Even");
        }
        else{
            System.out.println("Number "+num+ " is Odd");
        }
        sc.close();
    }
}