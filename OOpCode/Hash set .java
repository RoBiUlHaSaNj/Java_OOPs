import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet to store strings
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Attempt to add a duplicate

        // Check if a specific element is in the HashSet
        if (set.contains("Apple")) {
            System.out.println("Apple is in the set.");
        }

        // Remove an element from the HashSet
        set.remove("Banana");

        // Iterate over elements in the HashSet
        System.out.println("Elements in the set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Check the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Clear the HashSet
        set.clear();
        System.out.println("Is the HashSet empty? " + set.isEmpty());
    }
}
