// Interface for payment actions
interface PaymentActions {
    void initiatePayment();
    void cancelPayment();
}

// Implementing the interface in Credit Card Payment
class CreditCardPayment implements PaymentActions {
    private double amount;
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void initiatePayment() {
        System.out.println("Initiating credit card payment of $" + amount + " for card number " + cardNumber);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Credit card payment cancelled.");
    }
}

// Implementing the interface in PayPal Payment
class PayPalPayment implements PaymentActions {
    private double amount;
    private String email;

    public PayPalPayment(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    @Override
    public void initiatePayment() {
        System.out.println("Initiating PayPal payment of $" + amount + " for email " + email);
    }

    @Override
    public void cancelPayment() {
        System.out.println("PayPal payment cancelled.");
    }
}
/*Explanation:

The PaymentActions interface defines a contract that all payment methods must adhere to, ensuring they can initiate and cancel payments.
The CreditCardPayment and PayPalPayment classes implement the PaymentActions interface, providing specific implementations for initiating and canceling payments.*/
