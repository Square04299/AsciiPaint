package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public class AsciiPaint {
    private final Drawing drawing;

    public AsciiPaint(int width, int height) {
        drawing = new Drawing(width, height);
    }
    
    public AsciiPaint() {
        drawing = new Drawing(0, 0);
    }
    
    /**
     * Create a circle with a center a radius and a color.
     *
     * @param x X value of the center.
     * @param y Y value of the center.
     * @param radius Radius of the circle.
     * @param color Color of the circle.
     */
    public void newCircle(int x, int y, int radius, char color) {
        if ((x + radius) <= drawing.getWidth() && (x - radius) >= 0
                && (y + radius) <= drawing.getHeight() && (y - radius) >= 0) {
            drawing.addShape(new Circle(new Point(x, y), radius, color));
        } else {
            throw new IllegalArgumentException("Your Circle isn't in the drawing."
                    + " Circle = "
                    + " Center x : " + x + " Center Y : " + y + " Radius : " + radius
                    + " Drawing = "
                    + " Height : " + drawing.getHeight() + " Width : " + drawing.getWidth());
        }
    }

    /**
     * Create a rectangle with upperleft x and y, height and width of the
     * rectangle and this color.
     *
     * @param x X value of the upper left corner.
     * @param y Y value of the upper left corner.
     * @param width Width value of the rectangle.
     * @param height Height value of the rectangle.
     * @param color Color of the rectangle.
     */
    public void newRectangle(int x, int y, int width, int height, char color) {
        width--;
        height--;
        if (x >= 0 && (x + width) < drawing.getWidth()
                && (y - height) >= 0 && y < drawing.getHeight()) {
            drawing.addShape(new Rectangle(new Point(x, y), width, height, color));
        } else {
            throw new IllegalArgumentException("Your Rectangle isn't in the drawing."
                    + " Rectangle = "
                    + " Upper left x : " + x + " Upper left Y : " + y
                    + " Width : " + width + " Height : " + height
                    + " Drawing = "
                    + " Height : " + drawing.getHeight() + " Width : " + drawing.getWidth());
        }
    }

    /**
     * Create a square with upperleft x and y, side of the square and this
     * color.
     *
     * @param x X value of the upper left corner.
     * @param y Y value of the upper left corner.
     * @param side Side value of the square.
     * @param color Color of the square.
     */
    public void newSquare(int x, int y, int side, char color) {
        side--;
        if (x >= 0 && (x + side) < drawing.getWidth()
                && (y - side) >= 0 && y < drawing.getHeight()) {
            drawing.addShape(new Square(new Point(x, y), side, color));
        } else {
            throw new IllegalArgumentException("Your Square isn't in the drawing."
                    + " Square = "
                    + " Upper left x : " + x + " Upper left Y : " + y + " Side : " + side
                    + " Drawing = "
                    + " Height : " + drawing.getHeight() + " Width : " + drawing.getWidth());
        }
    }

    /**
     * The height value of the asciipaint.
     *
     * @return height value
     */
    public int getHeight() {
        return drawing.getHeight();
    }

    /**
     * The width value of the asciipaint.
     *
     * @return width value
     */
    public int getWidth() {
        return drawing.getWidth();
    }

    /**
     * Get the color of a shape where the point is inside.
     *
     * @param x X value of the point.
     * @param y Y value of the point.
     * @return The color of the shape.
     */
    public char getColorAt(int x, int y) {
        return drawing.getShapeAt(new Point(x, y)).getColor();
    }

    /**
     * remove the shape where the point is inside.
     *
     * @param x X value of the point.
     * @param y Y value of the point.
     */
    public void removeShapeAt(int x, int y) {
        drawing.getShapes().remove(drawing.getShapeAt(new Point(x, y)));
    }

    /**
     * Move a shape where the point is inside.
     *
     * @param x X value of the point.
     * @param y Y value of the point.
     * @param dx Change X value.
     * @param dy Change Y value.
     */
    public void moveShapeAt(int x, int y, int dx, int dy) {
        drawing.getShapeAt(new Point(x, y)).move(dx, dy);
    }
}
