import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationEmailTest {

    @Test
    void maySendEmailNotification() {
        INotification notification = NotificationFactory.getNotification("Email");
        assertEquals("Email sent", notification.send());
    }
}
