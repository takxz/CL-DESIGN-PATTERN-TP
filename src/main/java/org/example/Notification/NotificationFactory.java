package org.example.Notification;

public class NotificationFactory {

    public static INotification createNotificationSystem(String systemName) {
        switch (systemName.toLowerCase()) {
            case "email":
                return new EmailNotification(systemName);
            case "log":
                return new LogNotification(systemName);
            case "discord":
                return new DiscordNotification(systemName);
            default:
                throw new IllegalArgumentException("Unknown notification system: " + systemName);
        }
    }

}
