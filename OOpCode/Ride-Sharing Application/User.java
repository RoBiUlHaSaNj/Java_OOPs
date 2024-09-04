abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Common method for logging in
    public void login() {
        System.out.println(name + " has logged in with email " + email);
    }

    // Abstract method for performing an action, must be implemented by subclasses
    public abstract void performAction();
}

class Driver extends User {
    private Vehicle vehicle;

    public Driver(String name, String email, Vehicle vehicle) {
        super(name, email);
        this.vehicle = vehicle;
    }

    @Override
    public void performAction() {
        vehicle.start();
        System.out.println(name + " is ready to pick up passengers.");
    }

    public void acceptRide(double distance) {
        double fare = vehicle.calculateFare(distance);
        System.out.println(name + " has accepted a ride. The fare is $" + fare);
    }
}

class Passenger extends User {
    public Passenger(String name, String email) {
        super(name, email);
    }

    @Override
    public void performAction() {
        System.out.println(name + " is booking a ride.");
    }

    public void requestRide(Vehicle vehicle, double distance) {
        double fare = vehicle.calculateFare(distance);
        System.out.println(name + " has requested a ride. The estimated fare is $" + fare);
    }
}
