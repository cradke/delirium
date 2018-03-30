/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.DeliriumProject.model.Actor;
import byui.cit260.DeliriumProject.model.InventoryItem;
import byui.cit260.DeliriumProject.model.Items;
import delirium.Delirium;
/**
 *
 * @author Christian
 */
public class ProgramControl {

    public static int createNewGame(Player player) {

        if(player == null)
        {
            return -1;
        }

        Game game = new Game(player);
        game.setPlayer(player);
        Delirium.setCurrentGame(game);
        player.setActor(Actor.Prisoner);
        InventoryItem[] items = ProgramControl.createItems();
        
        
        
        
        


//Save the list of items in the game
//map = createMap(noOfRows, noOfColumns, items)
//IF map == null THEN
// RETURN -1
//ENDIF
//Assign the map to the game
//RETURN 1 // indicates success
        return 1;
    }

    private static InventoryItem[] createItems() {
        System.out.println("createItems called");
        
        return InventoryItem[];
    }
    
    public static Map createMap(int noOfRows, int noOfColumns){
        
        System.out.println("createMap called");
        return Map;
    }
}
