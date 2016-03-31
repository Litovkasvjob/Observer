package Observation.MaxObserver;

/**
 * Created by SergLion on 31.03.2016.
 */
public class PanelTemperature implements Observer, Display {
    private float temperature;
    private Subject sensor;

    public PanelTemperature(Subject sensor) {

        this.sensor = sensor;
        sensor.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature: " + temperature);
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }
}
