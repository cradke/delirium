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
import byui.cit260.DeliriumProject.model.Map;
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
        Delirium.getCurrentGame().setItems(items);
        
        Map map = new Map();
        map = createMap(noOfRows, noOfColumns, items);
        
        if(map == null){
            return -1;
        }
        
        Delirium.getCurrentGame().setMap(map);
        
        return 1;
    }

    private static InventoryItem[] createItems() {
        System.out.println("createItems called");
        InventoryItem[] items = new InventoryItem[6];
        
        
        
        
        return items;
    }
            
    public static Map createMap(int noOfRows, int noOfColumns,
            InventoryItem[] items){
        
        if(noOfRows < 0 || noOfColumns < 0){
            return null;
        }
        
        if(items == null || items.length < 1){
            return null;
        }
     //   if noOfRows < 0 OR numOfColumns < 0
// return null
 //endif
 //if items is null OR its length is < 1
 //RETURN null
 //endif
//Map map = new Map object
//save the noOfRows in the map
//save the noOfColumns in the map
//locations = createLocations(noOfRows, noOfColumns)
//Assign the locations array to the map
//scenes = createScenes()
//questions = createQuestions()
//assignQuestionsToScenes()
//assignItemsToScenes()
//assignScenesToLocations() 
        System.out.println("createMap called");
        return Map;
    }
}
