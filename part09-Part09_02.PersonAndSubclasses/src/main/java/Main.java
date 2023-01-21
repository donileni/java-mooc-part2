
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your test code here
        
        ArrayList<Person> persons = new ArrayList<Person>(); 
        
        persons.add(new Teacher("anton", "asdasd", 1000)); 
        persons.add(new Student("Filip", "123123")); 
        
        printPersons(persons); 
    }
    
    public static void printPersons(ArrayList<Person> persons){ 
        for (Person person : persons){
            System.out.println(person);
            
        }
    }

}
