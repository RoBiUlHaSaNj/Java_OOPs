public class RideSharingApp {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("ABC-123");
        Vehicle bike = new Bike("XYZ-987");

        // Create users
        Driver driver = new DriverWithRating("John Doe", "john@example.com", car);
        Passenger passenger = new PassengerWithRating("Jane Smith", "jane@example.com");

        // User actions
        driver.login();
        driver.performAction();
        passenger.login();
        passenger.performAction();

        // Request a ride and accept it
        double distance = 10.0; // Example distance in miles
        passenger.requestRide(car, distance);
        driver.acceptRide(distance);

        // Payment
        PaymentMethod payment = new CreditCardPayment("1234-5678-9012-3456");
        payment.processPayment(car.calculateFare(distance));

        // Rating
        driver.rate(5); // Passenger rates the driver
        passenger.rate(4); // Driver rates the passenger
    }
}
