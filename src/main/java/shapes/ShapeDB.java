package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> shapes;

    ShapeDB() {
        shapes = new ArrayList<Shape>();
    }

    void addCircle(Point pos, Color col, int radius) {
        Circle c = new Circle(pos, col, radius);
        shapes.add(c);
    }

    private void addSquare(Point pos, Color col, int side) {
        Square s = new Square(pos, col, side);
        shapes.add(s);

    }

    private void addRect(Point pos, Color col, int w, int h) {
        Rect r = new Rect(pos, col, w, h);
        shapes.add(r);
    }

    void drawShapes(Graphics g) {
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(g);
        }


    }
}
