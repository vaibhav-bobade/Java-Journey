public class TernaryOperatot {
    public static void main(String[] args) {
        int a =10, b =20, c =30;
        //Comparing three numbers with Ternary Operator
        int result = (a>b)? (a>c? a : c) : (b>c? b : c);
        System.out.println("Greater number is: " + result);
    }
}
