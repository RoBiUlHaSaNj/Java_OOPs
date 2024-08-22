//basic  structure
className object = new className();



Step 2: Create Objects and Use Them
public class Main {
    public static void main(String[] args) {
        // Creating an object of the 'Car' class
        Car myCar = new Car("Toyota", "Corolla", 2020, "Red");

        // Using the object's methods
        myCar.displayDetails(); // Displays the details of the car
        myCar.startCar();       // Starts the car
        myCar.stopCar();        // Stops the car

        // Creating another object of the 'Car' class
        Car anotherCar = new Car("Honda", "Civic", 2021, "Blue");

        // Using the object's methods
        anotherCar.displayDetails();
        anotherCar.startCar();
        anotherCar.stopCar();
    }
}
