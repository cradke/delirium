/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.delirium.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author Joshua Brown
 */
public class StartProgramView {
    
    public StartProgramView() {
    
        
    }
    
    
            
    public void displayStartProgramView() {
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
        
            Scanner inFile;
            inFile = new Scanner(System.in);
            String[] inputs = new String[1];
            System.out.println("**************************************** "
                             + "* Insert Incredibly Awesome Banner Here *"
                             + "*****************************************");
            
            boolean valid = false;
           
            while (valid == false) {
                System.out.println("Enter the player's name");
                 String input = inFile.nextLine();
                 String name = input.trim();
                
                if (name.length() < 2) {
                  System.out.println("This is not a valid input");
                  valid = false;
                }
                else {
                   inputs[0] = name;
                    valid = true;
                }
                
            }
            
            return inputs;

    }

    private boolean doAction(String[] inputs) {
        //playersName = get the first value in the inputs array
        String playersName = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.savePlayer(playersName);
        //IF player == null
        if (player == null) {
            System.out.println("Could not create the player." +
                                "Enter a different name.");
        //RETURN false // Repeats the StartProgramView
            return false;
        }
        
        else{
          System.out.println("****************************************" +
                             " Hi I'm Elmo. " + playersName +
                             " is my best friend." +
                             "****************************************");
        }

        //mainMenuView = Create a new MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        return true;
    }
} 
