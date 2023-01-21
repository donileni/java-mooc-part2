package smiley;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

        
        
public class SmileyApplication extends Application {
    
    public void start (Stage stage) {
        
        BorderPane layout = new BorderPane(); 
        
        Canvas canvas = new Canvas(640, 480); 
        GraphicsContext painter = canvas.getGraphicsContext2D();
        
        painter.setFill(Color.BLACK);
        painter.fillRect(120, 40, 50, 50);
        painter.fillRect(310, 40, 50, 50);
        painter.fillRect(80, 200, 50, 50);
        painter.fillRect(350, 200, 50, 50);
        painter.fillRect(130, 250, 220, 50);
         
        
        layout.setCenter(canvas);
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();

        
    }
    
    


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
