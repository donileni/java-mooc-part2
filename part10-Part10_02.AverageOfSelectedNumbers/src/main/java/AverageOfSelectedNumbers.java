
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>(); 
        
        System.out.println("Input numbers, type 'end' to stop.");
        while (true){
            String input = scanner.nextLine(); 
            
            if (input.equalsIgnoreCase("end")){
                break;
            }
            inputs.add(input); 
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String input2 = scanner.nextLine(); 
        
        if (input2.equalsIgnoreCase("n")){
            double averageOfNegativeNumbers = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of negative numbers: " + averageOfNegativeNumbers);
        } 
        
        if (input2.equalsIgnoreCase("p")){
            double averageOfPositiveNumbers = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of positive numbers: " + averageOfPositiveNumbers);
        }
    }
}
