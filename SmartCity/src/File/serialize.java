/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import Classes.Sensor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author SHEHA
 */
public class serialize implements Serializable{
private Sensor sensor;
 public static serialize slib;
    public serialize() {
      
    }
    
    
        public static void write(String filename, Object obj){
            
        try {
            FileOutputStream fil=new FileOutputStream(filename);
            ObjectOutputStream oo=new ObjectOutputStream(fil);
            oo.writeObject(obj);
           
            fil.flush();
            fil.close();
           
        } catch (Exception e) {
            System.out.println("write "+ e);
        }

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

    
//    public static boolean read(String filename,Object clas){
//        try {
//            FileInputStream fil=new FileInputStream(filename);
//            ObjectInputStream oo=new ObjectInputStream(fil);
//            Object obj= oo.readObject();
//            
//            fil.close();
//            if(clas.getClass().equals(obj.getClass())){
//                lib = (Library) obj;
//                return true;
//            }
//            
//        } catch (Exception e) {
//            System.out.println("read "+ e);
//        }
//
//            lib =new Library();
//        return false;
//    }
    
}
