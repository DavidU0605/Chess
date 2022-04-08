package chess.game;

import javafx.scene.image.Image;

public abstract class Figure {
    private Image image;


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}