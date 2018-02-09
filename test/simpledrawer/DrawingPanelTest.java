/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
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
public class DrawingPanelTest {
    
    public DrawingPanelTest() {
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
     * Test of getCanvasWidth method, of class DrawingPanel.
     */
    @Test
    public void testGetCanvasWidth() {
        System.out.println("getCanvasWidth");
        DrawingPanel instance = new DrawingPanel();
        int expResult = 0;
        int result = instance.getCanvasWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class DrawingPanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        DrawingPanel instance = new DrawingPanel();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentShapeType method, of class DrawingPanel.
     */
    @Test
    public void testGetCurrentShapeType() {
        System.out.println("getCurrentShapeType");
        DrawingPanel instance = new DrawingPanel();
        ShapeType expResult = null;
        ShapeType result = instance.getCurrentShapeType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentShapeType method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentShapeType() {
        System.out.println("setCurrentShapeType");
        ShapeType currentShapeType = null;
        DrawingPanel instance = new DrawingPanel();
        instance.setCurrentShapeType(currentShapeType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentBrightness method, of class DrawingPanel.
     */
    @Test
    public void testGetCurrentBrightness() {
        System.out.println("getCurrentBrightness");
        DrawingPanel instance = new DrawingPanel();
        float expResult = 0.0F;
        float result = instance.getCurrentBrightness();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentBrightness method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentBrightness() {
        System.out.println("setCurrentBrightness");
        float currentBrightness = 0.0F;
        DrawingPanel instance = new DrawingPanel();
        instance.setCurrentBrightness(currentBrightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentThickness method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentThickness() {
        System.out.println("setCurrentThickness");
        int currentThickness = 0;
        DrawingPanel instance = new DrawingPanel();
        instance.setCurrentThickness(currentThickness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentColor method, of class DrawingPanel.
     */
    @Test
    public void testSetCurrentColor() {
        System.out.println("setCurrentColor");
        Color currentColor = null;
        DrawingPanel instance = new DrawingPanel();
        instance.setCurrentColor(currentColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearDisplay method, of class DrawingPanel.
     */
    @Test
    public void testClearDisplay() {
        System.out.println("clearDisplay");
        DrawingPanel instance = new DrawingPanel();
        instance.clearDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rotate method, of class DrawingPanel.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        int amount = 0;
        DrawingPanel instance = new DrawingPanel();
        instance.rotate(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShapes method, of class DrawingPanel.
     */
    @Test
    public void testSetShapes() {
        System.out.println("setShapes");
        List shapes = null;
        DrawingPanel instance = new DrawingPanel();
        instance.setShapes(shapes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
