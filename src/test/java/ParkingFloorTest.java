import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
    }

    @Test
    public void testingForNextCarSlot(){
        Assertions.assertEquals(5,parkingFloor.getNearestSlotInFloor("car"));
    }

    @Test
    public void testingForNextInvalidCarSlot(){
        Assertions.assertEquals(-1,parkingFloor.getNearestSlotInFloor("any Invalid data"));
    }

    @Test
    public void testingGetAllFreeSlotCountInFloor(){
//        Assertions.assertEquals(-1,parkingFloor.getNearestSlotInFloor("any Invalid data"));
        Map<String, Integer> freeParkingSlotCount=new HashMap();
        freeParkingSlotCount = parkingFloor.getAllFreeSlotCountInFloor();

        assertTrue(freeParkingSlotCount.containsKey("truck") && freeParkingSlotCount.get("truck") == 2);
        assertTrue(freeParkingSlotCount.containsKey("bike") && freeParkingSlotCount.get("bike") == 2);
        assertTrue(freeParkingSlotCount.containsKey("car") && freeParkingSlotCount.get("car") == 2);
    }





}