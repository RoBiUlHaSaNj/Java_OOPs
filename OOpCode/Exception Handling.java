/*We want to simulate a banking system where users can withdraw money from their accounts. The system needs to:

Throw an exception when the user tries to withdraw more money than they have (i.e., Insufficient Balance).
Handle invalid account numbers.
Use custom exceptions to ensure withdrawals meet certain conditions (e.g., no withdrawal of negative amounts).
*/


// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Amount (e.g., negative withdrawal)
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// Bank Account class simulating the banking system
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Invalid amount. Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! You tried to withdraw $" + amount + ", but only $" + balance + " is available.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount("123456789", 500.00);

        try {
            System.out.println("Attempting to withdraw $100...");
            account.withdraw(100);  // Valid withdrawal
            System.out.println("Current Balance: $" + account.getBalance());

            System.out.println("\nAttempting to withdraw $600...");
            account.withdraw(600);  // Should throw InsufficientBalanceException

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nAttempting to withdraw -50...");
            account.withdraw(-50);  // Should throw InvalidAmountException
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("\nThank you for using our banking system!");
        }
    }
}

/*
Explanation:
Custom Exceptions:

InsufficientBalanceException: This exception is thrown if the user tries to withdraw more money than available.
InvalidAmountException: This exception is thrown if the user tries to withdraw a negative amount or zero.
withdraw() Method:

The method first checks if the amount is less than 0. If so, it throws InvalidAmountException.
It then checks if the withdrawal amount is greater than the current balance. If so, it throws InsufficientBalanceException.
If both conditions are satisfied, the withdrawal is processed, and the balance is updated.
Main Program:

We create a BankAccount with an initial balance of $500.
The program attempts three withdrawals:
A valid withdrawal of $100 (which should succeed).
An invalid withdrawal of $600 (which should throw an InsufficientBalanceException).
An invalid withdrawal of -$50 (which should throw an InvalidAmountException).
Exception Handling:

We use try-catch blocks to catch the exceptions and handle them appropriately.
The finally block ensures a message is printed regardless of whether an exception occurs.
Output:
Attempting to withdraw $100...
Withdrawal successful! New balance: $400.0
Current Balance: $400.0

Attempting to withdraw $600...
Exception: Insufficient balance! You tried to withdraw $600.0, but only $400.0 is available.

Attempting to withdraw -50...
Exception: Invalid amount. Withdrawal amount must be positive.

Thank you for using our banking system!*/
