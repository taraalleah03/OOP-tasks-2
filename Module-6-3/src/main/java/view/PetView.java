package view;

import controller.Controller;
import controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.Direction;

public class PetView extends Application{

    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;

    @Override
    public void init() {
        controller = new PetController(this);
    }

    private Direction getDirectionFromCursor(KeyCode Cursor) {
        switch (Cursor) {
            case UP:
                return Direction.UP;
            case DOWN:
                return Direction.DOWN;
            case LEFT:
                return Direction.LEFT;
            case RIGHT:
                return Direction.RIGHT;
            default:
                return null;
        }
    }

    public void updateCanvas(int playerX, int playerY) {
        int gridSize = 10;
        int canvasSize = 10;

        gc.clearRect(0, 0, canvasSize, canvasSize);

        gc.setFill(Color.BLUE);
        int x = playerX * CELL_SIZE;
        int y = playerY * CELL_SIZE;
        gc.fillRect(x, y, CELL_SIZE, CELL_SIZE);
    }
}
