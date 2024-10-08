

public class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;
    String color;

    // Default constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }

    // Parameterized constructor
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Car defaultCar = new Car();
        System.out.println("Default Car:");
        defaultCar.displayDetails();

        // Creating an object using the parameterized constructor
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");
        System.out.println("\nMy Car:");
        myCar.displayDetails();
    }
}
