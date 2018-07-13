package Classes;

import File.serialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SHEHA
 */
public class Mothership implements Observer{
 
    private String ID;
    private String name;
    private ArrayList<SensorStation> sensorStation;

    public Mothership(String ID, ArrayList<SensorStation> sensorStation) {
        this.ID = ID;
        this.sensorStation = sensorStation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<SensorStation> getSensorStation() {
        return sensorStation;
    }

    public void setSensorStation(ArrayList<SensorStation> sensorStation) {
        this.sensorStation = sensorStation;
    }
    
    public boolean addNewSensorStation(SensorStation station){
        this.sensorStation.add(station);
        return serialize.write("sensorstation.txt", sensorStation);
        
    }

    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    public boolean removeSensorStation(String Id){
        SensorStation s= findSensorStation(Id, this.sensorStation);
        this.sensorStation.remove(s);
        return serialize.write("sensorstation.txt", sensorStation);
        
    }
    
    public boolean updateSensorStation(String Id, SensorStation station){
        SensorStation s= findSensorStation(Id, this.sensorStation);
        if(s!=null){
               this.sensorStation.remove(s);
               this.sensorStation.add(station);
               return serialize.write("sensorstation.txt", sensorStation);
        }
        else{
            return false;
        }
    }    
    
    public SensorStation findSensorStation(String sensorId, ArrayList<SensorStation> allSensorStations){
        for(SensorStation station:allSensorStations){
                if(sensorId.equals(station.getStationID())){
                   
                    return station;
                }
            }
                        return null;
    }
    
    
}
