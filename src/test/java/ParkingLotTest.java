import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ParkingLot parkingLot = new ParkingLot(2,6,2,2);
    Vehicle truck1 = new Vehicle("Ka40m8500", "red", "truck");
    Vehicle truck2 = new Vehicle("Ka40m8501", "red", "truck");
    Vehicle truck3 = new Vehicle("Ka40m8502", "red", "truck");
    Vehicle truck4 = new Vehicle("Ka40m8503", "red", "truck");
//    Vehicle truck2 = new Vehicle("Ka40m8501", "red", "truck");

    @Test
    public void testingForNextTruckFloor(){
        Assertions.assertEquals(1,parkingLot.parkVehicleInLot(truck1).get("floor"));
        Assertions.assertEquals(1,parkingLot.parkVehicleInLot(truck2).get("floor"));
        Assertions.assertEquals(-1,parkingLot.parkVehicleInLot(truck3).get("floor"));
    }

    @Test
    public void testingForNextTruckSlot(){
        Assertions.assertEquals(1,parkingLot.parkVehicleInLot(truck1).get("slotId"));
        Assertions.assertEquals(2,parkingLot.parkVehicleInLot(truck2).get("slotId"));
        Assertions.assertEquals(-1,parkingLot.parkVehicleInLot(truck3).get("slotId"));
    }
    @Test
    public void testingForUnParking(){
        parkingLot.parkVehicleInLot(truck1);
        Assertions.assertTrue(parkingLot.unParkVehicleInLot(1,1));
    }



}