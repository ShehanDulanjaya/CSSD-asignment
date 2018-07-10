///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
///**
// *
// * @author CJ
// */

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;
 
public class DigitalClock {
    
    public int timeD;
    
    public DigitalClock(int x){
        this.timeD = x;
    }
    public DigitalClock() {
        this.timeD = 5000;
    }
 
  public static void main(String[] arguments) {
 
    ClockLabel dateLable = new ClockLabel("date");
    ClockLabel timeLable = new ClockLabel("time");
    ClockLabel dayLable = new ClockLabel("day");
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("Digital Clock");
    f.setSize(300,150);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(3, 1));
 
    f.add(dateLable);
    f.add(timeLable);
    f.add(dayLable);
 
    f.getContentPane().setBackground(Color.black);
 
    f.setVisible(true);
    
    
  }

}
 
class ClockLabel extends JLabel implements ActionListener {
 
  String type;
  SimpleDateFormat sdf;
  int timeDD;
 
  public ClockLabel(String type) {
    this.type = type;
    setForeground(Color.green);
 
    switch (type) {
      case "date" : sdf = new SimpleDateFormat("  MMMM dd yyyy");
                    setFont(new Font("sans-serif", Font.PLAIN, 12));
                    setHorizontalAlignment(SwingConstants.LEFT);
                    break;
      case "time" : sdf = new SimpleDateFormat("hh:mm:ss a");
                    setFont(new Font("sans-serif", Font.PLAIN, 40));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      case "day"  : sdf = new SimpleDateFormat("EEEE  ");
                    setFont(new Font("sans-serif", Font.PLAIN, 16));
                    setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
      default     : sdf = new SimpleDateFormat();
                    break;
    }
 
    Timer t = new Timer(1000, this);
    t.start();
    //t.sleep(5000);
    try{
        t.wait(6000);
        this.wait(5000);
        //this.wait(6000);
        this.sleep(5000);
        t.stop();
    }
    catch(Exception e){ 
    }
    
    DigitalClock d = new DigitalClock();
    this.timeDD=d.timeD;
    System.out.println(d.timeD);
    try{
        //this.wait(6000);
    }
    catch(Exception e){ 
    }
    System.out.println(d.timeD + " waited");
//    if(this.timeDD>0){
//        this.sleep(3000);
//    }
    //this.sleep(3000);
    //t.setDelay(this.timeDD);
//    while(t.isRunning()){
//        t.stop();
//    }
    //t.start();
    //t.setInitialDelay(5000);
//    if(t.isRunning()){
//        //f.sleep(2000);
//        System.out.println(this.timeDD);
//        for(int i=0;i<1;i++){
//            t.setDelay(this.timeDD);
//            try{
//                t.wait(timeDD);
//            }
//            catch(Exception e){
//                
//            }
//        }
//        
//        //t.setDelay(0);
//    }
  }
  
  
  
 
  public void actionPerformed(ActionEvent ae) {
    Date d = new Date();
    setText(sdf.format(d));
  }
  
  public static void sleep(int time){
      try{
          Thread.sleep(time);
      }
      catch(Exception e){
          
      }
  }
}