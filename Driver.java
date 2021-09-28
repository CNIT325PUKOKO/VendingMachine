
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
