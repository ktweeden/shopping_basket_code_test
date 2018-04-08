import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {

    Customer customerWithCard;
    Customer customerWithoutCard;
    Basket basket;
    Item book;

    @Before
    public void before() {
        customerWithCard = new Customer(true, 10000);
        customerWithoutCard = new Customer(false, 10000);
        book = new Item(1000, true);
        basket = new Basket();
        basket.addItem(book);
        basket.addItem(book);
        basket.addItem(book);
    }

    @Test
    public void chargeCustomerWithLoyaltyCard() {
        Checkout checkout = new Checkout(basket, customerWithCard);
        assertEquals(1764, checkout.chargeCustomer());
    }

    @Test
    public void chargeCustomerWithoutLoyaltyCard() {
        Checkout checkout = new Checkout(basket, customerWithoutCard);
        assertEquals(1800, checkout.chargeCustomer());
    }
}
