/*
Question 1 : Print the number of 7’s that are in the 2d array. 
Example : 
Input - int[][] array = { {4,7,8},{8,8,7},{5,7,7} }; 
Output - 2
*/

public class Array2DQ1 {
    public static int countDigit(int mat[][], int digit){
        int count = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == digit){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] mat = {{4,7,8},{8,8,7},{5,7,7}};
        System.out.println(countDigit(mat, 7));  //4
    }
}