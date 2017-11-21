/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Inventory;

/**
 *
<<<<<<< HEAD
 * @author Owner
 */
public class InventoryControl 
{
    public double getWeight(double Pickles, double Eggs) 
    {
	if (Pickles < 0 || Pickles > 100) 
        {
            return -1;
        }
        else if (Eggs < 0 || Eggs > 100) 
        {
            return -1;
        }
        else 
        {
            return Pickles + Eggs;
        }
    }

    void setDescription(String pickles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

