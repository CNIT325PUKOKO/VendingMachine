/**
 * An interface for a Machine class
 *
 * @author Adam, Kayla, Zephyn
 * @version 1.0
 */
public interface Machinable
{    
    /**
     * Sets the products with parameters name, size, and price in an array, then puts these arrays in the machine
     * 
     * @param String[] n an array of names, Size[] sizes an array of sizes, double[] p an array of prices
     * @return void
     */
    public void populateProducts(String[] n, Size[] sizes, double[] p);
    
    /**
     * Checks to see if the amount entered is correct
     *
     * @param slotNum String refences a slot, payAmount String references the amount entered
     * @return String tells the user if the amount paid is correct
     */   
    public String comparePrice(String slotNum, String payAmount);
    
    /**
     * Checks to see if the selected item is stocked
     *
     * @param sn String references a slotNum
     * @return int the quantity of the slot
     */
    public int checkQuantity(String sn);
    
    /**
     * Calls method in Slot to get price of product
     * 
     * @param sn String references a slotNum
     * @return double the price of the product in slot
     */
    public double getPrice(String sn);
}
