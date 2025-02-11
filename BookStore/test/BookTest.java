import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private Book book;
    @BeforeEach
    public void setUp() {
        book = new Book("YSG","akerele",19,12000.0);

    }

    @Test
    public void testThatBookCanGetTitle() {
        assertEquals("YSG",book.getTitle());
    }
    @Test
    public void testThatBookCanGetAuthor() {
        assertEquals("akerele",book.getAuthor());
    }
    @Test
    public void testThatBookCanGetPrice() {
        assertEquals(12000,book.getPrices());
    }
}