/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christian Chipman
 */
public class DefaultScene implements Serializable {
    
    private String description;
    private String interactableObject;
    

    public DefaultScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInteractableObject() {
        return interactableObject;
    }

    public void setInteractableObject(String interactableObject) {
        this.interactableObject = interactableObject;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.interactableObject);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DefaultScene other = (DefaultScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.interactableObject, other.interactableObject)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DefaultScene{" + "description=" + description + ", interactableObject=" + interactableObject + '}';
    }
    
    
    
}
