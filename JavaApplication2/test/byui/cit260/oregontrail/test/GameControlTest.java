/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.GameControl;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MasterCraft Computer
 */

public class GameControlTest {
    
    public GameControlTest() {}

    /**
     * Test of getNoPeople method, of class GameControl.
     */
    @Test
    public void testGetNoPeople() {
        System.out.println("getNoPeople");
        int noPeople = 40;
        int male = 35;
        int female = 5;
        GameControl instance = new GameControl();
        int expResult = 40;
        int result = instance.getNoPeople(noPeople, male, female);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(result);
    }
    
    @Test
    public void testGetNoPeople1() {
        System.out.println("getNoPeople");
        int noPeople = 41;
        int male = 20;
        int female = 21;
        GameControl instance = new GameControl();
        int expResult = -1;
        int result = instance.getNoPeople(noPeople, male, female);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(result);
    }
    
    @Test
    public void testGetNoPeople2() {
        System.out.println("getNoPeople");
        int noPeople = 9;
        int male = -1;
        int female = 10;
        GameControl instance = new GameControl();
        int expResult = -1;
        int result = instance.getNoPeople(noPeople, male, female);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(result);
    }
    
    @Test
    public void testGetNoPeople3() {
        System.out.println("getNoPeople");
        int noPeople = 0;
        int male = 0;
        int female = 0;
        GameControl instance = new GameControl();
        int expResult = -1;
        int result = instance.getNoPeople(noPeople, male, female);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println(result);
    }
}
