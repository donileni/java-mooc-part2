
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    
    private ArrayList<Person> employees; 
    
    public Employees(){
        this.employees = new ArrayList<>(); 
    }
    
    public void add(Person person){
        this.employees.add(person);
    }
    
    public void add(List<Person> peopleToAdd){
        for (Person person : peopleToAdd){
            this.employees.add(person); 
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator(); 
        
        iterator.forEachRemaining(employee -> System.out.println(employee));
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getEducation() == education){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next(); 
            if(person.getEducation() == education){
                iterator.remove();
            }
        }
    }
    
}
