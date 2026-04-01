package org.example;

import org.example.Notification.NotificationFactory;
import org.example.Room.Room;
import org.example.marque.MarqueA.CameraA;
import org.example.marque.MarqueA.TemperatureSensorA;
import org.example.marque.MarqueB.ThermalAdaptateurB;
import org.example.marque.MarqueB.ThermalSensorB;

public class Main {
    public static void main(String[] args) {

        Room salleServeur = new Room("Salle Serveur");

        CameraA cameraA = new CameraA(String.valueOf(salleServeur.getName()));

        TemperatureSensorA temperatureSensorA = new TemperatureSensorA(String.valueOf(salleServeur.getName()));

        ThermalSensorB thermalSensorB = new ThermalSensorB(String.valueOf(salleServeur.getName()));
        ThermalAdaptateurB thermalAdaptateurB = new ThermalAdaptateurB(thermalSensorB);

        salleServeur.addSensor(cameraA);
        salleServeur.addSensor(temperatureSensorA);
        salleServeur.addSensor(thermalAdaptateurB);

        salleServeur.addNotificationSystem(NotificationFactory.createNotificationSystem("email"));
        salleServeur.addNotificationSystem(NotificationFactory.createNotificationSystem("log"));

        System.out.println("\n==== Simulation des détéction dans la salle serveur ====");
        cameraA.detectMovement();

        temperatureSensorA.checkTemprature(50);

        thermalAdaptateurB.checkTemprature(34);
        System.out.println("==== Fin de la simulation de la salle serveur ====");


        Room salleBureau = new Room("Salle Bureau");

        CameraA cameraA2 = new CameraA(String.valueOf(salleBureau.getName()));
        TemperatureSensorA temperatureSensorA2 = new TemperatureSensorA(String.valueOf(salleBureau.getName()));
        ThermalSensorB thermalSensorB2 = new ThermalSensorB(String.valueOf(salleBureau.getName()));
        ThermalAdaptateurB thermalAdaptateurB2 = new ThermalAdaptateurB(thermalSensorB2);

        salleBureau.addSensor(cameraA2);
        salleBureau.addSensor(temperatureSensorA2);
        salleBureau.addSensor(thermalAdaptateurB2);

        salleBureau.addNotificationSystem(NotificationFactory.createNotificationSystem("discord"));

        System.out.println("\n==== Simulation des détéction dans la salle bureau ====");
        cameraA2.detectMovement();
        temperatureSensorA2.checkTemprature(28);
        thermalAdaptateurB2.checkTemprature(32);
        System.out.println("==== Fin de la simulation de la salle bureau ====");
    }
}