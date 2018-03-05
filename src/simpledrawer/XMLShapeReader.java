/*
 * XMLShapeREader.java
 *
 * @author Gill Windall
 *
 * Used to read shapes from a file stored in XML format using 
 * the class ShapeEventGeneratorFromXML
 *
 */
package simpledrawer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class XMLShapeReader {

    private ShapeEventGeneratorFromXML segfx; // used to read the data

    private List<SimpleLine> slList; // list of lines
    private List<SimpleOval> olList; // list of ovals
    private List<SimpleTriangle> stList; // list of triangles
    private List<SimpleRectangle> srList; // list of rectangles

    public XMLShapeReader() throws ParserConfigurationException, SAXException {

        try {
            segfx = new ShapeEventGeneratorFromXML();
        } catch (ParserConfigurationException | SAXException ex) {
            Logger.getLogger(XMLShapeReader.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }

        // Create a listerner to receive callbacks from the
        // ShapeEventGeneratorFromXML object each time a Shape has
        // been read from file.
        ShapeEventListener sel = new ShapeEventListener() {
            /**
             *
             * @param originator unused
             * @param se the shape event object containing details of the shape
             * that has just been read from file.
             */
           
            public void processShapeEvent(Object originator, ShapeEvent se) {
                storeShape(se);
            }
        };
        segfx.registerShapeEventListener("SHAPE", sel);
        slList = new ArrayList<>();
        olList = new ArrayList<>();
        stList = new ArrayList();
        srList = new ArrayList();
    }

    /**
     * Called to initiate the processing of the XML file containing shapes.
     *
     * @param file the name of the XML file to process
     * @throws IOException
     * @throws SAXException
     */
    public void getShapesFromFile(String file) throws IOException, SAXException {
        segfx.processScriptFile(file);
    }

    /**
     * Called each time a shape has been read. The shape is stored in the
     * appropriate list according to type.
     *
     * @param se the ShapeEvent object containing details of the shape to be
     * stored.
     */
    private void storeShape(ShapeEvent se) {
        switch (se.getShapeType()) {
            case LINE: // store the line
               SimpleLine sl = new SimpleLine(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.LINE);
                slList.add(sl);
                break;
            case OVAL: // store the oval
                SimpleOval ol = new SimpleOval(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.OVAL);
                olList.add(ol);
                break;
            case TRIANGLE: // store the triangle
                SimpleTriangle st = new SimpleTriangle(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.TRIANGLE);
                stList.add(st);
                break;
            case RECTANGLE: // store the rectangle
                SimpleRectangle sr = new SimpleRectangle(se.getVertices(), se.getColour(), se.getThickness(), ShapeType.RECTANGLE);
                srList.add(sr);
                break;
        }
    }

    /**
     *
     * @return the list of line shapes
     */
    public List<SimpleLine> getSlList() {
        return slList;
    }

    /**
     *
     * @return the list of oval shapes
     */
    public List<SimpleOval> getOlList() {
        return olList;
    }

    /**
     * Main method is just for testing in standalone mode
     *
     * @param args unused
     */
    public static void main(String[] args) {
        try {
            XMLShapeReader me = new XMLShapeReader();

            me.getShapesFromFile("stored_shapes.xml");
            System.out.println("number of lines: " + me.slList.size());
            System.out.println("number of ovals: " + me.olList.size());
            System.out.println("number of triangles: " + me.stList.size());
            System.out.println("number of rectangles: " + me.srList.size());

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(XMLShapeReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
