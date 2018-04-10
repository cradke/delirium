/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.DeliriumProject.model.Actor;
import byui.cit260.DeliriumProject.model.DefaultScene;
import byui.cit260.DeliriumProject.model.InventoryItem;
import byui.cit260.DeliriumProject.model.Location;
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
        
        Map map = createMap(6, 6, items);
        
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
            
    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) {
        
        if(noOfRows < 0 || noOfColumns < 0){
            return null;
        }
        if(items == null || items.length < 1){
            return null;
        }
        
        Map map = new Map(noOfRows, noOfColumns);
        
        Location[][] locations = ProgramControl.createLocations(noOfRows, noOfColumns);
        
        map.setLocations(locations);
        
       // DefaultScene[] scenes = ProgramControl.createScenes();
        
       // ProgramControl.ItemsToScenes(items, scenes);
        
        ScenesToLocations(locations);
        
        
        
   
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
        return null;
    }

    private static Location[][] createLocations(int noOfRows, int noOfColumns) {
        System.out.println("Create locations called");
        if(noOfRows < 0 || noOfColumns < 0){
            return null;
        }
        Location[][] locations = new Location[noOfRows][noOfColumns];
        for(int i = 0; i < noOfRows; i++) {
            for(int j = 0; j < noOfColumns; j++){
                locations[i][j] = new Location(); 
                locations[i][j].setVisited(false);
            }
    }
        
        return locations;
    }

    // private static DefaultScene[] createScenes() {
    //     System.out.println("Create scenes called");
    //  DefaultScene[] scenes = new DefaultScene[2];
        
    //    return scenes;
    // }

    // private static void ItemsToScenes(InventoryItem[] items, DefaultScene[] scenes) {
    //     System.out.println("Assign items to scenes called");
    // }

    private static void ScenesToLocations( Location[][] locations) {
        System.out.println("Assigns scenes to locations called");
        locations[0][0].setScene(new DefaultScene()) ;
        locations[0][1].setScene(new DefaultScene());
        locations[0][2].setScene(new DefaultScene());
        locations[0][3].setScene(new DefaultScene());
        locations[0][4].setScene(new DefaultScene());
        locations[0][5].setScene(new DefaultScene());
        
        locations[1][0].setScene(new DefaultScene());
        locations[1][1].setScene(new DefaultScene());
        locations[1][2].setScene(new DefaultScene());
        locations[1][3].setScene(new DefaultScene());
        locations[1][4].setScene(new DefaultScene());
        locations[1][5].setScene(new DefaultScene());
        
        locations[1][0].setScene(new DefaultScene());
        locations[1][1].setScene(new DefaultScene());
        locations[1][2].setScene(new DefaultScene());
        locations[1][3].setScene(new DefaultScene());
        locations[1][4].setScene(new DefaultScene());
        locations[1][5].setScene(new DefaultScene());
        
        locations[1][0].setScene(new DefaultScene());
        locations[1][1].setScene(new DefaultScene());
        locations[1][2].setScene(new DefaultScene());
        locations[1][3].setScene(new DefaultScene());
        locations[1][4].setScene(new DefaultScene());
        locations[1][5].setScene(new DefaultScene());
        
        locations[1][0].setScene(new DefaultScene());
        locations[1][1].setScene(new DefaultScene());
        locations[1][2].setScene(new DefaultScene());
        locations[1][3].setScene(new DefaultScene());
        locations[1][4].setScene(new DefaultScene());
        locations[1][5].setScene(new DefaultScene());
        
    }
}
