import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testLibraryIsNotNull() {
        assertNotNull(library.getBooks(), "The book list should not be null after creating a new object.");
    }

    @Test
    public void testAddingBooksToLibrary() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        List<Book> books = library.getBooks();
        assertEquals(2, books.size(), "The list should contain two books.");
    }

    @Test
    public void testGetBookAtSpecificPosition() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        assertEquals("1984", library.getBookAtPosition(0), "The first book should be '1984'.");
        assertEquals("Brave New World", library.getBookAtPosition(1), "The second book should be 'Brave New World'.");
    }

    @Test
    public void testAddBookAtSpecificPosition() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        library.addBookAtPosition(1, new Book("Animal Farm"));
        List<Book> books = library.getBooks();
        assertTrue(books.contains(new Book("Animal Farm")), "The list should contain 'Animal Farm'.");
    }

    @Test
    public void testRemoveBookByTitle() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        library.removeBookByTitle("1984");
        assertFalse(library.getBooks().contains(new Book("1984")), "The list should not contain '1984' anymore.");
        assertEquals(1, library.getBooks().size(), "The list size should have decreased by 1.");
    }

    @Test
    public void testNoDuplicateBooks() {
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        assertFalse(library.hasDuplicates(), "There should be no duplicate books.");
    }
}
