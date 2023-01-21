
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String name, int price) {

        if (this.items.keySet().contains(name)) {
            increaseQuantity(name);
        } else {
            this.items.put(name, new Item(name, 1, price));

        }
    }

    public int price() {
        int price = 0;

        for (Item item : items.values()) {
            price += item.price();
        }

        return price;
    }

    public void print() {

        for (Item item : items.values()) {
            System.out.println(item.name() + ": " + item.qty());
        }
    }

    public void increaseQuantity(String name) {
        this.items.get(name).increaseQuantity();
    }
}
