/*
 * OvalDrawer.java
 *
 * @author Gill Windall
 *
 * This class can be given a SimpleOval object and draw it using a 
 * Graphics2D object.
 * 
 */
package simpledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class OvalDrawer implements Drawer{

    private SimpleOval oval; // the oval to be drawn
    private DrawingPanel panel;

    public OvalDrawer(SimpleOval oval) {
        this.oval = oval;
        panel = new DrawingPanel();
    }

    /**
     * Draw the shape using a Graphics2D object
     *
     * @param g2d Graphics2D object used for drawing
     * @param currentBrightness the current brightness being used to draw
     */
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(oval.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(oval.getThickness()));

        int xs = oval.vertices.get(0).x;
        int ys = oval.vertices.get(0).y;
        
        int bottomXs =  ((oval.vertices.get(1).x- xs <= 0))? oval.vertices.get(1).x - xs : oval.vertices.get(1).x + xs ;
        // draw the oval        
        
        if((oval.vertices.get(1).x- xs) < 0){
          
       
            
            
        g2d.drawOval(xs, ys,Math.abs(oval.vertices.get(1).x - xs)  , oval.vertices.get(1).y - ys);
        
        }else{
            g2d.drawOval(xs, ys, oval.vertices.get(1).x - xs, oval.vertices.get(1).y - ys);
        }
        
       
    }

    /* The colour can be made brighter or darker.
     * currentBrightness is a number between 0.75 and 1.25
     * which is used to scale the brightness.  Each of the colours
     * (red, green and blue) have their values mutiplied by
     * currentBrightness.  If currentBrightness is < 1 the colours
     * will get darker.  If it is > 1 they will get brighter.
     * We have to be careful the values don't go over 255 as
     * that's the maximum allowed.
     */

    @Override
    public Color scaleColour(Color c, float currentBrightness) {
        // get the red amount and scale by currentBrightness
        int red = (int) (c.getRed() * currentBrightness);
        // check we've not gone over 255
        red = red > 255 ? 255 : red;
        // do the same for green and blue
        int green = (int) (c.getGreen() * currentBrightness);
        green = green > 255 ? 255 : green;
        int blue = (int) (c.getBlue() * currentBrightness);
        blue = blue > 255 ? 255 : blue;
        Color scaledColour = new Color(red, green, blue);

        return scaledColour;
    }
    
}
