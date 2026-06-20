package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2{
    int id;
    String name;
    int age;
    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
public class Comparator1 {
    public static void main(String[] args) {
        ArrayList<Student2> students = new ArrayList<>();
        students.add(new Student2(15, "BB", 16));
        students.add(new Student2(10, "CB", 22));
        students.add(new Student2(2, "AA", 18));
        students.add(new Student2(19, "DB", 21));
        students.add(new Student2(5, "EA", 17));

        System.out.println("==== Before sorting Students list ====");
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("==== After sorting Students list by Id ====");
        Comparator<Student2> stIdComparator = (Student2 o1, Student2 o2) -> Integer.compare(o1.id, o2.id);
        Collections.sort(students, stIdComparator);
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("==== After sorting Students list by Name ===");
        Comparator<Student2> stNameComparator = (Student2 obj1, Student2 obj2) -> obj1.name.compareTo(obj2.name);
        Collections.sort(students, stNameComparator);
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("==== After sorting Students list by Age ===");
        Comparator<Student2> stAgeComparator = (Student2 obj1, Student2 obj2) -> Integer.compare(obj1.age, obj2.age);
        Collections.sort(students, stAgeComparator);
        students.forEach(System.out::println);
    }
}

/* == Output ==
==== Before sorting Students list ====
Student [id=15, name=BB, age=16]
Student [id=10, name=CB, age=22]
Student [id=2, name=AA, age=18]
Student [id=19, name=DB, age=21]
Student [id=5, name=EA, age=17]

==== After sorting Students list by Id ====
Student [id=2, name=AA, age=18]
Student [id=5, name=EA, age=17]
Student [id=10, name=CB, age=22]
Student [id=15, name=BB, age=16]
Student [id=19, name=DB, age=21]

==== After sorting Students list by Name ===
Student [id=2, name=AA, age=18]
Student [id=15, name=BB, age=16]
Student [id=10, name=CB, age=22]
Student [id=19, name=DB, age=21]
Student [id=5, name=EA, age=17]

==== After sorting Students list by Age ===
Student [id=15, name=BB, age=16]
Student [id=5, name=EA, age=17]
Student [id=2, name=AA, age=18]
Student [id=19, name=DB, age=21]
Student [id=10, name=CB, age=22]

 */