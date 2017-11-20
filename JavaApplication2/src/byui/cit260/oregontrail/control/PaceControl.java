/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Pace;
/**
 *
 * @author MasterCraft Computer
 */
public class PaceControl 
{
    Pace pace = new Pace(); // creating a new object of the function
            
    
   // public int getpace; //this is the instantiation of the pace function we just made
    
    // put into player class maybe
    public int getPace(int Pace)
    {
        if (Pace < 1 || Pace > 3)
        {
            return -1;
        }
        else
        {
            return Pace;
        }
    }
}
