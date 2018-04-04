/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.io.Serializable;

/**
 *
 * @author Joshua Brown
 */
public class Game implements Serializable {

    
    private long gameTime;
    private Player player;

    public Game() {
    }

    public Game(Player player) {
        this.player = player;
    }
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public long getGameTime() {
        return gameTime;
    }

    public void setGameTime(long gameTime) {
        this.gameTime = gameTime;
    }
    
    @Override
    public String toString() {
        return "Game{" + "gameTime=" + gameTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.gameTime ^ (this.gameTime >>> 32));
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
        final Game other = (Game) obj;
        if (this.gameTime != other.gameTime) {
            return false;
        }
        return true;
    }

}
