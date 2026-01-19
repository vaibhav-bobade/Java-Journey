import java.util.Scanner;
public class Scanner2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Rows: ");
        int rows = sc.nextInt();
        System.out.print("Input Colums: ");
        int col = sc.nextInt();

        int[][] arr= new int[rows][col];

        System.out.println("Input Array Elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Input Rows: 3
// Input Colums: 3
// Input Array Elements: 
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9

// 1 2 3
// 4 5 6
// 7 8 9