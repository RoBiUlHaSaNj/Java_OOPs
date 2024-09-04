
public class Checkout {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(150.0, "1234-5678-9876-5432");
        PaymentActions payPalPayment = new PayPalPayment(75.0, "user@example.com");
        PaymentActions bankTransferPayment = new BankTransferPayment(200.0, "9876543210");

        // Validate and process credit card payment
        creditCardPayment.validatePaymentDetails();
        creditCardPayment.processPayment();
        creditCardPayment.confirmPayment();

        // Initiate and cancel PayPal payment
        payPalPayment.initiatePayment();
        payPalPayment.cancelPayment();

        // Initiate and process bank transfer
        bankTransferPayment.initiatePayment();
        bankTransferPayment.processPayment();
    }
}
