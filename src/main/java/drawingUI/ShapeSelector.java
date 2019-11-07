package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    private JRadioButton bCirc;
    private JRadioButton bRect;
    private JRadioButton bSquare;
    private ButtonGroup group;



    public ShapeSelector(){
        bCirc=new JRadioButton();
        bRect=new JRadioButton();
        bSquare=new JRadioButton();
        group= new ButtonGroup();

        bCirc.setText("Circle");
        bRect.setText("Rectangle");
        bSquare.setText("Square");
        group.add(bCirc);
        group.add(bSquare);
        group.add(bRect);

        add(bCirc);
        add(bSquare);
        add(bRect);

        bRect.setSelected(true);
    }

    public int getCurrentShape(){
        if(bCirc.isSelected()){
            System.out.println("Circle selected");
            return 1;
        }
        else if (bRect.isSelected()){
            System.out.println("Rectangle selected");
            return 2;
        }
        else if (bSquare.isSelected()){
            System.out.println("Square selected");
            return 3;
        }
        else
        {
            return 0;
        }
    }
}
