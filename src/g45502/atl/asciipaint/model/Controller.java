package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public class Controller {
    private final AsciiPaint asciiPaint;
    private final View view;

    /**
     * Create an sciipaint with a view.
     *
     * @param view The view.
     */
    public Controller(View view) {
        asciiPaint = view.defineSizeDrawing();
        this.view = new View(asciiPaint);
    }

    /**
     * Start the ascii game.
     */
    public void startAscii() {
        view.introduce();
        view.insertCommand();
    }
}
