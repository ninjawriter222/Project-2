/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Location;
/**
 *
 * @author Owner
 */
public class PointControl 
{        
    static Location createMap(int noOfRows, int noOfColumns) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Location createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public double riverCrossing(double TotWeight, double RiverDepth) {
            double WeightLost = 0;
            double WeightLostString;
            
            
	if (TotWeight < 0 || TotWeight > 150) {
		return -1;
        }
        else if (RiverDepth < 0 || RiverDepth > 24) {
                 return -1;
        }
        else if (TotWeight * RiverDepth > 3600) {
            WeightLost = TotWeight - TotWeight * RiverDepth / 100;
            TotWeight = TotWeight - WeightLost;
            WeightLostString = Double.parseDouble("You lost " + WeightLost + " pounds of food as you sank");
            return WeightLostString;
   
        }
        else {
            String SafelyCross;
            SafelyCross = "You cross the river safely";
            System.out.println(SafelyCross);
            return 0;
        }
    }
}
