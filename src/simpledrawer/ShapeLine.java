/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Point;

/**
 *
 * @author willi
 */
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
             System.out.println("You have click on a line");
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
