/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Akila Jayasinghe
 */
public class Data implements Serializable{
       private Double readings;
       DateFormat df = new SimpleDateFormat("dd/MM/yy                                 HH:mm:ss");
       private Date dateobj; 
    private static DecimalFormat df2 = new DecimalFormat("0.##");
   
    /**
     *
     */
    public Data() {
        setDate();
    }
    
    /**
     *
     * @return
     */
    public String getReadings() {
        
        this.readings = new Random().nextDouble();		
        return df2.format(readings);
    }

    /**
     *
     */
    public void setDate(){
          this.dateobj = new Date();

     }

    /**
     *
     * @return
     */
    public String getDateTime(){
         
         return this.df.format(this.dateobj);
     }
}
