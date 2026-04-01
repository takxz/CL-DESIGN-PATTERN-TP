package org.example.Notification;

public class LogNotification implements INotification{

    private String systemName;
    private String param;

    public LogNotification(String systemName, String param) {
        this.systemName = systemName;
        this.param = param;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Log Notification : " + message + ", logged to " + param);
    }
}
