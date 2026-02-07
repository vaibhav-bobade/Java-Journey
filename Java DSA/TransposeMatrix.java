import java.util.*;
public class TransposeMatrix {
    public static void transpose(int[][] mat){
        int row = mat.length, col = mat[0].length;
        int tMat[][] = new int[col][row];

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                tMat[j][i] = mat[i][j];
            }
        }
        System.out.println("Original Matrix: " + Arrays.deepToString(mat));
        System.out.println("Transpose Matrix: " + Arrays.deepToString(tMat));
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}};
        transpose(mat);
    }
}