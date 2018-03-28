/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.DeliriumProject.model.Actor;
import byui.cit260.DeliriumProject.model.Items;
/**
 *
 * @author Christian
 */
public class ProgramControl {

    public static int createNewGame(Player player, Actor prisoner, Items item) {

        if(player == null)
        {
            return -1;
        }

        Game game = new Game(player, prisoner);
        
                
        
        
        
        
        
//game = create a new Game object
//Save a reference to the Player object in the game
//Save a reference to the game in the main class
//actors = createActors()
//Save the list of actors in the Game object
//Assign an actor to the player
//items = createItems()
//Save the list of items in the game
//map = createMap(noOfRows, noOfColumns, items)
//IF map == null THEN
// RETURN -1
//ENDIF
//Assign the map to the game
//RETURN 1 // indicates success
        return 1;
    }
}
