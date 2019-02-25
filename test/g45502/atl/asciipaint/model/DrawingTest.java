package g45502.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G45502
 */
public class DrawingTest {

    /**
     * Test of getHeight method, of class Drawing.
     */
    @Test
    public void testGetHeight() {
        Drawing drawing = new Drawing(3, 2);
        assertEquals(drawing.getHeight(), 3);
    }

    /**
     * Test of getWidth method, of class Drawing.
     */
    @Test
    public void testGetWidth() {
        Drawing drawing = new Drawing(3, 2);
        assertEquals(drawing.getWidth(), 2);
    }

    /**
     * Test of addShape method, of class Drawing.
     */
    @Test
    public void testAddShape() {
        Drawing drawing = new Drawing(3, 2);
        drawing.addShape(new Square(new Point(1, 1), 3, 's'));
        assertEquals(drawing.getShapes().size(), 1);
    }
    
    /**
     * Test of addShape method, of class Drawing.
     */
    @Test
    public void testAddShapeEmptyConstructor() {
        Drawing drawing = new Drawing();
        drawing.addShape(new Square(new Point(1, 1), 3, 's'));
        assertEquals(drawing.getShapes().size(), 1);
    }

    /**
     * Test of getShapeAt method, of class Drawing.
     */
    @Test
    public void testGetShapeAt() {
        Drawing drawing = new Drawing(10, 10);
        Square square = new Square(new Point(3, 3), 3, 's');
        drawing.addShape(square);
        Rectangle rectangle = new Rectangle(new Point(2, 5), 4, 2, 'r');
        drawing.addShape(rectangle);
        Point p = new Point(3, 4);
        assertEquals(drawing.getShapeAt(p), rectangle);
    }

}