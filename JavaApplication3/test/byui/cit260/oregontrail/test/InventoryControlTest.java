/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.InventoryControl;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MasterCraft Computer
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {}

    /**
     * Test of getWeight method, of class InventoryControl.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        double Pickles = 20;
        double Eggs = 12 / 2;
        InventoryControl instance = new InventoryControl();
        double expResult = 26;
        double result = instance.getWeight(Pickles, Eggs);
        assertEquals(expResult, result, 0.0001);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Valid Input failed");
    }
    

    @Test
    public void testGetWeight1() {
        System.out.println("getWeight");
        double Pickles = 20.0;
        double Eggs = 101.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getWeight(Pickles, Eggs);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("You have too many eggs");
    }
    
    @Test
    public void testGetWeight2() {
        System.out.println("getWeight");
        double Pickles = -1.0;
        double Eggs = 12.0 / 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getWeight(Pickles, Eggs);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Pickles cannot be negative");
    }
    
    @Test
    public void testGetWeight3() {
        System.out.println("getWeight");
        double Pickles = 100.0;
        double Eggs = -1.0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getWeight(Pickles, Eggs);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Eggs cannot be negative");
    }
    
}