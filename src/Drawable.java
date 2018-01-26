import javafx.scene.paint.Color;

public interface Drawable {
    Color color = Color.WHITE;

    void draw(DrawingBoard db);
    boolean within(DrawingBoard db);
}
