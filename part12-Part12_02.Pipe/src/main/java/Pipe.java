
import java.util.ArrayList;


public class Pipe<T> {
    ArrayList<T> pipeContents;
    
    public Pipe(){
        this.pipeContents = new ArrayList<>(); 
    }
    
    public void putIntoPipe(T value){
        ArrayList<T> newPipe = new ArrayList<>(); 
        newPipe.add(value); 
        
        for (T t : this.pipeContents){
            newPipe.add(t);
        }
        
        this.pipeContents = newPipe; 
    }
    
    public T takeFromPipe(){
        T lastObject = this.pipeContents.get(this.pipeContents.size() - 1);
        this.pipeContents.remove(this.pipeContents.size() - 1); 
        return lastObject;
    }
    
    public boolean isInPipe(){
        if (this.pipeContents.size() == 0){
            return false;
        } else {
            return true; 
        }
    }
}
