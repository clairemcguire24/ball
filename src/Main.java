
import java.awt.*;
import javax.swing.*;

public class Main {
  
    public static void main (String [] args){
      System.out.println("made a comment in replit");
        System.out.println("added a comment from the other one");

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);

        BallPanel myBall = new BallPanel();

        //myFrame.add(myPanel);
        myFrame.add(myBall);

        myFrame.setVisible(true);



    }

}