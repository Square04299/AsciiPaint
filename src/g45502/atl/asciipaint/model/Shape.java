/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g45502.atl.asciipaint.model;

/**
 *
 * @author G45502
 */
public interface Shape {
    boolean isInside(Point p);
    void move (double dx, double dy);
    char getColor();
}
