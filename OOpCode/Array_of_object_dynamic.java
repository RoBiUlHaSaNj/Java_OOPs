
// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Array of Animal objects
        Animal[] animals = new Animal[2];

        // Initialize with different subclasses
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Access and call sound() method
        for (Animal animal : animals) {
            animal.sound();  // Calls overridden method in the respective subclass
        }
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold Person objects
        ArrayList<Person> peopleList = new ArrayList<>();

        // Add Person objects to the ArrayList
        peopleList.add(new Person("Alice", 30));
        peopleList.add(new Person("Bob", 25));
        peopleList.add(new Person("Charlie", 35));

        // Access and display information of each person
        for (Person person : peopleList) {
            person.displayInfo();
        }
    }
}
