// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Interface 1
interface CanFloat {
    void floatOnWater();
}

// Interface 2
interface CanDrive {
    void drive();
}

// Derived class implementing interfaces and inheriting from Vehicle
class HybridVehicle extends Vehicle implements CanFloat, CanDrive {
    @Override
    public void floatOnWater() {
        System.out.println("Hybrid vehicle is floating on water.");
    }

    @Override
    public void drive() {
        System.out.println("Hybrid vehicle is driving on land.");
    }
}

public class Main {
    public static void main(String[] args) {
        HybridVehicle hybridVehicle = new HybridVehicle();
        hybridVehicle.start();      // Inherited from Vehicle
        hybridVehicle.drive();     // Implemented from CanDrive
        hybridVehicle.floatOnWater(); // Implemented from CanFloat
    }
}
