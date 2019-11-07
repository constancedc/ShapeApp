package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    private Color currentColour;
    private JButton btn1;


    public ColourSelector(){
        currentColour=new Color(1,1,1);
        btn1=new JButton("Select Colour");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", currentColour);
                currentColour=newColour;
                btn1.setBackground(currentColour);
                btn1.setOpaque(true);
                btn1.setBorderPainted(false);
            }
        });
        add(btn1);
    }
    public Color getCurrentColour(){
        return(currentColour);
    }



}
