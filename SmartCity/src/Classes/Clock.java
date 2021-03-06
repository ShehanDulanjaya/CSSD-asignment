package Classes;

import File.serialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;

/**
 *
 * @author CJ
 */
public class Clock extends Observable implements Serializable {
    
    /**
     *
     */
    public ArrayList<SensorMonitor> observers;

    /**
     *
     */
    public double notifyFrequncy;
    private Clock clock;
    private static long wait=5000;
   private static final Clock instance = new Clock();
   Timer t;
   private boolean hasStart=false;
   
    /**
     *
     * @return
     */
   //get an instance
    public static Clock getInstance(){
       
       return instance;
       
   }
    
    /**
     *
     * @return
     */
    public List<SensorMonitor> getObservers() {
        return observers;
    }

    /**
     *
     * @param observers
     */
    public void setObservers(ArrayList<SensorMonitor> observers) {
        this.observers = observers;
    }

    /**
     *
     * @return
     */
    //get frequency 
    public double getNotifyFrequncy() {
        return notifyFrequncy;
    }

    /**
     *
     * @param notifyFrequncy
     */
    //set the frequency
    public void setNotifyFrequncy(double notifyFrequncy) {
        this.notifyFrequncy = notifyFrequncy;
    }

    /**
     *
     * @return
     */
    public Clock getClock() {
        return clock;
    }

    /**
     *
     * @param clock
     */
    //set the clock
    public void setClock(Clock clock) {
        this.clock = clock;
    }
        
    /**
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        this.observers.add((SensorMonitor) o);
       // serialize.write("clocksm.txt", this.observers);//add available sensor monitors
    }

    /**
     *
     * @param o
     */
    public void unregisterObserver(Observer o) {
        this.observers.remove((SensorMonitor)o);
       // serialize.write("clocksm.txt", this.observers);//remove sensor monitor from list
    }
    
    /**
     * 
     */
    //notify 
    public void notifyObservers() {
        for(Observer o:observers){
            System.out.println("Clock start Notify Monitors");
            o.update(this, o);
            
        }
               
    }
    
    /**
     * 
     */
    //track time
    private  void trackTime(){
    
    t.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                hasStart=true;
                System.out.println("----------------------------------");
                System.out.println("Clock Running: " + wait);
                notifyObservers();
                    
                    
            }
        },0,wait
            
         
);
    }
    
    /**
     *
     * @param wait
     */
    public void waitForTime(long wait){
        if(hasStart){
            t.cancel();
            t.purge();
            hasStart=false;
        }
        
            this.wait=wait;
            t=new Timer();
            trackTime();
        
    }
    /**
     * 
     * @return 
     */
    //get wait time
    public long getwaitTime(){
        return this.wait;
    }
    
}