package view;

import controller.CurrencyController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class CurrencyView extends Application{

    private CurrencyController controller;
    private TextField amount = new TextField();
    private TextField result = new TextField();
    private ChoiceBox<String> from = new ChoiceBox<>();
    private ChoiceBox<String> to = new ChoiceBox<>();

    public void start(Stage stage){
        Button convertButton = new Button("Convert");
        GridPane grid = new GridPane();
        Insets insets = new Insets(10, 10, 10, 10);

        stage.setTitle("Currency Converter");
        Label instructions = new Label("Enter amount, choose currency and click Convert");
        instructions.setPadding(insets);

        Label amountLabel = new Label("Amount");
        Label resultLabel = new Label("Result");
        Label fromLabel = new Label("From");
        Label toLabel = new Label("To");

        amount.setPromptText("e.g. 10.40");
        result.setEditable(false);

        from.getItems().addAll(controller.getCurrencyShortName());
        from.setValue("EUR");
        to.getItems().addAll(controller.getCurrencyShortName());
        to.setValue("USD");

        grid.setHgap(10);
        grid.setVgap(5);
        grid.setPadding(insets);

        grid.add(amountLabel, 0,0);
        grid.add(fromLabel, 1, 0);
        grid.add(amount, 0, 1);
        grid.add(from, 1, 1);
        grid.add(resultLabel, 0, 2);
        grid.add(toLabel, 1, 2);
        grid.add(result, 0, 3);
        grid.add(to, 1, 3);
        grid.add(convertButton, 0, 4, 2, 1);

        BorderPane layout = new BorderPane();
        layout.setTop(instructions);
        layout.setCenter(grid);
        Scene scene = new Scene(layout);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.show();

        amount.setTextFormatter(new TextFormatter<String>(change -> {
            if (change.getControlNewText().matches("\\d*(\\.\\d*)?")) {
                return change;
            }
            return null;
        }));

       convertButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String converted =  controller.convert(amount.getText(), from.getValue(), to.getValue());
                result.setText(converted);
            }
        });

    }

    public void init() {
        controller = new CurrencyController();
    }

}
