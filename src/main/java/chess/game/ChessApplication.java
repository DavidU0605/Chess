package chess.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class ChessApplication extends Application {
    private static final int SIZE = 8;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridpane = new GridPane();

        Scene scene = new Scene(gridpane, WIDTH, HEIGHT);


        buildBoard(gridpane);


        stage.setTitle("Chess");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private static void buildBoard(GridPane gridpane) {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                StackPane stackpane = new StackPane();
                Rectangle rectangle = new Rectangle((double) WIDTH / SIZE, (double) HEIGHT / SIZE);
                rectangle.setFill(x % 2 == y % 2 ? Color.WHITE : Color.BLACK);
                stackpane.getChildren().add(rectangle);

                stackpane.setOnMouseClicked(e -> {
                    Rectangle target = (Rectangle) e.getTarget();
                    int x1 = GridPane.getRowIndex(target);
                    int y1 = GridPane.getColumnIndex(target);

                    System.out.println(x1 + " " + y1);
                });

                gridpane.add(stackpane, y, x);
            }
        }
    }

    public static void main(String[] args) {
        launch();
    }
}