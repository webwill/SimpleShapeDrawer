package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class FactoryShape {
    
    public Shape getShapeType(List<Point> currentPoints, Color currentColor, int currentThickness, ShapeType shapeType) {
        switch(shapeType){
            case RECTANGLE:
                return new SimpleRectangle(currentPoints, currentColor, currentThickness, shapeType);
            case LINE:
                return new SimpleLine(currentPoints, currentColor, currentThickness, shapeType);
            case OVAL:
                return new SimpleOval(currentPoints, currentColor, currentThickness, shapeType);
            case TRIANGLE:
                return new SimpleTriangle(currentPoints, currentColor, currentThickness, shapeType);
            default:
                return null;
        }
    }
    
}
