package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList3  {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }
        System.out.println(list); // [10, 20, 30, 40, 50]

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            //list.add(70); // this will give infinite code execution till memory full
        }
        // 10 20 30 40 50
        System.out.println();
        //We have CopyOnWriteArrayList for Concurrent modification

        CopyOnWriteArrayList<Integer> newList = new CopyOnWriteArrayList<>();
        newList.addAll(list);

//        for (int i = 0; i < newList.size(); i++) {
//            System.out.print(newList.get(i) + " ");
//            newList.add(70);
//        } this will also lead to infinite output

        Iterator<Integer> it = newList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
            newList.add(70);
        } // 10 20 30 40 50
        System.out.println();
        System.out.println(newList);
        // [10, 20, 30, 40, 50, 70, 70, 70, 70, 70]
    }
}