// Abstract class for Payment
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    

    // Common method to validate payment details
    public void validatePaymentDetails() {
        System.out.println("Validating payment details...");
    }

    // Abstract method to process the payment (must be implemented by subclasses)
    public abstract void processPayment();

    // Abstract method to confirm the payment (must be implemented by subclasses)
    public abstract void confirmPayment();
}

// Subclass for Credit Card Payment
class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " for card number " + cardNumber);
    }

    @Override
    public void confirmPayment() {
        System.out.println("Credit card payment of $" + amount + " confirmed.");
    }
}

// Subclass for PayPal Payment
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " for email " + email);
    }

    @Override
    public void confirmPayment() {
        System.out.println("PayPal payment of $" + amount + " confirmed.");
    }
}
/*Explanation:

The Payment abstract class defines common behaviors like validatePaymentDetails() and abstract methods like processPayment() and confirmPayment() that each specific payment method must implement.
The CreditCardPayment and PayPalPayment classes extend Payment and provide specific implementations for processing and confirming payments.*/
