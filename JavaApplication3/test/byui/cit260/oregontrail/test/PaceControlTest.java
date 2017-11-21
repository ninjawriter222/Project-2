/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.PaceControl;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MasterCraft Computer
 */
public class PaceControlTest {
    
    public PaceControlTest() {
    }

    /**
     * Test of getPace method, of class PaceControl.
     */
    @Test
    public void testGetPace() {
        System.out.println("getPace");
        int Pace = 0;
        PaceControl instance = new PaceControl();
        int expResult = -1;
        int result = instance.getPace(Pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetPace1() {
        System.out.println("getPace");
        int Pace = 4;
        PaceControl instance = new PaceControl();
        int expResult = -1;
        int result = instance.getPace(Pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetPace2() {
        System.out.println("getPace");
        int Pace = 2;
        PaceControl instance = new PaceControl();
        int expResult = 2;
        int result = instance.getPace(Pace);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
