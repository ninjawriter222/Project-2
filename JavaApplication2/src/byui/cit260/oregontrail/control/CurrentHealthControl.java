/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;
import byui.cit260.oregontrail.model.Player;
/**
 *
 * @author MasterCraft Computer
 */
public class CurrentHealthControl 
{
    public int getCurrentHealth(int CurrentHealth)
    {
        if (CurrentHealth < 0 || CurrentHealth > 10)
        {
            return -1;
        }
        else
        {
            return CurrentHealth;
        }
    }
}
