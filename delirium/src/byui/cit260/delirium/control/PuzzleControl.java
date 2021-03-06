/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Actor;

/**
 *
 * author carlr & Christian
 */
public class PuzzleControl {
    
    public static int solvePythagoreanPuzzle(double height, double length, Actor actor) {
        int hypotenuse = 13;
        int insane;
        
        if (actor == null) {
            return -1;
        } else {
            if (height < 10 || height > 10 || length < 8 || length > 8) {
                insane = actor.getInsanityLevel();
                insane += 10;
                actor.setInsanityLevel(insane);
                return 0;
            } else {
                if (height * height + length * length == 164) {
                    
                    return 1;
                } else {
                    insane = actor.getInsanityLevel();
                    insane += 10;
                    actor.setInsanityLevel(insane);
                    return 0;
                }
            }
        }
        
    }

    public static int solvePuzzleVoodooBox(int boxB, int boxC, int boxD,
            int boxF, int boxG, int boxH, Actor actor) {

        // Constant Variables
        int boxA = 2;
        int boxE = 5;
        int boxI = 8;
        int insane;

        // if actor is null then return error
        if (actor == null) {
            return -1;
        } else {

            // Check for negative numbers
            if (boxB < 1 || boxC < 1 || boxD < 1 || boxF < 1 || boxF < 1 || boxG < 1 || boxH < 1) {
                insane = actor.getInsanityLevel();
                insane += 10;
                actor.setInsanityLevel(insane);
                return 0;
            } else {

                if (boxA + boxB + boxC == 15
                        && boxD + boxE + boxF == 15
                        && boxG + boxH + boxI == 15
                        && boxA + boxD + boxG == 15
                        && boxB + boxE + boxH == 15
                        && boxC + boxF + boxI == 15
                        && boxA + boxE + boxI == 15
                        && boxG + boxE + boxC == 15) {
                    return 1;
                } else {
                    insane = actor.getInsanityLevel();
                    insane += 10;
                    actor.setInsanityLevel(insane);
                    return 0;
                }
            }

        }
    }
    
    
    public static int solveForceMassPuzzle(double mass, double force, Actor actor) {
        
        //Constant variables
        double acceleration;
        int insane;
        
        // if actor is null then return error
        if (actor == null) {
            return -1;
        } else {
            //Check for negatives
            if (force < 0 || mass < 0) {
                insane = actor.getInsanityLevel();
                insane += 10;
                actor.setInsanityLevel(insane);
                return 0;
            } else {
                //Divide the force by the mass to try to find the required acceleration
                acceleration = force / mass;
                }
            
            if (acceleration >= 30) {
                    return 1;
            } else {
                insane = actor.getInsanityLevel();
                insane += 10;
                actor.setInsanityLevel(insane);
                return 0;
            }
        }
    }
}
