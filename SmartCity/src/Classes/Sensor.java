package Classes;

public class Sensor {

    private String sensorID;
    private String sensorType;

    public Sensor(String sensorID, String sensorType) {
        this.sensorID = sensorID;
        this.sensorType = sensorType;
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

}
