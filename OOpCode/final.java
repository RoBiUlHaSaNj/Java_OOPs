// Base class representing a general bank account
class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor to initialize savings account with interest rate
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance); // Call to superclass constructor
        this.interestRate = interestRate;
    }

    // Final method to calculate interest, which cannot be overridden
    public final void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Interest earned: $" + interest);
        deposit(interest); // Adding interest to the balance
    }

    // Overriding the display balance method to include interest rate info
    @Override
    public void displayBalance() {
        super.displayBalance(); // Call to superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the banking system
public class BankSystem {
    public static void main(String[] args) {
        // Create a savings account
        SavingsAccount myAccount = new SavingsAccount("123456789", 1000.00, 5.0);

        // Perform some operations
        myAccount.deposit(200.00);
        myAccount.withdraw(150.00);

        // Calculate interest
        myAccount.calculateInterest();

        // Display final balance
        myAccount.displayBalance();
    }
}
