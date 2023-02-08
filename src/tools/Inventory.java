package tools;

/**
 * @author Jeremiah Torralba
 */

public class Inventory {
    /**Data members
     */
    private String id;
    private String name;
    private int qoh;
    private int rop;
    private double sellPrice;
    
    public Inventory() {
    /** Default constructor
    * @param id, String must be within the format ABC-1234.
    * @param name, String cannot be null
    * @param qoh, int must be equal to or greater than 0.
    * @param rop, int must be equal to or greater than 0.
    * @param sellPrice, double must be equal to or greater than 0.
    */
    id="ABC-1234";
    name="New Item";
    qoh=0;
    rop=25;
    sellPrice=0;
    }
    
    public Inventory(String id, String name, double sellPrice) {
    /** Overloaded constructor 1
    * @param id
    * @param name
    * @param sellPrice 
    */
    this.id = id;
    this.name = name;
    this.sellPrice = sellPrice;
    }
    
    public Inventory(String id, String name, int qoh, int rop, double sellPrice) {
    /** Overloaded constructor 2
    * @param id
    * @param name
    * @param qoh
    * @param rop
    * @param sellPrice 
    */
    this.id = id;
    this.name = name;
    this.qoh = qoh;
    this.rop = rop;
    this.sellPrice = sellPrice;
    }
    
    public String getId() {
    /** Accessor method for data member id
     * @return id, String must be within the format ABC-1234. 
     */
        return id;
    }
    
    public void setId(String id) {
    /** Mutator method for data member id
    * @param id, String must be within the format ABC-1234. 
    */
        this.id = id;
    }
    
    public String getName() {
    /** Accessor method for data member name
    * @return name, String cannot be null 
    */    
        return name;
    }
    
    public void setName(String name) {
    /** Mutator method for data member name
    * @param name, String cannot be null 
    */
        this.name = name;
    }
    
    public int getQoh() {
    /** Accessor method for data member qoh
    * @return qoh, int must be equal to or greater than 0. 
    */
        return qoh;
    }
    
    public void setQoh(int qoh) {
    /** Mutator method for data member qoh
    * @param qoh, int must be equal to or greater than 0. 
    */
        this.qoh = qoh;
    }
    
    public int getRop() {
    /** Accessor method for data member rop
    * @return rop, int must be equal to or greater than 0. 
    */    
        return rop;
    }
    
    public void setRop(int rop) {
    /** Mutator method for data member rop
    * @param rop, int must be equal to or greater than 0. 
    */    
        this.rop = rop;
    }
    
    public double getSellPrice() {
    /** Accessor method for data member sellPrice
    * @return sellPrice, double must be equal to or greater than 0. 
    */    
        return sellPrice;
    }
    
    public void setSellPrice(double sellPrice) {
    /** Mutator method for data member sellPrice
    * @param sellPrice, double must be equal to or greater than 0. 
    */    
        this.sellPrice = sellPrice;
    }
     
    @Override
    public String toString() {
    /** This method outputs program statement */
        return id + " (" + name + ") " + qoh + " " + rop + " $" + sellPrice + "";
    }
}