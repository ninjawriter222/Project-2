/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import OregonTrail.OregonTrail;
import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Inventory;
import byui.cit260.oregontrail.model.Location;


/**
 *
 * @author Marchylia
 */
public class GameControl {

    private static int INVENTORY_COUNT;

    public static Player createPlayer(String playersName)
    {
        System.out.println("/n*** createPlayer() called ***");
        if (playersName == null)
        {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        OregonTrail.setPlayer(player);
        
        return player;
    }
private static Game game;

    public static Game getGame() 
    {
        return game;
    }

    public static void setGame(Game game) 
    {
        GameControl.game = game;
    }
    
    public static void createNewGame(Player player) 
    {
        // create a new game
       GameControl.game = new Game();
       
       // save as current game
       OrgeonTrail.setCurrentGame(game);
       
       // set (save) the player in the game object
       GameControl.game.setPlayer(OregonTrail.getPlayer());
       
       // create the map and save in tame
       Location map = PointControl.createMap();
       GameControl.game.setMap(map); // create and initialize the map
       
       Inventory items = new Inventory();
       
    }
    
    public int getNoPeople(int noPeople, int male, int female) 
    {
        if (noPeople < 1 || noPeople > 40) {
            return -1;
        }
        else if (male < 1 || male > 39 || female < 1 || female > 39) {
                return -1;
            }
        else {
            noPeople = male + female;
            
            return noPeople;
        }
    }
public void createInventoryList() 
    {
        
        InventoryControl[] inventory = 
            new InventoryControl[GameControl.INVENTORY_COUNT];
        
        InventoryControl pickles = new InventoryControl();
        pickles.setDescription("Pickles");
        pickles.setQuantityInStock(0);
        pickles.setRequiredAmount(0);
        inventory[0] = pickles;
        
        InventoryControl eggs = new InventoryControl();
        eggs.setDescription("Eggs");
        eggs.setQuantityInStock(0);
        eggs.setRequiredAmount(0);
        inventory[1] = eggs;

    }
}