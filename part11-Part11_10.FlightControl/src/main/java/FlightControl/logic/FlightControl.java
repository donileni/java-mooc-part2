
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map; 

public class FlightControl {
    
    private HashMap<String, Airplane> airplanes; 
    private HashMap<String, Flight> flights; 
    private Map<String, Place> places; 
    
    public FlightControl(){
        this.airplanes = new HashMap<>(); 
        this.flights = new HashMap<>(); 
        this.places = new HashMap<>(); 
    }
    
    public void addAirplane(String ID, int capacity){
        Airplane airplane = new Airplane(ID, capacity); 
        this.airplanes.put(ID, airplane); 
    }
    
    public void addFlight(Airplane airplane, String departureID, String arrivalID){
        this.places.putIfAbsent(departureID, new Place(departureID)); 
        this.places.putIfAbsent(arrivalID, new Place(arrivalID));
        
        Flight flight = new Flight(airplane, this.places.get(departureID), this.places.get(arrivalID)); 
        this.flights.put(flight.toString(), flight); 
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values(); 
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values(); 
    }
    
    public Airplane getAirplane(String ID){
        return this.airplanes.get(ID); 
    }
}
