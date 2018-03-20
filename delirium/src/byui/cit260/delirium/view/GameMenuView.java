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
public class GameMenuView extends View {
    
    public GameMenuView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        System.out.println("Welcome to DELIRIUM - Choose your action!"); 
        String actorName = this.getInput("Enter in the name of your actor");
        inputs[0] = actorName;
        inputs[1] = this.getInput("Press i to open the inventory - Press h to get help - Press q to quit back to the main menu and save the game");
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        switch (inputs[1].toUpperCase()) {
            case "I":
                InventoryItemsView inventoryItemsView = new InventoryItemsView();
                inventoryItemsView.display();
                return true;
                
            case "H":
                HelpView helpView = new HelpView();
                helpView.display();
                return true;
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
}
