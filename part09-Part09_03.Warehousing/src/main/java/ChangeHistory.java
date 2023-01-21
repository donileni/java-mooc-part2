
import java.util.ArrayList;


public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>(); 
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear(); 
    }
    
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        double largest = 0; 
        
        for (Double number : history){
            if (number > largest){
                largest = number;
            }
        }
        return largest; 
    }
    
    public double minValue(){
        double smallest = history.get(0); 
        for (Double number : history){
            if (number < smallest){
                smallest = number;
            }
        }
        return smallest; 
    }
    
    public double average(){
        double totalValue = 0; 
        double average = 0;
        for (Double number : history){
            totalValue += number; 
        }
        
        average = (totalValue / history.size());
        return average;
    }
 
}
