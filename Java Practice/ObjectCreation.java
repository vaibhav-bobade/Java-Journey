class Student{
    String name;
    int id;
    String email;

    void playing(){
        System.out.println(name + " is playing");
    }
    void studying(){
        System.out.println(name + " is studying");
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Vaibhav";
        st1.id = 21;
        st1.email = "abc@gmail.com";

        System.out.println("Student name: "+ st1.name);
        System.out.println("Student ID: "+ st1.id);
        System.out.println("Student Email: "+ st1.email);
        st1.playing();
        st1.studying();

        System.out.println("-------------------------------------------");

        Student st2 = new Student();
        st2.name = "Arun";
        st2.id = 20;
        st2.email = "abcde@gmail.com";

        System.out.println("Student name: "+ st2.name);
        System.out.println("Student ID: "+ st2.id);
        System.out.println("Student Email: "+ st2.email);
        st2.playing();
        st2.studying();
    }
}