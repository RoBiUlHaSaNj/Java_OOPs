


/*
Queastion:
Let's say you're developing a banking application where you have an Account class representing a bank account. 
You want to include a nested class that contains utility methods for account-related operations (e.g., validating account numbers).
Since these utilities don't need access to any specific Account instance, a static nested class is appropriate.


  */
// Outer class representing a bank account
class Account {
    private String accountNumber;
    private double balance;
    private static String bankCode = "XYZ123"; // Static member

    // Constructor to initialize account details
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Code: " + bankCode);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Static nested class for account-related utilities
    static class AccountUtils {
        // Static method to validate account number
        public static boolean isValidAccountNumber(String accountNumber) {
            // Simple validation: check if account number is exactly 10 digits
            return accountNumber != null && accountNumber.matches("\\d{10}");
        }

        // Static method to generate a new account number (for illustration purposes)
        public static String generateAccountNumber() {
            // Generating a dummy 10-digit account number
            return "9876543210";
        }

        // Static method to display bank code
        public static void displayBankCode() {
            System.out.println("Bank Code: " + bankCode); // Accessing outer class's static member
        }
    }
}

// Main class to test the static nested class
public class BankApp {
    public static void main(String[] args) {
        // Using the static nested class to generate a new account number
        String newAccountNumber = Account.AccountUtils.generateAccountNumber();
        System.out.println("Generated Account Number: " + newAccountNumber);

        // Validating the generated account number
        boolean isValid = Account.AccountUtils.isValidAccountNumber(newAccountNumber);
        System.out.println("Is Valid Account Number: " + isValid);

        // Creating an account using the generated account number
        Account myAccount = new Account(newAccountNumber, 5000.00);
        myAccount.displayAccountDetails();

        // Displaying bank code using static nested class method
        Account.AccountUtils.displayBankCode();
    }
}
