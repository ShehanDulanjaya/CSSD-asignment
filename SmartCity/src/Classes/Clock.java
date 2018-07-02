package Classes;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
public class Clock extends Observable {
    
    public List<SensorMonitor> observers;
    public double notifyFrequncy;
    private Clock clock;

    public Clock(double notifyFrequncy, Clock clock) {
        this.notifyFrequncy = notifyFrequncy;
        this.clock = clock;
    }
    
    public List<SensorMonitor> getObservers() {
        return observers;
    }

    public void setObservers(List<SensorMonitor> observers) {
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
        this.observers.add((SensorMonitor) o);//add available sensor monitors
    }

    public void unregisterObserver(Observer o) {
        this.observers.remove((SensorMonitor)o);//remove sensor monitor from list
    }
    
    public void notifyObservers() {
        for(Observer o:observers){
            
            o.update(this, o);
        }
        
        
    }
    
}