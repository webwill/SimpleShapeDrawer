/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SimpleOval extends Shape implements ShapeArea{
    public SimpleOval(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }
    public double getArea() {
        int line1 = vertices.get(1).x- vertices.get(0).x;
        int line2 = vertices.get(1).y - vertices.get(0).x;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1/2 * line2/2);
        return Math.PI * line1/2 * line2/2;
    }
}
