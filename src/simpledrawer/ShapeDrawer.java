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
public class ShapeDrawer implements Drawer{

    private Shape shape;
    
    public ShapeDrawer(Shape shape) {
        this.shape =  shape;
    }

    @Override
    public void drawShape(Graphics2D g2d, float currentBrightness) {
        Color c = scaleColour(shape.getColour(), currentBrightness);
        g2d.setColor(c);
        // set the thickness of the line
        g2d.setStroke(new BasicStroke(shape.getThickness()));
        
        
        for(int i = 0; i <  shape.getVertices().size(); i ++){
           if(i == shape.getVertices().size()-1){
            g2d.drawLine(shape.getVertices().get(i).x, shape.getVertices().get(i).y, shape.getVertices().get(0).x, shape.getVertices().get(0).y);
           }else{
                g2d.drawLine(shape.getVertices().get(i).x, shape.getVertices().get(i).y, shape.getVertices().get(i+1).x, shape.getVertices().get(i+1).y);
           }
       }
    }

    @Override
    public Color scaleColour(Color c, float currentBrightness) {
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
