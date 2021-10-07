
/**
 * Machine contains arrays of slot objects and controls the interaction between slots, products, and the controller
 *
 * @author Adam, Kayla, Zephyn
 * @version 3.0
 */
import java.lang.Math;
public class Machine implements Machinable
{
    final int SMALLSIZE;
    final int MEDROWS;
    final int MEDCOLS;
    final int BIGSIZE;
    private Slot[] smallSlots;
    private Slot[][] medSlots;
    private Slot[] bigSlots;
    double cashTotal;

    /**
     * Constructor for objects of class Machine
     */
    public Machine(int sm, int mr, int mc, int big)
    {
        SMALLSIZE = sm;
        MEDROWS = mr;
        MEDCOLS = mc;
        BIGSIZE = big;
        smallSlots = new Slot[SMALLSIZE];
        medSlots = new Slot[MEDROWS][MEDCOLS];
        bigSlots = new Slot[BIGSIZE];
        createSlots();
    }

    /**
     * Creates the slots based on the size of the constants set in the constructor
     *
     * @param  no parameters
     * @return   void
     */
    private void createSlots()
    {
        int ascii = 65;
        for (int i = 0; i < SMALLSIZE; i++)
        {
            smallSlots[i] = new Slot((char)ascii + Integer.toString((i)));
        }
        ascii++;
        for (int r = 0; r < MEDROWS; r++)
        {
            for (int c= 0; c < MEDCOLS; c++)
            {
                medSlots[r][c] = new Slot((char)ascii + Integer.toString(c));
                
            }
            ascii++;
        }
        //ascii++;
        for (int i = 0; i < BIGSIZE; i++)
        {
            bigSlots[i] = new Slot((char)ascii + Integer.toString((i)));
        }
    }
    
    /**
     * Fills the slots with products
     *
     * @param  String array for names, Size array for sizes, double array for prices
     * @return   void
     */
    public void populateProducts(String[] n, Size[] sizes, double[] p)
    {
        int i = 0;
        int j = 0;
        int m = 0;
        int r = 0;
        for (Size s : sizes)
        {
            if(s == Size.SMALL)
            {
                Product prod = new Product(p[i], n[i], Size.SMALL);
                smallSlots[j].setProduct(prod);
                j++;
            }
            else if(s == Size.MEDIUM)
            {
                Product prod = new Product(p[i], n[i], Size.MEDIUM);
                for(int c = 0; c < MEDCOLS; c++)
                {
                    if(r < MEDROWS)
                        medSlots[r][c].setProduct(prod);
                }
                r++;
            }
            else if(s == Size.BIG)
            {
                Product prod = new Product(p[i], n[i], Size.BIG);
                bigSlots[m].setProduct(prod);
                m++;
            }
            i++;
        }
    }
    
    /**
     * Checks to see if the amount entered is correct
     *
     * @param  String for the slot number, String for the payment amount
     * @return   String
     */
    public String comparePrice(String slotNum, String payAmount)
    {
        double paid = Double.parseDouble(payAmount);
        double price = getPrice(slotNum);
        if(paid > price)
        {
            double change = paid - price;
            //System.out.println(change);
            if(change > 0.009)
            {
                double roundChange = Math.round(change*100);
                return(Double.toString(roundChange/100));
            }
            else
                return("0");
        }
        else
        {
            return("0");
        }
    }
    
    /**
     * Checks to see if the selected item is stocked
     *
     * @param  String for the slot number
     * @return   int
     */
    public int checkQuantity(String sn)
    {
        String slotNumber = sn;
        int column = Integer.parseInt(slotNumber.substring(1,2));
        char bigRow = (char)(66 + MEDROWS);
        int quantity = -1;
        int row = (int)slotNumber.charAt(0) - 66;
        try{
            if(slotNumber.charAt(0) == 'A')
            {
                quantity = smallSlots[column].getQuantity();
            }
            else if(slotNumber.charAt(0) == bigRow)
            {
                quantity = bigSlots[column].getQuantity();
            }
            else
            {
                quantity = medSlots[row][column].getQuantity();
            }
        }
        catch(Exception e)
        {
            return -2;
        }
        return quantity;
    }  
    
    /**
     * Gets the price for the item in the slot an returns it
     *
     * @param  String for the slot number
     * @return   double
     */
    public double getPrice(String sn)
    {
        String slotNumber = sn;
        int column = Integer.parseInt(slotNumber.substring(1,2));
        char bigRow = (char)(66 + MEDROWS);
        double price = -1;
        int row = (int)slotNumber.charAt(0) - 66;
        int quantity = -2;
        if(checkQuantity(slotNumber) <= 0)
            return(-2); 
        else
            quantity = checkQuantity(slotNumber);
        try{
            if(slotNumber.charAt(0) == 'A')
            {
                price = smallSlots[column].getPrice();
            }
            else if(slotNumber.charAt(0) == bigRow)
            {
                price = bigSlots[column].getPrice();
            }
            else
            {
                price = medSlots[row][column].getPrice();
            }
        }
        catch(Exception e)
        {
            return -1;
        }
        return price;
    }
}
