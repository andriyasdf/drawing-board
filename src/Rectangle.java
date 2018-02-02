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
    public void drawOn(DrawingBoard db) {
        for (int y = (int)points.get(0).getX(); y < (int)points.get(2).getX(); y++) {
            for (int x = (int)points.get(0).getY(); x < (int)points.get(2).getY(); x++) {
                if (!within(db)) continue;

                db.imgArray[x][y] = color;
            }
        }
    }
}
