/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Dos
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CJ
 */
public class EmbllishedData implements Serializable{

    /**
     *
     */
    public Data data;

    /**
     *
     */
    public Long timeInMills;

    /**
     *
     */
    public List<Double> location;

    /**
     *
     */
    public String sensorID;
    
    /**
     *
     */
    public EmbllishedData() {
    System.out.println("Constructor method called.");
    }
    
    /**
     *
     * @param data
     * @param timeInMills
     * @param location
     * @param sensorID
     */
    //constructor
    public EmbllishedData(Data data, Long timeInMills,List<Double> location, String sensorID) {
        this.data = data;
        this.timeInMills = timeInMills;
        this.location = location;
        this.sensorID = sensorID;
    }

    /**
     *
     * @return
     */
    //get data
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    //set data
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    //get time
    public Long getTimeInMills() {
        return timeInMills;
    }

    /**
     *
     * @param timeInMills
     */
    //set the time
    public void setTimeInMills(Long timeInMills) {
        this.timeInMills = timeInMills;
    }

    /**
     *
     * @return
     */
    //get location coordinates
    public List<Double> getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    //set loaction
    public void setLocation(List<Double> location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    //get sensor ID
    public String getSensorID() {
        return sensorID;
    }

    /**
     *
     * @param sensorID
     */
    //set sensor ID
    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }
    
}
