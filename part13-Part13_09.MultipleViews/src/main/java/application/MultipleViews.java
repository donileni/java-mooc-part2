package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    public void start(Stage window) {
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");
        
        Label firstLabel = new Label("First view!");
        Label secondLabel = new Label("Second view!");
        Label thirdLabel = new Label("Third view!");
        
        
        BorderPane firstWindow = new BorderPane(); 
        VBox secondWindow = new VBox();
        GridPane thirdWindow = new GridPane(); 
        
        
        firstWindow.topProperty().set(firstLabel);
        firstWindow.centerProperty().set(firstButton);
        
        secondWindow.getChildren().add(secondButton);
        secondWindow.getChildren().add(secondLabel);
        
        thirdWindow.add(thirdLabel, 0, 0);
        thirdWindow.add(thirdButton, 1, 1);
        
        
        Scene firstScene = new Scene(firstWindow); 
        Scene secondScene = new Scene(secondWindow); 
        Scene thirdScene = new Scene (thirdWindow); 
        
        window.setScene(firstScene);
        window.show();
        
        firstButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        
        secondButton.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        
        thirdButton.setOnAction((event) -> {
            window.setScene(firstScene);
        });
         
    }
    

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
