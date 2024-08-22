// Base class
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Using polymorphism
        makeAnimalSound(myDog); // Output: Woof!
        makeAnimalSound(myCat); // Output: Meow!
    }
    
    static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
