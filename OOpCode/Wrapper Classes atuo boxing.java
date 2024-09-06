/*Scenario:
A User can borrow Books.
We will check if two users are equal based on their unique ID (using equals() and hashCode()).
We’ll use an ArrayList to store the borrowed books (this requires wrapper classes for storing primitive values like Integer).
Auto-boxing and unboxing will handle automatic conversion between primitive and object types.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Book class representing a book in the library
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + "]";
    }
}

// User class representing a user of the library
class User {
    private int userId;  // Unique user ID
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed " + book);
    }

    // Check if two users are equal (based on userId)
   
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return userId == user.userId;
    }

    // Generate a unique hash code for each user based on userId
  
    public int hashCode() {
        return Objects.hash(userId);
    }

    // Convert user details to a string representation
   
    public String toString() {
        return "User [ID=" + userId + ", Name=" + name + "]";
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        // Create some user objects
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        // Borrow books
        user1.borrowBook(book1);
        user2.borrowBook(book2);

        // Use the toString() method to print user and book details
        System.out.println(user1);
        System.out.println(user2);

        // Use equals() to check if two users are the same
        User user3 = new User(1, "Alice");
        System.out.println("Is user1 equal to user3? " + user1.equals(user3));

        // Use an ArrayList to store borrowed book counts (auto-boxing example)
        List<Integer> borrowedBookCounts = new ArrayList<>();
        borrowedBookCounts.add(3);  // Auto-boxing: primitive int is converted to Integer
        borrowedBookCounts.add(5);

        // Access the number of books using unboxing
        int booksBorrowedByUser1 = borrowedBookCounts.get(0);  // Unboxing
        System.out.println("Books borrowed by user1: " + booksBorrowedByUser1);
    }
}

