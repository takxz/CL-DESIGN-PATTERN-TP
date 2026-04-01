package org.example.Notification;

public class DiscordNotification implements INotification{

    private String systemName;
    private String param;

    public DiscordNotification(String systemName, String param) {
        this.systemName = systemName;
        this.param = param;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Discord Notification : " + message + ", sent to " + param);
    }
}
