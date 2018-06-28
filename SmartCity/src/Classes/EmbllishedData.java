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
import java.util.ArrayList;

public class EmbllishedData {

    public Data data;
    public Long timeInMills;
    public ArrayList<Double> location;
    public String sensorID;

    public EmbllishedData(Data data, Long timeInMills, ArrayList<Double> location, String sensorID) {
        this.data = data;
        this.timeInMills = timeInMills;
        this.location = location;
        this.sensorID = sensorID;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Long getTimeInMills() {
        return timeInMills;
    }

    public void setTimeInMills(Long timeInMills) {
        this.timeInMills = timeInMills;
    }

    public ArrayList<Double> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Double> location) {
        this.location = location;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }
}
