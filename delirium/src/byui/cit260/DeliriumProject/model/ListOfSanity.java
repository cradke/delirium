/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.util.Objects;

/**
 *
 * @author Joshua Brown
 */
public class ListOfSanity {
    
    private long timeStamp;
    private String actionName;
    private String description;

    public ListOfSanity() {
    }
    
    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.timeStamp ^ (this.timeStamp >>> 32));
        hash = 17 * hash + Objects.hashCode(this.actionName);
        hash = 17 * hash + Objects.hashCode(this.description);
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
        final ListOfSanity other = (ListOfSanity) obj;
        if (this.timeStamp != other.timeStamp) {
            return false;
        }
        if (!Objects.equals(this.actionName, other.actionName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListOfSanity{" + "timeStamp=" + timeStamp + ", actionName=" + actionName + ", description=" + description + '}';
    }
    
    
}
