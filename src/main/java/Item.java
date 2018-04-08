public class Item {

    private int cost;
    private boolean isBuyOneGetOneFree;

    public Item(int cost, boolean isBuyOneGetOneFree) {
        this.cost = cost;
        this.isBuyOneGetOneFree = isBuyOneGetOneFree;
    }

    public int getCost() {
        return cost;
    }

    public boolean isBuyOneGetOneFree() {
        return isBuyOneGetOneFree;
    }
}
