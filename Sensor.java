package Observation.MaxObserver;

import java.util.ArrayList;

/**
 * Created by SergLion on 31.03.2016.
 */
public class Sensor implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;

    public Sensor() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature);
        }
    }

    public void temperatureChanged() {
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        if (Math.abs(this.temperature - temperature) >= 1) {
            this.temperature = temperature;
            temperatureChanged();
        }
    }
}
