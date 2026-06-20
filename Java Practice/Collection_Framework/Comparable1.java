package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }
}
public class Comparable1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(15, "BB", 16));
        students.add(new Student(10, "CB", 22));
        students.add(new Student(2, "AA", 18));
        students.add(new Student(19, "DB", 21));
        students.add(new Student(5, "EA", 17));

        System.out.println("==== Before sorting Students list ====");
        students.forEach(System.out::println);
        System.out.println();
        System.out.println("==== After sorting Students list by Id ====");
        Collections.sort(students);
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

 */