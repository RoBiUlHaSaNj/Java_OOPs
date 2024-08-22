// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Derived class
class Car extends Vehicle {
    void honk() {
        System.out.println("Car horn sounds.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  // Inherited method
        car.honk();   // Specific to Car
    }
}
