package g45502.atl.asciipaint.model;

import static java.lang.Math.*;

/**
 *
 * @author G45502
 */
public class Point {
    private double x;
    private double y;
 
    /**
     * Builder of point default
     */
    public Point(){
        this(0,0);
    }

    /**
     * Builder of point
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Builder of point with a point
     * @param p
     */
    public Point(Point p){
        if(p == null){
            throw new NullPointerException();
        }
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Getter of x
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * Getter of y
     * @return y
     */
    public double getY() {
        return y;
    }
    
    /**
     * Move the point to a new coordination
     * @param dx x to add to the current x
     * @param dy y to add to the current y
     */
    void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    
    /**
     * Calculate the distance between to point
     * @param other the other point
     * @return the distance between other and the point
     */
    double distanceTo(Point other){
        if (other == null) {
            throw new NullPointerException("The point given is null");
        }
        return hypot(this.x - other.x, this.y - other.y);
    }

    @Override
    public String toString() {
        return "{ "+x+ " , " +y+ " }";
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    } 
}
