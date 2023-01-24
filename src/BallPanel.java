import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

public class BallPanel extends JPanel{
    private int x = 80;
    private int xSpeed = 3;
    private int y = 20;
    private int ySpeed = 3;

    Ball ballOne = new Ball(50,60,40);
    Ball[] olivia = new Ball[40];




    public BallPanel(){
        setBackground(Color.BLUE);
        for(int i = 0; i<40; i++){
            olivia[i] = new Ball((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
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


        for(int i = 0; i<olivia.length; i++){
            olivia[i].drawBall(g);
            olivia[i].moveBall(this);
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