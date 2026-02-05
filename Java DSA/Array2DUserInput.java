import java.util.Scanner;
public class Array2DUserInput {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        //User Input by Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers for inserting in 2D Array: ");
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        //Printing 2D Array
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
