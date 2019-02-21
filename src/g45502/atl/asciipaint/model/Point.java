package g45502.atl.asciipaint.model;

import static java.lang.Math.*;

/**
 *
 * @author G45502
 */
public class Point {
    private double x;
    private double y;

    public Point(){
        this(0,0);
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    void move(double dx, double dy){
        x += dx;
        y += dy;
    }
    
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
