// Base class
class Building {
    void openDoors() {
        System.out.println("Building doors are opened.");
    }
}

// Derived class 1
class House extends Building {
    void sleep() {
        System.out.println("House provides a place to sleep.");
    }
}

// Derived class 2
class Office extends Building {
    void work() {
        System.out.println("Office provides a place to work.");
    }
}

public class Main {
    public static void main(String[] args) {
        House house = new House();
        Office office = new Office();
        
        house.openDoors(); // Common feature
        house.sleep();     // Feature specific to House
        
        office.openDoors(); // Common feature
        office.work();      // Feature specific to Office
    }
}
