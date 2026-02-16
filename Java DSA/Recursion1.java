public class Recursion1 {
    public static void rec(int n){
        if(n>0){
            System.out.print(n + " ");
            rec(n-1);
        }
    }
    public static void main(String[] args) {
        rec(10);
    }
}