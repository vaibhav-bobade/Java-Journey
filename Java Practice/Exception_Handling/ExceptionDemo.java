package Exception_Handling;

public class ExceptionDemo {

    // 'throws' warns the compiler: "This method might throw an error"
    public static void checkBalance(int withdrawalAmount) throws ArithmeticException {
        int currentBalance = 3000;

        System.out.println("Attempting to withdraw: " + withdrawalAmount);

        if (withdrawalAmount > currentBalance) {
            // 'throw' explicitly triggers the error
            throw new ArithmeticException("Failure: Insufficient Funds!");
        } else {
            System.out.println("Success: Please collect your cash.");
        }
    }

    public static void main(String[] args) {
        // Test 1: Successful Transaction
        try {
            checkBalance(1000);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------");

        // Test 2: Triggering the 'throw'
        try {
            checkBalance(5000);
        } catch (ArithmeticException e) {
            // This catches the 'throw' from the method
            System.out.println("Caught in Catch Block: " + e.getMessage());
        }

        System.out.println("\nProgram continues running smoothly...");
    }
}
/*
Output:

Attempting to withdraw: 1000
Success: Please collect your cash.
---------------------------
Attempting to withdraw: 5000
Caught in Catch Block: Failure: Insufficient Funds!

Program continues running smoothly...
 */