/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.DeliriumProject.model.Notepad;
import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.delirium.control.GameControl;
import byui.cit260.delirium.control.NotepadControl;
import java.util.Scanner;

/**
 *
 * @author Joshua Brown
 */
public class NotesView extends View{
    
    private void displayNotesView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("")) {
                return;
            }
            endview = doAction(inputs);
        } while (endView != true);    
    }
    
    
    private String[] getInputs() {
        Scanner inFile;
        inFile = new Scanner(System.in);
        String[] inputs = new String[1];
        System.out.println("You reach into your pocket to find a small pocketbook and pencil."
                         + "It's incredibly worn down, most likely from getting wet a time or two."
                         + "There is also some gruesome stains on the back cover. Blood? You hope not.");

        boolean valid = false;

        while (valid == false) {
            System.out.println("Enter the page number (1-99)");
            String input = inFile.nextLine();
            String note = input.trim();

            if (note.length() > 99) {
                System.out.println("This is not a valid input");
                valid = false;
            } else {
                inputs[0] = note;
                valid = true;
            }

        }

        return inputs;
        
    }
    
    private boolean doAction(String[] inputs) {
         //noteNumber = get the first value in the inputs array
        String noteNumber = inputs[0];
        //player = savePlayer(playersName)
        String noteId = noteNumber;
        //IF player == null
        if (noteId == null) {
            System.out.println("Could not retrieve the note."
                    + "Enter a different page #");
            //RETURN false // Repeats the StartProgramView
            return false;
        } else {
            System.out.println("Here is your note");
            
        }

        //I need this program to be able to save Note strings inside of an array
        //
    }
        
    }
}
