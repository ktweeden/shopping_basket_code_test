import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {
    Basket basket;
    Item book;
    Item cheese;

    @Before
    public void before() {
        basket = new Basket();
        book = new Item(1000, true);
        cheese = new Item (500, false);
    }

    @Test
    public void canGetItems() {
        assertEquals(0, basket.getItems().size());
    }

    @Test
    public void canAddItemToBasket() {
        basket.addItem(book);
        assertEquals(1, basket.getItems().size());
    }

    @Test
    public void canRemoveItemFromBasket() {
        basket.addItem(book);
        basket.removeItem(book);
        assertEquals(0, basket.getItems().size());
    }

    @Test
    public void canClearBasket() {
        basket.addItem(book);
        basket.addItem(cheese);
        basket.clearItems();
        assertEquals(0, basket.getItems().size());
    }

    @Test
    public void canCalculateBuyOneGetOneFreeWhenAllItemsAreBOGOF() {
        basket.addItem(book);
        basket.addItem(book);
        assertEquals(1000, basket.calculateBOGOF());
    }

    @Test
    public void canCalculateBuyOneFreeWithMixedItems() {
        basket.addItem(book);
        basket.addItem(book);
        basket.addItem(cheese);
        assertEquals(1500, basket.calculateBOGOF());
    }

    @Test
    public void canCalculate10PercentDiscount() {
        assertEquals(1800, basket.calculateDiscount(2000));
    }

    @Test
    public void canCalculateTotal() {
        basket.addItem(book);
        basket.addItem(book);
        basket.addItem(book);
        basket.addItem(cheese);
        assertEquals(2250, basket.totalCost());
    }
}
