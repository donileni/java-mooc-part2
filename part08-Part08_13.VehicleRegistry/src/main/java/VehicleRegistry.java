
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    
    private HashMap <LicensePlate, String> vehicles;
    
    public VehicleRegistry(){
        this.vehicles = new HashMap<>(); 
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        for (LicensePlate license : vehicles.keySet()){
            if (license.equals(licensePlate)){
                return false; 
            }
        }
        
        this.vehicles.put(licensePlate, owner);
        return true; 
    }
    
    public String get(LicensePlate licensePlate){
        return this.vehicles.getOrDefault(licensePlate, null); 
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (!this.vehicles.containsKey(licensePlate)){
            return false; 
        }
        
        this.vehicles.remove(licensePlate); 
        
        return true; 
    }
    
    public void printLicensePlates(){
        for (LicensePlate license : vehicles.keySet()){
            System.out.println(license);
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> owners = new ArrayList<>(); 
        
        for (String owner : vehicles.values()){
            if (!(owners.contains(owner))){
                owners.add(owner); 
            }
        }
        
        for (String owner : owners){
            System.out.println(owner);
        }
    }
}
