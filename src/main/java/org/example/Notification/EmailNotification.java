package org.example.Notification;

public class EmailNotification implements INotification{

    private String systemName;
    private String param;

    public EmailNotification(String systemName, String param) {
        this.systemName = systemName;
        this.param = param;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification :  " + message + ", sent to " + param);
    }
}
