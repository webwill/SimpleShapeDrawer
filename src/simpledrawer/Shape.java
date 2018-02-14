/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.awt.Graphics2D;
/**
 *
 * @author willi
 */
public class Shape{
    
    protected List<Point> vertices; // points that define the triangle
    // Shape characteristics
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval or triangle
    private ShapeType shapeType;

    public Shape(List<Point> v, Color c, int t, ShapeType st) {
        vertices = v;
        colour = c;
        thickness = t;
        shapeType = st;
    }
    
    
    public List<Point> getVertices() {
        return vertices;
    }

    public void setVertices(List<Point> vertices) {
        this.vertices = vertices;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
     public void drawShape(Graphics2D g2d, float currentBrightness){
        Color c = scaleColour(vertices.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(thickness));
        
        
        for(int i = 0; i <  vertices.getVertices().size(); i++){
           if(i == vertices.getVertices().size()-1){
            g2d.drawLine(vertices.getVertices().get(i).x, vertices.getVertices().get(i).y, vertices.getVertices().get(0).x, vertices.getVertices().get(0).y);
           }else{
                g2d.drawLine(vertices.getVertices().get(i).x, vertices.getVertices().get(i).y, vertices.getVertices().get(i+1).x, vertices.getVertices().get(i+1).y);
           }
       }
     }
}
