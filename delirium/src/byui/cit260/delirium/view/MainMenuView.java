/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.delirium.control.ProgramControl;
import delirium.Delirium;

import java.util.Scanner;

/**
 *
 * @author Joshua Brown
 */
public class MainMenuView extends View {

    public MainMenuView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Welcome to the Delirium Main Menu - Choose an Option"
                + "\n n = new game"
                + "\n l = load a game"
                + "\n h = help menu"
                + "\n q = quit");
        inputs[0] = this.getInput("Enter in your selection");
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        switch (inputs[0].toUpperCase()) {
            case "N":
                ProgramControl.createNewGame(Delirium.getPlayer());
                GameMenuView gameMenu = new GameMenuView();
                return true;
            case "L":
                LoadGameView loadGameView = new LoadGameView();
                
                return true;
            case "H":
                HelpView helpView = new HelpView();
                
                return true;
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }

}
