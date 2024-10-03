public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("1984"));
        library.addBook(new Book("Brave New World"));
        library.addBook(new Book("The Great Gatsby"));

        // Print all books
        System.out.println("Books in the library: " + library.getBooks());

        // Get book by position
        System.out.println("Book at position 1: " + library.getBookAtPosition(1));

        // Add a book at a specific position
        library.addBookAtPosition(1, new Book("Animal Farm"));
        System.out.println("Books after adding 'Animal Farm': " + library.getBooks());

        // Remove a book by title
        library.removeBookByTitle("1984");
        System.out.println("Books after removing '1984': " + library.getBooks());

        // Check for duplicates
        System.out.println("Has duplicates: " + library.hasDuplicates());
    }
}

