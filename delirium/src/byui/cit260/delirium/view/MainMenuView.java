/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.delirium.control.ProgramControl;
import delirium.Delirium;

import java.util.*;

/**
 *
 * @author Joshua Brown
 */
public class MainMenuView {
    private String main;
    private String description;
    private String promptMessage;

    public MainMenuView() {
    }

    public void displayMainMenuView() {

        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")) {
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        this.main = "DELIRIUM - Main Menu";
        this.description = "Press 'N' to start a new game | Press 'L' to load a saved game | Press 'H' to get help | Press 'Q' to quit the game";
        this.promptMessage = "Enter in a command! ('N', 'L', 'H' or 'Q')";
        inputs[0] = this.getInput();
        return inputs;
    }

    private String getInput() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String input = null;
        System.out.println(this.main);
        System.out.println(this.description);
        System.out.println(this.promptMessage);

        while (valid == false) {
            
            input = inFile.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Please enter in a correct value");
                valid = false;
            } else {
                valid = true;
            }

        }
        return input;
    }

    private boolean doAction(String[] inputs) {
        switch (inputs[0].toUpperCase()) {
            case "N":
                ProgramControl.createNewGame(Delirium.getPlayer());
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayGameMenuView();
                return true;
            case "L":
                LoadGameView loadGameView = new LoadGameView();
                loadGameView.displayLoadGameView();
                return true;
            case "H":
                HelpView helpView = new HelpView();
                helpView.displayHelpView();
                return true;
            case "Q":
                return true;
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
}
