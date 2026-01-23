public class SubArray {
    public static void subArray(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }count++;
                System.out.println();
            }System.out.println();
            
        }System.out.println("The total number of SubArrays are: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subArray(arr);
    }
}