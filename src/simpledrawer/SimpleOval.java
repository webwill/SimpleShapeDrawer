/*
 * SimpleOval.java
 *
 * @author Gill Windall
 *
 * Represents an oval that can be drawn on a drawing area
 *
 */
package simpledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.List;

public class SimpleOval extends Shape implements ShapeArea, SelectableShape{
    
    Color colour = null;
    int t;
    
    public SimpleOval(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
        this.colour = c;
        this.t = t;
    }
    @Override
    public double getArea() {
        int line1 = vertices.get(1).x- vertices.get(0).x;
        int line2 = vertices.get(1).y - vertices.get(0).x;
        System.out.println(line1 + ", " + line2 + " " + Math.PI * line1/2 * line2/2);
        return Math.PI * line1/2 * line2/2;
    }

    @Override
    public void drawShape(Graphics2D g2d, float currentBrightness) {
         Color c = scaleColour(colour,currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(t));

        int xs = vertices.get(0).x;
        int ys = vertices.get(0).y;
        
        int bottomXs =  ((vertices.get(1).x- xs <= 0))? vertices.get(1).x - xs : vertices.get(1).x + xs ;
        // draw the oval        
        
        if((vertices.get(1).x- xs) < 0){
          
       
            
            
        g2d.drawOval(xs, ys,Math.abs( vertices.get(1).x - xs)  ,  vertices.get(1).y - ys);
        
        }else{
            g2d.drawOval(xs, ys,  vertices.get(1).x - xs,  vertices.get(1).y - ys);
        }
        
    }    

    @Override
    public boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
