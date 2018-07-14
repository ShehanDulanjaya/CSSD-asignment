/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import File.serialize;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author SHEHA
 */
public class SensorMonitor implements Observer,Serializable{
    
    private String sensorMonitorID;
    private List<Double> coords;
    private Boolean isActive;
    private long intereval;
    private SensorStation observers;
    private long lastReadingTime;
   private Sensor sensor;
    public int readingsCount;
    public Data reading;
    public Location location;

    public SensorMonitor(String sensorMonitorID, List<Double> coords, Boolean isActive, long intereval, long lastReadingTime, int readingsCount, Data reading,Sensor sensor,SensorStation observers) {
        this.sensorMonitorID = sensorMonitorID;
        this.coords = coords;
        this.isActive = isActive;
        this.intereval = intereval;
        this.lastReadingTime = lastReadingTime;
        this.readingsCount = readingsCount;
        this.reading = reading;
        this.sensor=sensor;
        this.observers=observers;
    }

    public SensorStation getObservers() {
        return observers;
    }

    public void setObservers(SensorStation observers) {
        this.observers = observers;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
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

    public void setIntereval(long intereval) {
        this.intereval = intereval;
    }

    public void setLastReadingTime(long lastReadingTime) {
        this.lastReadingTime = lastReadingTime;
    }

    public void setReadingsCount() {
        this.readingsCount = readingsCount+1;
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

    public long getIntereval() {
        return intereval;
    }

    public long getLastReadingTime() {
        return lastReadingTime;
    }

    public int getReadingsCount() {
        return readingsCount;
    }

    public Data getReading() {
        return reading;
    }
    
    public void doTick(){
        
    }
    
    public void setLocation(Location location){
        this.location=location;
        new Location(location.getLatitude(),location.getLongitude());
        
    }
    
    public String getLocation(){
      
        return this.location.toAdress();
    }
   
    public void registerObserver(Observer o) {
        this.observers=(SensorStation) o;
        //can add only one sensor station to sensor monitor
    }

    public void unregisterObserver(Observer o) {
        this.observers=null;
    }
    
    private void shouldNotifySensorStation(){
        
    }

    public EmbllishedData embellishData(){
      EmbllishedData emb = new EmbllishedData(reading, lastReadingTime, coords, sensorMonitorID);
      return emb;
      
    }
    public  boolean addNewSensor(String sensorID, String sensorType, String description, Boolean status, String frequency,Data data){

        this.sensor = new Sensor(sensorID,sensorType,description,status,frequency,data);
        boolean result=serialize.write("sensor.txt", this.sensor);
        return result;
    }
    @Override
    public void update(Observable o, Object ob) {
         if(ob instanceof SensorMonitor){
                if(((SensorMonitor) ob).getIsActive()){
                    ((SensorMonitor) ob).doTick();
                }
            }
        
        
    }
    
    
    public void notifyObservers() {
        observers.update(null,embellishData());
        
    }
    
      
    
}
