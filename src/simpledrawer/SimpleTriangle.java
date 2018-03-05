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
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
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

    @Override
    public void sizeChange(int scale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawShape(Graphics2D g2d, float currentBrightness) {
       // super.drawShape(g2d, currentBrightness); //To change body of generated methods, choose Tools | Templates.
       int[] x = new int[vertices.size()];
       int[] y = new int[vertices.size()];
       for(int i = 0 ; i < vertices.size(); i++){
           x[i] = vertices.get(i).x;
           y[i] = vertices.get(i).y;
           
       }
       g2d.setColor(getColour());
       Polygon p = new Polygon(x, y, 3);
       g2d.fillPolygon(p);
    }
    
    
}
