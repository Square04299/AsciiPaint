/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.asciipaint.model;

import java.util.Objects;

/**
 *
 * @author G45502
 */
public class Circle extends ColoredShape {
    
    private Point center;
    private double raduis;

    public Circle(Point center, double raduis, char color) {
        super(color);
        if (center == null) {
            throw new NullPointerException();
        }
        this.center = center;
        this.raduis = raduis;
    }
    
    public Circle(Point cercle, double raduis) {
        this(new Point(), raduis, '#');
    }
    
    public Circle() {
        this(new Point(), 0.0, '#');
    }

    public Point getCenter() {
        return center;
    }

    public double getRaduis() {
        return raduis;
    }

    @Override
    public boolean isInside(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(double dx, double dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.center);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.raduis) ^ (Double.doubleToLongBits(this.raduis) >>> 32));
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
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.raduis) != Double.doubleToLongBits(other.raduis)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        return true;
    }
    
    
    
}
