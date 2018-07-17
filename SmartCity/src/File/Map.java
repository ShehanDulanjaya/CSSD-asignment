/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Akila Jayasinghe
 */
public class Map {
    public static String[] readmap(){
        String result[];
        try {
            File file = new File("../location.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String res=null;
            String st;
            
            while ((st = br.readLine()) != null)
              res=st;
            
            result = res.split("/");
            return result;
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        return null;

    }
    
    public static String[] emergencyread(){
        String result[];
        try {
            File file = new File("../emergency.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String res=null;
            String st;
            
            while ((st = br.readLine()) != null)
              res=st;
            
            result = res.split("/");
            return result;
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        return null;

    }
}
