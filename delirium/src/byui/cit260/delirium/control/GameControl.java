/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Player;
import delirium.Delirium;

/**
 *
 * @author Joshua Brown
 */
public class GameControl {
        
    public static Player savePlayer(String name) {
            //if name is null OR length of name is < 1 THEN
            if (name == null || name.length() < 1) {
                return null;
            }
            else{

            Player player = new Player();

            player.setName(name);
            Delirium.setPlayer(player);

            return player;
            }
    }
    
    
}
