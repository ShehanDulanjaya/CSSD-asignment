/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Akila Jayasinghe
 */
public class Data {
       private Double readings;
private static DecimalFormat df2 = new DecimalFormat("0.##");
   
    public Data() {
    }
    
     public String getReadings() {
         
        this.readings = new Random().nextDouble();		
        return df2.format(readings);
    }
}
