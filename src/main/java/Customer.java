public class Customer {
    private boolean hasLoyaltyCard;
    private int wallet;

    public Customer(boolean hasLoyaltyCard, int wallet) {
        this.hasLoyaltyCard = hasLoyaltyCard;
        this.wallet = wallet;
    }

    public boolean hasLoyaltyCard() {
        return hasLoyaltyCard;
    }

    public int getWallet() {
        return wallet;
    }
}
