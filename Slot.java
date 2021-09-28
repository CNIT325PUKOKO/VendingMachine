
/**
 * Each slot object has a name and is stored in an array of slots
 *
 * @author Adam, Kayla, Zephyn
 * @version 1.0
 */
public class Slot
{
    private int quantity = 3;
    private String slotnum;
    Product prod;
    final int full = quantity;
    
    /**
     * Constructor for objects of class Slot
     */
    public Slot(String sn)
    {
        slotnum = sn;
    }
    
    /**
     * Sets the Product in the slot
     * 
     * @param sp Product recieves the Product object
     * @return void
     * 
     */
    public void setProduct(Product sp)
    {
        prod = sp;
    }
    
    /**
     * Sets the quantity for the Slot
     * 
     * @param q int recieves an integer to set as quantity
     * @return void
     * 
     */
    public void setQuantity(int q)
    {
        quantity = q;
    }

    /**
     * Returns the slotNum
     * 
     * @param no parameters
     * @return slotnum String
     * 
     */
    public String getSlotNum()
    {
        return slotnum;
    }
    
    /**
     * Returns the price of a product
     *
     * @param no parameters
     * @return double p the price of the product 
     */
    public double getPrice()
    {
        double p = prod.getPrice();
        return p;
    }
    
    /**
     * Retrieves the product name from the product object
     * 
     * @param none
     * @return String pn this is the name of the product
     */
    public String getProdName()
    {
       String pn;
       pn = prod.getName();
       return pn;
    }

    /**
     * Retrieves the set quantity in slot
     * 
     * @param none
     * @return int quantity
     */
    public int getQuantity()
    {
        return quantity;
    }    
    
    /**
     * Resets the quantity of a product when it is refilled
     *
     * @param  c the code of the product that's quantity will be reset
     * @return   String
     */
    public String resetQuantity()
    {
        quantity = full;
        return "Quantities Reset.";
    }

    /**
     * Reduces the quantity of a product by one when it is dispensed
     *
     * @param no parameters
     * @return String p message saying the product was dispensed
     */
    public String dispenseOne()
    {
        String s;
        quantity = quantity - 1;
        s = ("Dispensed " + prod.getName());
        return s; 
    }    
}

