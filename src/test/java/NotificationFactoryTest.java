import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    @Test
    void mayRaiseExceptionNonExistentNotification() {
        try {
            NotificationFactory.getNotification("Non-existent");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Non-existent notification", e.getMessage());
        }
    }

    @Test
    void mayRaiseExceptionInvalidNotification() {
        try {
            NotificationFactory.getNotification("Invalid");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid notification", e.getMessage());
        }
    }

}
