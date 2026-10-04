package JDBC;

import java.sql.*;

public class JdbcDataDeleteDemo{
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class driver loaded.");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String query = "DELETE FROM employees WHERE id = 5";
            int rowsAffected = stmt.executeUpdate(query);

            if(rowsAffected > 0){
                System.out.println("Employee deleted successfully, " + rowsAffected + " rows affected.");
            }

            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*
Class driver loaded.
Employee deleted successfully, 1 rows affected.
 */