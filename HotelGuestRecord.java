package Tools_assignment;
import java.util.HashMap;
import java.util.Map;

public class HotelGuestRecord {
	private Map<Integer, String> guestRecords;

    public HotelGuestRecord() {
        this.guestRecords = new HashMap<>();
    }

    public void addGuest(int roomNumber, String guestName) {
        guestRecords.put(roomNumber, guestName);
    }

    public String getGuest(int roomNumber) {
        return guestRecords.get(roomNumber);
    }

    public void updateGuest(int roomNumber, String newGuestName) {
        if (guestRecords.containsKey(roomNumber)) {
            guestRecords.put(roomNumber, newGuestName);
        }
    }

    public void removeGuest(int roomNumber) {
        guestRecords.remove(roomNumber);
    }

}
