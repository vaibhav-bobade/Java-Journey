import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range till which you want Fibonacci Series: ");
        int num = sc.nextInt();
        fibonaccitill(num);
        sc.close();
    }

    public static void fibonaccitill(int num){
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=2; i<= num; i++){
            int c = a+b;
            if(c>=num){
                break;
            }
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}

// Output:
// Enter the range till which you want Fibonacci Series: 40
// 0 1 1 2 3 5 8 13 21 34 