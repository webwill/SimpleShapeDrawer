/*
 * TriangleDrawer.java
 *
 * @author Gill Windall
 *
 * This class can be given a SimpleTriangle object and draw it using a 
 * Graphics2D object.
 * 
 */
package simpledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.sound.midi.SysexMessage;

public class TriangleDrawer  implements Drawer{

    private SimpleTriangle triangle; // the triangle to be drawn

    public TriangleDrawer(SimpleTriangle triangle) {
        this.triangle = triangle;
    }

    /**
     * Draw the shape using a Graphics2D object
     *
     * @param g2d Graphics2D object used for drawing
     * @param currentBrightness the current brightness being used to draw
     */
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(triangle.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(triangle.getThickness()));

        // draw the triangle
        //g2d.drawLine(triangle.getVertices().get(0).x, triangle.getVertices().get(0).y, triangle.getVertices().get(1).x, triangle.getVertices().get(1).y);
        //g2d.drawLine(triangle.getVertices().get(2).x, triangle.getVertices().get(2).y, triangle.getVertices().get(1).x, triangle.getVertices().get(1).y);
        //This is the thrid line 
       //g2d.drawLine(triangle.getVertices().get(2).x, triangle.getVertices().get(2).y, triangle.getVertices().get(0).x, triangle.getVertices().get(0).y);
       
       for(int i = 0; i < triangle.getVertices().size(); i ++){
           if(i == triangle.getVertices().size()-1){
            g2d.drawLine(triangle.getVertices().get(i).x, triangle.getVertices().get(i).y, triangle.getVertices().get(0).x, triangle.getVertices().get(0).y);
           
           }else{
                g2d.drawLine(triangle.getVertices().get(i).x, triangle.getVertices().get(i).y, triangle.getVertices().get(i+1).x, triangle.getVertices().get(i+1).y);
           }
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
    /*private Color scaleColour(Color c, float currentBrightness) {
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
    } */

    @Override
    public Color scaleColour(Color c, float currentBrightness) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
