/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Sensor;
import Classes.SensorMonitor;
import File.serialize;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author SHEHA
 */
public class SmartCity extends Application {
    private ArrayList<Sensor> sen = new ArrayList<Sensor>();
     private ArrayList<Sensor> sen2 = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
              
      Sensor senr=new Sensor("sheha2", "food sensor", "food sensor",true, "food sensor");
      Sensor senrb=new Sensor("banuka", "food sensor", "food sensor",true, "food sensor");
      sen2.add(senrb);
      sen2.add(senr);
//        sen2.add(senr);
//          sen2.add(senr);
//            sen2.add(senr);
//              sen2.add(senr);
                // serialize.write("sensor.txt", sen2);
                // read("sensor.txt");
                ArrayList<Sensor> allSensors = serialize.getAllSensors();
                for(Sensor sensor:allSensors){
                    //sensor.setSensorID("praneeth");
                       System.out.print(sensor.getSensorID());
                    }
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
       
    }
    public  boolean read(String filename){
        
        try {
            FileInputStream fil=new FileInputStream(filename);
            ObjectInputStream oo=new ObjectInputStream(fil);         
    
     ArrayList<Sensor> sr = (ArrayList<Sensor>) oo.readObject();
     oo.close();
     fil.close();
               
            //Sensor[] bo=    sr.toArray(new Sensor[0]);
                for(Sensor sensor:sr){
                       System.out.print(sensor.getSensorID());
                    }
             
                return true;
            
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

            
        return false;
    }
}
