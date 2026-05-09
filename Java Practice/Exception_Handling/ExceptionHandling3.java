package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Practical Scenario: Custom Checked Exception
Task: Create a custom checked exception called InsufficientFundsException.

Add a constructor that accepts both a String message and the current double balance.

Write a withdraw method that throws this exception if the amount is too high.
*/

class InsufficientFundsException extends Exception {
    private final double balance;
    public InsufficientFundsException(double balance, String message) {
        super(message);
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
class ATM {
    double balance;
    Scanner sc = new Scanner(System.in);

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw() throws InsufficientFundsException {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            System.out.println("Withdraw Successful...");
            balance -= amount;
            System.out.println("Your Remaining Balance: " + balance);
        } else {
            throw new InsufficientFundsException(balance, "Transaction Denied: You do not have enough money.");
        }
    }
}

public class  ExceptionHandling3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to our ATM----");
        ATM atm = new ATM();

        try{
            System.out.print("Enter the amount you want to deposit: ");
            atm.deposit(sc.nextDouble());
            atm.withdraw();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, Please enter Numeric Values only");
            System.out.println("Try Again");
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Your Current Balance is: " + e.getBalance());
        }
        catch (Exception e) {
            // A "Catch-All" for any other unexpected issues
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        System.out.println("----Thank you for using our ATM----");
	}
}