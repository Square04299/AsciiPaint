package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public interface Shape {

    /**
     * Method to see is a point is inside a shape
     * @param p Point that will be verified
     * @return true if the point is inside the shape
     */
    boolean isInside(Point p);

    /**
     * Method to move a point by adding an x and y
     * @param dx add to the current x
     * @param dy add to the current y
     */
    void move (double dx, double dy);

    /**
     * Getter of the character
     * @return the character
     */
    char getColor();
}
