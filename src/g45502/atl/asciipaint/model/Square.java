package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public class Square extends Rectangle {
    
    /**
     * Builder of square using Rectangle with all attribute
     * @param upperleft point at the to left of the square
     * @param side lenght of each side of the square
     * @param color character to fill the shape with
     */
    public Square(Point upperleft, double side, char color) {
        super(upperleft, side, side, color);
    }
    
    /**
     * Builder of Square using Rectangle with a point and side
     * @param upperleft point at the to left of the square
     * @param side lenght of each side of the square
     */
    public Square(Point upperleft, double side) {
        super(upperleft, side, side);
    }
}
