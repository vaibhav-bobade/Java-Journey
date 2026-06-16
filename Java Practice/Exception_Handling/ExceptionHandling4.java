class InsufficientFundsException extends Exception {
    private double shortfall;

    // Constructor that accepts a custom error message
    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}

class BankAccount {
    private double balance = 500.00;

    // The 'throws' keyword warns the caller that this method might fail
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: $" + amount);
        
        if (amount > balance) {
            double missingMoney = amount - balance;
            // The 'throw' keyword actually launches the exception object
            throw new InsufficientFundsException("Transaction denied: Insufficient funds.", missingMoney);
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: $" + balance);
    }
}

public class  ExceptionHandling4{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        try {
            // This transaction will work fine
            myAccount.withdraw(200.00); 
            System.out.println("-----------------------------------");
            
            // This transaction will fail and trigger our custom exception
            myAccount.withdraw(400.00); 
            
        } catch (InsufficientFundsException e) {
            // We catch the specific custom error and handle it gracefully
            System.err.println("ALERT: " + e.getMessage());
            System.err.println("You are short by: $" + e.getShortfall());
        } finally {
            // This always runs, perfect for cleanup actions
            System.out.println("ATM session closed.");
        }
    }
}