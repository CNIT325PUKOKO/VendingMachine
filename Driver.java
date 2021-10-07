
/**
 * Driver starts the program execution
 *
 * @author Jack, Michael
 * @version 2.0
 */
import javax.swing.*;
public class Driver
{
    public static void main(String[] args)
    {
        Controller control = new Controller();
        SwingUtilities.invokeLater
        (
             new Runnable()
             {
                 public void run()
                 {
                     //pass the controller to the GUI upon creation
                     GUIable gui = new GUI(control);

                 }
             }
        );
    }
}
