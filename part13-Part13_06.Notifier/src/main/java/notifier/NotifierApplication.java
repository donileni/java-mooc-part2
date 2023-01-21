package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class NotifierApplication extends Application {

    public void start(Stage window) {
        final TextField textField = new TextField();
        Button button = new Button("Update");
        final Label label = new Label();
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                label.setText(textField.getText());
            }
        });
        
        

        VBox layout = new VBox(textField, button, label);
        layout.setSpacing(20);


        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
