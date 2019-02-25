/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.asciipaint.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G45502
 */
public class AsciiPaintTest {

    /**
     * Test of empty constructor, of class AsciiPaint.
     */
    @Test
    public void testEmptyConstruct() {
        AsciiPaint asciiPaint = new AsciiPaint();
        assertTrue(asciiPaint.getHeight() == 0);
    }

    /**
     * Test of newCircle method, of class AsciiPaint.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNewCircleExc() {
        AsciiPaint asciiPaint = new AsciiPaint(1, 1);
        asciiPaint.newCircle(1, 1, 1, 'c');
    }

    /**
     * Test of newRectangle method, of class AsciiPaint.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNewRectangle() {
        AsciiPaint asciiPaint = new AsciiPaint(1, 1);
        asciiPaint.newRectangle(1, 1, 1, 2, 'r');
    }

    /**
     * Test of newSquare method, of class AsciiPaint.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNewSquare() {
        AsciiPaint asciiPaint = new AsciiPaint(1, 1);
        asciiPaint.newSquare(1, 1, 1, 's');
    }

    /**
     * Test of getHeight method, of class AsciiPaint.
     */
    @Test
    public void testGetHeight() {
        AsciiPaint asciiPaint = new AsciiPaint(10, 5);
        assertEquals(asciiPaint.getHeight(), 10, 0);
    }

    /**
     * Test of getWidth method, of class AsciiPaint.
     */
    @Test
    public void testGetWidth() {
        AsciiPaint asciiPaint = new AsciiPaint(10, 5);
        assertEquals(asciiPaint.getWidth(), 5, 0);
    }

    /**
     * Test of getColorAt method, of class AsciiPaint.
     */
    @Test
    public void testGetColorAt() {
        AsciiPaint asciiPaint = new AsciiPaint(5, 10);
        asciiPaint.newCircle(8, 3, 2, 'c');
        asciiPaint.newRectangle(2, 2, 4, 2, 's');
        assertTrue(asciiPaint.getColorAt(7, 4) == 'c');
    }

    /**
     * Test of removeShapeAt method, of class AsciiPaint.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShapeAt() {
        AsciiPaint asciiPaint = new AsciiPaint(10, 5);
        asciiPaint.newCircle(8, 3, 2, 'c');
        asciiPaint.newSquare(1, 3, 2, 's');
        asciiPaint.removeShapeAt(7, 4);
        asciiPaint.getColorAt(7, 4);
    }

    /**
     * Test of moveShapeAt method, of class AsciiPaint.
     */
    @Test
    public void testMoveShapeAt() {
        AsciiPaint asciiPaint = new AsciiPaint(5, 10);
        asciiPaint.newCircle(8, 3, 2, 'c');
        asciiPaint.newSquare(1, 3, 2, 's');
        asciiPaint.moveShapeAt(2, 2, 3, 1);
        assertTrue(asciiPaint.getColorAt(5, 3) == 's');
    }

    /**
     * Test of moveShapeAt method, of class AsciiPaint.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMoveShapeAtOut() {
        AsciiPaint asciiPaint = new AsciiPaint(10, 5);
        asciiPaint.newCircle(8, 3, 2, 'c');
        asciiPaint.newSquare(1, 3, 2, 's');
        asciiPaint.moveShapeAt(1, 4, 0, 0);
    }

}

