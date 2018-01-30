import java.awt.geom.Point2D;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(new Point2D.Double(x, y), new Point2D.Double(x + width, y),
                new Point2D.Double(x + width, y + height), new Point2D.Double(x, y + height));
    }

    public Rectangle(int x, int y, int width, int height, int color) {
        this(x, y, width, height);
        this.color = color;
    }

    @Override
    public void draw(DrawingBoard db) {
        for (int i = (int)points.get(0).getX(); i < (int)points.get(2).getX(); i++) {
            for (int j = (int)points.get(0).getY(); j < (int)points.get(2).getY(); j++) {
                db.imgArray[i][j] = color;
            }
        }
    }
}
