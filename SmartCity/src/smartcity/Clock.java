package smartcity;

import java.util.List;
public class Clock {
    
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
        
    
}