import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store integers as keys and strings as values
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Access and print a value
        System.out.println("Value for key 2: " + map.get(2));

        // Update a value
        map.put(2, "Blueberry");
        System.out.println("Updated value for key 2: " + map.get(2));

        // Remove an entry
        map.remove(3);
        System.out.println("Entry with key 3 removed.");

        // Print all key-value pairs in the HashMap
        System.out.println("All entries in the HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Clear the HashMap
        map.clear();
        System.out.println("Is the HashMap empty? " + map.isEmpty());
    }
}
