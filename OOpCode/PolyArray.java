// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Array of Animal references
        Animal[] animals = new Animal[2];
        
        // Initializing the array with different subclasses
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        // Polymorphic behavior: calling overridden methods
        for (Animal animal : animals) {
            animal.sound();  // Calls the overridden method in the subclass
        }
    }
}
