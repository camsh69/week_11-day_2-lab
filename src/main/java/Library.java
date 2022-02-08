import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (!isAtCapacity()) this.books.add(book);
    }

    public boolean isAtCapacity() {
        return this.books.size() >= this.capacity;
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void addByGenre(String genre) {
       int count;
        if (this.booksByGenre.get(genre) != null) {
            count = countByGenre(genre) + 1;
        } else {
            count = 1;
        }
        this.booksByGenre.put(genre, count);
    }

    public int countByGenre(String genre) {
        return this.booksByGenre.get(genre);
    }
}
