package Observation.MaxObserver;

/**
 * Created by SergLion on 31.03.2016.
 */
public class SensorTest {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        PanelTemperature panelTemperature1 = new PanelTemperature(sensor);
        PanelTemperature panelTemperature2 = new PanelTemperature(sensor);
        PanelTemperature panelTemperature3 = new PanelTemperature(sensor);

        sensor.setTemperature(23);
        sensor.setTemperature(25);
        sensor.setTemperature(27);
        sensor.setTemperature(27);
        sensor.setTemperature(23);
        sensor.setTemperature(10);
    }
}
