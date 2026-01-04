import java.util.*;
public class Calculatorpractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers for Operation");
        System.out.print("Enter Number x: ");
        int x = sc.nextInt();
        System.out.print("Enter Number y: ");
        int y = sc.nextInt();

        System.out.println("     ");
        System.out.println("1: Addition'+'  ");
        System.out.println("2: Subtractionn '-' ");
        System.out.println("3: Multiplication'*'  ");
        System.out.println("4: Division'/'  ");
        System.out.println("5: Modulo'%'  ");
        System.out.print("Enter the number of Choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
            System.out.println("The Addition of given two Numbers is: "+ (x+y));
            break;

            case 2:
            System.out.println("The Subtraction of given two Numbers is: "+ (x-y));
            break;

            case 3:
            System.out.println("The Multiplication of given two Numbers is: "+ (x*y));
            break;

            case 4:
            if(y != 0){
                System.out.println("The Division of given two Numbers is: "+ ((double)x/y));
            }else{ System.out.println("Cant Divide number by 0");
             }
            break;
            
            case 5:
            if(y != 0){
                System.out.println("The Modulo of given two Numbers is: "+ (x%y));
            }else{System.out.println("Y can't be 0");
             } 
            

        sc.close();
    }
    }
}