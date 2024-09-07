import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Patron> patrons = new HashMap<>();
    private Map<String, String> checkedOutBooks = new HashMap<>();
    
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }
    
    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }
    
    public void checkOutBook(String isbn, String patronId) {
        if (books.containsKey(isbn) && patrons.containsKey(patronId)) {
            if (!checkedOutBooks.containsKey(isbn)) {
                checkedOutBooks.put(isbn, patronId);
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Book is already checked out.");
            }
        } else {
            System.out.println("Invalid book or patron.");
        }
    }
    
    public void returnBook(String isbn) {
        if (checkedOutBooks.containsKey(isbn)) {
            checkedOutBooks.remove(isbn);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not checked out.");
        }
    }
    
    public boolean isBookCheckedOut(String isbn) {
        return checkedOutBooks.containsKey(isbn);
    }
    
    public List<Book> findBooksByTitle(String title) {
        return books.values().stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .collect(Collectors.toList());
    }
    
    public List<Book> findBooksByAuthor(String author) {
        return books.values().stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
    }
}
