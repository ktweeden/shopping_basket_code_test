public class Checkout {

    private Customer customer;
    private Basket basket;

    public Checkout(Basket basket, Customer customer) {
        this.basket = basket;
        this.customer = customer;
    }

    public int chargeCustomer() {
        int total = basket.totalCost();
        if (customer.hasLoyaltyCard()) {
            total *= 0.98;
        }
        return total;
    }
}
