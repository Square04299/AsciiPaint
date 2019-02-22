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
public class CircleTest {
    
    public CircleTest() {
    }
    
    /**
     * Test of constructor method, of class Circle.
     */
    @Test
    public void testCircle() {
        System.out.println("Circle");
        Circle c = new Circle();
        Circle expected = new Circle(new Point(), 0, '#');
        assertEquals(expected, c);
    }
    
    /**
     * Test of constructor method, of class Circle.
     */
    @Test
    public void testCircleColor() {
        System.out.println("CircleColor");
        Circle c = new Circle(new Point(),0);
        Circle expected = new Circle(new Point(), 0, '#');
        assertEquals(expected, c);
    }
    
    /**
     * Test of constructor method, of class Rectangle.
     */
    @Test
    public void testCircleParametre() {
        System.out.println("CircleParametre");
        Circle c = new Circle(new Point(), 0, '@');
        Circle expected = new Circle(new Point(), 0 , '@');
        assertEquals(expected, c);
    }
    
    /**
     * Test of constructor method, of class Circle.
     */
    @Test(expected = NullPointerException.class)
    public void testCircleNull() {
        System.out.println("CircleNull");
        Circle c = new Circle(null, 0, '#');
    }

    /**
     * Test of getCenter method, of class Circle.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        Circle instance = new Circle();
        Point expResult = new Point(0,0);
        Point result = instance.getCenter();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRaduis method, of class Circle.
     */
    @Test
    public void testGetRaduis() {
        System.out.println("getRaduis");
        Circle instance = new Circle();
        double expResult = 0.0;
        double result = instance.getRaduis();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of isInside method, of class Circle.
     */
    @Test
    public void testIsInsideIn() {
        System.out.println("isInsideIn");
        Point p = new Point(2,2);
        Circle instance = new Circle(new Point(1,1), 3, '#');
        boolean expResult = true;
        boolean result = instance.isInside(p);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isInside method, of class Circle.
     */
    @Test
    public void testIsInsideOut() {
        System.out.println("isInsideOut");
        Point p = new Point(4,1);
        Circle instance = new Circle(new Point(1,1), 3, '#');
        boolean expResult = false;
        boolean result = instance.isInside(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Circle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Circle c = new Circle(new Point(2,2), 3);
        c.move(1, 1);
        Circle expected = new Circle(new Point(3,3), 3);
        assertEquals(expected, c);
    }

    /**
     * Test of hashCode method, of class Circle.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Circle instance = new Circle();
        int expResult = 0;
        int result = instance.hashCode();
        assertFalse(expResult == result);
    }

    /**
     * Test of equals method, of class Circle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Circle();
        Circle instance = new Circle();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
