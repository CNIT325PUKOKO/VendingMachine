/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // instance variables - replace the example below with your own
    private double price;
    private String name;
    private Size size;

    /**
     * Constructor for objects of class Product
     */
    public Product(double price, String name, Size size)
    {
        this.price = price;
        this.name = name;
        this.size = size;
    }

    /**
     * Returns the price of the product
     *
     * @param  no paramters
     * @return   double
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Returns the name of the product
     *
     * @param  no parameters
     * @return   String
     */
    public String getName()
    {
        return name;
    }
       
    /**
     * Set the price of the product
     *
     * @param  p the amount to set the price as
     * @return   String
     */
    public double setPrice(double p)
    {
        this.price = p;
        return price;
    }
}