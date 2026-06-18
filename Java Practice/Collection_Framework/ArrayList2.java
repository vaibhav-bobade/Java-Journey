package Collection_Framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list); //[1, 2, 3, 4, 5]

        for(Object o : list) {
            System.out.print(o + " ");
        }
        //1 2 3 4 5
        System.out.println();

        // Iterators allows Concurrent modification but failfast
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        //1 2 3 4 5
        System.out.println();

        //ArrayList provides special ListIterator, we can perform reverse traversall
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        //5 4 3 2 1
        System.out.println();
    }
}