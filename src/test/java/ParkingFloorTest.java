import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingFloorTest {
    ParkingFloor parkingFloor = new ParkingFloor(6,2,2);

    @Test
    public void testingForNextTruckSlot(){
        Assertions.assertEquals(0,parkingFloor.getNearestSlotInFloor("truck"));
    }


}