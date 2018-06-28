/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author SHEHA
 */public class UserInterface {
    private Mothership motherShip;
    private ArrayList<SensorStation> sensorStation;
    private ArrayList<SensorMonitor> sensorMonitor;
    private SensorStation currentSensorStation;
    private SensorMonitor currentSensorMonitor;

    public Mothership getMotherShip() {
        return motherShip;
    }

    public void setMotherShip(Mothership motherShip) {
        this.motherShip = motherShip;
    }

    public ArrayList<SensorStation> getSensorStation() {
        return sensorStation;
    }

    public void setSensorStation(ArrayList<SensorStation> sensorStation) {
        this.sensorStation = sensorStation;
    }

    public ArrayList<SensorMonitor> getSensorMonitor() {
        return sensorMonitor;
    }

    public void setSensorMonitor(ArrayList<SensorMonitor> sensorMonitor) {
        this.sensorMonitor = sensorMonitor;
    }

    public SensorStation getCurrentSensorStation() {
        return currentSensorStation;
    }

    public void setCurrentSensorStation(SensorStation currentSensorStation) {
        this.currentSensorStation = currentSensorStation;
    }

    public SensorMonitor getCurrentSensorMonitor() {
        return currentSensorMonitor;
    }

    public void setCurrentSensorMonitor(SensorMonitor currentSensorMonitor) {
        this.currentSensorMonitor = currentSensorMonitor;
    }
}
