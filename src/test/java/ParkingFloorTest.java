import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingFloorTest {
    ParkingFloor parkingFloor = new ParkingFloor(6,2,2);

    @Test
    public void testingForNextTruckSlot(){
        Assertions.assertEquals(1,parkingFloor.getNearestSlotInFloor("truck"));
    }
    @Test
    public void testingForNextBikeSlot(){
        Assertions.assertEquals(3,parkingFloor.getNearestSlotInFloor("bike"));
    } @Test
    public void testingForNextCarSlot(){
        Assertions.assertEquals(5,parkingFloor.getNearestSlotInFloor("car"));
    }
    @Test
    public void testingForNextInvalidCarSlot(){
        Assertions.assertEquals(-1,parkingFloor.getNearestSlotInFloor("any Invalid data"));
    }


}