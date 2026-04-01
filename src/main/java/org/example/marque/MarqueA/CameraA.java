package org.example.marque.MarqueA;

import org.example.app.ISensor;

import java.util.function.Consumer;

public class CameraA implements ISensor {

    private String location;
    private Consumer<String> callback;

    public CameraA(String location) {
        this.location = location;
    }

    @Override
    public void onDetect(Consumer<String> callback) {
        this.callback = callback;
    }


    public void detectMovement() {
        if (callback != null)
            callback.accept("Movement detected at " + location);
    }
}
