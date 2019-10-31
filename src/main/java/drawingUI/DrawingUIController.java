package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DrawingUIController extends JPanel{
    private JPanel controlsPanel;
    private JPanel mainPanel;
    private JLabel label;


    public DrawingUIController(){
        controlsPanel=new JPanel();
        mainPanel=new JPanel();
        GridLayout grid=new GridLayout(3,1);
        GridLayout grid2=new GridLayout(2,1);
        controlsPanel.setLayout(grid);
        mainPanel.setLayout(grid);
        //mainPanel.setBackground(Color.blue);
        label=new JLabel("text 1");
        label.setOpaque(true);
        mainPanel.setBorder(new LineBorder(Color.BLACK));
        label.setBackground(Color.red);
        mainPanel.add(label);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }




}
