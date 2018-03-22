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
public class InventoryItemsView extends View{

    public InventoryItemsView() {
    }

   @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Inventory Menu - Choose an Option"
                + "\n item"
                + "\n item"
                + "\n b = exit inventory view and return to game"
                + "\n q = quit the game");
        inputs[0] = this.getInput("Enter in your selection");
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        switch (inputs[0].toUpperCase()) {
            case "A":
                
                return true;
            case "B":
                    GameMenuView gameMenuView = new GameMenuView();
                    gameMenuView.display();
                    return true;
                
            case "C":
                
                return true;
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
    
}
