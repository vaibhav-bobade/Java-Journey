package JDBC;

import java.sql.*;

public class JdbcDataUpdateDemo {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "----";
        String query = """
                update employees\s
                set salary = 600000.00\s
                where id = 2""";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");
        } catch(ClassNotFoundException e){
            System.out.println("Driver NOT loaded.");
        }

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(query);

            if(rowsAffected > 0){
                System.out.println("Data Update Successfully, " + rowsAffected + " Rows affected.");
            }

            stmt.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
/*output

Driver loaded.
Data Update Successfully, 1 Rows affected.
 */