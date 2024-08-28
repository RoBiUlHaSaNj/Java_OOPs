public class BankAccount {
    private double balance;  // Private variable to store balance

    // Getter method to get the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to set the balance
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount myAccount = new BankAccount();

        // Deposit money into the account
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        // Withdraw money from the account
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        // Attempt to withdraw more than the balance
        myAccount.withdraw(400.0);
        System.out.println("Balance after attempting to overdraw: $" + myAccount.getBalance());
    }
}

