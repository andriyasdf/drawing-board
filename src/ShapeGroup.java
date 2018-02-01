import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class ShapeGroup implements Drawable {
    private Point2D pos = new Point2D.Double();
    private ArrayList<Shape> children = new ArrayList<>();

    public ShapeGroup(Shape... child) {
        children.addAll(Arrays.asList(child));

    }

    public ShapeGroup(Point2D pos, Shape... child) {
        this(child);
        this.pos = pos;
    }

    @Override
    public void draw(DrawingBoard db) {
        for (Drawable o : children) {
            o.draw(db);
        }
    }

    @Override
    public boolean within(DrawingBoard db) {
        for (Drawable o : children) {
            if (!o.within(db)) return false;
        }

        return true;
    }

    public void add(Shape s) {
        children.add(s);
    }
}
