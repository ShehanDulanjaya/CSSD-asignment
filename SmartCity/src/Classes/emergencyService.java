/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileWriter;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author SHEHA
 */
public class emergencyService implements Observer{

    /**
     *
     */
    public emergencyService() {
    }
    
    /**
     *
     * @param location
     */
    public void warnEmergancy(String location){
        try{    
           FileWriter fw=new FileWriter("D:\\Github\\CSSD-asignment\\SmartCity\\emergancy.txt");    
           fw.write(location);    
           fw.close();    
          }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        
          System.out.println("emergancy warn...");    
     
    }

    @Override
    public void update(Observable o, Object arg) {
        warnEmergancy((String) arg);
    }
    
}
