/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class StartProgramView 
{

private String promptMessage;
    
    public void displayStartProgramView() 
    {
        System.out.println("display's StartProgram() function called ***");
        boolean done = false;
        do
        {
            String playersName = this.getPlayerName();
            if(playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        } while(!done);
    }
        
    public StartProgramView()
    {
        this.promptMessage = "\n Please enter your name: ";
            
        this.displayBanner();
    }

    private void displayBanner() 
    {
        System.out.println("\n Enter a description of the game here");
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1) 
            {
                System.out.println ("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String playersName)
    {
        
        if (playersName.length() < 2) {
        System.out.println("\nInvalid players name: "
                            + "The name must be greater than one character in "
                                + "length");
            return false;
    }
       Player player = GameControl.createPlayer(playersName);
       
       if (player == null) 
       {
           System.out.println("\nError creating the player name.");
           return false;
       }
       
       this.displayNextView(player);
       
       return true;
    }

    private void displayNextView(Player player) 
    {
        System.out.println("\n==================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you die a lot!"
                         + "\n===================================");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
          
    }
}
