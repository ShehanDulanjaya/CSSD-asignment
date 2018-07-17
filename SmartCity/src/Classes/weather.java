/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
        result=new String[3];
    }
    
   public String[] getWeather(){
       String URL = "http://dataservice.accuweather.com/currentconditions/v1/311426?apikey=lY1XA38vgKFMuDmsgT4C1JYRStRaAAud"; 
//       String URL = "http://dataservice.accuweather.com/currentconditions/v1/311426?apikey=FyWGmTSPz6eAZdRM9I30v3cuoSve61TG";

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
            String icon =data.get("WeatherIcon").toString();
            this.result[0]=res.toString();
            this.result[1]=type;
            this.result[2]="13";
               
          
        }catch (Exception  e) {
            System.out.print(e);
            

                              }
      
        return this.result;
        
    
   }
   
   public ImageIcon readimage(String no){
       
       String path = "https://developer.accuweather.com/sites/default/files/"+no+"-s.png";
                    System.out.println("Get Image from " + path);
                    URL url;
       try {
           url = new URL(path);
       
                    BufferedImage image = ImageIO.read(url);
                    System.out.println("Load image into frame...");
                  return   new ImageIcon(image);
                    } catch (MalformedURLException ex) {
                         System.out.println (ex.toString());
                     }
                catch(IOException ex){
                         System.out.println (ex.toString());
                    }
       return null;
   }
}
