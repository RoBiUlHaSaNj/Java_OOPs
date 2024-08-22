//Declaring an Array:

int[] myArray; // Declares an array of integers

//Initializing an Array:

int[] myArray = new int[5]; // Creates an array of 5 integers with default values (0)


//Accessing Array Elements:

int firstElement = myArray[0]; // Accesses the first element
myArray[2] = 10; // Changes the value of the third element to 10

//Iterating Over an Array:

for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}

for (int element : myArray) {
    System.out.println(element);
}

public class ArrayExample {
    public static void main(String[] args) {
        // 1. Declaring and initializing an array
        int[] myArray = {10, 20, 30, 40, 50};
        
        // 2. Accessing elements of the array
        System.out.println("First element: " + myArray[0]); // Output: 10
        System.out.println("Third element before change: " + myArray[2]); // Output: 30
        
        // 3. Modifying an element of the array
        myArray[2] = 35;
        System.out.println("Third element after change: " + myArray[2]); // Output: 35
        
        // 4. Iterating over the array using a for loop
        System.out.println("\nArray elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + ": " + myArray[i]);
        }
        
        // 5. Iterating over the array using an enhanced for loop
        System.out.println("\nArray elements (using enhanced for loop):");
        for (int element : myArray) {
            System.out.println("Element: " + element);
        }
        
        // 6. Finding the length of the array
        System.out.println("\nLength of the array: " + myArray.length);
        
        // 7. Copying the array to a new array
        int[] newArray = java.util.Arrays.copyOf(myArray, myArray.length);
        System.out.println("\nCopied array elements:");
        for (int element : newArray) {
            System.out.println("Element: " + element);
        }
        
        // 8. Sorting the array (not needed here since it's already sorted, but here's how it's done)
        java.util.Arrays.sort(myArray);
        System.out.println("\nSorted array elements:");
        for (int element : myArray) {
            System.out.println("Element: " + element);
        }
    }
}

//For User input Array
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // 2. Create an array with the specified size
        int[] userArray = new int[size];

        // 3. Ask the user to input the elements of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        // 4. Display the elements of the array
        System.out.println("\nThe elements of the array are:");
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Element at index " + i + ": " + userArray[i]);
        }

        // 5. Optionally, display using an enhanced for loop
        System.out.println("\nArray elements (using enhanced for loop):");
        for (int element : userArray) {
            System.out.println("Element: " + element);
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}



