package Collection_Framework;

import java.util.ArrayList;

public  class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.size()); //5

        for(int i = 6; i <= 10; i++){
            list.add(i * 10);
        }
        System.out.println(list.size()); //10

        System.out.println(list);
        // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        list.add(1, 15);
        System.out.println(list);
        // [10, 15, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        int i = list.get(0);
        System.out.println(i); // 10

        list.set(0, 11);
        System.out.println(list); // [11, 15, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        System.out.println(list.contains(100)); //true
        list.remove(10);
        System.out.println(list); //[11, 15, 20, 30, 40, 50, 60, 70, 80, 90]

        System.out.println(list.isEmpty()); //false
        list.clear();
        System.out.println(list.isEmpty()); //true
    }
}