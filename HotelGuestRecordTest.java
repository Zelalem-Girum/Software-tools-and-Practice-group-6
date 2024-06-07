package Tools_assignment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class HotelGuestRecordTest {

    @Test
    public void testAddGuestAndGetGuest() {
        HotelGuestRecord guestRecord = new HotelGuestRecord();
        int roomNumber = 101;
        String guestName = "John Doe";
        guestRecord.addGuest(roomNumber, guestName);

        assertEquals(guestName, guestRecord.getGuest(roomNumber));
    }

    @Test
    public void testUpdateGuest() {
        HotelGuestRecord guestRecord = new HotelGuestRecord();
        int roomNumber = 101;
        String guestName = "John Doe";
        guestRecord.addGuest(roomNumber, guestName);

        String newGuestName = "Jane Doe";
        guestRecord.updateGuest(roomNumber, newGuestName);

        assertEquals(newGuestName, guestRecord.getGuest(roomNumber));
    }

    @Test
    public void testRemoveGuest() {
        HotelGuestRecord guestRecord = new HotelGuestRecord();
        int roomNumber = 101;
        String guestName = "John Doe";
        guestRecord.addGuest(roomNumber, guestName);

        guestRecord.removeGuest(roomNumber);

        assertNull(guestRecord.getGuest(roomNumber));
    }

}
