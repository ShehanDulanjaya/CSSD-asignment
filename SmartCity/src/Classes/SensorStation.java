/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.SensorMonitor;
import java.io.Serializable;
import java.util.List;
import java.util.Observer;
import java.util.Observable;



/**
 *
 * @author Akila Jayasinghe
 */
public class SensorStation implements Observer,Serializable{
   private String stationID;
   private List<SensorMonitor> sensorMonitors;
   private Mothership observer;
   public SensorMonitor sensrmoni;
   private EmbllishedData embllishedData;

    public SensorStation(String stationID) {
        this.stationID = stationID;
    }
   
    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public List<SensorMonitor> getSensorMonitors() {
        return sensorMonitors;
    }

    public void setSensorMonitors(List<SensorMonitor> sensorMonitors) {
        this.sensorMonitors = sensorMonitors;
    }

    public Mothership getOberver() {
        return observer;
    }

    public void setOberver(Mothership observer) {
        this.observer = observer;
    }
    
    public void receiveSensorData(EmbllishedData embllishedData){
        this.embllishedData=embllishedData;
    }
    @Override
    public void update(Observable o, Object ob) {
         if(ob instanceof SensorMonitor){
             receiveSensorData((EmbllishedData) ob);
         }
        
    }

    
    

    

   
}
