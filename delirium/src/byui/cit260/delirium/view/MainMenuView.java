/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import java.util.*;

/**
 *
 * @author Joshua Brown
 */
public class MainMenuView {

    private String description;
    private String promptMessage;

    public MainMenuView() {
    }
    
    public void displayMainMenuView(){
        
       boolean endView = false;
        do {
           String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
        }

    private String[] getInputs() {
        
        String[] inputs = new String[3];
        System.out.println("DELIRIUM - Main Menu ");
        
        // The 'q' key boi
        this.description = "Press 'Q' to quit the view Press 'N' for new game Press 'L' to load a saved game";
        this.promptMessage = "Enter in a command! ('N', 'L' or 'Q')";
        inputs[0] = this.getInput();
        if (inputs[0].toUpperCase().equals("Q")) {
            return inputs;
        }
        
        // The 'l' key boi
        this.description = "Press 'Q' to quit the view Press 'N' for new game Press 'L' to load a saved game";
        this.promptMessage = "Enter in a command! ('N', 'L' or 'Q')";
        inputs[1] = this.getInput();
        if (inputs[1].toUpperCase().equals("L")) {
            return inputs;
        }
        
        // The 'n' key boi
        this.description = "Press 'Q' to quit the view Press 'N' for new game Press 'L' to load a saved game";
        this.promptMessage = "Enter in a command! ('N', 'L' or 'Q')";
        inputs[2] = this.getInput();
        if (inputs[2].toUpperCase().equals("N")) {
            return inputs;
        }
        
        return inputs;
}

    private String getInput() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        boolean valid = false;
        String input = null;
        
        while (valid == false) {
            System.out.println(this.description);
            System.out.println(this.promptMessage);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

