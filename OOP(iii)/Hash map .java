In Java, HashMap is a part of the Java Collections Framework and is used to store data in key-value pairs. It is based on the hash table data structure and allows efficient insertion, deletion, and lookup operations.

Key Features of HashMap:
Key-Value Pairs: Stores data as key-value pairs where each key is unique.
Null Values and Keys: Allows one null key and multiple null values.
No Order: Does not maintain any order of elements.
Fast Access: Provides constant-time performance for basic operations like get() and put() under typical conditions.
Generic: Can store any type of objects as keys and values (e.g., HashMap<String, Integer>).
Basic Operations
Creating a HashMap:

java
Copy code
HashMap<Integer, String> map = new HashMap<>();
Adding Elements:

java
Copy code
map.put(1, "Apple");
map.put(2, "Banana");
map.put(3, "Cherry");
Accessing Elements:

java
Copy code
String value = map.get(2);  // Gets the value associated with key 2 ("Banana")
Updating Elements:

java
Copy code
map.put(2, "Blueberry");  // Updates the value for key 2 to "Blueberry"
Removing Elements:

java
Copy code
map.remove(3);  // Removes the entry with key 3 ("Cherry")
Checking for a Key or Value:

java
Copy code
boolean hasKey = map.containsKey(1);  // Checks if key 1 is present (true)
boolean hasValue = map.containsValue("Apple");  // Checks if "Apple" is a value (true)
Iterating Over Entries:

Using a for-each loop to iterate over keys:
java
Copy code
for (Integer key : map.keySet()) {
    System.out.println("Key: " + key + ", Value: " + map.get(key));
}
Using a for-each loop to iterate over entries:
java
Copy code
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
Checking the Size:

java
Copy code
int size = map.size();  // Returns the number of key-value pairs in the map
Clearing the Map:

java
Copy code
map.clear();  // Removes all entries from the map
Checking if the Map is Empty:

java
Copy code
boolean isEmpty = map.isEmpty();  // Returns true if the map is empty
