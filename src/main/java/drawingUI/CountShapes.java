package drawingUI;

import javax.swing.*;
import java.awt.*;

public class CountShapes extends JPanel {
    private int scorerect;
    private int scorecirc;
    private int scoresquare;


    public CountShapes(){
        JLabel label1=new JLabel("Rectangles: "+ scorerect);
        JLabel label2=new JLabel("Squares: "+ scoresquare);
        JLabel label3=new JLabel("Circle: "+ scorecirc);

        setLayout(new GridLayout(3,2));
        add(label1);
        add(label2);
        add(label3);
    }
    public void addscorerect(int previousscore){
        scorerect=previousscore+1;
    }
    public void addscoresquare(int previousscore){
        scoresquare=previousscore+1;
    }
    public void addscorecircle(int previousscore){
        scorecirc=previousscore+1;
    }
    public int returnrect(){
        return scorerect;
    }
    public int returnsquare(){
        return scoresquare;
    }
    public int returncirc(){
        return scorecirc;
    }



}
