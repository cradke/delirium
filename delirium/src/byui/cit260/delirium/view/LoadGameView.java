/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.view;

/**
 *
 * @author Christian
 */
public class LoadGameView extends View{

    public LoadGameView() {
    }

   @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("Load Game State");
        inputs[0] = this.getInput("Type in your saved game file");
        
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
