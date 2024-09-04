// Abstract class for Payment
abstract class Payment implements PaymentActions {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Common method to validate payment details
    public void validatePaymentDetails() {
        System.out.println("Validating payment details...");
    }

    // Abstract methods for processing and confirming payment
    public abstract void processPayment();
    public abstract void confirmPayment();
}

// Implementing both abstract class and interface
class BankTransferPayment extends Payment {
    private String bankAccountNumber;

    public BankTransferPayment(double amount, String bankAccountNumber) {
        super(amount);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer of $" + amount + " for account number " + bankAccountNumber);
    }

    @Override
    public void confirmPayment() {
        System.out.println("Bank transfer of $" + amount + " confirmed.");
    }

    @Override
    public void initiatePayment() {
        System.out.println("Initiating bank transfer of $" + amount + " for account number " + bankAccountNumber);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Bank transfer cancelled.");
    }
}
