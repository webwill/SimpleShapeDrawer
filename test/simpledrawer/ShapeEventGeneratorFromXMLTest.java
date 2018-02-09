/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;

/**
 *
 * @author te4695k
 */
public class ShapeEventGeneratorFromXMLTest {
    
    public ShapeEventGeneratorFromXMLTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of processScriptFile method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testProcessScriptFile() throws Exception {
        System.out.println("processScriptFile");
        String filename = "";
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.processScriptFile(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startElement method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testStartElement() throws Exception {
        System.out.println("startElement");
        String namespaceURI = "";
        String localName = "";
        String qName = "";
        Attributes atts = null;
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.startElement(namespaceURI, localName, qName, atts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of characters method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testCharacters() throws Exception {
        System.out.println("characters");
        char[] ch = null;
        int start = 0;
        int length = 0;
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.characters(ch, start, length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endElement method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testEndElement() throws Exception {
        System.out.println("endElement");
        String uri = "";
        String localName = "";
        String qName = "";
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.endElement(uri, localName, qName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerShapeEventListener method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testRegisterShapeEventListener() {
        System.out.println("registerShapeEventListener");
        String type = "";
        ShapeEventListener dbel = null;
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.registerShapeEventListener(type, dbel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeShapeEventListener method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testRemoveShapeEventListener() {
        System.out.println("removeShapeEventListener");
        String type = "";
        ShapeEventListener dbel = null;
        ShapeEventGeneratorFromXML instance = new ShapeEventGeneratorFromXML();
        instance.removeShapeEventListener(type, dbel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ShapeEventGeneratorFromXML.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ShapeEventGeneratorFromXML.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
