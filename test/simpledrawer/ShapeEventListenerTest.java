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

/**
 *
 * @author te4695k
 */
public class ShapeEventListenerTest {
    
    public ShapeEventListenerTest() {
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
     * Test of processShapeEvent method, of class ShapeEventListener.
     */
    @Test
    public void testProcessShapeEvent() {
        System.out.println("processShapeEvent");
        Object originator = null;
        ShapeEvent se = null;
        ShapeEventListener instance = new ShapeEventListenerImpl();
        instance.processShapeEvent(originator, se);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ShapeEventListenerImpl implements ShapeEventListener {

        public void processShapeEvent(Object originator, ShapeEvent se) {
        }
    }
    
}
