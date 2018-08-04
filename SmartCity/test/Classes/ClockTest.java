/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
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
public class ClockTest {
    
    public ClockTest() {
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
     * Test of getInstance method, of class Clock.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Clock expResult = null;
        Clock result = Clock.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservers method, of class Clock.
     */
    @Test
    public void testGetObservers() {
        System.out.println("getObservers");
        Clock instance = new Clock();
        List<SensorMonitor> expResult = null;
        List<SensorMonitor> result = instance.getObservers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservers method, of class Clock.
     */
    @Test
    public void testSetObservers() {
        System.out.println("setObservers");
        ArrayList<SensorMonitor> observers = null;
        Clock instance = new Clock();
        instance.setObservers(observers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotifyFrequncy method, of class Clock.
     */
    @Test
    public void testGetNotifyFrequncy() {
        System.out.println("getNotifyFrequncy");
        Clock instance = new Clock();
        double expResult = 0.0;
        double result = instance.getNotifyFrequncy();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotifyFrequncy method, of class Clock.
     */
    @Test
    public void testSetNotifyFrequncy() {
        System.out.println("setNotifyFrequncy");
        double notifyFrequncy = 0.0;
        Clock instance = new Clock();
        instance.setNotifyFrequncy(notifyFrequncy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClock method, of class Clock.
     */
    @Test
    public void testGetClock() {
        System.out.println("getClock");
        Clock instance = new Clock();
        Clock expResult = null;
        Clock result = instance.getClock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClock method, of class Clock.
     */
    @Test
    public void testSetClock() {
        System.out.println("setClock");
        Clock clock = null;
        Clock instance = new Clock();
        instance.setClock(clock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerObserver method, of class Clock.
     */
    @Test
    public void testRegisterObserver() {
        System.out.println("registerObserver");
        Observer o = null;
        Clock instance = new Clock();
        instance.registerObserver(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unregisterObserver method, of class Clock.
     */
    @Test
    public void testUnregisterObserver() {
        System.out.println("unregisterObserver");
        Observer o = null;
        Clock instance = new Clock();
        instance.unregisterObserver(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObservers method, of class Clock.
     */
    @Test
    public void testNotifyObservers() {
        System.out.println("notifyObservers");
        Clock instance = new Clock();
        instance.notifyObservers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitForTime method, of class Clock.
     */
    @Test
    public void testWaitForTime() {
        System.out.println("waitForTime");
        long wait = 0L;
        Clock instance = new Clock();
        instance.waitForTime(wait);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getwaitTime method, of class Clock.
     */
    @Test
    public void testGetwaitTime() {
        System.out.println("getwaitTime");
        Clock instance = new Clock();
        long expResult = 0L;
        long result = instance.getwaitTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
