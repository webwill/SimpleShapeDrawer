package simpledrawer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.List;

public class SimpleRectangle extends Shape implements ShapeArea, SelectableShape {

    

    public SimpleRectangle(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }
    
    public SimpleRectangle(List<Point> v, Color c, int t, ShapeType st, Color fill) {
        super(v, c, t, st, fill);
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
