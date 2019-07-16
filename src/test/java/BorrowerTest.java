import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void setup(){
        borrower = new Borrower();
        library = new Library(100);
        book1 = new Book("The Lord of the Rings", "Fantasy", "J.R.R. Tolkien");
        book2 = new Book("The Penguin Lessons", "Travel", "Tom Michell");
    }

    @Test
    public void borrowerBeginsWithNoBooks(){
        assertEquals(0, borrower.numberOfBooks());
    }

    @Test
    public void borrowerCanBorrowBook(){
        library.addBook(book1);
        borrower.borrow(library, book1);
        assertEquals(0, library.numberOfBooks());
        assertEquals(1, borrower.numberOfBooks());
    }

    @Test
    public void borrowerCannotRemoveBookIfDoesntExist(){
        library.addBook(book1);
        borrower.borrow(library, book2);
        assertEquals(1, library.numberOfBooks());
        assertEquals(0, borrower.numberOfBooks());
    }

}
