package Classes;

import File.serialize;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
public class Clock extends Observable implements Serializable {
    
    public ArrayList<SensorMonitor> observers;
    public double notifyFrequncy;
    private Clock clock;
    private long wait;
   private static final Clock instance = new Clock();
   
   public static Clock getInstance(){
       return instance;
   }
    
    public List<SensorMonitor> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<SensorMonitor> observers) {
        this.observers = observers;
    }

    public double getNotifyFrequncy() {
        return notifyFrequncy;
    }

    public void setNotifyFrequncy(double notifyFrequncy) {
        this.notifyFrequncy = notifyFrequncy;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }
        
    
    public void registerObserver(Observer o) {
        this.observers.add((SensorMonitor) o);
        serialize.write("clocksm.txt", this.observers);//add available sensor monitors
    }

    public void unregisterObserver(Observer o) {
        this.observers.remove((SensorMonitor)o);
        serialize.write("clocksm.txt", this.observers);//remove sensor monitor from list
    }
    
    public void notifyObservers() {
        for(Observer o:observers){
            
            o.update(this, o);
        }
               
    }
    
    private void trackTime(){
          long wait=5000;
    Timer t=  new Timer();
    t.schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
               notifyObservers();
                    
            }
        },0,wait
            
         
);
    }
    
  
    public void waitForTime(long wait){
        this.wait=wait;
    }
    
}