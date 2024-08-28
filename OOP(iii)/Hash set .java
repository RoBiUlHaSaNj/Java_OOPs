In Java, HashSet is a part of the Java Collections Framework and is used to store a 
  collection of unique elements. It implements the Set interface, backed by a hash table
  (actually a HashMap instance), and does not allow duplicate elements.

Key Features of HashSet:

Unique Elements: Ensures that no duplicates are present. If you try to add a duplicate, it will not be added.
No Order: Does not maintain any order of elements; the order of elements can change over time.
Null Elements: Allows one null element.
Fast Operations: Provides constant-time performance for basic operations like add(), remove(), and contains().

  Basic Operations

  
Creating a HashSet:
HashSet<String> set = new HashSet<>();

Adding Elements:
set.add("Apple");
set.add("Banana");
set.add("Cherry");
set.add("Apple");  // Duplicate, won't be added


Checking if an Element Exists:
boolean containsApple = set.contains("Apple");  // Returns true
boolean containsMango = set.contains("Mango");  // Returns false


Removing Elements:
set.remove("Banana");  // Removes "Banana" from the set
Iterating Over Elements:

Using a for-each loop:
for (String fruit : set) {
    System.out.println(fruit);
}

Checking the Size:
int size = set.size();  // Returns the number of elements in the set


Checking if the Set is Empty:
boolean isEmpty = set.isEmpty();  // Returns true if the set is empty


Clearing the Set:
set.clear();  // Removes all elements from the set
