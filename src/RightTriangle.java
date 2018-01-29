import java.awt.geom.Point2D;

public class RightTriangle extends Shape {
    public RightTriangle(Point2D corner, Point2D point1, Point2D point2) {
        super(point1, new Point2D.Double(point2.getX(), point1.getY()), point2);
    }
}
