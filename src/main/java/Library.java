import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int numberOfBooks() {
        return stock.size();
    }

    public void addBook(Book book) {
        if(capacity > 0) {
            stock.add(book);
            capacity -= 1;
        }
    }

    public ArrayList<Book> getStock() {
        return stock;
    }

    public int getCapacity() {
        return capacity;
    }

    public void removeBook(Book book) {
        stock.remove(book);
    }
}
