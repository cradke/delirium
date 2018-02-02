/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delirium;

import byui.cit260.DeliriumProject.model.Actor;
import byui.cit260.DeliriumProject.model.Player;

/**
 *
 * @author Carl, Christian, and their Homeboy Josh
 */
public class Delirium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bob");
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
        
        Actor.Prisoner.getName();     
        Actor.Prisoner.getDescription();
        
        System.out.println(Actor.Prisoner.getName() +     
        Actor.Prisoner.getDescription());
        
    }
    
}
