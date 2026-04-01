package org.example.marque.MarqueA;

import org.example.app.ISensor;

import java.util.function.Consumer;

public class TemperatureSensorA implements ISensor {

    private String location;
    private double threshold = 25.0;
    private Consumer<String> callback;

    public TemperatureSensorA(String location) {
        this.location = location;
        this.threshold = 40.0;
    }

    @Override
    public void onDetect(Consumer<String> callback) {
        this.callback = callback;

    }

    public void checkTemprature(double currentTemperature) {
        if (currentTemperature > threshold && callback != null) {
            callback.accept("Temperature at " + location + " is above threshold: " + currentTemperature + "°C");
        }
    }

}
