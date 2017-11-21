/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import OregonTrail.OregonTrail;
import byui.cit260.oregontrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class MainMenuView extends View
{
    private String value;
    private String helpMenu;
    private boolean done;
    public MainMenuView()
    {
    super(        "\n"
                + "\n -----------------------"
                + "\n | Main Menu            |"
                + "\n -----------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "---------------------------");
    
    }
    @Override
    public boolean doAction(String value) 
    {
        value = value.toUpperCase();
        switch (value)
        {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    

    private void startNewGame() 
    {
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() 
    {
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() 
    {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.dummyLoop();
        
    }

    private void saveGame() 
    {
        System.out.println("\n*** getMenuOption() function called ***");
    }
}

    
