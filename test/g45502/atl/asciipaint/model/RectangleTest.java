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
public class RectangleTest {
    
    public RectangleTest() {
    }

    /**
     * Test of constructor method, of class Rectangle.
     */
    @Test
    public void testRectangleDefault() {
        Rectangle rc = new Rectangle();
        Rectangle expected = new Rectangle(new Point(), 0, 0, '#');
        assertEquals(expected, rc);
    }
    
    /**
     * Test of constructor method, of class Rectangle.
     */
    @Test
    public void testRectangleParametre() {
        Rectangle rc = new Rectangle(new Point(), 0, 0, '@');
        Rectangle expected = new Rectangle(new Point(), 0, 0, '@');
        assertEquals(expected, rc);
    }
    
    /**
     * Test of constructor method, of class Rectangle.
     */
    @Test
    public void testRectangleDefaultColor() {
        Rectangle rc = new Rectangle(new Point(), 0, 0);
        Rectangle expected = new Rectangle(new Point(), 0, 0, '#');
        assertEquals(expected, rc);
    }
    
    /**
     * Test of constructor method, of class Rectangle.
     */
    @Test(expected = NullPointerException.class)
    public void testRectangleNull() {
        Rectangle rc = new Rectangle(null, 0, 0, '#');
    }
    
    /**
     * Test of isInside method, of class Rectangle.
     */
    @Test
    public void testIsInside() {
        Rectangle rc = new Rectangle(new Point(1,3), 4, 2);
        Point p = new Point(2,2);
        assertTrue(rc.isInside(p));
    }

    /**
     * Test of move method, of class Rectangle.
     */
    @Test
    public void testMove() {
        Rectangle rc = new Rectangle(new Point(1,3), 4, 2);
        rc.move(1,1);
        Rectangle expected = new Rectangle(new Point(2,4), 4, 2);
        assertEquals(expected, rc);
    }

    /**
     * Test of getUpperleft method, of class Rectangle.
     */
    @Test
    public void testGetUpperleft() {
        System.out.println("getUpperleft");
        Rectangle instance = new Rectangle();
        Point expResult = new Point(0.0,0.0);
        Point result = instance.getUpperleft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getHeight method, of class Rectangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getColor method, of class Rectangle.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Rectangle instance = new Rectangle();
        char expResult = '#';
        char result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Rectangle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Rectangle instance = new Rectangle();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
