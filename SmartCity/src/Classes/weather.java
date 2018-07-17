/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author SHEHA
 */
public class weather {
   private String[] result;
   
    public weather(){
        
    }
    
   public String[] getWeather(){
       String URL = "http://dataservice.accuweather.com/currentconditions/v1/311426?apikey=FyWGmTSPz6eAZdRM9I30v3cuoSve61TG"; 


 
            try {
            URL url = new URL(URL);

            URLConnection conn = url.openConnection();
            InputStream in = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String result, line = reader.readLine();
            result = line;
            while ((line = reader.readLine()) != null) {
               result += line;
            }
 
            JSONParser parser = new JSONParser();
            JSONArray rsp = (JSONArray) parser.parse(result);
            JSONObject data = (JSONObject)rsp.get(0);
            JSONObject data1 = (JSONObject)data.get("Temperature");
            JSONObject data2 = (JSONObject)data1.get("Metric");
            Double res=(Double)data2.get("Value");
            String type =(String)data.get("WeatherText");
            this.result[1]=res.toString();
            this.result[2]=type;
               
          
        }catch (Exception  e) {
            System.out.print(e);
            

                              }
      
        return this.result;
        
    
   } 
}
