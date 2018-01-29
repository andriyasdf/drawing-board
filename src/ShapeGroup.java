import java.util.ArrayList;

public class ShapeGroup implements Drawable {
    private ArrayList<Shape> children = new ArrayList<>();

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
