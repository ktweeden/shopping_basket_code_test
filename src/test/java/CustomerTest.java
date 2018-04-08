import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;

    @Before
    public void before() {
        customer = new Customer(true, 100);
    }

    @Test
    public void customerHasLoyaltyCard() {
        assertEquals(true, customer.hasLoyaltyCard());
    }

    @Test
    public void customerHasWallet() {
        assertEquals(100, customer.getWallet());
    }
}
