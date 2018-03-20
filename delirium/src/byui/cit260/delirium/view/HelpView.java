/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.delirium.control.ProgramControl;
import delirium.Delirium;

/**
 *
 * @author Christian
 */
public class HelpView extends View {
    
    public HelpView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Hello there! Welcome to the help menu! "
                + "\n You want some help? Your objective in this game is to "
                + "\n escape the building! As you go room to room you solve "
                + "\n puzzles to progress but if you solve them wrong be careful "
                + "\n because you will start to go insane! "
                + "\n Press q to return to the main menu!");
        inputs[0] = this.getInput("Enter in your command");
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        
        switch (inputs[0].toUpperCase()) {
            
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
}
