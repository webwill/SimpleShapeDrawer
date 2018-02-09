/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

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
public class RectangleDrawerTest {
    
    public RectangleDrawerTest() {
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
     * Test of drawShape method, of class RectangleDrawer.
     */
    @Test
    public void testDrawShape() {
        System.out.println("drawShape");
        Graphics2D g2d = null;
        float currentBrightness = 0.0F;
        RectangleDrawer instance = null;
        instance.drawShape(g2d, currentBrightness);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
