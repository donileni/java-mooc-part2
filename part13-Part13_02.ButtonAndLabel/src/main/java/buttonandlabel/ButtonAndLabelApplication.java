package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {
    
    public void start (Stage window) {
        FlowPane layout = new FlowPane(); 
        
        Label lable = new Label("Label"); 
        Button button = new Button("Button"); 
        
        layout.getChildren().add(lable);
        layout.getChildren().add(button);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
