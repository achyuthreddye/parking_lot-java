public class Main {
    public static void main(String[] args) {
//        ParkingFloor parkingFloor = new ParkingFloor(6,2,2);

//        for (int i = 0; i < parkingFloor.getParkingFloor().length; i++) {
//            System.out.println(parkingFloor.getParkingSlot(i).getSlotType());
//        }
//        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("truck"));
//        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("bike"));
//        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("car"));
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

        Vehicle truck1 = new Vehicle("Ka40m8500", "red", "truck");
        Vehicle truck2 = new Vehicle("Ka40m8501", "red", "truck");
//        Vehicle truck3 = new Vehicle("Ka40m8503", "red", "truck");

        ParkingLot parkingLot = new ParkingLot(2,6,2,2);

//        System.out.println(parkingLot);

//        for (int i = 0; i < 2; i++) {
        System.out.println( parkingLot.parkVehicleInLot(truck1));
        System.out.println(parkingLot.parkVehicleInLot(truck2));
//        System.out.println( parkingLot.parkVehicleInLot(truck2));

//        Vehicle bike1 = new Vehicle("Ka40m8501", "red", "bike");
//        Vehicle bike2 = new Vehicle("Ka40m8501", "red", "car");
//        Vehicle bike3 = new Vehicle("Ka40m8502", "red", "truck");
//        System.out.println(this.parkingFloor.parkVehicleinParkingFloor(truck1));

//        System.out.println("********* truck 1 *************");
////        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck1).get("status").toString()));
//        System.out.println( "slotId to truck 1 " +parkingFloor.parkVehicleinParkingFloor(truck1).get("slotId"));
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println("Occupied");
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

//        System.out.println("********* truck 2 *************");
////        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck2).get("status").toString()));
//        System.out.println( "slotId to truck 2 " +parkingFloor.parkVehicleinParkingFloor(truck2).get("slotId"));
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println("Occupied");
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

//        System.out.println("********* truck 3  should not park here*************");
////        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck3).get("status").toString()));
//        System.out.println( "slotId to truck 3 " +parkingFloor.parkVehicleinParkingFloor(truck3).get("slotId"));
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println("Occupied");
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

//        System.out.println("********* truck 2 *************");
////        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck2).get("status").toString()));
//        parkingFloor.unParkVehicleinParkingFloor(2);
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println("Occupied");
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

//        System.out.println("********* truck 3 should park here *************");
////        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck3).get("status").toString()));
//        System.out.println( "slotId to truck 3 " +parkingFloor.parkVehicleinParkingFloor(truck3).get("slotId"));
//        System.out.println(parkingFloor.getAllFreeSlotsInFloor());
//        System.out.println("Occupied");
//        System.out.println(parkingFloor.getAllOccupiedSlotsInFloor());

//        System.out.println(parkingFloor.parkVehicleinParkingFloor(truck2));
//        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck2).get("status").toString()));
//
//        System.out.println(parkingFloor.parkVehicleinParkingFloor(truck3));
//        System.out.println(Boolean.parseBoolean(parkingFloor.parkVehicleinParkingFloor(truck3).get("status").toString()));
//        parkingFloor.parkVehicleinParkingFloor(truck4);
//        parkingFloor.parkVehicleinParkingFloor(truck6);




//        for (int i = 0; i < parkingFloor.getParkingFloor().length; i++) {
//            System.out.println(parkingFloor.getParkingSlot(i).isParked());
////            if(parkingFloor.getParkingSlot(i).isParked())
////            System.out.println(parkingFloor.getParkingSlot(i).getVehicle().getVehicleNumber());
//        }
//        System.out.println("BREAK");
//        parkingFloor.unParkVehicleinParkingFloor(1);
//        parkingFloor.unParkVehicleinParkingFloor(5);
//        for (int i = 0; i < parkingFloor.getParkingFloor().length; i++) {
//            System.out.println(parkingFloor.getParkingSlot(i).isParked());
////            if(parkingFloor.getParkingSlot(i).isParked())
////            System.out.println(parkingFloor.getParkingSlot(i).getVehicle().getVehicleNumber());
//        }

//        ParkingLot parkingLot = new ParkingLot(2,6,2,2);
//
////        System.out.println(parkingLot);
//
////        for (int i = 0; i < 2; i++) {
//            System.out.println( parkingLot.parkVehicleInLot(truck1));
//            System.out.println(parkingLot[i].p );
//        }

    }
}
