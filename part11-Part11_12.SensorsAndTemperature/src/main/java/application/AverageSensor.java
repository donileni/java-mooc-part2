
package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> averages; 
    
   public AverageSensor(){
       this.sensors = new ArrayList<Sensor>();
       this.averages = new ArrayList<Integer>(); 
   }

    @Override
    public boolean isOn() {
        
       boolean isOn = false;
       for (Sensor sensor : sensors){
           if (sensor.isOn() == true){
               isOn = true;
           } else {
               isOn = false;
               break; 
           }
           
       }
       
       return isOn; 
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors){
            sensor.setOn(); 
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0; 
        if (isOn() && !sensors.isEmpty()){
            for (Sensor sensor : sensors){
                sum += sensor.read();
            }
            
            int average = sum / sensors.size();
            
            this.averages.add(average); 
            
            return average; 
        } else {
            throw new IllegalArgumentException("Error average");
        }
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd); 
    }
    
    public List<Integer> readings() {
        return this.averages;
    }
    
}
