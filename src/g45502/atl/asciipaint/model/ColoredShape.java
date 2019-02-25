package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public abstract class ColoredShape implements Shape{
    private char color;

    public ColoredShape(char color) {
        this.color = color;
    }

    @Override
    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
