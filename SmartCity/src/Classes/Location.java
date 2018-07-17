/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import javafx.beans.InvalidationListener;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Dos
 */
public class Location extends Observable{

    private double latitude;
    private double longitude;
    private String address;
    emergencyService observer;
    private String random;

    /**
     *
     * @param latitude
     * @param longitude
     */
    //constructor
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        
    }
    
    /**
     *
     */
    public Location(){
        
    }

    /**
     *
     * @return
     */
    //get Latitude
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     */
    //set Latitude
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     */
    //get Longitude
    public double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     */
    //set Longitude
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     */
    //Extract coodinates from the map and pass to UI
    public String toAdress(){
        
            
            String URL = "https://maps.googleapis.com/maps/api/geocode/json"; 


 
            try {
            URL url = new URL(URL+"?latlng="+this.latitude+","+this.longitude+"&key=AIzaSyCCu1RHF_poxJ-UnzJIessLJ_2CMLlyPI8");

            URLConnection conn = url.openConnection();
            InputStream in = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String result, line = reader.readLine();
            result = line;
            while ((line = reader.readLine()) != null) {
               result += line;
            }
 
            JSONParser parser = new JSONParser();
            JSONObject rsp = (JSONObject) parser.parse(result);
 
            if (rsp.containsKey("results")) {
                JSONArray matches = (JSONArray) rsp.get("results");
                JSONObject data = (JSONObject) matches.get(0); 
                this.address = (String) data.get("formatted_address");
            }
 
           
        }catch (Exception  e) {
            System.out.print(e);
            return "no location codes";

                              }
        return this.address;
    }
    
    /**
     *
     * @return
     */
    //Set Emergency Coordinates
    public String setemergency(){
        String[] cordinates = {"6.864124613608374/80.0048899434737","6.930399406839585/79.9771101098645","6.941487794409919/79.9135422706604"
                ,"6.932092591524386/79.88621896274822","6.876004993503434/79.90870034814657","6.930080472159258/79.84503842599281","6.852634708845186/79.9179616201177","6.828754293439086/80.01523604897454"};
        this.random = (cordinates[new Random().nextInt(cordinates.length)]);
        notifyObservers(random);
        return this.random;
    }
    
    /**
     *
     * @param listener
     */
    //register Observer
    public void registerObserver(emergencyService listener) {
        this.observer=listener;
         
    }

    /**
     *
     * @param listener
     */
    //unregister Observer
    public void unregisterObserver(emergencyService listener) {
        this.observer=null;
      
    }

    /**
     *
     * @param ob
     */
    //notify Observers
    public void notifyObservers(String ob) {
            this.observer.update(this,ob );
            
        }
               
    
}
