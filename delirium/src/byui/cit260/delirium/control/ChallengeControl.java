/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

/**
 *
 * @author carlr
 */
public class ChallengeControl {
    
    public static double calcVolumeOfHole(double depth, double radius) {
        
        // Check for invalid inputs
        if(depth < 0 || depth > 15){
            return -1;
        }
        if(radius < 0 || radius > 10){
            return -1;
        }
        // Algorithm to determine volume
        double volume = (Math.PI * Math.pow(radius, 2) * depth);
        return Math.round(volume);
    
    }
}
    

