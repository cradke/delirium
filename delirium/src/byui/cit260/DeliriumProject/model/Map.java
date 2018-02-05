/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DeliriumProject.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christian Chipman
 */
public class Map implements Serializable {
    
    private Point rowCount;
    private Point columnCount;
    private String description;

    public Map() {
    }

    public Point getRowCount() {
        return rowCount;
    }

    public void setRowCount(Point rowCount) {
        this.rowCount = rowCount;
    }

    public Point getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Point columnCount) {
        this.columnCount = columnCount;
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
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        hash = 97 * hash + Objects.hashCode(this.columnCount);
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", description=" + description + '}';
    }
    
    
    
}
