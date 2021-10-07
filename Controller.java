
/**
 * Controller handles the interaction between the different modules
 *
 * @author Kintzel, Kayla
 * @version 3.0
 */
public class Controller
{
    Machinable machine;
    GUIable gui;
    Dispense dispenser;
    boolean machineStatus;
    
    /**
     * Constructor for objects of class Controller
     */
    public Controller()
    {
        try
        {
            createMachine();
        }
        catch(Exception e)
        {
            System.out.println("Machine creation failed!!");
            System.exit(0);
        }
        dispenser = new Dispense();
    }
    
    /**
     * Sends the code to machine and gets the price for the product in that slot
     *
     * @param  String for the code
     * @return   double
     */
    public double sendSelectionToMachine(String code)
    {
        return machine.getPrice(code);
    }

    /**
     * Sends the code and amount paid to machine and returns the result of comparing the price
     *
     * @param  String for the code, String for the cash paid
     * @return   String
     */
    public String sendCashAmountToMachine(String code, String cash)
    {
        return machine.comparePrice(code, cash);
    }
    
    
    /**
     * Creates the machine
     *
     * @param  no parameters
     * @return   void
     */
    public void createMachine()
    {
        machine = new Machine(10,4,10,10);
        String[] names = {"AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "BA", "BB", "BC", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "CA", "CB", "CC", "CD", "CE", "CF", "CG", "CH", "CI", "CJ", "DA", "DB", "DC", "DD", "DE", "DF", "DG", "DH", "DI", "DJ", "EA", "EB", "EC", "ED", "EE", "EF", "EG", "EH", "EI", "EJ", "FA", "FB", "FC", "FD", "FE", "FF", "FG", "FH", "FI", "FJ"};
        Size[] sizes = {Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.SMALL, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.MEDIUM, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG, Size.BIG}; 
        double[] prices = {0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.25, 0.75, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 0.75, 1, 1, 1, 1, 1, 1, 1, 1.25, 1, 1, 1, 1, 1, 1, 1, 1.5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1.75, 2, 2, 2, 1.5, 2};
        machine.populateProducts(names, sizes, prices);
    }
    
    /**
     * Sends the slot number to the dispenser to dispense it
     *
     * @param  String for the slot number
     * @return   void
     */
    public void dispenseItem(String slotNum)
    {
        dispenser.dispenseProd(slotNum);
    } 
    
    /**
     * Sends the machine status to the GUI
     *
     * @param  no parameters
     * @return   boolean
     */
    public boolean getMachineStatus()
    {
        return machineStatus;
    }
}   



