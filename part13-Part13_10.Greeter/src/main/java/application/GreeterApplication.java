package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    public void start(Stage window) {
        Label instructionLabel = new Label("Enter your name and start.");
        TextField inputField = new TextField(); 
        Button startButton = new Button("Start"); 
        
        GridPane firstLayout = new GridPane(); 
        firstLayout.add(instructionLabel, 0, 0);
        firstLayout.add(inputField, 0, 1);
        firstLayout.add(startButton, 0, 2);
        
        firstLayout.setPrefSize(300, 180);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20,20));
        
        
        GridPane secondLayout = new GridPane();
        
        secondLayout.setPrefSize(300, 180);
        secondLayout.setAlignment(Pos.CENTER);
        
        Scene firstScene =  new Scene(firstLayout); 
        Scene secondScene =  new Scene(secondLayout);
        
        startButton.setOnAction((event) -> {
            String username = inputField.getText();
            Label welcomeLabel = new Label("Welcome " + username + "!");
            secondLayout.add(welcomeLabel, 0, 0);
            window.setScene(secondScene);
        });
        
        window.setScene(firstScene);
        window.show();

    }


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
