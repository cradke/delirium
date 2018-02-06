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
 * @author carlr
 */
public class EndScene implements Serializable{
    
    private double insanityLevel;
    private String description;

    public EndScene() {
    }
    
    

    public double getInsanityLevel() {
        return insanityLevel;
    }

    public void setInsanityLevel(double insanityLevel) {
        this.insanityLevel = insanityLevel;
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
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.insanityLevel) ^ (Double.doubleToLongBits(this.insanityLevel) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.description);
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
        final EndScene other = (EndScene) obj;
        if (Double.doubleToLongBits(this.insanityLevel) != Double.doubleToLongBits(other.insanityLevel)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    @Override
    public String toString() {
        return "endScene{" + "insanityLevel=" + insanityLevel + ", description=" + description + '}';
    }
    
    
}
