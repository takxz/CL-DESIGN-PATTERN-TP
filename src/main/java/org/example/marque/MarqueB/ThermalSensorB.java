package org.example.marque.MarqueB;

import java.util.function.Consumer;

public class ThermalSensorB {

    private String position;

    public ThermalSensorB(String position) {
        this.position = position;
    }

    public void triggerHeatSignature(Consumer<String> process){
        //exemple de données JSON
        String json= String.format("{\"sensor\": \"%s\", \"detection\": \"thermal\", \"date\": \"%s\"}", position, java.time.LocalDateTime.now());
        process.accept(json);
    }
}
