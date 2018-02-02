/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.awt.Point;

/**
 *
 * @author Joshua Brown
 */
public enum Actor {
    
    Prisoner("Prisoner", new Point(1,1), "The protagonist", true);
    
    private String name;
    private Point coordinates;
    private String description;
    private boolean inventory;

    Actor(String name, Point coordinates, String description, boolean inventory) {
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.inventory = inventory;
}

    public String getName() {
        return name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public boolean isInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", coordinates=" + coordinates + ", insanityLevel=" + ", description=" + description + ", inventory=" + inventory + '}';
    }
       
}
