import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void setup(){
        borrower = new Borrower();
    }

    @Test
    public void borrowerBeginsWithNoBooks(){
        assertEquals(0, borrower.numberOfBooks());
    }

}
