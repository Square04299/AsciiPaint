/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.asciipaint.model;

import static java.lang.Math.sqrt;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G45502
 */
public class PointTest {
    
    /**
     * Test of constructor, of class Point.
     */
    @Test
    public void testPointDefault() {
        Point p = new Point();
        Point expected = new Point(0,0);
        assertEquals(expected, p);
    }
    
    /**
     * Test of constructor, of class Point.
     */
    @Test
    public void testPointCopy() {
        Point expected = new Point(2,2);
        Point pc = new Point(expected);
        assertEquals(expected, pc);
    }
    
    /**
     * Test of getter X, of class Point.
     */
    @Test
    public void testGetX() {
        Point expected = new Point(5,3);
        assertTrue(5 == expected.getX());
    }
    
    /**
     * Test of getter Y, of class Point.
     */
    @Test
    public void testGetY() {
        Point expected = new Point(5,3);
        assertTrue(3 == expected.getY());
    }
    

    /**
     * Test of move method, of class Point.
     */
    @Test
    public void testMoveValidePoint() {
        Point p = new Point(1,1);
        p.move(1,1);
        Point expected = new Point(2,2);
        assertEquals(expected, p);
    }
    
    /**
     * Test of distanceTo method, of class Point.
     */
    @Test
    public void testDistanceToValideDistance() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        double expected = sqrt(2);
        double results = p1.distanceTo(p2);
        assertTrue(expected == results);
    }
    
    /**
     * Test of distanceTo method, of class Point.
     */
    @Test
    public void testDistanceToODistance() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,1);
        double expected = 0;
        double results = p1.distanceTo(p2);
        assertTrue(expected == results);
    }
    
    /**
     * Test of distanceTo method, of class Point.
     */
    @Test(expected = NullPointerException.class)
    public void testDistanceToNull() {
        Point p1 = new Point(1,1);
        Point p2 = null;
        double results = p1.distanceTo(p2);
    }
    
    /**
     * Test of distanceTo method, of class Point.
     */
    @Test
    public void testToString() {
        Point p1 = new Point();
        String expeString = null;
        assertFalse(p1.toString() == expeString);
    }
    
    
}
