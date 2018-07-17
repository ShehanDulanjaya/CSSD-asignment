package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Sensor implements Serializable{

    private String sensorID;
    private String sensorType;
    private String description;
    private Boolean status;
    private String frequency;
    private Data data;
    private ArrayList<Data> store;
    private String monitorName;
    private String station;

    public Sensor(String sensorID, String sensorType, String description, Boolean status, String frequency,Data data,String monitorName,String station) {
        this.sensorID = sensorID;
        this.sensorType = sensorType;
        this.description = description;
        this.status = status;
        this.frequency = frequency;
        this.data=data;
        this.monitorName=monitorName;
        this.store=new ArrayList<>();
        this.station=station;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    public Data getData() {
        return data;
    }

    public void setStore(ArrayList<Data> store) {
        this.store = store;
    }
//com
    public void setData(Data data) {
        this.data = data;
    }

    public void store(Data data){
        this.store.add(data);
    }
    
    public ArrayList<Data> getStore(){
        
    return this.store;
    }
    
    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

   

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public String getSensorID() {
        return sensorID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    
    
    
}
