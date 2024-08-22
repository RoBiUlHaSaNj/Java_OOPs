//Define the Person Class

public class Person {
    // Fields of the class
    String name;
    int age;

    // Constructor of the class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[3]; // Array to hold 3 Person objects

        // Initialize each element in the array
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Access and display information of each person
        for (Person person : people) {
            person.displayInfo();
        }
    }
}
