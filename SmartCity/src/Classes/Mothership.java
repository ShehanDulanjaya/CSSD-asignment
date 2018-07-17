package Classes;

import File.serialize;
import java.io.Serializable;
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
public class Mothership implements Observer,Serializable{
 
    private String ID;
    
    private ArrayList<SensorStation> sensorStation;

    /**
     *
     * @param ID
     * @param sensorStation
     */
    //Constructor
    public Mothership(String ID, ArrayList<SensorStation> sensorStation) {
        this.ID = ID;
        this.sensorStation = sensorStation;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     *
     * @return
     */
    //Fetch sensor stations
    public ArrayList<SensorStation> getSensorStation() {
        return sensorStation;
    }

    /**
     *
     * @param sensorStation
     */
    //Set sensor station
    public void setSensorStation(ArrayList<SensorStation> sensorStation) {
        this.sensorStation = sensorStation;
    }
    
    /**
     *
     * @param station
     * @return
     */
    //Add new sensor station and store using serialization
    public boolean addNewSensorStation(SensorStation station){
        this.sensorStation.add(station);
        return serialize.write("sensorstation.txt", sensorStation);
        
    }

    @Override
    public void update(Observable o, Object dat) {
        uploadData((EmbllishedData)dat);
    }
    
    /**
     *
     * @param Id
     * @return
     */
    //Delate sensor station
    public boolean removeSensorStation(String Id){
        SensorStation s= findSensorStation(Id);
        this.sensorStation.remove(s);
        return serialize.write("sensorstation.txt", sensorStation);
        
    } 
    
    /**
     *
     * @param sensorId
     * @return
     */
    //Search sensor station by ID
    public SensorStation findSensorStation(String sensorId){
        for(SensorStation station:sensorStation){
                if(sensorId.equals(station.getStationID())){
                   
                    return station;
                }
            }
                        return null;
    }
    
    
    
}
