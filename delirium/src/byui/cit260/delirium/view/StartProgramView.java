/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

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
            if (inputs == null){
                return;
            }
            endView = doAction(inputs);
        } while (endView != true);
    }

    private String [] getInputs(): {
        
        //Create scanner file and input for that file, then trim the string
            Scanner inFile;
            inFile = new Scanner(System.in);
           //inputs = new String array one element long;
            String a[] = new String[1];
            //Display the welcome banner
            System.out.println("**************************************** "
                             + "* Insert Incredibly Awesome Banner Here *"
                             + "*****************************************");
            
            boolean valid = false;
           
            while (valid == false) {
                //Display the prompy message, "Enter the player's name"
                System.out.println("Enter the player's name");
                //Get the value entered from the keyboard
                 String input = inFile.nextLine();
                 String name = input.trim();
                
                //IF length of the value < 2 then
                if (name.length() < 2) {
                  System.out.println("This is not a valid input");
                  valid = false;
                }
                else {
                    name = a[0];
                    valid = true;
                }
                
            }
            
            return a;

    }

    private boolean doAction(String[] inputs) {
        //playersName = get the first value in the inputs array
        String playesrsName = a[0];
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
                             " Welcom to the game" + playersName +
                             " We hope you pee your pants" +
                             "****************************************");
        }

        //mainMenuView = Create a new MainMenuView object
        mainMenuView = mainMenuView.displayMainMenuView();
    }
} 
