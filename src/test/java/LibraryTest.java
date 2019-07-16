import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Borrower borrower;

    @Before
    public void setup(){
        library = new Library(100);
        book1 = new Book("The Lord of the Rings", "Fantasy", "J.R.R. Tolkien");
        book2 = new Book("The Penguin Lessons", "Travel", "Tom Michell");
        book3 = new Book("The Hobbit", "Fantasy", "J.R.R. Tolkien");
        borrower = new Borrower();
    }

    @Test
    public void libraryStartOffWithZeroStock(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void libraryHasInitialCapacity(){
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.numberOfBooks());
        assertTrue(library.getStock().contains(book1));
    }

    @Test
    public void canRemoveBooksFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.numberOfBooks());
        assertFalse(library.getStock().contains(book1));
    }

    @Test
    public void cannotAddBookToLibraryWithoutCapacity(){
        Library smallLibrary = new Library(1);
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        assertEquals(1, smallLibrary.numberOfBooks());
    }

    @Test
    public void capacityDecreasesWhenBookAdded(){
        library.addBook(book1);
        assertEquals(99, library.getCapacity());
    }

    @Test
    public void libraryCanTrackBooksByGenre(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        HashMap<String, Integer> genre = new HashMap<String, Integer>();
        genre.put("Travel", 1);
        genre.put("Fantasy", 2);
        assertEquals(genre, library.booksByGenre());
    }
}
