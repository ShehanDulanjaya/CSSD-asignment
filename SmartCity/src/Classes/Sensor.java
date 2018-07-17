package Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CJ
 */
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

    /**
     *
     * @param sensorID
     * @param sensorType
     * @param description
     * @param status
     * @param frequency
     * @param data
     * @param monitorName
     * @param station
     */
    //Constructor
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

    /**
     *
     * @return
     */
    //Get station
    public String getStation() {
        return station;
    }

    /**
     *
     * @param station
     */
    //add station
    public void setStation(String station) {
        this.station = station;
    }

    /**
     *
     * @return
     */
    //Get monitor name
    public String getMonitorName() {
        return monitorName;
    }

    /**
     *
     * @param monitorName
     */
    //Set monitor name
    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     *
     * @return
     */
    //Get data
    public Data getData() {
        return data;
    }

    /**
     *
     * @param store
     */
    //Set store
    public void setStore(ArrayList<Data> store) {
        this.store = store;
    }
//com

    /**
     *
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     *
     * @param data
     */
    public void store(Data data){
        this.store.add(data);
    }
    
    /**
     *
     * @return
     */
    //Fetch store
    public ArrayList<Data> getStore(){
        
    return this.store;
    }
    
    /**
     *
     * @return
     */
    //Get sensor type
    public String getSensorType() {
        return sensorType;
    }

    /**
     *
     * @param sensorType
     */
    //Set Sensor Type
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    /**
     *
     * @param sensorID
     */
    //set Sensor ID
    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    /**
     *
     * @return
     */
    //get Sensor ID
    public String getSensorID() {
        return sensorID;
    }

    /**
     *
     * @return
     */
    //get Description
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    //set Description
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    //get Status
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    //set Status active/in-active
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    //get Frequency
    public String getFrequency() {
        return frequency;
    }

    /**
     *
     * @param frequency
     */
    //set Frequency
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    
    
    
}
