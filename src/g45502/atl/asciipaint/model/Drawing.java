package g45502.atl.asciipaint.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G45502
 */
public class Drawing {
    private List<Shape> shapes;
    private int height;
    private int width;
    
    /**
     * Builder of drawing with attribute
     * @param height height of the canvas to draw
     * @param width width of the canvas to draw
     */
    public Drawing(int height, int width) {
        this.shapes = new ArrayList<>();
        this.height = height;
        this.width = width;
    }

    /**
     * Builder of drawing default
     */
    public Drawing() {
        this(0,0);
    }

    /**
     * Getter of shapes
     * @return shapes
     */
    public List<Shape> getShapes() {
        return shapes;
    }

    /**
     * Getter of height
     * @return height of the canvas
     */
    public int getHeight() {
        return height;
    }

    /**
     * Getter of width
     * @return width of the canvas
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Add a new shape to the drawing canvas
     * @param shape new shape to add
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    
    /**
     * Will go thought the canvas to see if the point if inside the shape
     * @param p point the check if he is inside the shape
     * @return true if you can add the point to the shape
     */
    public Shape getShapeAt(Point p){
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).isInside(p)) {
                return shapes.get(i);
            }
        }
        throw new IllegalArgumentException();
    }
    
    
}
