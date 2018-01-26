public class Drawing {
    static DrawingBoard drawingBoard;

    public static void main(String[] args) {
        int width = 800;
        int height = 600;

        drawingBoard = new DrawingBoard(width, height);
    }
}
