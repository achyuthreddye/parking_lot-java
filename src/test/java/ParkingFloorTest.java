import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkingFloorTest {
    ParkingFloor parkingFloor = new ParkingFloor(6,2,2);
    Vehicle truck1 = new Vehicle("Ka40m8500", "red", "truck");
    Vehicle truck2 = new Vehicle("Ka40m8501", "red", "truck");
    Vehicle truck3 = new Vehicle("Ka40m8503", "red", "truck");

    Vehicle bike1 = new Vehicle("Ka40m8500", "red", "bike");
    Vehicle bike2 = new Vehicle("Ka40m8501", "red", "bike");
    Vehicle bike3 = new Vehicle("Ka40m8503", "red", "bike");
//    Vehicle truck3 = new Vehicle("Ka40m8501", "red", "bike");
    Vehicle truck4 = new Vehicle("Ka40m8501", "red", "car");

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
        Map<String, Integer> freeParkingSlotCount=new HashMap();
        freeParkingSlotCount = parkingFloor.getAllFreeSlotCountInFloor();

        assertTrue(freeParkingSlotCount.containsKey("truck") && freeParkingSlotCount.get("truck") == 2);
        assertTrue(freeParkingSlotCount.containsKey("bike") && freeParkingSlotCount.get("bike") == 2);
        assertTrue(freeParkingSlotCount.containsKey("car") && freeParkingSlotCount.get("car") == 2);
    }

    @Test
    public void testingGetAllOccupiedSlotCountInFloor(){
        Map<String, Integer> occupiedParkingSlotCount=new HashMap();
        occupiedParkingSlotCount = parkingFloor.getAllOccupiedSlotCountInFloor();

        assertTrue(occupiedParkingSlotCount.containsKey("truck") && occupiedParkingSlotCount.get("truck") == 0);
        assertTrue(occupiedParkingSlotCount.containsKey("bike") && occupiedParkingSlotCount.get("bike") == 0);
        assertTrue(occupiedParkingSlotCount.containsKey("car") && occupiedParkingSlotCount.get("car") == 0);
    }

    @Test
    public  void testingForParkingTruck1(){
//        assertTrue(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck1).get("status").toString()));
        assertEquals(1, parkingFloor.parkVehicleinParkingFloor(truck1).get("slotId"));
        assertEquals(2, parkingFloor.parkVehicleinParkingFloor(truck2).get("slotId"));
        assertFalse(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck3).get("status").toString()));
    }

    @Test
    public  void testingForUnParkingTruck1(){
        assertEquals(1, parkingFloor.parkVehicleinParkingFloor(truck1).get("slotId"));
        assertEquals(2, parkingFloor.parkVehicleinParkingFloor(truck2).get("slotId"));
        parkingFloor.unParkVehicleinParkingFloor(1);
        int nearestParkingSlotForTruck = parkingFloor.getNearestSlotInFloor("truck");
        assertEquals(1, nearestParkingSlotForTruck);
    }



    @Test
    public  void testingForParkingTruck3(){
        assertTrue(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck3).get("status").toString()));
    }

//    @Test
//    public  void testingForParkingBike1(){
//        assertTrue(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(bike1).get("status").toString()));
//    }
//
//    @Test
//    public  void testingForParkingBike2(){
//        assertTrue(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(bike2).get("status").toString()));
//    }
//
//    @Test
//    public  void testingForParkingBike3(){
//        assertTrue(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(bike3).get("status").toString()));
//    }



}