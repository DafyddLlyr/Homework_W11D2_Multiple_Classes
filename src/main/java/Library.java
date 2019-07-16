import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap booksByGenre() {
        HashMap<String, Integer> genres = new HashMap<String, Integer>();
        for(Book book : stock){
            String key = book.getGenre();
            if(genres.containsKey(book.getGenre())){
                Integer value = genres.get(key);
                genres.put(key, (value += 1));
            } else {
                genres.put(book.getGenre(), 1);
            }
        }
        return genres;
    }
}
