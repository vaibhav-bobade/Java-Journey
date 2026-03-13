 class StudentGetSet {
    private String name;
    private int rollNo;
    private int marks;

    public void setName(String n){
        name = n;
    }
    public void setRollNO(int roll){
        rollNo = roll;
    }
    public void setMarks(int m){
        if(m>=0 && m<=100){
            marks = m;
        }
        else{
            System.out.println("Enter Valid Marks..");
        }
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
public class StudentGetterSetter{
    public static void main(String[] args) {
        StudentGetSet st = new StudentGetSet();

        st.setName("Vaibhav");
        st.setRollNO(21);
        st.setMarks(75);

        System.out.println("Student name: " + st.getName());
        System.out.println("Student Roll No.: " + st.getRollNo());
        System.out.println("Student Marks: " + st.getMarks());
    }
}