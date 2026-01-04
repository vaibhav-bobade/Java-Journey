public class XPattern {
    public static void main(String[] args) {
        int n = 10;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( i==j || i+j==n+1 || i==1&&j<8 || i==n&&j<8 || j==1 || j==n ){
                    System.out.print(" *");
                }
                else{
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
    }
}
