/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Location;
import byui.cit260.DeliriumProject.model.Map;
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
    
    public static void displayMap(Player player, Map map) {
        Delirium delirium = new Delirium();
        Game game = delirium.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();
        System.out.println("DELIRIUM MAP");
        System.out.println("1 2 3 4 5 6");
        
        for(int i = 0; i < locations[0].length; i++) {
            System.out.println("------------");
            System.out.println(i);
            for(int j = 0; j < locations[i].length; j++) {
                System.out.println("|");
                Location l = locations[i][j];
                if(l.isVisited()) {
                    
                }
            }
        }
    }
    
    
}
