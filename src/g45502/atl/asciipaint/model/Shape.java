package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public interface Shape {
    boolean isInside(Point p);
    void move (double dx, double dy);
    char getColor();
}
