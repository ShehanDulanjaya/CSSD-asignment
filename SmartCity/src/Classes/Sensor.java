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

    public Sensor(String sensorID, String sensorType, String description, Boolean status, String frequency,Data data) {
        this.sensorID = sensorID;
        this.sensorType = sensorType;
        this.description = description;
        this.status = status;
        this.frequency = frequency;
        this.data=data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
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
