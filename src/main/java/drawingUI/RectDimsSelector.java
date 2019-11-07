package drawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimsSelector extends JPanel {
    private JSlider width;
    private JSlider height;

    public RectDimsSelector(){
        JPanel controls1=new JPanel();
        controls1.setLayout(new GridLayout(5,1));
        JLabel label=new JLabel(" Width");
        JLabel label2=new JLabel(" Height");
        width=new JSlider(1,100);
        height=new JSlider(1,100);
        controls1.add(label);
        controls1.add(width);
        controls1.add(label2);
        controls1.add(height);
        add(controls1);

    }

    public int getRectWidth(){
        return width.getValue();
    }
    public int getRectHeight(){
        return height.getValue();
    }

}
