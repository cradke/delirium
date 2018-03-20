/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlr
 */
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }

    /**
     * Test of calcVolumeOfHole method, of class ChallengeControl.
     */
    @Test
    public void testCalcVolumeOfHole() {
        System.out.println("calcVolumeOfHole");
        double depth = 5.0;
        double radius = 6.0;
        double expResult = 565;
        double result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 2
        System.out.println("calcVolumeOfHole");
        depth = -5.0;
        radius = 4.0;
        expResult = -1;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 3
        System.out.println("calcVolumeOfHole");
        depth = 10.0;
        radius = -7.0;
        expResult = -1;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 4
        System.out.println("calcVolumeOfHole");
        depth = 12.0;
        radius = 56.0;
        expResult = -1;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 5
        System.out.println("calcVolumeOfHole");
        depth = 0.0;
        radius = 8.0;
        expResult = 0;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 6
        System.out.println("calcVolumeOfHole");
        depth = 7.0;
        radius = 0.0;
        expResult = 0;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
        
        // Test case 7
        System.out.println("calcVolumeOfHole");
        depth = 15.0;
        radius = 10.0;
        expResult = 4712;
        result = ChallengeControl.calcVolumeOfHole(depth, radius);
        assertEquals(expResult, result, 0.0);
    }
    
}
