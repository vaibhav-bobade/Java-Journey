class Student{
    private String name;
    private int rollNo;
    private int marks;
    
    public Student(String n, int rn, int m){
        name = n;
        rollNo = rn;
        marks = m;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getMarks(){
        return marks;
    }

}
public class Constructor1{
    public static void main(String[] args) {
        Student st = new Student("Vaibhav", 21, 75);

        System.out.println(st.getName());
        System.out.println(st.getRollNo());
        System.out.println(st.getMarks());
    }
}