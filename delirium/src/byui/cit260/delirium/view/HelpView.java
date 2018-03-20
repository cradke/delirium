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
 * @author Christian
 */
public class HelpView {
    private String message;
    
    public HelpView() {
    }

    public void displayHelpView() {
        System.out.println("*** Help view called ***");
        
        boolean returnView = false;
        do {
            String[] inputs = this.getInputs();
            returnView = doAction(inputs);
        } while (returnView != true);
    }
    
    private String[] getInputs() {
        String[] inputs = new String[1];
        this.message = "Hello there! Welcome to the help menu! "
                + "You want some help? Your objective in this game is to "
                + "escape the building! As you go room to room you solve "
                + "puzzles to progress but if you solve them wrong be careful "
                + "because you will start to go insane! "
                + "Press q to return to the main menu!";
        inputs[0] = this.getInput();
        return inputs;
    }

    private String getInput() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String input = null;
        System.out.println(this.message);

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
            
            case "Q":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.MainMenuView();
                return true;
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
}
