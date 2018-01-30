import java.awt.geom.Point2D;

public class Line extends Shape {
    public Line(Point2D point1, Point2D point2) {
        super(point1, point2);
    }

    public Line(Point2D point1, Point2D point2, int color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public void draw(DrawingBoard db) {
        // Find the slope of the line
        double dy = points.get(1).getY() - points.get(0).getY();
        double dx = points.get(1).getX() - points.get(0).getX();
        double angle = Math.atan2(dy, dx);

        Point2D draw = new Point2D.Double(points.get(0).getX(), points.get(0).getY());
        while (draw.distance(points.get(1)) > 1) {
            db.imgArray[(int)draw.getY()][(int)draw.getX()] = color;

            draw.setLocation(draw.getX() + Math.cos(angle), draw.getY() + Math.sin(angle));
        }
    }
}
