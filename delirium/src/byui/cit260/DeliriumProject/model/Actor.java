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
    
    Prisoner("Prisoner", new Point(1,1), "The protagonist", true, 0);
    
    private String name;
    private Point coordinates;
    private String description;
    private boolean inventory;
    private int insanityLevel;

    private Actor(String name, Point coordinates, String description, boolean inventory, int insanityLevel) {
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.inventory = inventory;
        this.insanityLevel = insanityLevel;
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

    public int getInsanityLevel() {
        return insanityLevel;
    }

    public void setInsanityLevel(int insanityLevel) {
        this.insanityLevel = insanityLevel;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", coordinates=" + coordinates + ", description=" + description + ", inventory=" + inventory + ", insanityLevel=" + insanityLevel + '}';
    }
       
}
