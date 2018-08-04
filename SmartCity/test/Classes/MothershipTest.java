/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Observable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SHEHA
 */
public class MothershipTest {
    
    public MothershipTest() {
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
     * Test of getID method, of class Mothership.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        ArrayList<SensorStation> sensorStation= new ArrayList<>();
        String ID = "Kaduwela";
        Mothership instance = new Mothership(ID, sensorStation);
        String expResult = "Kaduwela";
        String result = instance.getID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setID method, of class Mothership.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        ArrayList<SensorStation> sensorStation= new ArrayList<>();
        String ID = "Kaduwela";
        Mothership instance = new Mothership(null, sensorStation);
        instance.setID(ID);

    }

    /**
     * Test of getSensorStation method, of class Mothership.
     */
    @Test
    public void testGetSensorStation() {
        System.out.println("getSensorStation");
        ArrayList<SensorStation> sensorStation= new ArrayList<>();
        Mothership instance = new Mothership(null, sensorStation);
        
        ArrayList<SensorStation> expResult = sensorStation;
        ArrayList<SensorStation> result = instance.getSensorStation();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setSensorStation method, of class Mothership.
     */
    @Test
    public void testSetSensorStation() {
        System.out.println("setSensorStation");
         ArrayList<SensorStation> sensorStation= new ArrayList<>();
        Mothership instance = new Mothership(null, null);
        
        instance.setSensorStation(sensorStation);
        
    }

    /**
     * Test of addNewSensorStation method, of class Mothership.
     */
    @Test
    public void testAddNewSensorStation() {
        System.out.println("addNewSensorStation");
        ArrayList<SensorStation> sensorStation= new ArrayList<>();
        SensorStation station = new SensorStation("01245", null, null, null);
        Mothership instance = new Mothership(null, sensorStation);
        boolean expResult = true;
        boolean result = instance.addNewSensorStation(station);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of update method, of class Mothership.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable o = null;
        Object dat = new EmbllishedData(null, null, null, null);
        Mothership instance = new Mothership(null, null);
        instance.update(o, dat);
        
    }

    /**
     * Test of removeSensorStation method, of class Mothership.
     */
    @Test
    public void testRemoveSensorStation() {
        System.out.println("removeSensorStation");
        testAddNewSensorStation();
        String Id = "01245";
        Mothership instance = new Mothership(null, null);
        boolean expResult = true;
        boolean result = instance.removeSensorStation(Id);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of findSensorStation method, of class Mothership.
     */
    @Test
    public void testFindSensorStation() {
        System.out.println("findSensorStation");
        String sensorId = "";
        Mothership instance = null;
        SensorStation expResult = null;
        SensorStation result = instance.findSensorStation(sensorId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uploadData method, of class Mothership.
     */
    @Test
    public void testUploadData() {
        System.out.println("uploadData");
        EmbllishedData data = null;
        Mothership instance = null;
        instance.uploadData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
