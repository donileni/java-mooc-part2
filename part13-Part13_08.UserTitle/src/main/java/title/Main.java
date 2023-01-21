package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    
    public void start(Stage window){
        Parameters params = getParameters();
        String title = params.getNamed().get("userTitle"); 
        window.setTitle(title);
        window.show();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        UserTitle title = new UserTitle(scanner.nextLine());
        
        launch(Main.class,
                "--userTitle=" + title.getTitle());

    }

}
