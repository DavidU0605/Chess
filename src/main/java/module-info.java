module chess.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens chess.game to javafx.fxml;
    exports chess.game;
}