import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.scene.layout.*;


public class LayoutDemo extends Application {

    /*GridPane example
    @Override
    public void start(Stage stage) {
        GridPane layout = new GridPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");
        Button button5 = new Button("MIDDLE (with long text)");

        layout.add(button1, 0, 0);
        layout.add(button2, 1, 0);
        layout.add(button3, 0, 1);
        layout.add(button4, 1, 1);
        layout.add(button5, 0, 2, 2, 1);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    /*HBox and VBox example
    public void start(Stage stage) {
        HBox layout = new HBox();

        Button[] buttons = new Button[12];

        for (int i = 0; i < 12; i++) {
            buttons[i] = new Button("" + (i + 1));
            layout.getChildren().add(buttons[i]);
        }

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    /*StackPane example
    public void start(Stage stage) {
        StackPane layout = new StackPane();

        Button button1 = new Button("[           ]");
        Label label = new Label("Hello!");

        label.setOpacity(0.5);

        layout.getChildren().add(button1);
        layout.getChildren().add(label);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    /*AnchorPane example
    public void start(Stage stage) {
        AnchorPane layout = new AnchorPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");

        layout.getChildren().add(button1);
        layout.getChildren().add(button2);
        layout.getChildren().add(button3);
        layout.getChildren().add(button4);

        AnchorPane.setTopAnchor(button1, 10.0);
        AnchorPane.setLeftAnchor(button1, 10.0);

        AnchorPane.setTopAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 10.0);

        AnchorPane.setBottomAnchor(button3, 10.0);
        AnchorPane.setLeftAnchor(button3, 10.0);

        AnchorPane.setBottomAnchor(button4, 10.0);
        AnchorPane.setRightAnchor(button4, 10.0);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    /*TilePane example
    @Override
    public void start(Stage stage) {
        TilePane layout = new TilePane();

        Button[] buttons = new Button[12];

        for (int i = 0; i < 12; i++) {
            buttons[i] = new Button("" + (i + 1));
            layout.getChildren().add(buttons[i]);
        }

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    /*Nested containers example
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        HBox top = new HBox();
        top.getChildren().add(new Button("File"));
        top.getChildren().add(new Button("Edit"));
        top.getChildren().add(new Button("View"));
        layout.setTop(top);

        VBox left = new VBox();
        left.getChildren().add(new Button("A"));
        left.getChildren().add(new Button("B"));
        left.getChildren().add(new Button("C"));
        layout.setLeft(left);

        StackPane center = new StackPane();
        center.getChildren().add(new Button("CLICK!"));
        layout.setCenter(center);

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
    }*/

    public void start(Stage stage) {
        VBox layout = new VBox();

        Button button = new Button("CLICK ME!");
        layout.getChildren().add(button);

        Scene view = new Scene(layout);

        view.getStylesheets().add("style.css");

        stage.setScene(view);
        stage.show();
    }
}
