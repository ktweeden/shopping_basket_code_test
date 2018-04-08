import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    Item book;

    @Before
    public void before() {
        book = new Item(20, true);
    }

    @Test
    public void hasCost() {
        assertEquals(20, book.getCost());
    }

    @Test
    public void isBuyOneGetOneFree() {
        assertEquals(true, book.isBuyOneGetOneFree());
    }

}
