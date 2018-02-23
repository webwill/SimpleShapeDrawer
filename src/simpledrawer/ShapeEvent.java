/*
 * ShapeEvent.java
 *
 * @author Gill Windall
 *
 * Represents a shape event holding data for a shape read from file
 *
 */
package simpledrawer;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ShapeEvent {

    // Shape start location
    
    ArrayList<Point> vertices;
    
    
    // Shape characteristics
    private Color colour;
    private int thickness;
    // Type of shape e.g. line or oval
    private ShapeType shapeType;

    private String eventType; // currently always SHAPE

    
    public ShapeEvent(ArrayList<Point> v, Color c, int t, ShapeType st, String eType) {
        vertices = new ArrayList<>();
        
        for(Point p: v){
        vertices.add(new Point(p.x,p.y));
        }
   
        colour = c;
        thickness = t;
        shapeType = st;
        eventType = eType;
    }

    /** 
     * Default constructor will create a default shape
     */
    

    public ArrayList getVertices(){
          return vertices;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    /**
     * The method converts the string representation of the colour passed to it
     * to the corresponding static constant of class Color e.g. "red" will be
     * converted to Color.RED. The strange code is an example of "reflection".
     * See
     * http://stackoverflow.com/questions/5822384/getting-a-color-from-a-string-input
     * for more explanation.
     *
     * @param colour string representation of the Color required
     */
    public void setColourByString(String colour) {
        try {
            Color c;
            Field f = Color.class.getField(colour.toUpperCase());
            this.colour = (Color) f.get(null);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            this.colour = Color.BLACK;
        }
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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        
        //return "ShapeEvent{" + "xStart=" + xStart + ", yStart=" + yStart + ", xEnd=" + xEnd + ", yEnd=" + yEnd + ", colour=" + colour + ", thickness=" + thickness + ", shapeType=" + shapeType + ", eventType=" + eventType + '}';
       return null;
    }
    
}
