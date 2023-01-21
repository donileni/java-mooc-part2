
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        System.out.println("Input Numbers");

        while (true) {
            double input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                number = +input;
            }
        }

        if (number > 0) {
            System.out.println(number);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
