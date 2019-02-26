package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public abstract class ColoredShape implements Shape{
    private final char color;
    
    /**
     *Builder of ColoredShape
     * @param color asci character
     */
    public ColoredShape(char color) {
        this.color = color;
    }

    /**
     *getter of color
     * @return the character
     */
    @Override
    public char getColor() {
        return color;
    }
}
