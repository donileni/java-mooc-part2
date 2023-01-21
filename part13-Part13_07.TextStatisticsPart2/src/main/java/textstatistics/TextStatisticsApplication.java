package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea();
        HBox texts = new HBox();
        texts.setSpacing(20);
        
        Label letters = new Label("");
        Label numberOfWords = new Label("");
        Label longestWord = new Label("");

        texts.getChildren().add(letters);
        texts.getChildren().add(numberOfWords);
        texts.getChildren().add(longestWord);

        layout.setCenter(textArea);
        layout.setBottom(texts);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            letters.setText("Letters: " + characters);
            numberOfWords.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
            
        });

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
