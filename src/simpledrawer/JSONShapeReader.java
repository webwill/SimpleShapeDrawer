/*
 * JSONShapeREader.java
 *
 * @author Gill Windall
 *
 * Used to read shapes from a file stored in JSON format.  Uses the Gson
 * library to convert the JSON from the file into Java objects in memory.
 * You can read more about Gson at https://code.google.com/p/google-gson/
 *
 */
package simpledrawer;

import com.google.gson.*;
import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONShapeReader {

    // ListOfShapeEvents is an inner class used to wrap a list of 
    // ShapeEvent objects which hold shape details
    static class ListOfShapeEvents {

        List<ShapeEvent> listOfShapeEvents;
    }

    private ListOfShapeEvents los; // list of all the shapes
    private List<SimpleLine> slList; // list of lines
    private List<SimpleTriangle> triangleList; // list of lines
    private List<SimpleOval> olList; // list of ovals
    private List<SimpleRectangle> rectangleList;
    private List<Shape> shapeList;
    
    private Gson gson; // gson object used to "parse" the JSON

    public JSONShapeReader() {
        gson = new Gson();
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        triangleList = new ArrayList<>();
        shapeList = new ArrayList<>();
        rectangleList = new ArrayList<>();
        
    }

    /**
     * Read the shapes in JSON format from file. The shapes are initially read
     * into a single list (listOfShapeEvents) and then split into separate lists
     * according to type of shape.
     *
     * @param file the file from which to read the JSON
     * @throws FileNotFoundException
     */
    public void getShapesFromFile(String file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        los = gson.fromJson(br, ListOfShapeEvents.class); // load the shapes
        storeShapes(); // store in separate lists according to type
    }

    /**
     * Read through the list of shapes that have been loaded from file and
     * create an appropriate shape object according to type and store it in the
     * relevant list.
     */
    private void storeShapes() {

        for (ShapeEvent se : los.listOfShapeEvents) {
            switch (se.getShapeType()) {
                case LINE:  // store the line
                    SimpleLine sl = new SimpleLine(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.LINE);
                    slList.add(sl);
                    shapeList.add(sl);
                    break;
                case OVAL:  // store the oval
                    SimpleOval ol = new SimpleOval(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.OVAL);
                   olList.add(ol);
                   shapeList.add(ol);
                    break;
                case TRIANGLE:
                    SimpleTriangle st = new SimpleTriangle(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.TRIANGLE);
                    triangleList.add(st);
                    shapeList.add(st);
                    break;
                case RECTANGLE:
                    SimpleRectangle sr = new SimpleRectangle (se.getVertices(), se.getColour(), se.getThickness(), ShapeType.RECTANGLE);
                    rectangleList.add(sr);
                    shapeList.add(sr);
                    break;
            }
        }
    }

    // return the list of triangle shapes
    public List<SimpleTriangle> getSlList() {
        return triangleList;
    }

    public List<Shape> getShapes(){
        return shapeList;
    }
    
    // return the list of oval shapes
    public List<SimpleOval> getOlList() {
        return olList;
    }
    
    // return the list of rectangle shapes
    public List<SimpleRectangle> getSrList() {
        return rectangleList;
    }

    /**
     * This method is used to create some initial data in the JSON file which
     * can then be loaded later
     *
     * @param file the file into which to write the JSON
     */
    private static void generateTestJSON(String file) {
        List<ShapeEvent> list = new ArrayList<>();
        // load in some hard-coded shapes
        
        ArrayList<Point> triangle = new ArrayList<>();
        ArrayList<Point> line = new ArrayList<>();
        ArrayList<Point> oval = new ArrayList<>();
        ArrayList<Point> rectangle = new ArrayList<>();
        
        
        //add the points to draw a triangle
        triangle.add(new Point(440,80));
        triangle.add(new Point(570,160));
        triangle.add(new Point(570,60));
        
        //add the points to make line
        line.add(new Point(20,40));
        line.add(new Point(30,220));
        
        //add the points to make  
        oval.add(new Point(80, 95));
        oval.add(new Point(210, 555));
        
        //add the points to draw a rectangle
        rectangle.add(new Point(340,380));
        rectangle.add(new Point(340,560));
        rectangle.add(new Point(380,560));
        rectangle.add(new Point(380,380));        
        
        list.add(new ShapeEvent(line, Color.red, 25, ShapeType.LINE, "SHAPE"));
        list.add(new ShapeEvent(oval, Color.pink, 15, ShapeType.OVAL, "SHAPE"));
        list.add(new ShapeEvent(triangle, Color.CYAN, 25, ShapeType.TRIANGLE, "SHAPE"));
        list.add(new ShapeEvent(rectangle, Color.green, 10, ShapeType.RECTANGLE, "SHAPE"));

        ListOfShapeEvents los = new ListOfShapeEvents();
        los.listOfShapeEvents = list;
        Gson gson = new Gson();
        String json = gson.toJson(los); // convert the object to a JSON string

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(json); // write the JSON string to file
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method is just for testing in standalone mode
     *
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {

        generateTestJSON("stored_shapes.json"); // uncomment if you wish to 
        // create a file of JSON
        
        // Read the JSON from file and output number of lines and number
        // of ovals read.
        JSONShapeReader me = new JSONShapeReader();
        me.getShapesFromFile("stored_shapes.json");
        System.out.println("Lines loaded = " + me.slList.size());
        System.out.println("Ovals loaded = " + me.olList.size());
        System.out.println("Triangles loaded = " + me.triangleList.size());
        System.out.println("Rectangles loaded = " + me.rectangleList.size());

    }
}
