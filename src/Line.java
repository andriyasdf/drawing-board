import java.awt.geom.Point2D;

public class Line extends Shape {
    public Line(Point2D point1, Point2D point2) {
        super(point1, point2);
    }

    public Line(Point2D point1, Point2D point2, int color) {
        super(point1, point2);
        this.color = color;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2));
    }

    public Line(int x1, int y1, int x2, int y2, int color) {
        this(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2), color);
    }

    @Override
    public void drawOn(DrawingBoard db) {
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
