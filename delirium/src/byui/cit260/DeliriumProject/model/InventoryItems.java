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
 * @author Joshua Brown
 */
public class InventoryItems implements Serializable {
    
    private double itemId;
    private long itemQuantity;
    private String description;

    public InventoryItems() {
    }

    public double getItemId() {
        return itemId;
    }

    public void setItemId(double itemId) {
        this.itemId = itemId;
    }

    public long getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.itemId) ^ (Double.doubleToLongBits(this.itemId) >>> 32));
        hash = 59 * hash + (int) (this.itemQuantity ^ (this.itemQuantity >>> 32));
        hash = 59 * hash + Objects.hashCode(this.description);
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
        final InventoryItems other = (InventoryItems) obj;
        if (Double.doubleToLongBits(this.itemId) != Double.doubleToLongBits(other.itemId)) {
            return false;
        }
        if (this.itemQuantity != other.itemQuantity) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItems{" + "itemId=" + itemId + ", itemQuantity=" + itemQuantity + ", description=" + description + '}';
    }
    
}
