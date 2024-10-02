import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(Book book) {
        if (!books.contains(book)) {  // Prevent duplicates
            books.add(book);
            Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle())); // Sort alphabetically
        }
    }

    // Retrieve the complete list of books
    public List<Book> getBooks() {
        return books;
    }

    // Get the title of a book by position
    public String getBookAtPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position).getTitle();
        } else {
            return null;
        }
    }

    // Add a book at a specific position
    public void addBookAtPosition(int position, Book book) {
        if (!books.contains(book)) {  // Prevent duplicates
            if (position >= 0 && position <= books.size()) {
                books.add(position, book);
                Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle())); // Sort alphabetically
            }
        }
    }

    // Remove a book by its title
    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
        Collections.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle())); // Sort alphabetically
    }

    // Check for duplicate titles
    public boolean hasDuplicates() {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i).equals(books.get(i + 1))) {
                return true;
            }
        }
        return false;
    }
}

