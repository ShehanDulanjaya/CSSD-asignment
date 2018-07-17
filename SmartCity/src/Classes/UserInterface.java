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

    /**
     *
     * @return
     */
    public Mothership getMotherShip() {
        return motherShip;
    }

    /**
     *
     * @param motherShip
     */
    public void setMotherShip(Mothership motherShip) {
        this.motherShip = motherShip;
    }

    /**
     *
     * @return
     */
    public ArrayList<SensorStation> getSensorStation() {
        return sensorStation;
    }

    /**
     *
     * @param sensorStation
     */
    public void setSensorStation(ArrayList<SensorStation> sensorStation) {
        this.sensorStation = sensorStation;
    }

    /**
     *
     * @return
     */
    public ArrayList<SensorMonitor> getSensorMonitor() {
        return sensorMonitor;
    }

    /**
     *
     * @param sensorMonitor
     */
    public void setSensorMonitor(ArrayList<SensorMonitor> sensorMonitor) {
        this.sensorMonitor = sensorMonitor;
    }

    /**
     *
     * @return
     */
    public SensorStation getCurrentSensorStation() {
        return currentSensorStation;
    }

    /**
     *
     * @param currentSensorStation
     */
    public void setCurrentSensorStation(SensorStation currentSensorStation) {
        this.currentSensorStation = currentSensorStation;
    }

    /**
     *
     * @return
     */
    public SensorMonitor getCurrentSensorMonitor() {
        return currentSensorMonitor;
    }

    /**
     *
     * @param currentSensorMonitor
     */
    public void setCurrentSensorMonitor(SensorMonitor currentSensorMonitor) {
        this.currentSensorMonitor = currentSensorMonitor;
    }
}
