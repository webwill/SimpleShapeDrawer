/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ww4953j
 */
public class ChangeCurrentShapeColour {

    
    
    public void ChangeColour(Color color){
        DrawingPanel drawingPanel = new DrawingPanel();
        List<Shape> newShape = new ArrayList<Shape>();
        
        List<Shape>  tempShape = drawingPanel.getCurrentShape();
        
        
        System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " shape " + tempShape.size());
        for(Shape s: tempShape){
             s.setColour(color);
             newShape.add(s);
        }
        
        drawingPanel.clearDisplay();
        drawingPanel.setCurrentShape(newShape);
        drawingPanel.repaintCanvas();
        
    
    }
    
    
}

    