import java.awt.*;
import javax.swing.*;


public class Ball{

    private int x,y, size, xSpeed, ySpeed;
    private Color c;



    public Ball (int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = (int)(Math.random()*10);
        ySpeed = (int)(Math.random()*10);
        c = new Color ((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));

    }

    public int getX (){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }

    public void drawBall(Graphics corey){
        corey.fillOval(x,y,size,size);
        corey.setColor(c);
    }

    public void moveBall(JPanel bPanel){
        x+=xSpeed;
        if (x>=bPanel.getWidth()-size || x<=0){
            xSpeed*=-1;
        }

        y+=ySpeed;
        if (y>=bPanel.getHeight()-size || y<=0){
            ySpeed*=-1;
        }



    }

    public void moveRight(){
        x+=xSpeed;
    }


}