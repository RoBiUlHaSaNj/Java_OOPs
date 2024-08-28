import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Ali");
        names.add("Bob");
        names.add("Charlie");

        // Access and print the first element
        System.out.println("First name: " + names.get(0));

        // Update the second element
        names.set(1, "Robert");
        System.out.println("Updated second name: " + names.get(1));

        // Remove the third element
        names.remove(2);

        // Print all elements in the ArrayList
        System.out.println("All names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Check the size of the ArrayList
        System.out.println("Size of the ArrayList: " + names.size());

        // Clear the ArrayList
        names.clear();
        System.out.println("Is the ArrayList empty? " + names.isEmpty());
    }
}
