/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

/**
 *
 * @author Joshua Brown
 */
public class NotepadControl {
    
    String value = null;
    boolean grab = false;
    
    
    //Creat the notepad array with 99 indexi
    String[] notepad = new String[98];
        
    public String saveNote() {
        
        value = "input";
        return value;
    }
    
    public boolean grabNote() {
        
        grab = true;
        return grab;
    }
            
    
}
