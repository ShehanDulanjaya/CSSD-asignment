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
    private String name;

    /**
     *
     */
    public int readingsCount;

    /**
     *
     */
    public Data reading;

    /**
     *
     */
    public Location location;
    private boolean checkSensor;

    /**
     *
     * @param sensorMonitorID
     * @param coords
     * @param isActive
     * @param intereval
     * @param lastReadingTime
     * @param readingsCount
     * @param reading
     * @param sensor
     * @param observers
     * @param name
     */
    //Constructor
    public SensorMonitor(String sensorMonitorID, List<Double> coords, Boolean isActive, long intereval, long lastReadingTime, int readingsCount, Data reading,Sensor sensor,SensorStation observers,String name) {
        this.sensorMonitorID = sensorMonitorID;
        this.coords = coords;
        this.isActive = isActive;
        this.intereval = intereval;
        this.lastReadingTime = lastReadingTime;
        this.readingsCount = readingsCount;
        this.reading = reading;
        this.sensor=sensor;
        this.observers=observers;
        this.name = name;
        this.checkSensor=false;
    }

    /**
     *
     * @return
     */
    //Check if there is a sensor
    public boolean isCheckSensor() {
        return checkSensor;
    }

    /**
     *
     * @param checkSensor
     */
    public void setCheckSensor(boolean checkSensor) {
        this.checkSensor = checkSensor;
    }

    /**
     *
     * @return
     */
    //get sensor monitor name
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    //set sensor monitor name
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    //Extract Observers
    public SensorStation getObservers() {
        return observers;
    }

    /**
     *
     * @param observers
     */
    //set Observers
    public void setObservers(SensorStation observers) {
        this.observers = observers;
    }

    /**
     *
     * @return
     */
    //Get Sensor
    public Sensor getSensor() {
        return sensor;
    }

    /**
     *
     * @param sensor
     */
    //set Sensor
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
    /**
     *
     * @param sensorMonitorID
     */
    //set Sensor Monitor ID
    public void setSensorMonitorID(String sensorMonitorID) {
        this.sensorMonitorID = sensorMonitorID;
    }

    /**
     *
     * @param coords
     */
    //set Coordinates
    public void setCoords(List<Double> coords) {
        this.coords = coords;
    }

    /**
     *
     * @param isActive
     */
    //Set monitor state to active
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     *
     * @param intereval
     */
    //set Time Intereval
    public void setIntereval(long intereval) {
        this.intereval = intereval;
    }

    /**
     *
     * @param lastReadingTime
     */
    //set Last Reading Time
    public void setLastReadingTime(long lastReadingTime) {
        this.lastReadingTime = lastReadingTime;
    }

    /**
     *
     */
    public void setReadingsCount() {
        this.readingsCount = readingsCount+1;
    }

    /**
     *
     * @param reading
     */
    //Set Reading and notify the Observers
    public void setReading(Data reading) {
        this.reading = reading;
        notifyObservers(embellishData());
    }

    /**
     *
     * @return
     */
    //extract Sensor Monitor ID
    public String getSensorMonitorID() {
        return sensorMonitorID;
    }

    /**
     *
     * @return
     */
    //extract Coordinates
    public List<Double> getCoords() {
        return coords;
    }

    /**
     *
     * @return
     */
    //Check if is active
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     *
     * @return
     */
    //get Intereval
    public long getIntereval() {
        return intereval;
    }

    /**
     *
     * @return
     */
    //get Last Reading Time
    public long getLastReadingTime() {
        return lastReadingTime;
    }

    /**
     *
     * @return
     */
    //get Readings Count
    public int getReadingsCount() {
        return readingsCount;
    }

    /**
     *
     * @return
     */
    //get Reading
    public Data getReading() {
        return reading;
    }
    
    /**
     *
     */
    //Extract all details of the sensors and use accordingly 
    public void doTick(){
        setSensor(findSensor(sensor.getSensorID()));
         ArrayList<Data> dt=sensor.getStore();
         if(dt !=null){
            Data data = new Data();
            System.out.println("Sensor Monitor Do tick");
            removeSensor(sensor.getSensorID());
            sensor.setStore(dt);
            sensor.setData(data);
            sensor.store(data);

            addNewSensor(sensor);

            setReading(data);
    //        setLocation(location);
         }
    }
    
    /**
     *
     * @param location
     */
    public void setLocation(Location location){
        this.location=location;
        new Location(location.getLatitude(),location.getLongitude());
        
    }
    
    /**
     *
     * @return
     */
    public String getLocation(){
      
        return this.location.toAdress();
    }
   
    /**
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        this.observers=(SensorStation) o;
        //can add only one sensor station to sensor monitor
    }

    /**
     *
     * @param o
     */
    public void unregisterObserver(Observer o) {
        this.observers=null;
    }
    
    private void shouldNotifySensorStation(){
        
    }

    /**
     *
     * @return
     */
    //Object used to store data
    public EmbllishedData embellishData(){
      EmbllishedData emb = new EmbllishedData(reading, lastReadingTime, coords, sensorMonitorID);
      return emb;
      
    }

    /**
     *
     * @param sensor
     * @return
     */
    //Save the new sensor with serialization
    public  boolean addNewSensor(Sensor sensor){
 
        ArrayList<Sensor> allSensors = serialize.getAllSensors();
        allSensors.add(sensor);
        boolean result=serialize.write("sensor.txt", allSensors);
        return result;
    }
    
    /**
     *
     * @param sensorId
     * @return
     */
    //remove Sensor
    public  boolean removeSensor(String sensorId){
 
        ArrayList<Sensor> allSensors = serialize.getAllSensors();
        for(Sensor sensor:allSensors){
                if(sensorId.equals(sensor.getSensorID())){
                   
                    allSensors.remove(sensor);
                    boolean result=serialize.write("sensor.txt", allSensors);
                    return result;
                }
            }
        return false;
        
    }
    
    @Override
    public void update(Observable o, Object ob) {
         if(ob instanceof SensorMonitor){
                if(((SensorMonitor) ob).getIsActive()){
                    ((SensorMonitor) ob).doTick();
                    ((SensorMonitor) ob).setLastReadingTime(((Clock)o).getwaitTime());
                }
            }
        
        
    }

    /**
     *
     * @param sensorId
     * @return
     */
    //get sensor by ID
    public Sensor findSensor(String sensorId){
          ArrayList<Sensor> allSensors = serialize.getAllSensors();
        for(Sensor sensor:allSensors){
                if(sensorId.equals(sensor.getSensorID())){
                   
                    return sensor;
                }
            }
                        return null;
    }
    
    /**
     *
     * @param emb
     */
    public void notifyObservers(EmbllishedData emb) {
        System.out.println("Notify Sensor Staion");
        observers.update(null,emb);
        
    }
    
      
    
}
