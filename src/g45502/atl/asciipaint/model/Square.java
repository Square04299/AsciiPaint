package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public class Square extends Rectangle {

    public Square(Point upperleft, double side, char color) {
        super(upperleft, side, side, color);
    }
    
    public Square(Point upperleft, double side) {
        super(upperleft, side, side);
    }
}
