package drawingUI;

import javax.swing.*;

public class SquaresDimsSelector extends JPanel {

    private JSlider side;

    public SquaresDimsSelector(){
        side=new JSlider(1,100);
        side.setName("Side");
        add(side);
    }
    public int getSquareSide(){
        return side.getValue();
    }
}
