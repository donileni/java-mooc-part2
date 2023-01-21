
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList; 
    
    public UserInterface (TodoList newTodoList, Scanner newScanner){
        this.todoList = newTodoList;
        this.scanner = newScanner;  
        
    }
    
    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break; 
            }
            
            if (command.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.todoList.add(task);
            }
            
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int input = Integer.valueOf(scanner.nextLine()); 
                this.todoList.remove(input);
            }
            
            if (command.equals("list")){
                this.todoList.print();
            }
        }
    }
}
