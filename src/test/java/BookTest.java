import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup(){
        book = new Book("The Lord of the Rings", "Fantasy", "J.R.R. Tolkien");
    }

    @Test
    public void bookHasATitle(){
        assertEquals("The Lord of the Rings", book.getTitle());
    }

    @Test
    public void bookHasAGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void bookHasAnAuthor(){
        assertEquals("J.R.R. Tolkien", book.getAuthor());
    }

}
