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
 * author carlr & Christian
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
        int boxB = 7;
        int boxC = 6;
        int boxD = 9;
        int boxF = 1;
        int boxG = 4;
        int boxH = 3;
        
        int expResult = 1;
        int result = PuzzleControl.solvePuzzleVoodooBox(boxB, boxC, boxD, boxF, boxG, boxH, Actor.Prisoner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
        
    // Test case 2
       System.out.println("solvePuzzleVoodooBox");
        boxB = 9;
        boxC = 6;
        boxD = 7;
        boxF = 1;
        boxG = 3;
        boxH = 4;
        
        expResult = 0;
        result = PuzzleControl.solvePuzzleVoodooBox(boxB, boxC, boxD, boxF, boxG, boxH, Actor.Prisoner);
        assertEquals(expResult, result);
        
        // Test case 3
        System.out.println("solvePuzzleVoodooBox");
        boxB = -5;
        boxC = 6;
        boxD = 9;
        boxF = 1;
        boxG = 4;
        boxH = 3;
        
        expResult = 0;
        result = PuzzleControl.solvePuzzleVoodooBox(boxB, boxC, boxD, boxF, boxG, boxH, Actor.Prisoner);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of solvePythagoreanTheorem method, of class PuzzleControl.
     */
    @Test
    public void testSolvePythagoreanTheorem() {
        // Test 1
        System.out.println("solvePythagoreanTheorem");
        double height = 10;
        double length = 8;
        
        
        int expResult = 1;
        int result = PuzzleControl.solvePythagoreanPuzzle(height, length, Actor.Prisoner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // Test 2
        System.out.println("solvePythagoreanTheorem");
        height = 11;
        length = 9;
        
        
        expResult = 0;
        result = PuzzleControl.solvePythagoreanPuzzle(height, length, Actor.Prisoner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // Test 3
        System.out.println("solvePythagoreanTheorem");
        height = 9;
        length = 7;
        
        
        expResult = 0;
        result = PuzzleControl.solvePythagoreanPuzzle(height, length, Actor.Prisoner);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSolveForceMassPuzzle() {
        
        //Test 1
        //This test is to check if the entered variables are negative
        System.out.println("solveForceMassPuzzle");
        double mass = -1;
        double force = -1;
        
        int expResult = 0;
        int result = PuzzleControl.solveForceMassPuzzle(mass, force, Actor.Prisoner);
        assertEquals(expResult, result);
        
        //Test 2
        //This test is to make sure the eqaution works
        
        System.out.println("solveForceMassPuzzle");
        mass = 4;
        force = 120;
        
        expResult = 1;
        result = PuzzleControl.solveForceMassPuzzle(mass, force, Actor.Prisoner);
        assertEquals(expResult, result);
        
        //Test 3
        //This test is to make sure that a failure works in the equation
        
        System.out.println("solveForceMassPuzzke");
        mass = 5;
        force = 5;
        
        expResult = 0;
        result = PuzzleControl.solveForceMassPuzzle(mass, force, Actor.Prisoner);
        assertEquals(expResult, result);
        
    }
    
    
}
