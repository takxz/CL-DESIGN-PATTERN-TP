package org.example.Notification;

public class NotificationFactory {

    public static INotification createNotificationSystem(String systemName, String param) {
        switch (systemName.toLowerCase()) {
            case "email":
                return new EmailNotification(systemName, param);
            case "log":
                return new LogNotification(systemName, param);
            case "discord":
                return new DiscordNotification(systemName, param);
            default:
                throw new IllegalArgumentException("Unknown notification system: " + systemName);
        }
    }

}
