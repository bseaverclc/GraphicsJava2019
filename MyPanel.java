import javax.swing.*;
import java.awt.*;
public class MyPanel extends JPanel
{
    private ImageIcon im = new ImageIcon("queenHearts.png");
    
    public MyPanel(Color c)
    {
        setBackground(c);
        setPreferredSize(new Dimension(200,300));
    }

    public void paintComponent(Graphics g)// automatically gets called by JVM when refreshed
    {
        super.paintComponent(g);
        im.paintIcon(this,g,0,0);
        
        int width = getWidth();
        int height = getHeight();
       
       
        g.setColor(Color.RED);
        g.fillOval(width/2-15,height/2-15,30,30);

        // g.drawOval(80,30,10,10);

        // g.setColor(Color.CYAN);
        // g.drawArc(30,400,60,30,180,180);
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         int xadd = getWidth()/8;
        int yadd = getHeight()/8;
        int startx = 0, starty = 0;
        
        // Square[] squares = new Square[64];
        // for(int i = 0; i<64; i++)
        // {
            // squares[i] = new Square(startx, starty,xadd, yadd);
            
        // }
        
        
    
        
        // Color startColor = Color.black;
        // Color secondColor = Color.WHITE;
        // for(int row = 0; row <8; row++)
        // {
            // for(int col = 0; col<8; col++)
            // {
                // if(col%2 ==0)
                    // g.setColor(startColor);
                // else g.setColor(secondColor);
                // g.fillRect(startx, starty,xadd,yadd);
                // startx += xadd;
            // }
            // startx = 0;
            // starty += yadd;
            // Color temp = startColor;
            // startColor = secondColor;
            // secondColor = temp;
        // }

        

    }

}