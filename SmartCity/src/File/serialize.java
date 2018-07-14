/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import Classes.Sensor;
import Classes.SensorMonitor;
import Classes.SensorStation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SHEHA
 */
public class serialize implements Serializable{
private Sensor sensor;
 public static serialize slib;
    public serialize() {
      
    }
    
    
        public static boolean write(String filename, Object obj){
            
        try {
            FileOutputStream fil=new FileOutputStream(filename);
            ObjectOutputStream oo=new ObjectOutputStream(fil);
            oo.writeObject(obj);
           
            fil.flush();
            oo.close();
            fil.close();
           return true;
        } catch (Exception e) {
            System.out.println("write "+ e);
        }
return false;
    }
        
        
        public static void delete(String filename){
        
        File file = new File (filename);
        if (! file.exists() )
            {
        boolean success = file.delete();
        }
     
       file.delete();
         
        try{
             
               FileWriter fstream = new FileWriter(filename);
                   BufferedWriter out = new BufferedWriter(fstream);
 
               out.close();
               }catch (Exception e){
                 System.err.println("Error: " + e.getMessage());
               }
    }

    
    public static boolean read(String filename,Object clas){
        try {
            FileInputStream fil=new FileInputStream(filename);
            ObjectInputStream oo=new ObjectInputStream(fil);
            Object obj= oo.readObject();
            
            fil.close();
            if(clas.getClass().equals(obj.getClass())){
                clas = obj;
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return false;
    }
public static ArrayList<Sensor> getAllSensors(){
          try {
            FileInputStream fil=new FileInputStream("sensor.txt");
                     
                if(fil.available()>0){
                    ObjectInputStream oo=new ObjectInputStream(fil);
                 ArrayList<Sensor> sr = (ArrayList<Sensor>) oo.readObject();
                 oo.close();
                 fil.close();
                 return sr;
                }
                else{
                     ArrayList<Sensor>sr  = new ArrayList<>();

                     fil.close();
                     return sr;
                }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return null;
      }

public static ArrayList<SensorStation> getAllSensorStations(){
          try {
            FileInputStream fil=new FileInputStream("sensorstation.txt");
                     
                if(fil.available()>0){
                    ObjectInputStream oo=new ObjectInputStream(fil);
                 ArrayList<SensorStation> sr = (ArrayList<SensorStation>) oo.readObject();
                 oo.close();
                 fil.close();
                 return sr;
                }
                else{
                     ArrayList<SensorStation>sr  = new ArrayList<>();

                     fil.close();
                     return sr;
                }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return null;
      }
    
    public static ArrayList<SensorMonitor> readSensorMonitor(){
        try {
            FileInputStream fil=new FileInputStream("sensormonitor.txt");
                     
                if(fil.available()>0){
                    ObjectInputStream oo=new ObjectInputStream(fil);
                 ArrayList<SensorMonitor> sr = (ArrayList<SensorMonitor>) oo.readObject();
                 oo.close();
                 fil.close();
                 return sr;
                }
                else{
                     ArrayList<SensorMonitor>sr  = new ArrayList<>();

                     fil.close();
                     return sr;
                }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return null;
    }
}
