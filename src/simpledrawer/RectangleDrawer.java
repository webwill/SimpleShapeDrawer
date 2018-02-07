/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author willi
 */
class RectangleDrawer {
    
    private SimpleRectangle rectangle;
    
    
    public RectangleDrawer(SimpleRectangle rectangle) {
        this.rectangle = rectangle;
    }
    
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        // scale the brightness of the colour
        Color c = scaleColour(rectangle.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(rectangle.getThickness()));

        
       // g2d.drawLine(rectangle.getVertices().get(0).x, rectangle.getVertices().get(0).y, rectangle.getVertices().get(1).x, rectangle.getVertices().get(1).y);
        //draw the 
    //    g2d.drawLine(rectangle.getVertices().get(1).x, rectangle.getVertices().get(1).y, rectangle.getVertices().get(2).x, rectangle.getVertices().get(2).y);
        //This is the thrid line 
    //    g2d.drawLine(rectangle.getVertices().get(2).x, rectangle.getVertices().get(2).y, rectangle.getVertices().get(3).x, rectangle.getVertices().get(3).y);
        //This is drawing the fourth
   //     g2d.drawLine(rectangle.getVertices().get(3).x, rectangle.getVertices().get(3).y, rectangle.getVertices().get(0).x, rectangle.getVertices().get(0).y);
   
   for(int i = 0; i < rectangle.getVertices().size(); i ++){
           if(i == rectangle.getVertices().size()-1){
            g2d.drawLine(rectangle.getVertices().get(i).x, rectangle.getVertices().get(i).y, rectangle.getVertices().get(0).x, rectangle.getVertices().get(0).y);
           
           }else{
                g2d.drawLine(rectangle.getVertices().get(i).x, rectangle.getVertices().get(i).y, rectangle.getVertices().get(i+1).x, rectangle.getVertices().get(i+1).y);
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
    private Color scaleColour(Color c, float currentBrightness) {
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
