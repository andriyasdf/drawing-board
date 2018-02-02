import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;

public class ShapeGroup implements Drawable {
    private Point2D pos = new Point2D.Double();
    private ArrayList<Drawable> children = new ArrayList<>();

    public ShapeGroup(Drawable... child) {
        children.addAll(Arrays.asList(child));

    }

    public ShapeGroup(Point2D pos, Drawable... child) {
        this(child);
        this.pos = pos;
    }

    @Override
    public void drawOn(DrawingBoard db) {
        for (Drawable o : children) {
            o.drawOn(db);
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
