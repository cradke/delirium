/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.DeliriumProject.model.Location;
import byui.cit260.DeliriumProject.model.Map;
import byui.cit260.delirium.control.ProgramControl;
import delirium.Delirium;

/**
 *
 * @author Christian
 */
public class GameMenuView extends View {
    String actorName = null;
    public GameMenuView() {
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[2];
        if(actorName == null) {
        System.out.println("Welcome to DELIRIUM"); 
        actorName = this.getInput("Enter in the name of your actor");
        }
        inputs[0] = actorName;
        inputs[1] = this.getInput("Press i to open the inventory"
                + "\nPress h to get help"
                + "\nPress b to go back to save and go back to the main menu"
                + "\nPress q to save and quit the game");
        
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        switch (inputs[1].toUpperCase()) {
            case "M":
                this.displayMap();
                return true;
            case "I":
                InventoryItemsView inventoryItemsView = new InventoryItemsView();
                inventoryItemsView.display();
                return true;
                
            case "H":
                HelpView helpView = new HelpView();
                helpView.display();
                return true;
                
            case "B":
                // prompt for and get input
                String answer = this.getInput("Are you sure you want to return to the main menu? Y for yes");
                // if input value is yes 'y' then return 
                if(answer.toUpperCase().substring(0,1).equals("Y")) {
                    MainMenuView mainMenuView = new MainMenuView();
                    mainMenuView.display();
                    return true;
                } else {
                    return false;
                }
                
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }

    private void displayMap() {
        System.out.println("*** DISPLAY MAP CALLED ***");
        Delirium.getCurrentGame();
        
        System.out.println("DELIRIUM MAP");
        System.out.println("0 1 2 3 4 5");
        
    }
}
