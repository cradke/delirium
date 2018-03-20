/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delirium;


import byui.cit260.DeliriumProject.model.Game;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.delirium.view.StartProgramView;

/**
 *
 * @author carlr
 */
public class Delirium {

       private static Game currentGame = null;
       private static Player player = null;
       
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    } 
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        Delirium.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        Delirium.player = player;
    }
}
