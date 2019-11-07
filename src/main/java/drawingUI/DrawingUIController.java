package drawingUI;

import shapes.Circle;
import shapes.Drawing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawingUIController extends JPanel{
    private JPanel controlsPanel;
    private JPanel mainPanel;
    private JLabel label;
    private Drawing drawing;
    private ShapeSelector sSel;
    private ColourSelector cSel;
    private CircleDimsSelector circDims;
    private RectDimsSelector rectDims;
    private SquaresDimsSelector squareDims;
    private CountShapes counter;

    public DrawingUIController(){
        controlsPanel=new JPanel();
        mainPanel=new JPanel();
        counter=new CountShapes();
        drawing=new Drawing();
        sSel=new ShapeSelector();
        cSel=new ColourSelector();
        circDims=new CircleDimsSelector();
        rectDims=new RectDimsSelector();
        squareDims=new SquaresDimsSelector();
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

               if(sSel.getCurrentShape()==1){
                   drawing.addCircle(mouseEvent.getPoint(),cSel.getCurrentColour(), circDims.getCurrentRadius());
                   drawing.repaint();
                   counter.addscorecircle(counter.returncirc());


               }
                else if(sSel.getCurrentShape()==2){
                    drawing.addRect(mouseEvent.getPoint(),cSel.getCurrentColour(), rectDims.getRectWidth(),rectDims.getRectHeight());
                    drawing.repaint();
                    counter.addscorerect(counter.returnrect());

                }
                if(sSel.getCurrentShape()==3){
                    drawing.addSquare(mouseEvent.getPoint(),cSel.getCurrentColour(),squareDims.getSquareSide());
                    drawing.repaint();
                    counter.addscoresquare(counter.returnsquare());

                }


            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        GridLayout grid=new GridLayout(3,1);
        GridLayout grid2=new GridLayout(2,1);
        controlsPanel.setLayout(grid);
        mainPanel.setLayout(grid2);
        counter.setLayout(new GridLayout(3,1));
        //mainPanel.setBackground(Color.blue);
        label=new JLabel("text 1");
        label.setOpaque(true);
        mainPanel.setBorder(new LineBorder(Color.BLACK));
        mainPanel.add(controlsPanel);
        mainPanel.add(counter);
        mainPanel.add(drawing);
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        //label.setBackground(Color.red);
        controlsPanel.add(circDims);
        controlsPanel.add(rectDims);
        controlsPanel.add(squareDims);

    }

    public JPanel getMainPanel(){
        return mainPanel;
    }




}
