import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationPushTest {

    @Test
    void maySendEmailNotification() {
        INotification notification = NotificationFactory.getNotification("Push");
        assertEquals("Push sent", notification.send());
    }
}
