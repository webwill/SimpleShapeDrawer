package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SimpleRectangle extends Shape implements ShapeArea, SelectableShape {

    public SimpleRectangle() {
        super(null, null, 0, null);
    }

    public SimpleRectangle(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
