
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity; 
        this.items = new ArrayList<>(); 
    }
    
    public int currentAmount(){
        int currentAmount = 0; 
        for (Item item : items){
            currentAmount += item.getWeight();
        }
        return currentAmount;
    }
    
    @Override
    public void add(Item item){
        int remainingAmount = this.capacity - currentAmount(); 
        
        if (remainingAmount >= item.getWeight()){
            this.items.add(item); 
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return items.contains(item); 
    }
}
