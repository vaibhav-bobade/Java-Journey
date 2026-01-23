public class SubArraywithSum {
    public static void subArray(int[] arr){
        int count = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }count++;
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                System.out.println();
            }System.out.println();
            
        }System.out.println("The total number of SubArrays are: " + count);
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subArray(arr);
    }    
}

/*
--------------Output-------------- 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

2
2 3
2 3 4
2 3 4 5

3
3 4
3 4 5

4
4 5

5

The total number of SubArrays are: 15
Max Sum: 15
*/