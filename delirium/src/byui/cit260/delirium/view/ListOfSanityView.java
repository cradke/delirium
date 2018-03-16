/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

/**
 *
 * @author carlr
 */
public class ListOfSanityView {
    ListOfSanityView() {
       boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null || inputs[0].toUpperCase().equals("Q")){
                 return;
            }
            
        endView = doAction(inputs);
        } while (endView != true);
}

    private String[] getInputs() {

 /*inputs = new String array whose length = no. of inputs
 Display the instructions

valid = false
WHILE valid == false (while input value is not valid)

Display the prompt message
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 1 then
Display "You must enter a value.”
Continue
ENDIF
Assign value to the next position in the inputs array
valid = true
ENDWHILE

RETURN inputs
}*/
    }

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
