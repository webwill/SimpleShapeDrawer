/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

import java.awt.Color;
import java.awt.Graphics2D;
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
public class DrawerTest {
    
    public DrawerTest() {
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
     * Test of drawShape method, of class Drawer.
     */
    @Test
    public void testDrawShape() {
        System.out.println("drawShape");
        Graphics2D g2d = null;
        float currentBrightness = 0.0F;
        Drawer instance = new DrawerImpl();
        instance.drawShape(g2d, currentBrightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scaleColour method, of class Drawer.
     */
    @Test
    public void testScaleColour() {
        System.out.println("scaleColour");
        Color c = null;
        float currentBrightness = 0.0F;
        Drawer instance = new DrawerImpl();
        Color expResult = null;
        Color result = instance.scaleColour(c, currentBrightness);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DrawerImpl implements Drawer {

        public void drawShape(Graphics2D g2d, float currentBrightness) {
        }

        public Color scaleColour(Color c, float currentBrightness) {
            return null;
        }
    }
    
}
