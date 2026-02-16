public class SumOfNnum {
    public static int addN(int n){
        if(n == 0){
            return 0;
        }
        int sum = n + addN(n -1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(addN(5));
    }
}
