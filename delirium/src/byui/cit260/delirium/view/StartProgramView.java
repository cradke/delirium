/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import java.util.Scanner;

/**
 *
 * @author Joshua Brown
 */
public class StartProgramView {
    
    public StartProgramView() {
    
        //getInputs(): String[] {
        
            //inputs = new String array one element long
            
            //Display the welcome banner
            
            //valid = false
            //WHILE valid == false (while input value is not valid)
                
                //Display the prompy message, "Enter the player's name"
                //Get the value entered from the keyboard
                //Trim off leading and trailing blanks from the value
                
                //IF length of the value < 2 then
                  //Display "you must enter a value."
                  //Continue (move to the top of the loop and repeat)
                //ENDIF
                
                //Assign the value to the first position in the inputs array 
                //valid = true
            //ENDWHILE
            
            //RETURN inputs
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

    private String[] getInputs() {
        
        //Creates an input file
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        //Reads the vaue of the next line typed in the console
        String name = inFile.nextLine();
        
        //Trim the string
       
    }

    private boolean doAction(String[] inputs) {
        System.out.println("**** doAction() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
} 
