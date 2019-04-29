import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallPanel extends JPanel
{
    private Ball ball1, chick;
    private int x = 50;

    public BallPanel()
    {
        setPreferredSize(new Dimension(500,500)); 
        ball1 = new Ball(x,50,5,1,1,Color.RED);
        addKeyListener(new MyKeyListener());
        setFocusable(true);
        requestFocus();
        //chick = new Ball(30,70,10,3,2,Color.GREEN);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // draws paper
        ball1.draw(g);
        //ball1.move();
        //ball1.bounce(this);
        // chick.draw(g);
        // chick.move();
        //chick.bounce(this);
        //g.fillOval(x,y, 10,10);
        // x += xAdd;
        //y++;
        //if( x == getWidth()-10 || x ==0 ) xAdd *=-1;


        try
        {
            Thread.sleep(100);// pausing the computer
        }
        catch(Exception e)
        {
        }

        //repaint();
    }

    public class MyKeyListener extends KeyAdapter
    {

        public void keyPressed(KeyEvent e)
        {
            int key = e.getKeyCode();
            System.out.println(key);
            switch(key)
            {
                case KeyEvent.VK_D:
                ball1.moveRight();
                break;
                case 65:
                ball1.moveLeft();
                break;
                default:
                System.out.println("Hi");
            }
            
            
            
            
            if(key == 68)
            {

                ball1.moveRight();
            }
            repaint();
        }
    }

}