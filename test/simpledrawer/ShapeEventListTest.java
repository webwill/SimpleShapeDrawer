/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledrawer;

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
public class ShapeEventListTest {
    
    public ShapeEventListTest() {
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
     * Test of addListener method, of class ShapeEventList.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        String type = "";
        ShapeEventListener listener = null;
        ShapeEventList instance = new ShapeEventList();
        instance.addListener(type, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeListener method, of class ShapeEventList.
     */
    @Test
    public void testRemoveListener() {
        System.out.println("removeListener");
        String type = "";
        ShapeEventListener listener = null;
        ShapeEventList instance = new ShapeEventList();
        instance.removeListener(type, listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeners method, of class ShapeEventList.
     */
    @Test
    public void testGetListeners() {
        System.out.println("getListeners");
        String type = "";
        ShapeEventList instance = new ShapeEventList();
        List<ShapeEventListener> expResult = null;
        List<ShapeEventListener> result = instance.getListeners(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
