package view;

import controller.CurrencyController;
import javafx.scene.control.Spinner;
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

public class CurrencyView extends Application{

    private Spinner<String> sidesSpinner = new Spinner<String>();
    private CurrencyController controller;
    private TextField field = new TextField();
    private Label convert = new Label("Enter amount to convert...");

    public void start(Stage stage){
        Button convertButton = new Button("Convert");
        FlowPane pane = new FlowPane();

        stage.setTitle("Currency Converter");
        field.setPromptText("Select a currency to convert to (EUR/GBP)");

        Insets insets = new Insets(10, 10, 10, 10);
        FlowPane.setMargin(field, insets);
        FlowPane.setMargin(convert, insets);
        FlowPane.setMargin(convertButton, insets);

        pane.getChildren().add(convert);
        pane.getChildren().add(field);
        pane.getChildren().add(convertButton);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

       convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String result = controller.convert(Double.valueOf(field.getText()));
                convert.setText(result);
            }
        });

    }

    public void init() {
        controller = new CurrencyController(this);
    }
    public String getType() {
        return sidesSpinner.getValue();
    }
}
