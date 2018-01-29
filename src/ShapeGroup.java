import java.util.ArrayList;
import java.util.Arrays;

public class ShapeGroup implements Drawable {
    private ArrayList<Shape> children = new ArrayList<>();

    public ShapeGroup(Shape... child) {
        children.addAll(Arrays.asList(child));
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
