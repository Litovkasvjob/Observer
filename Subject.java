package Observation.MaxObserver;

/**
 * Created by SergLion on 31.03.2016.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}

interface Observer {
    public void update(float temperature);
}

interface Display {
    public void display();
}
