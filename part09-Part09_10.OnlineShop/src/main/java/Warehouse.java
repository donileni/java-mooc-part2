
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> items;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.items = new HashMap();
        this.stock = new HashMap(); 
    }
    
    public void addProduct(String name, int price, int stock){
        this.items.put(name, price); 
        this.stock.put(name, stock);
    }
    
    public int price(String product){
        return items.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if (stock(product) > 0){
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return items.keySet();
    }
}
