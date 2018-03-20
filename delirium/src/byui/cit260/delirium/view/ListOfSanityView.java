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
public class ListOfSanityView extends View {

    public ListOfSanityView() {
    }

    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

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
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        switch (inputs[0].toUpperCase()) {
            case "A":

                return true;

            default:
                System.out.println("Error invalid option!");
        }
        return false;
    }

}
