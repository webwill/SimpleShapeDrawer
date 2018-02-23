/*
 * DrawingPanel.java
 *
 * @author Gill Windall
 *
 * A specialised JPanel used as the canvas for simple drawings.
 *
 * NOT created using the NetBeans GUI builder
 */
package simpledrawer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.Line;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

    // current settings used when drawing
    private int currentThickness;
    private Color currentColor;
    private ShapeType currentShapeType;
    private float currentBrightness;
    private int currentRotation;
    private static int canvasWidth;
    private Graphics2D g2d;
    private List<Point> currentPoints; // x and y points for shape being drawn

    private boolean gameIsRunning = false;
    
    ArrayList<ShapeLine> rectLine = new ArrayList<ShapeLine>();
    
    // position of the latest click
    private int x, y;
    
    //Get amount of slides the user wants for their shape;
   
    private int shapeSildes;


    // A List that stores the shapes that appear on the JPanel
    private List<Shape> shapes;  // using a raw type - dangerous !!

    /* Default constructor.  Sets default values for line colour, thickness 
     * and shape type.
     */
    public DrawingPanel() {
        this(Color.BLACK, 5, ShapeType.LINE);
    }

    /* Constructor used to create a DrawingPanel with a
     * specified line colour, thickness and shape type
     */
    public DrawingPanel(Color c, int t, ShapeType st) {
        this.addMouseListener(new MouseWatcher());
        this.addMouseMotionListener(new MouseDrag());
        this.setBorder(BorderFactory.createLoweredBevelBorder());
        x = -1;
        y = -1;
        currentColor = c;
        currentThickness = t;
        currentShapeType = st;
        currentRotation = 0;
        currentBrightness = 1;

        // instantiate the ArrayList to store shapes
        shapes = new ArrayList<Shape>();
    }

    public int getCanvasWidth() {
        return canvasWidth;
    }

    /*
     * paint the drawing including all shapes drawn so far
     *
     * paintComponent() is invoked when repaint() is called and
     * when the GUI needs redrawing e.g. because it has been covered
     * by another window
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Graphics2D needed to set line thickness
        g2d = (Graphics2D) g;

        Stroke s = g2d.getStroke(); // save stroke to restore later

        // rotate the drawing by the current rotation amount
        double rotateTheta = currentRotation * Math.PI / 180;
        g2d.rotate(rotateTheta, this.getWidth() / 2, this.getHeight() / 2);

        // Loop though the ArrayList drawing
        // all the shapes stored in it
        for (Shape Shape : shapes) {
             Shape.drawShape(g2d , currentBrightness);
        }
          
        g2d.setStroke(s);  // restore saved stroke

        
        if(gameIsRunning){
       
        g2d.setStroke(new BasicStroke(currentThickness));
        
    
        
        g2d.drawLine(rectLine.get(0).getStartX(),rectLine.get(0).getStartY() , rectLine.get(0).getEndX(), rectLine.get(0).getEndY());
        g2d.drawLine(rectLine.get(0).getEndX(),rectLine.get(0).getEndY() , rectLine.get(1).getEndX(), rectLine.get(1).getEndY());
        g2d.drawLine(rectLine.get(1).getEndX(),rectLine.get(1).getEndY() , rectLine.get(2).getEndX(), rectLine.get(2).getEndY());
        g2d.drawLine(rectLine.get(3).getStartX(),rectLine.get(3).getStartY() , rectLine.get(0).getStartX(), rectLine.get(0).getStartY());
        

        }else{
            getDot();
        }
    }

    public void setShapeSildes(int input){
        shapeSildes = input;
    }
    
    public void drawRect(){
       
        int canvasX, canvasY;
         
        DrawerMain dm = new DrawerMain();
         
        canvasX = dm.getCanvasWidth().width/4;
        canvasY = dm.getCanvasWidth().height/4;
        
        System.out.println("X:"+canvasX);
        System.out.println("X/4:"+canvasX/4);
        System.out.println("Y:"+canvasY);
        System.out.println("Y/4:"+canvasY/4);
        
        ShapeLine silde1,silde2,silde3,silde4;
         
        silde1 = new ShapeLine(new Point(canvasX,canvasY), new Point(canvasX*3,canvasY));
        silde2 = new ShapeLine(new Point(canvasX*3,canvasY), new Point(canvasX*3,canvasY*3));
        silde3 = new ShapeLine(new Point(canvasX*3,canvasY*2), new Point(canvasX,canvasY*3));
        silde4 = new ShapeLine(new Point(canvasX,canvasY*3), new Point(canvasX,canvasY));
        
        rectLine.add(silde1);
        rectLine.add(silde2);
        rectLine.add(silde3);
        rectLine.add(silde4);
        
         drawLine(canvasX, canvasY,canvasX*3,canvasY);
         drawLine(canvasX*3, canvasY,canvasX*3,canvasY*3);
         
         
         
         gameIsRunning = true;
         repaint();
         
         
    }
    
    public void getDot(){
       if (currentPoints != null && currentPoints.size() >= 1) { // draw dot where line started
            g2d.setColor(currentColor);
            for (int i = 0; i < currentPoints.size(); i++) {
                g2d.fillOval(currentPoints.get(i).x, currentPoints.get(i).y, 5, 5);
            }
            
       }
        
    }
    public void drawLine(int startX, int startY, int endX, int endY){
            
            
            System.out.println("Called the line");
           
           
            
    }
    public void drawDot(){
       
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x,y, 5, 5);
        
    }
    
    /**
     * @return the currentShapeType
     */
    public ShapeType getCurrentShapeType() {
        return currentShapeType;
    }

    /**
     * @param currentShapeType the currentShapeType to set
     */
    public void setCurrentShapeType(ShapeType currentShapeType) {
        this.currentShapeType = currentShapeType;
    }

    /**
     * @return the currentBrightness
     */
    public float getCurrentBrightness() {
        return currentBrightness;
    }

    /*
     * currentBrightness is passed in as a number in the range
     * 0 to 1.  In this class it needs to be in the range 0.75 to
     * 1.25 which is what the division by 2 and addition of
     * 0.75 achieves.
     */
    public void setCurrentBrightness(float currentBrightness) {
        this.currentBrightness = (currentBrightness / 2) + 0.75F;
        repaint();
    }
    public int getSildes(){
        return shapeSildes;
    }
    
    public void rectIsSelected(Point p){
        for(ShapeLine line: rectLine){
            if(line.getSelectableBound(p)){
                    //make all adjuctment
            }        
        
        }
    }

    private class MouseDrag implements MouseMotionListener {

        
        @Override
        public void mouseDragged(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println("X:" + e.getX() + " Y" + e.getY() );
            rectIsSelected(new Point(e.getX(), e.getY()));
            
        }
        

        @Override
        public void mouseMoved(MouseEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
    /* MouseWatcher is an inner class used to handle the
     * mouse events generated by the user clicking on the drawing panel
     */
    private class MouseWatcher extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            // reset the rotation to 0 otherwise things get messy.
            currentRotation = 0;

            if (currentPoints == null) { // must be starting a new shape
                
                currentPoints = new ArrayList<>();
                currentPoints.add(new Point(e.getX(),e.getY()));
                
            } else { // shape must have already been started
                // decide what to do based on the current shape
                switch (currentShapeType) {
                    case LINE: // Draw the line 
                        currentPoints.add(new Point(e.getX(), e.getY()));
                        shapes.add(new SimpleLine(currentPoints, currentColor, currentThickness, ShapeType.LINE));
                        currentPoints = null;
                        break;
                    case OVAL: // Draw the oval
                        currentPoints.add(new Point(e.getX(), e.getY()));
                        shapes.add(new SimpleOval(currentPoints, currentColor, currentThickness, ShapeType.OVAL));
                        currentPoints = null;
                        break;
                    case TRIANGLE: // May or may not have finished the triangle
                        currentPoints.add(new Point(e.getX(), e.getY()));
                        //This is not where the dots are been created
                        if (currentPoints.size() == 3) { // 3 points so must be complete triangle
                            shapes.add(new SimpleTriangle(currentPoints, currentColor, currentThickness, ShapeType.TRIANGLE));
                            currentPoints = null;
                            break;
                        }
                        break;
                    case RECTANGLE:
                        //Need to get store the fourth point to create a rectangle

                        SimpleRectangle test = new SimpleRectangle();
                        if (currentPoints.size()  > 1 && test.checkSamePoint(currentPoints)) {
                              currentPoints.add(new Point(e.getX(), e.getY()));
                              
                        }else if(currentPoints.size() == 1){
                           currentPoints.add(new Point(e.getX(), e.getY()));
                           currentPoints = test.checkSamePointList(currentPoints);
                            
                        }
                        
                        if (currentPoints.size() == 4) {
                            SimpleRectangle st = new SimpleRectangle(currentPoints, currentColor, currentThickness, ShapeType.RECTANGLE);
                            shapes.add(st);
                            currentPoints = null;
                            break;
                        }
                    case NEWSHAPE:
                        
                        currentPoints.add(new Point(e.getX(), e.getY()));
                        //This is not where the dots are been created
                        if (currentPoints.size() == getSildes()) { // 3 points so must be complete triangle
                            shapes.add(new SimpleTriangle(currentPoints, currentColor, currentThickness, ShapeType.TRIANGLE));
                            currentPoints = null;
                            break;
                        }
                        break;
                    case NOSHAPE:
                        
                        
                        break;
                       
                }
            }
            repaint(); // causes paintComponent() to be called
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e); //To change body of generated methods, choose Tools | Templates.
            System.out.println("This is the ");
        }

        
        
    }

    public void setCurrentThickness(int currentThickness) {
        this.currentThickness = currentThickness;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    public void clearDisplay() {
        // Empty the ArrayList and clear the display.
        shapes.clear();
        repaint();
    }

    /* The whole drawing area can be rotated left or right.
     * The amount passed in is the amount in degrees to rotate.
     * A negative number roates to the left and a positive number to
     * the right
     */
    public void rotate(int amount) {
        currentRotation += amount;
        repaint();
    }

    public void setShapes(List shapes) {
        this.shapes = shapes;
    }
}
