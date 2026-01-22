public class PairsArray{
    public static int arraypairs(int array[]){
        int count=0;
        for(int i=0;i<array.length;i++){
            int current = array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+current+","+array[j]+")");
                count++;
            }System.out.println();
        }
        return count;
    }
    public static void main(String args[]){
        int array[]= {1,2,3,4,5,6,7,8,9};
        int count =arraypairs(array);
         System.out.print("The Count of pairs is: "+ count);
    }
}