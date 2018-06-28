/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

import smartcity.SensorMonitor;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Akila Jayasinghe
 */
public class SensorStation implements Serializable{
   private String stationID;
   private List<SensorMonitor> sensorMonitors;
   private Mothership oberver;

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
        return oberver;
    }

    public void setOberver(Mothership oberver) {
        this.oberver = oberver;
    }
    
}
