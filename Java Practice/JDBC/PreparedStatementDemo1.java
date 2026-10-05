package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo1 {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/testjdbc";
        String user="root";
        String password = "root";

        String query1 = "select * from employees where id = ?";

        try(Connection conn = DriverManager.getConnection(url,user,password);)
        {
            PreparedStatement ps = conn.prepareStatement(query1);
            ps.setInt(1,1);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                int salary = rs.getInt("salary");

                System.out.println("ID = " + id);
                System.out.println("Name = " + name);
                System.out.println("Job Title = " + job_title);
                System.out.println("Salary = " + salary);
            }

            rs.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
/*
ID = 1
Name = Ram
Job Title = Software Engineer
Salary = 1500000

 */