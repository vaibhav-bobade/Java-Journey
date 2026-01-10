class Student{
    String name;
    int id, age;

    public Student(){
        System.out.println("Student Information");
    }
    public Student(String name){
        this.name= name;
        this.id= 21;
        this.age=19;
    }
    public Student(String name, int id, int age){
        this();
        this.name= name;
        this.id= id;
        this.age= age;
    }
    public void show(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Age: "+ age);
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        Student st = new Student("Vaibhav");
        st.show();
        System.out.println("--------------------------------------");

        Student st2 = new Student("Ramesh",1234,18);
        st2.show();
    }
}