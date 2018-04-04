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
public class ChallengeScene extends DefaultScene{
    
    private String description;
    private double timeLimit;
    private double reward;
    private double failureConsequence;

    public ChallengeScene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.timeLimit) ^ (Double.doubleToLongBits(this.timeLimit) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.failureConsequence) ^ (Double.doubleToLongBits(this.failureConsequence) >>> 32));
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
        final ChallengeScene other = (ChallengeScene) obj;
        if (Double.doubleToLongBits(this.timeLimit) != Double.doubleToLongBits(other.timeLimit)) {
            return false;
        }
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.failureConsequence) != Double.doubleToLongBits(other.failureConsequence)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    @Override
    public String toString() {
        return "ChallengeScene{" + "description=" + description + ", timeLimit=" + timeLimit + ", reward=" + reward + ", failureConsequence=" + failureConsequence + '}';
    }
    
    
}
