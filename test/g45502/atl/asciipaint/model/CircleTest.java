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
    public void testIsInside() {
        System.out.println("isInside");
        /*
        Point and circle need to finish the test
        */
        Point p = new Point();
        Circle instance = new Circle(new Point(), 0, '#');
        boolean expResult = false;
        boolean result = instance.isInside(p);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Circle.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        double dx = 0.0;
        double dy = 0.0;
        Circle instance = new Circle();
        instance.move(dx, dy);
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Circle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Circle instance = new Circle();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
