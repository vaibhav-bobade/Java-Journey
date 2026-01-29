class Student5{
    String name;
    int id, age;

    public Student5(){
        System.out.println("Student Information");
    }
    public Student5(String name){
        this.name= name;
        this.id= 21;
        this.age=19;
    }
    public Student5(String name, int id, int age){
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
        Student5 st = new Student5("Vaibhav");
        st.show();
        System.out.println("--------------------------------------");

        Student5 st2 = new Student5("Ramesh",1234,18);
        st2.show();
    }
}