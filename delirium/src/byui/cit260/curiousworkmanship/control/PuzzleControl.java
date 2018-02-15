/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousworkmanship.control;

import byui.cit260.DeliriumProject.model.Actor;

/**
 *
 * @author carlr
 */
public class PuzzleControl {

    public static void solvePuzzleVoodooBox(int boxB, int boxC, int boxD, int boxF, int boxG, int boxH, Actor actor) {

        int boxA = 2;
        int boxE = 5;
        int boxI = 8;

        if (boxA + boxB + boxC == 15
                && boxD + boxE + boxF == 15
                && boxG + boxH + boxI == 15
                && boxA + boxD + boxG == 15
                && boxB + boxE + boxH == 15
                && boxC + boxF + boxI == 15
                && boxA + boxE + boxI == 15
                && boxG + boxE + boxC == 15) {

            System.out.println("The voodoo box is correct and has been solved. The door unlocks and you can proceed");
        } else {
            System.out.println("That is incorrect. Try again. You feel a strange feeling in your head.");
            int insane = actor.getInsanityLevel();
            insane += 10;
            actor.setInsanityLevel(insane);
        }

    }
}
