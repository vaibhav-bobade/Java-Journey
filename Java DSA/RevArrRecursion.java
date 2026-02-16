import java.util.Arrays;

public class RevArrRecursion {
    public static int[] revArr(int[] arr, int l, int r){
        if(l >= r){
            return arr;
        }
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        revArr(arr, l+1, r-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        revArr(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
