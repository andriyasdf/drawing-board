import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Drawing {
    private static int width = 800;
    private static int height = 600;

    public static DrawingBoard drawingBoard;

    public static void main(String[] args) {
        drawingBoard = new DrawingBoard(width, height);

        ArrayList<Drawable> objects = new ArrayList<>();

        objects.add(new Rectangle(20, 20, 400, 100));
        objects.add(new Rectangle(100, 400, 40, 40));
        objects.add(new Rectangle(300, 500, 100, 200));

        objects.add(new ShapeGroup());

        // Draw all the objects
        for (Drawable o : objects) {
            o.draw(drawingBoard);
        }

        drawingBoard.show();
    }
}
