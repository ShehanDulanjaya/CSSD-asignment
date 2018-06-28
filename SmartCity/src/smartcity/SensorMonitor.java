/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author SHEHA
 */
public class SensorMonitor implements Serializable{
    
    private String sensorMonitorID;
    private List<Double> coords;
    private Boolean isActive;
    private Double intereval;
    //private SensorStation observers;
    private Long lastReadingTime;
   // private Sensor sensor;
    public int readingsCount;
    public Data reading;

    public SensorMonitor(String sensorMonitorID, List<Double> coords, Boolean isActive, Double intereval, Long lastReadingTime, int readingsCount, Data reading) {
        this.sensorMonitorID = sensorMonitorID;
        this.coords = coords;
        this.isActive = isActive;
        this.intereval = intereval;
        this.lastReadingTime = lastReadingTime;
        this.readingsCount = readingsCount;
        this.reading = reading;
    }
    

    public void setSensorMonitorID(String sensorMonitorID) {
        this.sensorMonitorID = sensorMonitorID;
    }

    public void setCoords(List<Double> coords) {
        this.coords = coords;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public void setIntereval(Double intereval) {
        this.intereval = intereval;
    }

    public void setLastReadingTime(Long lastReadingTime) {
        this.lastReadingTime = lastReadingTime;
    }

    public void setReadingsCount(int readingsCount) {
        this.readingsCount = readingsCount;
    }

    public void setReading(Data reading) {
        this.reading = reading;
    }

    public String getSensorMonitorID() {
        return sensorMonitorID;
    }

    public List<Double> getCoords() {
        return coords;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Double getIntereval() {
        return intereval;
    }

    public Long getLastReadingTime() {
        return lastReadingTime;
    }

    public int getReadingsCount() {
        return readingsCount;
    }

    public Data getReading() {
        return reading;
    }
    
            
    
}
