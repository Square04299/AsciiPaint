package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public class Main {

    /**
     * Start AsciiPaint.
     *
     * @param args
     */
    public static void main(String[] args) {
        AsciiPaint asciiPaint = new AsciiPaint();
        View view = new View(asciiPaint);
        new Controller(view).startAscii();
    }
}
