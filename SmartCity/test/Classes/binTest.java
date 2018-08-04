/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akila Jayasinghe
 */
public class binTest {
    
    public binTest() {
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
     * Test of getinstance method, of class bin.
     */
    @Test
    public void testGetinstance() {
        System.out.println("getinstance");
        bin expResult = null;
        bin result = bin.getinstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBins method, of class bin.
     */
    @Test
    public void testGetBins() {
        System.out.println("getBins");
        bin instance = new bin();
        ArrayList<Sensor> expResult = null;
        ArrayList<Sensor> result = instance.getBins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlocation method, of class bin.
     */
    @Test
    public void testGetlocation() {
        System.out.println("getlocation");
        bin instance = new bin();
        String expResult = "";
        String result = instance.getlocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeBin method, of class bin.
     */
    @Test
    public void testWriteBin() {
        System.out.println("writeBin");
        String location = "";
        bin instance = new bin();
        instance.writeBin(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
