import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(new Point2D.Double(x, y), new Point2D.Double(x + width, y + height),
                new Point2D.Double(x, y + height), new Point2D.Double(x + width, y));
    }
}
