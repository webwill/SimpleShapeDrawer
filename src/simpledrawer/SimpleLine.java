/*
 * SimpleLine.java
 *
 * @author Gill Windall
 *
 * Represents a line that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SimpleLine extends Shape implements SelectableShape{
    public SimpleLine(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }

    @Override
    public boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sizeChange(int scale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
