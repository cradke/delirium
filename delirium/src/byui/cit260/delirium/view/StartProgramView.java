/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

import byui.cit260.DeliriumProject.model.Player;
import byui.cit260.delirium.control.GameControl;


/**
 *
 * @author Joshua Brown
 */
public class StartProgramView extends View {

    public StartProgramView() {

    }
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        System.out.println("****************************************"
                         + "********* Welcome to Delirium **********"
                         + "****************************************");
        String playerName = this.getInput("Enter the player's name");
        inputs[0] = playerName;
        return inputs;

    }

    @Override
    public boolean doAction(String[] inputs) {
        //playersName = get the first value in the inputs array
        String playersName = inputs[0];
        //player = savePlayer(playersName)
        Player player = GameControl.savePlayer(playersName);
        //IF player == null
        if (player == null) {
            System.out.println("Could not create the player."
                    + "Enter a different name.");
            //RETURN false // Repeats the StartProgramView
            return false;
        } else {
            System.out.println("****************************************"
                             + " Hello" + playersName + ","
                             + " Swiggity Swooty, go get that booty"
                             + "****************************************");
        }
        //mainMenuView = Create a new MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return true;
    }
}
