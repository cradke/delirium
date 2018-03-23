/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.delirium.control;

import byui.cit260.DeliriumProject.model.Actor;
import delirium.Delirium;


/**
 *
 * @author carlr
 */
public class ActorControl {
    
    public static Actor saveActor(String actorName) {
            //if name is null OR length of name is < 1 THEN
            if (actorName == null || actorName.length() < 1) {
                return null;
            }
            else{

            Actor prisoner;
                prisoner = new Actor();

            prisoner.setName(actorName);
            Delirium.setActor(prisoner);

            return prisoner;
            }
    }
}
