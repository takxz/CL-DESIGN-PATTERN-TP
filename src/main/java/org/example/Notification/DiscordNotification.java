package org.example.Notification;

public class DiscordNotification implements INotification{

    private String systemName;

    public DiscordNotification(String systemName) {
        this.systemName = systemName;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Discord Notification : " + message);
    }
}
