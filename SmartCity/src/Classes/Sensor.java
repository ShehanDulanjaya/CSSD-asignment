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
    private ArrayList<Sensor> store;
    private String monitorName;

    public Sensor(String sensorID, String sensorType, String description, Boolean status, String frequency,Data data,String monitorName) {
        this.sensorID = sensorID;
        this.sensorType = sensorType;
        this.description = description;
        this.status = status;
        this.frequency = frequency;
        this.data=data;
        this.monitorName=monitorName;
        this.store=new ArrayList<>();
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

    public void setData(Data data) {
        this.data = data;
    }

    public void store(Sensor data){
        this.store.add(data);
    }
    
    public ArrayList<Sensor> getStore(){
        
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
