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

        objects.add(new Line(new Point2D.Double(300, 200), new Point2D.Double(400, 300)));
        objects.add(new RightTriangle(new Point2D.Double(1, 2), new Point2D.Double( 400, 20), new Point2D.Double( 200, 300)));
        objects.add(new Rectangle(20, 20, 400, 100));

        // Draw all the objects
        for (Drawable o : objects) {
            o.draw(drawingBoard);
        }

        drawingBoard.show();
    }
}
