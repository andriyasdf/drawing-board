import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(new Point2D.Double(x, y), new Point2D.Double(x + width, y + height),
                new Point2D.Double(x, y + height), new Point2D.Double(x + width, y));
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
