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
 * @author Christian
 */
public class GameMenuView {
    Scanner inFile = new Scanner(System.in);
    String input, input2 = null;
    boolean valid, valid2 = false;
    private String message;
    private String actorName;
    
    public GameMenuView() {
    }

    public void displayGameMenuView() {
        System.out.println("*** Display game menu called ***");
        
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String[] getInputs() {
        String[] inputs = new String[2];
        String name = null;
        boolean nameValid = false;
        while (nameValid == false) {
            System.out.println("Enter in the name of your actor");
            String nameInput = inFile.nextLine();
            name = nameInput.trim();

            if (name.length() < 2) {
                System.out.println("This is not a valid input");
                nameValid = false;
            } else {
                inputs[0] = name;
                nameValid = true;
            }
            
        }
        
        this.message = "Welcome to DELIRIUM - Choose your action "+name+"!"; 
        inputs[1] = this.getInput();
        return inputs;
    }

    private String getInput() {
        System.out.println(this.message);
        System.out.println("Press a b c d e f or g for whatever command they are given");
        System.out.println("Press i to open the inventory");
        System.out.println("Press h to get help");
        System.out.println("Press q to quit back to the main menu and save the game");
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
        switch (inputs[1].toUpperCase()) {
            case "I":
                InventoryItemsView inventoryItemsView = new InventoryItemsView();
                inventoryItemsView.displayInventoryItemsView();
                return true;
                
            case "H":
                HelpView helpView = new HelpView();
                helpView.displayHelpView();
                return true;
                
            case "Q":
                System.out.println("Are you sure you want to Save and Quit to the main menu? Press y for yes or n for no");
                input2 = inFile.nextLine();
                input2 = input2.trim();
                if (input2.length() < 1) {
                    System.out.println("Please enter in a correct value");
                    valid2 = false;
                } else {
                    valid2 = true;
                }
                if (input2.toUpperCase().equals("Y")) {
                    MainMenuView mainMenuView = new MainMenuView();
                    mainMenuView.displayMainMenuView();
                    return true;
                } else if (input2.toUpperCase().equals("N")) {
                    GameMenuView gameMenu = new GameMenuView();
                    gameMenu.displayGameMenuView();
                    return false;
                } else {
                    System.out.println("Error! Incorrect value!");
                    return false;
                }
                
                
            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }
}
