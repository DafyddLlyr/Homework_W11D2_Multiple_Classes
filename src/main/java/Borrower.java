import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }

    public int numberOfBooks() {
        return collection.size();
    }

    public void borrow(Library library, Book book) {
        if(library.getStock().contains(book)) {
            library.removeBook(book);
            collection.add(book);
        }
    }
}
