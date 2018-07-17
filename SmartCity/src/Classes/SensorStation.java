/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.SensorMonitor;
import File.serialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Observable;



/**
 *
 * @author Akila Jayasinghe
 */
public class SensorStation implements Observer,Serializable{
   private String stationID;
   private String name;
   private ArrayList<SensorMonitor> sensorMonitors;
   private Mothership observer;
   private EmbllishedData embllishedData;

    /**
     *
     * @param stationID
     * @param name
     * @param sensorMonitors
     * @param observer
     */
   //Constructor
    public SensorStation(String stationID, String name, ArrayList<SensorMonitor> sensorMonitors, Mothership observer) {
        this.stationID = stationID;
        this.name = name;
        this.sensorMonitors = sensorMonitors;
        this.observer = observer;
    }

    /**
     *
     * @return
     */
    //get sensor station name
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    //set sensor station name
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Mothership getObserver() {
        return observer;
    }

    /**
     *
     * @param observer
     */
    public void setObserver(Mothership observer) {
        this.observer = observer;
    }

    /**
     *
     * @return
     */
    public String getStationID() {
        return stationID;
    }

    /**
     *
     * @param stationID
     */
    //set Station ID
    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    /**
     *
     * @return
     */
    //get sensor monitors of the station
    public List<SensorMonitor> getSensorMonitors() {
        return sensorMonitors;
    }

    /**
     *
     * @param sensorMonitors
     */
    //set Sensor Monitors
    public void setSensorMonitors(ArrayList<SensorMonitor> sensorMonitors) {
        this.sensorMonitors = sensorMonitors;
    }

    /**
     *
     * @return
     */
    public Mothership getOberver() {
        return observer;
    }

    /**
     *
     * @param observer
     */
    public void setOberver(Mothership observer) {
        this.observer = observer;
    }
    
    /**
     *
     * @param embllishedData
     */
    //receive data of the sensor
    public void receiveSensorData(EmbllishedData embllishedData){
        this.embllishedData=embllishedData;
        notifyObservers(embllishedData);
    }
    
    /**
     *
     * @param monitor
     */
    //add New Sensor Monitor
    public void addNewSensorMonitor(SensorMonitor monitor){
       
        this.sensorMonitors.add((SensorMonitor)monitor);
        
       
    }
    
    /**
     *
     * @param monitor
     */
    //remove Sensor Monitor
    public void removeSensorMonitor(SensorMonitor monitor){
       
        sensorMonitors.remove(monitor);
        
    }
    
    /**
     *
     * @return
     */
    //Get all Sensor monitors
    public ArrayList<SensorMonitor> getAllSensorMonitors(){
        if(this.sensorMonitors!=null){
        return this.sensorMonitors;
        }
        else{
            return null;
        }
    }
    
    /**
     *
     * @param id
     * @return
     */
    //Get sensor monitor from ID
    public SensorMonitor getASensorMonitor(String id){
        for(SensorMonitor monitor:this.sensorMonitors){
                if(id.equals(monitor.getSensorMonitorID())){
                   
                    return monitor;
                }
            }
                        return null;
    }
    
    @Override
    public void update(Observable o, Object ob) {
         if(ob instanceof EmbllishedData){
             receiveSensorData((EmbllishedData) ob);
             System.out.println("Sensor Station Data Recieved: " + ((EmbllishedData) ob).getData().getReadings()+" "+
                     ((EmbllishedData) ob).getData().getDateTime());
         }
        
    }

    
     public void notifyObservers(EmbllishedData emb) {
        System.out.println("Notify Mothership");
        observer.update(null,emb);
        
    }

    

   
}
