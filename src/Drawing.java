import java.util.ArrayList;
import java.util.Arrays;

public class Drawing {
    private DrawingBoard drawingBoard;
    private ArrayList<Drawable> objects = new ArrayList<>();

    public Drawing(int width, int height) {
        drawingBoard = new DrawingBoard(width, height);
    }

    public Drawing(String filePath) {
        drawingBoard = new DrawingBoard(filePath);
    }

    public void add(Drawable... object) {
        objects.addAll(Arrays.asList(object));
    }

    public void show() {
        // Draw all the objects
        for (Drawable o : objects) {
            if (o.within(drawingBoard)) o.draw(drawingBoard);
        }

        drawingBoard.show();
    }
}
