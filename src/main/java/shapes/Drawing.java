package shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private Circle c; //Fields
    private Rect r;
    private Square s;
    private Frame f; //3


    ShapeDB shapeDB=new ShapeDB();


    public Drawing() {//Constructor
        setupCanvas();
        setupFrame();
    }


    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frames
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(600, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {    // Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }

    public void addCircle(Point pos, Color col, int radius) {
        Circle c = new Circle(pos, col, radius);
        shapeDB.addCircle(pos,col,radius);
    }

    public void addSquare(Point pos, Color col, int side) {
        Square s = new Square(pos, col, side);
        shapeDB.addSquare(pos,col,side);

    }

    public void addRect(Point pos, Color col, int w, int h) {
        Rect r = new Rect(pos, col, w, h);
        shapeDB.addRect(pos,col,w,h);
    }


    }

