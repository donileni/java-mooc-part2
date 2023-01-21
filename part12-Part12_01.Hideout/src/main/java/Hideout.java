
import java.util.ArrayList;

public class Hideout<T> {
    ArrayList<T> hideout; 
    
    public Hideout(){
        this.hideout = new ArrayList<>(); 
    }
    
    public void putIntoHideout(T toHide){
        this.hideout.clear();
        this.hideout.add(toHide); 
    }
    
    public T takeFromHideout(){
        T currentObject = hideout.get(0);
        
        if (this.hideout.size() == 0){
            return null; 
        } else {
            this.hideout.clear();
            return currentObject;
        }
    }
    
    public boolean isInHideout(){
        if (this.hideout.size() > 0){
            return true;
        } else {
            return false; 
        }
    }
}
