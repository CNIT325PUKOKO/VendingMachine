
/**
 * Write a description of class Controller here.
 *
 * @author kintzel
 * @version 9-28-21
 */
import javax.swing.*;
//import Machines.*;
public class Controller
{
    Machinable machine;
    GUIable gui;
    public Controller()
    {
        machine = new Machine(3,2,2,1);
        execute();
        //gui = new GUI(this);
        
    }
    
    public double sendSelectionToMachine(String code)
    {
        return machine.getPrice(code);
        //return 1.50;
    }

    public String sendCashAmountToMachine(String codey, String cashy)
    {
        return machine.comparePrice(codey,cashy);
    }
    
 public void execute()
    {
        Machine vend = (Machine)machine;
        String[] names = new String[8];
        names[0] = "Gum";
        names[1] = "Pop-Tarts";
        names[2] = "Air Heads";
        names[3] = "M&Ms";
        names[4] = "Jolly Ranchers";
        names[5] = "Gummy Bears";
        names[6] = "Sour Gummy Worms";
        names[7] = "Reese's Cups";
        Size[] sizes = new Size[8];
        sizes[0] = Size.SMALL;
        sizes[1] = Size.BIG;
        sizes[2] = Size.SMALL;
        sizes[3] = Size.SMALL;
        sizes[4] = Size.MEDIUM;
        sizes[5] = Size.MEDIUM;
        sizes[6] = Size.MEDIUM;
        sizes[7] = Size.MEDIUM;
        double[] prices = new double[8];
        prices[0] = 0.5;
        prices[1] = 2;
        prices[2] = 0.5;
        prices[3] = 0.5;
        prices[4] = 1;
        prices[5] = 1;
        prices[6] = 1;
        prices[7] = 1;
        vend.populateProducts(names, sizes, prices);
        vend.printMachine();
        System.out.println(vend.getPrice("A1"));
        System.out.println(vend.comparePrice("A1", "1"));
    }
}   

