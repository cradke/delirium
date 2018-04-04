/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.util.Objects;

/**
 *
 * @author carlr
 */
public class PuzzleScene extends DefaultScene{
    
    private double reward;
    private double failureConsequence;
    private double interactableObjects;
    private String puzzle;

    public PuzzleScene() {
    }
    
    

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getFailureConsequence() {
        return failureConsequence;
    }

    public void setFailureConsequence(double failureConsequence) {
        this.failureConsequence = failureConsequence;
    }

    public double getInteractableObjects() {
        return interactableObjects;
    }

    public void setInteractableObjects(double interactableObjects) {
        this.interactableObjects = interactableObjects;
    }

    public String getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(String puzzle) {
        this.puzzle = puzzle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.failureConsequence) ^ (Double.doubleToLongBits(this.failureConsequence) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.interactableObjects) ^ (Double.doubleToLongBits(this.interactableObjects) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.puzzle);
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
        final PuzzleScene other = (PuzzleScene) obj;
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.failureConsequence) != Double.doubleToLongBits(other.failureConsequence)) {
            return false;
        }
        if (Double.doubleToLongBits(this.interactableObjects) != Double.doubleToLongBits(other.interactableObjects)) {
            return false;
        }
        return Objects.equals(this.puzzle, other.puzzle);
    }

    @Override
    public String toString() {
        return "PuzzleScene{" + "reward=" + reward + ", failureConsequence=" + failureConsequence + ", interactableObjects=" + interactableObjects + ", puzzle=" + puzzle + '}';
    }
    
    
    
    
}
