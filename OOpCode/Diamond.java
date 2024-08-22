// Base class representing a common family trait
class Family {
    void familyTrait() {
        System.out.println("Family trait: Tradition");
    }
}

// Intermediate class 1 inheriting from Family
class Parent1 extends Family {
    void parent1Trait() {
        System.out.println("Parent1's unique trait: Gardening");
    }

  
    void familyTrait() {
        System.out.println("Parent1's family tradition: Gardening");
    }
}

// Intermediate class 2 inheriting from Family
class Parent2 extends Family {
    void parent2Trait() {
        System.out.println("Parent2's unique trait: Engineering");
    }

 
    void familyTrait() {
        System.out.println("Parent2's family tradition: Engineering");
    }
}

// Derived class inheriting from both Parent1 and Parent2
class Child extends Parent1, Parent2 {
    // Explicitly override the method to resolve ambiguity
   
    void familyTrait() {
        System.out.println("Child's choice: A blend of Gardening and Engineering");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.familyTrait();  // Calls the overridden method in Child
        child.parent1Trait(); // Calls method from Parent1
        child.parent2Trait(); // Calls method from Parent2
    }
}
