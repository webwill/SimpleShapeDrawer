/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author te4695k
 */
public class ShapeEventTest {
    
    public ShapeEventTest() {
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
     * Test of getXStart method, of class ShapeEvent.
     */
    @Test
    public void testGetXStart() {
        System.out.println("getXStart");
        ShapeEvent instance = new ShapeEvent();
        int expResult = 0;
        int result = instance.getXStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXStart method, of class ShapeEvent.
     */
    @Test
    public void testSetXStart() {
        System.out.println("setXStart");
        int xStart = 0;
        ShapeEvent instance = new ShapeEvent();
        instance.setXStart(xStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYStart method, of class ShapeEvent.
     */
    @Test
    public void testGetYStart() {
        System.out.println("getYStart");
        ShapeEvent instance = new ShapeEvent();
        int expResult = 0;
        int result = instance.getYStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYStart method, of class ShapeEvent.
     */
    @Test
    public void testSetYStart() {
        System.out.println("setYStart");
        int yStart = 0;
        ShapeEvent instance = new ShapeEvent();
        instance.setYStart(yStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXEnd method, of class ShapeEvent.
     */
    @Test
    public void testGetXEnd() {
        System.out.println("getXEnd");
        ShapeEvent instance = new ShapeEvent();
        int expResult = 0;
        int result = instance.getXEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXEnd method, of class ShapeEvent.
     */
    @Test
    public void testSetXEnd() {
        System.out.println("setXEnd");
        int xEnd = 0;
        ShapeEvent instance = new ShapeEvent();
        instance.setXEnd(xEnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYEnd method, of class ShapeEvent.
     */
    @Test
    public void testGetYEnd() {
        System.out.println("getYEnd");
        ShapeEvent instance = new ShapeEvent();
        int expResult = 0;
        int result = instance.getYEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYEnd method, of class ShapeEvent.
     */
    @Test
    public void testSetYEnd() {
        System.out.println("setYEnd");
        int yEnd = 0;
        ShapeEvent instance = new ShapeEvent();
        instance.setYEnd(yEnd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class ShapeEvent.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        ShapeEvent instance = new ShapeEvent();
        Color expResult = null;
        Color result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class ShapeEvent.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        Color colour = null;
        ShapeEvent instance = new ShapeEvent();
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColourByString method, of class ShapeEvent.
     */
    @Test
    public void testSetColourByString() {
        System.out.println("setColourByString");
        String colour = "";
        ShapeEvent instance = new ShapeEvent();
        instance.setColourByString(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThickness method, of class ShapeEvent.
     */
    @Test
    public void testGetThickness() {
        System.out.println("getThickness");
        ShapeEvent instance = new ShapeEvent();
        int expResult = 0;
        int result = instance.getThickness();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThickness method, of class ShapeEvent.
     */
    @Test
    public void testSetThickness() {
        System.out.println("setThickness");
        int thickness = 0;
        ShapeEvent instance = new ShapeEvent();
        instance.setThickness(thickness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShapeType method, of class ShapeEvent.
     */
    @Test
    public void testGetShapeType() {
        System.out.println("getShapeType");
        ShapeEvent instance = new ShapeEvent();
        ShapeType expResult = null;
        ShapeType result = instance.getShapeType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShapeType method, of class ShapeEvent.
     */
    @Test
    public void testSetShapeType() {
        System.out.println("setShapeType");
        ShapeType shapeType = null;
        ShapeEvent instance = new ShapeEvent();
        instance.setShapeType(shapeType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventType method, of class ShapeEvent.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        ShapeEvent instance = new ShapeEvent();
        String expResult = "";
        String result = instance.getEventType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventType method, of class ShapeEvent.
     */
    @Test
    public void testSetEventType() {
        System.out.println("setEventType");
        String eventType = "";
        ShapeEvent instance = new ShapeEvent();
        instance.setEventType(eventType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ShapeEvent.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ShapeEvent instance = new ShapeEvent();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
