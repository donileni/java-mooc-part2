
import java.util.ArrayList;


public class Box implements Packable{
    private double weight;
    private double maxWeight; 
    private ArrayList<Packable> items;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight; 
        this.weight = 0; 
        this.items = new ArrayList<>(); 
    }
    
    public void add(Packable packable){
        if ((this.maxWeight - this.weight) > packable.weight()){
            this.weight += packable.weight();
            items.add(packable);
        }
    }
    
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + this.weight + " kg";
    }
    
    public double weight(){
        double weight = 0; 
        for (Packable item: this.items){
            weight += item.weight();
        }
        return weight; 
    }
}
