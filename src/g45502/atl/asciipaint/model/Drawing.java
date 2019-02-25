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

    public Drawing(int height, int width) {
        this.shapes = new ArrayList<>();
        this.height = height;
        this.width = width;
    }

    public Drawing() {
        this(0,0);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    
    public Shape getShapeAt(Point p){
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).isInside(p)) {
                return shapes.get(i);
            }
        }
        throw new IllegalArgumentException();
    }
    
    
}
