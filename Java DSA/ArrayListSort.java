import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(2,5,9,6,4,8));
        System.out.println("Before Sorting : " +  list);
        Collections.sort(list);
        System.out.println("After Sorting : " + list);
        // Before Sorting : [2, 5, 9, 6, 4, 8]
        //After Sorting : [2, 4, 5, 6, 8, 9]

        //reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Order : " +  list);
    }
}
