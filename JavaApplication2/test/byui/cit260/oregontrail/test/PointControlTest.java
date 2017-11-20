/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.test;

import byui.cit260.oregontrail.control.PointControl;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author MasterCraft Computer
 */
public class PointControlTest {
    
    public PointControlTest() {
    }
    /**
     * Test of riverCrossing method, of class PointControl.
     */
    @Test
    public void testRiverCrossing0() {
        System.out.println("riverCrossing");
        double TotWeight = 97;
        double RiverDepth = 12;
        PointControl instance = new PointControl();
        double expResult = 0;
        double result = instance.riverCrossing(TotWeight, RiverDepth);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);

    }
    
    @Test
    public void testRiverCrossing1() {
        System.out.println("riverCrossing");
        double TotWeight = 20;
        double RiverDepth = 51;
        PointControl instance = new PointControl();
        double expResult = -1;
        double result = instance.riverCrossing(TotWeight, RiverDepth);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
    }
    
    @Test
    public void testRiverCrossing2() {
        System.out.println("riverCrossing");
        double TotWeight = -1;
        double RiverDepth = 12;
        PointControl instance = new PointControl();
        double expResult = -1;
        double result = instance.riverCrossing(TotWeight, RiverDepth);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
    }
    
    @Test
    public void testRiverCrossing3() {
        System.out.println("riverCrossing");
        double TotWeight = 100;
        double RiverDepth = -1;
        PointControl instance = new PointControl();
        double expResult = -1;
        double result = instance.riverCrossing(TotWeight, RiverDepth);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
    }
    
}
