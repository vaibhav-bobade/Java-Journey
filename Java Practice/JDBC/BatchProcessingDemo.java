package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchProcessingDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "-----";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        String insertQuery = "INSERT INTO employees(id, name, job_title, salary) VALUES (?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(url,user,password);
         PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);){
            conn.setAutoCommit(false);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee Name, Job Title and Salary to Insert Data");
            while(true){
                System.out.print("Enter ID:");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Job Title: ");
                String job_Title = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); //to consume the leftover space
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, job_Title);
                preparedStatement.setDouble(4, salary);

                preparedStatement.addBatch();

                System.out.print("Do you want to add more Employees? (Y/N): ");
                String decision = sc.nextLine();

                if(decision.equalsIgnoreCase("Y")){
                    continue;
                }
                else if(decision.equalsIgnoreCase("N")){
                    break;
                } else {
                    System.out.println("Invalid Input, only Y or N was expected");
                    break;
                }
            }
            int[]  result = preparedStatement.executeBatch();
            conn.commit();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
