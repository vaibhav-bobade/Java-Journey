package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "-----";

        try(Connection conn = DriverManager.getConnection(url,user,password)) {
            conn.setAutoCommit(false);

            String withdrawQuery = "UPDATE bank SET balance = balance - ? WHERE id = ?";
            String creditQuery = "UPDATE bank SET balance = balance + ? WHERE id = ?";

            try {
                PreparedStatement psWithdraw = conn.prepareStatement(withdrawQuery);
                PreparedStatement psCredit = conn.prepareStatement(creditQuery);

                psWithdraw.setInt(1, 500);
                psWithdraw.setString(2, "account123");
                psCredit.setInt(1, 500);
                psCredit.setString(2, "account456");

                int withdrawAffectedRows = psWithdraw.executeUpdate();
                int creditAffectedRows = psCredit.executeUpdate();

                if (withdrawAffectedRows == 1 && creditAffectedRows == 1) {
                    conn.commit();
                    System.out.println("Transaction successful");
                } else {
                    conn.rollback();
                    System.out.println("Transaction Failed");
                }
            } catch (SQLException e) {
                conn.rollback();
                System.out.println(e.getMessage());
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
