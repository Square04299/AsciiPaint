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

    /**
     * Builder of rectangle with all attribute
     * @param upperleft point at the to left of the rectangle
     * @param width length of the width for the rectangle
     * @param height length of the height for the rectangle
     * @param color character to fill the shape with
     */
    public Rectangle(Point upperleft, double width, double height, char color) {
        super(color);
        if (upperleft == null) {
            throw new NullPointerException();
        }
        this.upperleft = upperleft;
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @param upperleft point at the to left of the rectangle
     * @param width length of the width for the rectangle
     * @param height length of the height for the rectangle
     */
    public Rectangle(Point upperleft, double width, double height) {
        this(upperleft, width, height, '#');
    }
    
    /**
     * Builder of rectangle default
     */
    public Rectangle() {
        this(new Point(), 0.0, 0.0, '#');
    }

    /**
     * Getter of upperLeft
     * @return the upperleft point of the rectangle
     */
    public Point getUpperleft() {
        return upperleft;
    }

    /**
     * Getter of width
     * @return width of the shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getter of height
     * @return height of the shape
     */
    public double getHeight() {
        return height;
    }

    @Override
    public char getColor() {
        return super.getColor();
    }

    @Override
    public boolean isInside(Point p) {
        Point bottomright = new Point(upperleft);
        bottomright.move(width, -height);
        return (p.getX() >= upperleft.getX() && p.getX() <= bottomright.getX()
                && p.getY() <= upperleft.getY() 
                && p.getY() >= bottomright.getY());
    }

    @Override
    public void move(double dx, double dy) {
        upperleft.move(dx, dy);
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
