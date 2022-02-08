import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Crow Road", "Ian Rankin", "Mystery");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Crow Road", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Ian Rankin", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Mystery", book.getGenre());
    }

}
