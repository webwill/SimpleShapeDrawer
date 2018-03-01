/*
 * SimpleTriangle.java
 *
 * @author Gill Windall
 *
 * Represents a triangle that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SimpleTriangle extends Shape implements ShapeArea, SelectableShape{

    public SimpleTriangle(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }

    @Override
    public double getArea() {
        int term1 = vertices.get(0).x * (vertices.get(1).y - vertices.get(2).y);
        int term2 = vertices.get(1).x * (vertices.get(2).y - vertices.get(0).y);
        int term3 = vertices.get(2).x * (vertices.get(0).y - vertices.get(1).y);

        return Math.abs((term1 + term2 + term3) / 2.0);
    }

    @Override
    public boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
