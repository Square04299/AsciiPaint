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
        this(cercle, raduis, '#');
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
        return (this.center.distanceTo(p) < this.raduis);
    }

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
