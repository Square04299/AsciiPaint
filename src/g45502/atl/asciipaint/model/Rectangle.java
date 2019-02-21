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
public class Rectangle extends ColoredShape {
    Point upperleft;
    double width;
    double height;

    public Rectangle(Point upperleft, double width, double height, char color) {
        super(color);
        if (upperleft == null) {
            throw new NullPointerException();
        }
        this.upperleft = upperleft;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point upperleft, double width, double height) {
        this(new Point(), width, height, '#');
    }
    
    public Rectangle() {
        this(new Point(), 0.0, 0.0, '#');
    }

    public Point getUpperleft() {
        return upperleft;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public char getColor() {
        return super.getColor();
    }

    @Override
    public boolean isInside(Point p) {
        Point bottomright = new Point(this.getUpperleft());
        bottomright.move(this.width, this.height);
        if (p.getX() > this.upperleft.getX() && p.getX() < bottomright.getX()) {
            if (p.getY() > this.upperleft.getY() && p.getY() < bottomright.getY()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void move(double dx, double dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.upperleft);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
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
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (!Objects.equals(this.upperleft, other.upperleft)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
