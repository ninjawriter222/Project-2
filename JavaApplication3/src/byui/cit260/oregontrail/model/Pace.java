/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author MasterCraft Computer
 */
public class Pace 
{
//average speed is the normal speed that a character moves which is 2
    //slow =1 and fast =3
    private int speed;

    public Pace()
    {
    this.Average();
    }
    
    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) 
    {
        this.speed = speed;
    }
    public void Slow()
    {
        this.setSpeed(1);
    }
    public void Average()
    {
        this.setSpeed(2);
    }
    public void Fast()
    {
        this.setSpeed(3);
    }
    
}
