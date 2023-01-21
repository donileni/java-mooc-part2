
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int max = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            
            String input = scan.nextLine(); 
            
            if (input.equals("quite")){
                break;
            }
            
            String[] parts = input.split(" "); 
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]); 
            
            if (amount < 0){
                continue; 
            }
            
            if (command.equals("add")){
                if (firstContainer + amount > max){
                    firstContainer = max;
                } else {
                    firstContainer += amount; 
                }
            } else if (command.equals("move")){
                if (amount > firstContainer){
                    secondContainer += firstContainer;
                    firstContainer = 0; 
                } else {
                    firstContainer -= amount; 
                    secondContainer += amount;
                }
                
                if (secondContainer > max){
                    secondContainer = max;
                }
            } else if (command.equals("remove")){
                if (amount > secondContainer){
                    secondContainer = 0;
                } else {
                    secondContainer -= amount; 
                }
            }
            
            
            

        }

    }

}
