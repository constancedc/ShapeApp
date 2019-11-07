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


    Point p1=new Point(200,200); //parameters
    Color q1=new Color(0x992266);
    Point p2=new Point (100, 100);
    Color q2=new Color(293333);
    ShapeDB shapeDB=new ShapeDB();


    public Drawing() {//Constructor

        c= new Circle(p1,q1,200); //instantiates the circle
        r= new Rect(p2,q2,200,100);
        s= new Square(p1,q2,40);

        setupCanvas();
        setupFrame();
        shapeDB.addCircle(p1,q1,200);
        shapeDB.addRect(p2,q2,100,100);
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

