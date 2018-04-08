import java.util.ArrayList;

public class Basket {
    private ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int calculateBOGOF() {
        boolean bOGOF = true;
        int total = 0;
        for (Item item : items) {
            if (item.isBuyOneGetOneFree() && bOGOF) {
                bOGOF = false;
                total += item.getCost();
            }
            else if (item.isBuyOneGetOneFree() && !bOGOF) {
                bOGOF = true;
            }
            else {
                total += item.getCost();
            }
        }
        return total;
    }

    public void clearItems() {
        this.items.clear();
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateDiscount(int runningTotal) {
        if (runningTotal >= 2000) {
            runningTotal *= 0.9;
        }
        return runningTotal;
    }

    public int totalCost() {
        return calculateDiscount(calculateBOGOF());
    }
}
