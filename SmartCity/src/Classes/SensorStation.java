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
public class SensorStation implements Observer{
   private String stationID;
   private List<SensorMonitor> sensorMonitors;
   private Mothership observer;

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
    
    
    @Override
    public void update(Observable o, Object ob) {
         if(ob instanceof SensorMonitor){
             sensorMonitors.add((SensorMonitor) ob);
         }
        
    }

    
    

    

   
}
