/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class HelpMenuView 
{

    private Object choice;
    private String menuOption; 
    private String value;
    private boolean done;

    public void dummyLoop()
    {
    done = false;
    do 
        {
        displayMenu();
        menuOption = this.getMenuOption();
        if(menuOption.toUpperCase().equals("Q"))
            return;
            this.doAction(menuOption); 
            break;
        } while (done = false);
    }
    void displayMenu() 
    {
    System.out.println("\n"
                + "\n -----------------------"
                + "\n | Help Menu            |"
                + "\n -----------------------"
                + "\nType the letter corrisponding"
                + "\nto the option/action you want"
                + "\nto take."
                + "\n"
                + "\nG - what is the goal of the game?"
                + "\nM - How to move"
                + "\nH - Harvesting resources"
                + "\nQ - Quit"
                + "\n---------------------------"); 
    done = false;
    }
    public String getMenuOption() 
    {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) 
        {
            value = keyboard.nextLine();
            value = value.trim();  
            break;
        }
        return value;
    }
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        switch (choice)
        {
            case "G":
                this.gameGoal();
                break;
            case "M":
                this.howToMove();
                break;
            case "H":
                this.harvestingResources();
                break;
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void gameGoal()
    {
        System.out.println("The Goal of the game is to reach Oregon... I guess."
                + "\nYou do this by moving your wagon along each day."
                + "\nEach day you move you will end up using resources and health"
                + "\ndon't move too much without restocking on resources or resting"
                + "\nor you'll die.");
    }

    private void howToMove()
    {
        System.out.println("Moving is simple, you simple type in Move.  However;"
                + "\nyou don't want to simply keep moving.  Read the events and locations"
                + "\nthat pop up and interact with them by following their directions.");
    }

    private void harvestingResources() 
    {
        System.out.println("I have no idea how this is going to work yet...");
    }

    private void quit() 
    {
        System.out.println("type Q to exit this menu.");
    }
}
