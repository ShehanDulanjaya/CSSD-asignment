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
    private String store;
   
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
    //get readings
    public String getReadings() {
        
        this.readings = new Random().nextDouble();
        this.store=df2.format(readings).toString();
        return this.store;
//        this.store="0.9";
//        return this.store;
    }
    
    public String getStore(){
        return this.store;
    }

    /**
     *
     */
    //set date
    public void setDate(){
          this.dateobj = new Date();

     }

    /**
     *
     * @return
     */
    //get date and time
    public String getDateTime(){
         
         return this.df.format(this.dateobj).toString();
     }
}
