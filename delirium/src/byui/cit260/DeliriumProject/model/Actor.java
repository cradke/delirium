/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

/**
 *
 * @author Joshua Brown
 */
public enum Actor {
    
    Prisoner("The unnamed protagonist", "He wakes up in the building in the beggining", new Point(1,1));
    
    private String name;
    private Point coordinates;
    private double insanityLevel;
    private String description;
    private boolean inventory;

    Actor(String name, Point coordinates, double insanityLevel, String description, boolean inventory {
        this.name = name;
        this.coordinates = coordinates;
        this.insanityLevel = insanityLevel;
        this.description = description;
        this.inventory = inventory;
}

    public String getName() {
        return name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public double getInsanityLevel() {
        return insanityLevel;
    }

    public String getDescription() {
        return description;
    }

    public boolean isInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", coordinates=" + coordinates + ", insanityLevel=" + insanityLevel + ", description=" + description + ", inventory=" + inventory + '}';
    }
       
}
