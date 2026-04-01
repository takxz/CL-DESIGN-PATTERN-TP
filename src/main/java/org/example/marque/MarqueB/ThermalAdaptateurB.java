package org.example.marque.MarqueB;

import org.example.app.ISensor;

import java.util.function.Consumer;

public class ThermalAdaptateurB implements ISensor {

    private ThermalSensorB thermalSensorB;
    private double threshold;
    private Consumer<String> callback;


    public ThermalAdaptateurB(ThermalSensorB thermalSensorB) {
        this.thermalSensorB = thermalSensorB;
        this.threshold = 30.0;
    }

    @Override
    public void onDetect(Consumer<String> callback) {
        this.callback = callback;
    }

    public void checkTemprature(double currentTemperature) {
        if (currentTemperature > threshold && callback != null) {
            thermalSensorB.triggerHeatSignature(callback);
        }
    }
}
