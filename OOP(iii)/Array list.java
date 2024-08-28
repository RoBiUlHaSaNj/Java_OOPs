In Java, ArrayList is a part of the Java Collections Framework and provides a dynamic 
  array that can grow and shrink as needed. Unlike arrays, which have a fixed size, an 
  ArrayList can adjust its size automatically as elements are added or removed.

Key Features of ArrayList:

Dynamic Sizing: Automatically resizes when elements are added or removed.
  
Indexed Access: Provides fast access to elements using an index.
  
Generic: Can be used to store any type of objects (e.g., ArrayList<String>, ArrayList<Integer>).
  
Null Values: Allows null values to be stored.
  
Order: Maintains the insertion order of elements.
Basic Operations

  
Creating an ArrayList:


ArrayList<String> names = new ArrayList<>();



Adding Elements:
names.add("Ali");
names.add("Bob");
names.add("Charlie");


Accessing Elements:
String name = names.get(0);  // Gets the first element ("Ali")


Updating Elements:
names.set(1, "Robert");  // Updates the second element ("Bob" to "Robert")


Removing Elements:
names.remove(2);  // Removes the third element ("Charlie")
Iterating Over Elements:


Using a for-each loop:
for (String name : names) {
    System.out.println(name);
}


Using an index-based loop:
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}


Checking Size:
int size = names.size();  // Returns the number of elements in the list

Checking if the List is Empty:
boolean isEmpty = names.isEmpty();  // Returns true if the list is empty


Clearing the List:
names.clear();  // Removes all elements from the list

Checking if an Element Exists:
boolean contains = names.contains("Ali);  // Returns true if "Ali" is in the list
