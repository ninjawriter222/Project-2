package byui.cit260.oregontrail.model;

/**
 *
 * @author Devin & cleaned by Marchylia
 */
public class Inventory {
    //the Private Class Instance Variables
    private int pickles;
    private double eggs;
    
    //the Default Constructor
    public Inventory() {
        this(0, 0);
    }

    public Inventory(int pickles, double eggs) {
        this.pickles = pickles;
        this.eggs = eggs;
    }
    
    //the Public Getter Function
    public int getPickles() {
        return pickles;
    }

    //the Public Setter Function
    public void setPickles(int pickles) {
        this.pickles = pickles;
    }

    //the Public Getter Function
    public double getEggs() {
        return eggs;
    }

    //the Public Setter Function
    public void setEggs(double eggs) {
        this.eggs = eggs;
    }
    
    //the Public Getter Function
    public double getWeight()
    {
        return this.pickles + this.eggs;
    }
    
    //witin another Package; it is the View Layer
    public void displayWeight()
    {
        System.out.println("you have" + this.getWeight() + "pounds of food.");
    }
}