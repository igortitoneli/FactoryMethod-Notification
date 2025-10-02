public class NotificationFactory {
    public static INotification getNotification(String notification) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Notification" + notification);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Non-existent notification");
        }
        if (!(objeto instanceof INotification)) {
            throw new IllegalArgumentException("Invalid notification");
        }
        return (INotification) objeto;
    }
}
