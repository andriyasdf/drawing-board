import javafx.scene.paint.Color;

import java.awt.geom.Point2D;

public interface Drawable {
    Point2D position = new Point2D.Double();
    Color color = Color.BLACK;

    void drawOn(DrawingBoard db);
    boolean within(DrawingBoard db);
}
