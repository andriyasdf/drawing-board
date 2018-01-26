import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Drawing {
    private static int width = 800;
    private static int height = 600;

    public static DrawingBoard drawingBoard;

    public static void main(String[] args) {
        drawingBoard = new DrawingBoard(width, height);

        Triangle triangle = new Triangle(new Point2D.Double(1, 2), new Point2D.Double( 400, 20), new Point2D.Double( 200, 300));
        triangle.draw(drawingBoard);

        Line line = new Line(new Point2D.Double(20, 20), new Point2D.Double(400, 100));
        line.draw(drawingBoard);

        Rectangle rectangle = new Rectangle(new Point2D.Double(20, 20), new Point2D.Double(400, 100));
        rectangle.draw(drawingBoard);


        drawingBoard.show();
    }
}
