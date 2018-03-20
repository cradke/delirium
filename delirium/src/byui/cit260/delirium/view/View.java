/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import java.util.Scanner;

/**
 *
 * @author carlr
 */
public abstract class View implements ViewInterface {

    Scanner inFile = new Scanner(System.in);

    public View() {
    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            // if the value of the first item in the inputs array is "Q" then
            if(inputs[0].toUpperCase().equals("Q")) {
                // prompt for and get input
                String answer = this.getInput("Are you sure you want to quit? Y for yes");
                // if input value is yes 'y' then return 
                if(answer.toUpperCase().substring(0,1).equals("Y")) {
                    return;
                }
                
            }
                // end the view
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        
        String input = null;
        boolean valid = false;
        System.out.println(promptMessage);
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
}
