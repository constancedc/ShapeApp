package drawingUI;

import javax.swing.*;
import java.awt.*;

public class SquaresDimsSelector extends JPanel {

    private JSlider side;

    public SquaresDimsSelector(){
        side=new JSlider(1,100);
        JPanel controls= new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label= new JLabel("Square size");
        controls.add(label);
        controls.add(side);
        add(controls);
    }
    public int getSquareSide(){
        return side.getValue();
    }
}
