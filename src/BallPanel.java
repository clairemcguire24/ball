import javax.swing.*;

import com.sun.jdi.request.ThreadStartRequest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.*;

public class BallPanel extends JPanel{
    private int x = 80;
    private int xSpeed = 3;
    private int y = 20;
    private int ySpeed = 3;
  

    Ball ballOne = new Ball(50,60,40);
    Ball[] olivia = new Ball[40];
  ArrayList<Ball> better = new ArrayList<Ball>();
  JButton blah = new JButton("press");




    public BallPanel(){
      blah.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
          better.add(new Ball((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
        
        }
      }
        );

      
      this.add(blah);
        setBackground(Color.BLUE);
         for(int i = 0; i<3; i++){
           better.add(new Ball((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
        }
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int x = e.getKeyCode();
                if (x == 39){
                    ballOne.moveRight();
                }
              if (x==37){
                ballOne.moveLeft();
              }
              if (x==38){
                ballOne.moveUp();
              }
              if (x==40){
                ballOne.moveDown();
              }

              

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //g.fillOval(x,y,10,10);
        //g.fillOval(ballOne.getX(), ballOne.getY(), ballOne.getSize(), ballOne.getSize() );
        //ballOne.drawBall(g);
        //ballOne.moveBall();

        ballOne.drawBall(g);
      if (ballOne.getX()-ballOne.getSize()>this.getWidth()){
        ballOne.setX(0);
      }
      if (ballOne.getX()<0){
        ballOne.setX(500);
      }
      if (ballOne.getY()-ballOne.getSize()>this.getHeight()){
        ballOne.setY(500);
      }
      if (ballOne.getY()<0){
        ballOne.setY(0);
      }


        for(int i = 0; i<better.size(); i++){
            better.get(i).drawBall(g);
            better.get(i).moveBall(this);
        }

        try {
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        };




        repaint();


    }






}