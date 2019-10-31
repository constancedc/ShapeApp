package shapes;
import java.awt.*;

public class Rect extends Shape {
    private int width;
    private int height;

    public Rect(Point initpos, Color col, int width, int height){//constructor
        super(initpos, col);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }
}
