package byui.cit260.oregontrail.model;

import java.io.Serializable;

/**
 *
 * @author Poe
 */
public class Game implements Serializable {
    private double totalTime;
    private int noPeople;
    private int male;
    private int female;
    private Player player;
    
    public Game() {
            
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 23 * hash + this.noPeople;
        hash = 23 * hash + (this.player != null ? this.player.hashCode() : 0);
        return hash;
    }

    @Override
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        if (this.player != other.player && (this.player == null || !this.player.equals(other.player))) {
            return false;
        }
        return true;
    }

    public void setMap(Location map) 
    {
        System.out.println("\n*** setMap() function called ***");
    }


}