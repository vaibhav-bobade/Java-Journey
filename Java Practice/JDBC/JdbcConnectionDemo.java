package JDBC;

import java.sql.*;

public  class JdbcConnectionDemo {
    public static void main(String[] args) {


        //step 1. Initialize Credentials
        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String username = "root";
        String password = "----";

        //step 2. Load the Driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println( e.getMessage() );
        }

        //step 3. Create Connection, Statement and ResultSet
        try{
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");

            //rs will give us rows of our DB bcz we executed that query
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_tile = rs.getString("job_title");
                double salary = rs.getDouble("salary");

                System.out.println("==============================");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Job Title: " + job_tile);
                System.out.println("Annual Salary: " + salary);
            }

            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection closed");
        }
        catch (SQLException e){
            System.out.println( e.getMessage() );
        }
    }
}