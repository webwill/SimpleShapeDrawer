package simpledrawer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

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

    