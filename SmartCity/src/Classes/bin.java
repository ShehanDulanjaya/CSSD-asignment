/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import File.serialize;
import java.util.ArrayList;
/**
 *
 * @author CJ
 */
public class bin {
    private bin Bin;
    ArrayList<Sensor>sens;
    Location location;
    private static final bin instance = new bin ();
    public static bin getinstance(){
       
     
        return instance;
    }
    
    /**
     * 
     * @return 
     */
    //get bins
    public ArrayList<Sensor> getBins(){
        this.sens=new ArrayList<>();
    
         for(Sensor sensor:serialize.getAllSensors()){
            if("Bin Sensor".equals(sensor.getSensorType())){
                this.sens.add(sensor);
            }  
    }
         return this.sens;
    }
    /**
     * 
     * @return 
     */
    //get location
    public String getlocation(){
        this.location=new Location();
        return this.location.getemergency();
    }
}
