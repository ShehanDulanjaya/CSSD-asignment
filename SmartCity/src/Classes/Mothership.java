package Classes;

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
    private List<SensorStation> sensorStation;

    public Mothership(String ID, List<SensorStation> sensorStation) {
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

    public void setSensorStation(List<SensorStation> sensorStation) {
        this.sensorStation = sensorStation;
    }

    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    
    
}
