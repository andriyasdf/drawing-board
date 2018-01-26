import java.awt.geom.Point2D;

public class Triangle extends Shape {
    public Triangle(Point2D point1, Point2D point2, Point2D point3) {
        super(point1, point2, point3);
    }

    @Override
    public void draw(DrawingBoard db) {
        super.draw(db);

        for (int i = 0; i < points.size(); i++) {
            Line line = new Line(points.get(i), points.get((i+1) % points.size()));
            line.draw(db);
        }
    }
}
