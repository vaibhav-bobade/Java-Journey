import java.util.*;
class PalindromeLC9 {
    public static boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        else if(x < 0){
            return false;
        }
        int n =x;
        int rev = 0;
        while(n > 0){
            int rem = n%10;
            rev = (rev * 10)+rem;
            n = n/10;
        }
        return rev == x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check Palindrome: ");
        int x = sc.nextInt();
        boolean result = isPalindrome(x);

        if(result){
            System.out.println(result);
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
