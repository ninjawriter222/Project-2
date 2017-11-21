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
public class GameMenuView 
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
                + "\n | Game Menu            |"
                + "\n -----------------------"
                + "\nType the letter corrisponding"
                + "\nto the option/action you want"
                + "\nto take."
                + "\n"
                + "\nI - Look at inventory"
                + "\nM - Move Forward"
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
            case "I":
                this.displayInventory();
                break;
            case "M":
                this.move();
                break;
            case "H":
                this.harvestResources();
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

    private void displayInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
