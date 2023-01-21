
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        // test your method here

        System.out.println("Input numbers, stop with 'end'");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            inputs.add(Integer.valueOf(input));
        }
        
        System.out.println(positive(inputs)); 

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> list = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList()); 
        
        return list; 
    }

}
