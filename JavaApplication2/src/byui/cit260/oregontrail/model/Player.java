package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Poe & Camden & cleaned by Marchylia
 */
public class Player implements Serializable {
    //the Private Class Instance Variables
    private String name;
    private double bestTime;
    
    //the Default Constructor 
    public Player() {  
    }
    
    //the Public Getter Function
    public String getName() {
        return name;
    }

    //the Public Setter Function
    public void setName(String name) {
        this.name = name;
    }

    //the Public Getter Function
    public double getBestTime() {
        return bestTime;
    }

    //the Public Setter Function
    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    @Override
    //the HashCode Method
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    //the Equals Method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    //the ToString Method
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }   
}