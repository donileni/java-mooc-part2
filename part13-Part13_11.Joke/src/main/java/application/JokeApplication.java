package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    public void start(Stage window) {
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");
        
        BorderPane layout = new BorderPane(); 
        
        HBox menu = new HBox(); 
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        menu.getChildren().addAll(firstButton, secondButton, thirdButton); 
        
        layout.setCenter(menu);
        
        Label message = new Label(""); 
        String defaultJoke = "What do you call a bear with no teeth?";
        
        message.setText(defaultJoke);
        
        layout.setTop(message);
        
        firstButton.setOnAction((event) -> {
            message.setText(defaultJoke);
        });
        
        secondButton.setOnAction((event) -> {
            String answer = "A gummy bear.";
            message.setText(answer);
        });
        
        thirdButton.setOnAction((event) -> {
            String explanation = "It is funnny because it is true";
            message.setText(explanation);
        });
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(JokeApplication.class); 
    }
}
