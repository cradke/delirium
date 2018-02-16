/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Actor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlr
 */
public class PuzzleControlTest {
    
    public PuzzleControlTest() {
    }

    /**
     * Test of solvePuzzleVoodooBox method, of class PuzzleControl.
     */
    @Test
    public void testSolvePuzzleVoodooBox() {
        System.out.println("solvePuzzleVoodooBox");
        int boxB = 0;
        int boxC = 0;
        int boxD = 0;
        int boxF = 0;
        int boxG = 0;
        int boxH = 0;
        Actor actor = null;
        int expResult = 0;
        int result = PuzzleControl.solvePuzzleVoodooBox(boxB, boxC, boxD, boxF, boxG, boxH, actor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
