import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationSMSTest {

    @Test
    void maySendEmailNotification() {
        INotification notification = NotificationFactory.getNotification("SMS");
        assertEquals("SMS sent", notification.send());
    }
}
