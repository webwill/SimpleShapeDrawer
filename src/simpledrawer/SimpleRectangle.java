package simpledrawer;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SimpleRectangle extends Shape implements ShapeArea {

    private int minX, maxX, minY, maxY;

    public SimpleRectangle() {
        super(null, null, 0, null);
    }

    public SimpleRectangle(List<Point> v, Color c, int t, ShapeType st) {
        super(v, c, t, st);
    }
    public List<Point> checkSamePointList(List<Point> v){  
        
        
        Point p = v.get(1);
        
                minX = v.get(0).x - 10;
                maxX = v.get(0).x + 10;
                minY = v.get(0).y - 10;
                maxY = v.get(0).y + 10;
         
                if (p.x <= maxX && p.x >= minX && p.y <= maxY && p.y >= minY){
                       JOptionPane.showConfirmDialog(null, "You are clicking too short to the last click");
                       List<Point> point = new ArrayList<>();
                       point.add(v.get(0));
                       return point;
                }
        
        return v;
}
    public boolean checkSamePoint(List<Point> v) {
            boolean state = false;
        for (int i = 0; i < v.size(); i++) {
            //We need to compare two point together 

            Point p = v.get(i);
            if ((i == v.size() - 1)){
            break;
            }else{
         
                int z = i + 1;
                minX = v.get(z).x - 10;
                maxX = v.get(z).x + 10;
                minY = v.get(z).y - 10;
                maxY = v.get(z).y + 10;

                if (p.x <= maxX && p.x >= minX && p.y <= maxY && p.y >= minY) {
                    JOptionPane.showConfirmDialog(null, "You are clicking too close to the previous point.");
                   state = false;
                  break;
                }else {
                    state = true;
                }
            }
        }
           System.out.println(state); 
       return state;
        
}

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
