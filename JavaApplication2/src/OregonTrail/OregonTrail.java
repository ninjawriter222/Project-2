package OregonTrail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Inventory;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.view.StartProgramView;
/**
 *
 * @author Poe
 */
public class OregonTrail 
{
    
    private static Game currentGame = null;
    private static Player player = null;
    
    //goes in main method?
    public static void setCurrentGame(Game currentGame)
        {
            OregonTrail.currentGame=currentGame;
        }
   
    public static void main(String[] args)
    {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        Player playerOne = new Player();
       
        playerOne.setName("Devin Poe");
        playerOne.setBestTime(999);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        
        System.out.println(playerOne.toString());
        
        //call the getweight from the control class
        //double weight = getWeight
        /*
        Inventory inventory = new Inventory();
        getWeight(inventory.getPickles(), inventory.getEggs());
        System.out.println(getWeight(inventory.getPickles(), inventory.getEggs()));
        
        playerOne.setAverage();
        */
    }
        
   // public static double getRandomNumber;
            //random.nextInt(0, 100);
 public static Game getCurrentGame() 
    {
        return currentGame;
    }

    public static Player getPlayer() 
    {
        return player;
    }

    public static void setPlayer(Player player) 
    {
        OregonTrail.player = player;
    }
}
