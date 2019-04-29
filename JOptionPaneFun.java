import javax.swing.*;
public class JOptionPaneFun
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Hello World");
        int answer = JOptionPane.showConfirmDialog(null, "Are you having fun?");
        if(answer == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Good for you!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Bad for you!");
        }
        boolean again = true;
        do
        {
            String cat = JOptionPane.showInputDialog(null, "What is your age?");
            int dog = 0;
            

            try
            {
                dog = Integer.parseInt(cat);
                dog = dog + 5;
                JOptionPane.showMessageDialog(null, "Hello " + dog);
                again = false;
            }
            catch(Exception blah)
            {
                JOptionPane.showMessageDialog(null,blah);
            }
        } while(again == true);

        }
    }