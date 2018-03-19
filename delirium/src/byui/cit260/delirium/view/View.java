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
            endView = doAction(inputs);
        } while (endView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        String[] inputs = new String[1];
        System.out.println(promptMessage);
        inputs[0] = this.getInput();
        return inputs;
    }
}
