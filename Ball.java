import java.awt.*;
import javax.swing.*;

public class Ball
{
    private int x, y, radius, xSpeed,ySpeed;
    private Color c;
    
    public Ball(int x, int y, int radius, int xSpeed, int ySpeed, Color c)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.c = c;
    }
    
    public void moveRight()
    {
        x += xSpeed;
    }
    
    public void moveLeft()
    {
        x -= xSpeed;
    }
    
    public void draw(Graphics dog)
    {
        dog.setColor(c);
        dog.fillOval(x,y,2*radius,2*radius);
    }
    
    
    public void move()
    {
        x = x + xSpeed;
        y = y + ySpeed;
        
    }
    
    public void bounce(JPanel cat)
    {
        if(x >= cat.getWidth()-2*radius)
        {
            xSpeed = xSpeed*(-1);
        }
        
    }
    
    
}