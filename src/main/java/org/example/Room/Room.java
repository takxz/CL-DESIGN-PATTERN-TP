package org.example.Room;

import org.example.Notification.INotification;
import org.example.app.ISensor;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<ISensor> sensors = new ArrayList<>();
    private List<INotification> notifications = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addSensor(ISensor sensor) {
        sensors.add(sensor);
            sensor.onDetect(alert -> notifications.forEach(notification -> notification.sendNotification(alert)));
            };

    public void addNotificationSystem(INotification notification) {
        notifications.add(notification);
    }

    public String getName() {
        return name;
    }




}
