import javax.swing.*;
import java.awt.*;

public class MyPanelDriver
{
   public static void main(String[] args)
   {
       JFrame frame = new JFrame();
       //frame.setSize(500,500);
       
       BallPanel panel = new BallPanel();
       //MyPanel panel = new MyPanel(Color.BLUE);
       
       Container pane = frame.getContentPane();
       
       pane.add(panel);
       
       frame.pack(); // packs the frame around the panel
       frame.setVisible(true);
       
       
    }

   
}
