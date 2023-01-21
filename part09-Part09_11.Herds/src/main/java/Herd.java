
import java.util.ArrayList;


public class Herd implements Movable {
    private ArrayList<Movable> herd; 
    
    public Herd(){
        this.herd = new ArrayList<>(); 
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable); 
    }
    
    public String toString(){
        String allOrganisms = ""; 
        for (Movable organism: this.herd){
            allOrganisms += organism.toString() + "\n";
        }
        return allOrganisms; 
    }
    
    public void move(int dx, int dy){
        for (Movable organism: this.herd){
            organism.move(dx, dy);
        }
    }
}
