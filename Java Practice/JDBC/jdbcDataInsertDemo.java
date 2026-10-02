package JDBC;

import java.sql.*;

public class jdbcDataInsertDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        }
        catch(Exception e){
            System.out.println("Driver not able to Load: " + e.getMessage());
        }

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            //here we are adding data to DB so we did not need ResultSet here
            String query = "insert into employees(id, name, job_title, salary) values (3, 'Rohit', 'Application Developer', 1000000.00)";
            int rowsAffected = stmt.executeUpdate(query);

            if(rowsAffected > 0){
                System.out.println("Data Inserted Successfully. " + rowsAffected + " rows affected.");
            }
            else{
                System.out.println("Data Insert Failed. " + rowsAffected + " rows affected.");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}