package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

public class DictionaryView extends Application{

    private TextField wordField = new TextField();
    private Label meaning = new Label("Meaning...");
    private DictionaryController controller;

    public void start(Stage stage) {

        Button searchButton = new Button("Search");
        FlowPane pane = new FlowPane();

        stage.setTitle("Dictionary");
        wordField.setPromptText("Enter word to search");

        Insets insets = new Insets(10, 10, 10, 10);
        FlowPane.setMargin(wordField, insets);
        FlowPane.setMargin(meaning, insets);
        FlowPane.setMargin(searchButton, insets);

        pane.getChildren().add(wordField);
        pane.getChildren().add(meaning);
        pane.getChildren().add(searchButton);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String result = controller.search(wordField.getText());
                meaning.setText(result);
            }
        });
    }

    public void init() {
        controller = new DictionaryController();
    }
}
