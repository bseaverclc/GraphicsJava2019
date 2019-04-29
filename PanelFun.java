import javax.swing.*;
import java.awt.*;
public class PanelFun
{
    public static void main(String[] args)
    {
        JFrame dog = new JFrame();
        dog.setSize(300,200);
        
        Container pane = dog.getContentPane();
        pane.setLayout(new GridLayout(8,8));
        
        for(int i = 0; i<64; i++)
        {
            JPanel cat = new JPanel();
            if(i%2==0) cat.setBackground(Color.WHITE);
            else cat.setBackground(Color.BLACK);
            pane.add(cat);
            
        }
        
        /*JPanel horse = new JPanel();
        horse.setBackground(Color.CYAN);
        Color mine = new Color(122,5,9);
        cat.setBackground(mine);
        cat.setBackground(new Color(5,189,7));*/
        
        
        
        
        //pane.add(cat);
        //pane.add(horse);
        
        dog.setVisible(true);
    }
}