
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true){
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            
            String input = scan.nextLine(); 
            
            if (input.equals("quite")){
                break; 
            }
            
            String [] parts = input.split(" "); 
            String command = parts[0]; 
            int amount = Integer.valueOf(parts[1]); 
            
            if (amount < 0){
                continue; 
            }
            
            if (command.equals("add")){
                firstContainer.add(amount);
                
            } else if (command.equals("move")){
                if(amount > firstContainer.contains()){
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                } else {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }

                
            } else if (command.equals("remove")){
                secondContainer.remove(amount);
                
            }
            
        }
    }

}
