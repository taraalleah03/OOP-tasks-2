package view;

import controller.PetController;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetView extends Application{

    private static final int CANVAS_SIZE = 1000;

    private GraphicsContext gc;
    private PetController controller;
    private Image petImage;

    @Override
    public void init() {
        controller = new PetController(this);
    }

    public void start(Stage stage){

        petImage = new Image("pet.png");
        Canvas canvas = new Canvas(CANVAS_SIZE, CANVAS_SIZE);
        gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseMoved(event -> {
            controller.setTarget(event.getX(), event.getY());
        });
        canvas.setOnMouseExited(event -> {
            controller.stopChasing();
        });

        //every 60 seconds
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                controller.update();
            }
        };

        timer.start();
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, CANVAS_SIZE,CANVAS_SIZE);
        stage.setTitle("My Virtual Pet");
        stage.setScene(scene);
        scene.getStylesheets().add("style.css");
        stage.show();

    }

    public void updateCanvas(double petX, double petY) {
        gc.clearRect(0, 0, CANVAS_SIZE, CANVAS_SIZE);

        double x = petX - petImage.getWidth() /2;
        double y = petY - petImage.getHeight() /2;
        gc.drawImage(petImage,x,y);
    }
}
