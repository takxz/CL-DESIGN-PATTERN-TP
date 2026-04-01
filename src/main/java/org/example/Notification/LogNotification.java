package org.example.Notification;

public class LogNotification implements INotification{

    private String systemName;

    public LogNotification(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Log Notification : " + message);
    }
}
