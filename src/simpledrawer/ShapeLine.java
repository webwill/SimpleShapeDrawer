package simpledrawer;

import java.awt.Point;

public class ShapeLine {
    private Point startPoint, endPoint;    

    int minBound,maxBound, bufferArea = 10;
    
    public ShapeLine(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        
    }
    
    //public void setRectIndex
    
    public boolean getSelectableBound(Point p){
        
        //get the min and max X axle
        //get the min and max Y axle
        
        
        if(p.x >= startPoint.x && p.x <= endPoint.x && p.y >= startPoint.y && p.y <= endPoint.y ){
        }
        
        //return true the mouse is clicking on the line
        //than need to draw the affect lines
 
       
        
        return true;
    }
    
    public int getStartX(){
        return startPoint.x;
    }
    
    public int getStartY(){
        return startPoint.y;
    }
    public int getEndX(){
        return endPoint.x;
    }
    public int getEndY(){
        return endPoint.y;
    }
    
    public void setStartPoint(Point p){
    
    }
    public void setEndPoint(Point p){}
   
}
