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
public class Notepad implements Serializable {
    
    private long timeStamp;
    private String note;
    private double noteId;

    public Notepad() {
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getNoteId() {
        return noteId;
    }

    public void setNoteId(double noteId) {
        this.noteId = noteId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.timeStamp ^ (this.timeStamp >>> 32));
        hash = 29 * hash + Objects.hashCode(this.note);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.noteId) ^ (Double.doubleToLongBits(this.noteId) >>> 32));
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
        final Notepad other = (Notepad) obj;
        if (this.timeStamp != other.timeStamp) {
            return false;
        }
        if (Double.doubleToLongBits(this.noteId) != Double.doubleToLongBits(other.noteId)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notepad{" + "timeStamp=" + timeStamp + ", note=" + note + ", noteId=" + noteId + '}';
    }
    
    
}
