package g45502.atl.asciipaint.model;

import java.util.Objects;

/**
 *
 * @author G45502
 */
public class Circle extends ColoredShape {
    
    private Point center;
    private double raduis;
    
    /**
     * Builder of the circle class
     * @param center X and Y of the circle
     * @param raduis radius of the circle from the center
     * @param color Ascii character to make the shape
     */
    public Circle(Point center, double raduis, char color) {
        super(color);
        if (center == null) {
            throw new NullPointerException();
        }
        this.center = center;
        this.raduis = raduis;
    }
    
    /**
     * Builder of the circle class with a Point and radius
     * @param cercle X and Y of the circle
     * @param raduis radius of the circle from the center
     */
    public Circle(Point cercle, double raduis) {
        this(cercle, raduis, '#');
    }
    
    /**
     *Builder by default
     */
    public Circle() {
        this(new Point(), 0.0, '#');
    }

    /**
     *Getter of center
     * @return the center of the circle
     */
    public Point getCenter() {
        return center;
    }

    /**
     *Getter of radius
     * @return the radius of the circle
     */
    public double getRaduis() {
        return raduis;
    }

    /**
     *Check if a point is inside the circle
     * @param p point you will need to check
     * @return true of the point is inside
     */
    @Override
    public boolean isInside(Point p) {
        return (this.center.distanceTo(p) < this.raduis);
    }

    /**
     *Move the point center to another location
     * @param dx where to move X
     * @param dy where to move Y
     */
    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.center);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.raduis) ^ (Double.doubleToLongBits(this.raduis) >>> 32));
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
