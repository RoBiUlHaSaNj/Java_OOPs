// Interface 1
interface Driver {
    void drive();
}

// Interface 2
interface Swimmer {
    void swim();
}

// Class implementing multiple interfaces
class Person implements Driver, Swimmer {
    @Override
    public void drive() {
        System.out.println("Person is driving.");
    }

    @Override
    public void swim() {
        System.out.println("Person is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.drive();  // Ability to drive
        person.swim();   // Ability to swim
    }
}
