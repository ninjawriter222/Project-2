package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Poe & cleaned by Marchylia
 */
public class Location implements Serializable {
    //the Private Class Instance Variables
    int xcoordinate;
    int ycoordinate;
    
    //the Default Constructor 
    public Location() {  
    }
    
    public Location(int x, int y) {
        xcoordinate = x;
        ycoordinate = y;
    }
    
    @Override
    //the ToString Method
    public String toString() {
        return "Point{" + "xcoordinate=" + xcoordinate + ", ycoordinate=" + ycoordinate + '}';
    }

    //the Public Getter Function
    public int getXcoordinate() {
        return xcoordinate;
    }

    //the Public Setter Function
    public void setXcoordinate(int xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    //the Public Getter Function
    public int getYcoordinate() {
        return ycoordinate;
    }

    //the Public Setter Function
    public void setYcoordinate(int ycoordinate) {
        this.ycoordinate = ycoordinate;
    }
}