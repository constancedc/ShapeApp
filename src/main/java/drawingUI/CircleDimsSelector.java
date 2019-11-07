package drawingUI;

import shapes.Circle;

import javax.swing.*;

public class CircleDimsSelector extends JPanel {
    private JSlider radius;

    CircleDimsSelector(){
        radius=new JSlider(1,100);
        add(radius);

    }

    public int getCurrentRadius(){
       return radius.getValue();
    }
}
