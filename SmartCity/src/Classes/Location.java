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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Dos
 */
public class Location {

    private double latitude;
    private double longitude;
    private String address;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

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
}
