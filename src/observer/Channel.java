package observer;

import java.util.ArrayList;

public class Channel implements Subject{

    private ArrayList<Observer> observers;
    private String channelName;
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer obs: observers ) {
            obs.update(status);
        }
    }
}
