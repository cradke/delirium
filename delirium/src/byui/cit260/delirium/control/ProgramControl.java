/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.DeliriumProject.model.Actor;
import byui.cit260.DeliriumProject.model.ChallengeScene;
import byui.cit260.DeliriumProject.model.DefaultScene;
import byui.cit260.DeliriumProject.model.EndScene;
import byui.cit260.DeliriumProject.model.InventoryItem;
import byui.cit260.DeliriumProject.model.Location;
import byui.cit260.DeliriumProject.model.Map;
import byui.cit260.DeliriumProject.model.PuzzleScene;
import byui.cit260.DeliriumProject.model.SceneType;
import byui.cit260.DeliriumProject.model.StartScene;
import byui.cit260.DeliriumProject.model.WallScene;
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
        DefaultScene[] scenes = createScenes();
        Map map = createMap(6, 6, items, scenes);
        
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
            
    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items, DefaultScene[] scenes) {
        
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
        
        ScenesToLocations(locations, scenes);
        
        
        
   
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

    private static DefaultScene[] createScenes() {
        System.out.println("Create scenes called");
        DefaultScene[] scenes = new DefaultScene[6];
        scenes[SceneType.EmptyScene.ordinal()] = new DefaultScene("There is nothing here but empty space.");
        scenes[SceneType.WallScene.ordinal()] = new DefaultScene("You see a wall.");
        scenes[SceneType.PuzzleScene.ordinal()] = new DefaultScene("There is a puzzle in here.");
        scenes[SceneType.ChallengeScene.ordinal()] = new DefaultScene("There is a challenge in here.");
        scenes[SceneType.StartScene.ordinal()] = new DefaultScene("This looks like the beginning.");
        scenes[SceneType.EndScene.ordinal()] = new DefaultScene("This is the end!");
        
        
        return scenes;
    }

    // private static void ItemsToScenes(InventoryItem[] items, DefaultScene[] scenes) {
    //     System.out.println("Assign items to scenes called");
    // }

    private static void ScenesToLocations( Location[][] locations, DefaultScene[] scenes) {
        System.out.println("Assigns scenes to locations called");
        locations[0][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.EmptyScene.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.StartScene.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.EndScene.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.PuzzleScene.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.EmptyScene.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.EmptyScene.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.ChallengeScene.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.PuzzleScene.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.EmptyScene.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.PuzzleScene.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.EmptyScene.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.WallScene.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.WallScene.ordinal()]);
        
    }
}
