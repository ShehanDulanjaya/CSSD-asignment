public class Sensor{
	private String sensorID;
	
	public void setSensorID(String sensorID){
		this.sensorID = sensorID;
	}
	
	public String getSensorID(){
		return sensorID;
	}
	
	public Sensor(String sensorID){
		this.sensorID = sensorID;
	}
}