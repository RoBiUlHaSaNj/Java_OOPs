abstract class Vehicle {
    protected String licensePlate;
    protected int capacity;

    public Vehicle(String licensePlate, int capacity) {
        this.licensePlate = licensePlate;
        this.capacity = capacity;
    }

    // Common method for starting the vehicle
    public void start() {
        System.out.println("Vehicle with license plate " + licensePlate + " is starting.");
    }

    // Abstract method for calculating the fare, which must be implemented by subclasses
    public abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, 4); // Cars typically have a capacity of 4 passengers
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 1.5; // Fare calculation for a car
    }
}

class Bike extends Vehicle {
    public Bike(String licensePlate) {
        super(licensePlate, 1); // Bikes typically have a capacity of 1 passenger
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 0.75; // Fare calculation for a bike
    }
}
