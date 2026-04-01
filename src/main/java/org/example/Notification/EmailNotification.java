package org.example.Notification;

public class EmailNotification implements INotification{

    private String systemName;

    public EmailNotification(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification :  " + message);
    }
}
