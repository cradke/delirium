/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.awt.Point;
/**
 *
 * @author carlr
 */
public enum Items {
    
    Item("Hammer", new Point(2,2), "Used for construction", true);
    
    
    private String name;
    private Point coordinates;
    private String description;
    private boolean inventory;

    private Items(String name, Point coordinates, String description, boolean inventory) {
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInventory() {
        return inventory;
    }

    public void setInventory(boolean inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Items{" + "name=" + name + ", coordinates=" + coordinates + ", description=" + description + ", inventory=" + inventory + '}';
    }
    
    
}
