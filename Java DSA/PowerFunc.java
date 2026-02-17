public class PowerFunc{
    public static int powOf(int x, int n){
        if(n == 0){
            return 1;
        }
        return x*powOf(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(powOf(2, 4));
    }
}