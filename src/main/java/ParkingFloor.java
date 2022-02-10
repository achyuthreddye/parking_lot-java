import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {
    private int totalNoOfSlots;
    private int noOfTrucks;
    private int noOfBikes;
    Slot[] parkingFloor;



    public  ParkingFloor(int totalNoOfSlots, int noOfTrucks, int noOfBikes){
        this.totalNoOfSlots = totalNoOfSlots;
        this.noOfTrucks = noOfTrucks;
        this.noOfBikes = noOfBikes;
        parkingFloor = new Slot[totalNoOfSlots];

        for (int i = 0; i < noOfTrucks; i++) {
            this.parkingFloor[i] = new Slot(i+1, "truck");
        }
        for (int i = noOfTrucks; i < noOfBikes+noOfTrucks; i++) {
            this.parkingFloor[i] = new Slot(i+1, "bike");
        }
        for (int i = noOfBikes+noOfTrucks; i < totalNoOfSlots; i++) {
            this.parkingFloor[i] = new Slot(i+1, "car");
        }
    }

    public Slot[] getParkingFloor() {
        return parkingFloor;
    }
    public Slot getParkingSlot(int slotId){
        return parkingFloor[slotId];
    }
    public int getNearestSlotInFloor(String vehicleType){
        int freeSlotInFloor= -1;
        for (int i = 0; i < this.totalNoOfSlots; i++) {
            if((parkingFloor[i].getSlotType() == vehicleType) && !parkingFloor[i].isParked()){
                freeSlotInFloor = parkingFloor[i].getSlotId();
                break;
            }
        }
        return freeSlotInFloor;
    }

    public Map<String, Integer> getAllFreeSlotCountInFloor(){
        Map<String, Integer> freeParkingSlotCount=new HashMap();

        for (int i = 0; i < this.totalNoOfSlots; i++) {
            if (parkingFloor[i].getSlotType() == "truck" && !parkingFloor[i].isParked()){
                freeParkingSlotCount.put("truck", freeParkingSlotCount.getOrDefault("truck",0) + 1);
            }
            if (parkingFloor[i].getSlotType() == "bike" && !parkingFloor[i].isParked()){
                freeParkingSlotCount.put("bike", freeParkingSlotCount.getOrDefault("bike",0) + 1);
            }
            if (parkingFloor[i].getSlotType() == "car" && !parkingFloor[i].isParked()){
                freeParkingSlotCount.put("car", freeParkingSlotCount.getOrDefault("car",0) + 1);
            }
        }
        return freeParkingSlotCount;
    }
//    public Map<String, String[]> getAllFreeSlotsInFloor(){
//        Map<String, String[]> freeParkingSlots=new HashMap();
//
//        for (int i = 0; i < this.totalNoOfSlots; i++) {
//            if (parkingFloor[i].getSlotType() == "truck"){
//                freeParkingSlots.put("truck", freeParkingSlots.getOrDefault("truck",0) + 1);
//            }
//            if (parkingFloor[i].getSlotType() == "bike"){
//                freeParkingSlots.put("bike", freeParkingSlots.getOrDefault("bike",0) + 1);
//            }
//            if (parkingFloor[i].getSlotType() == "car"){
//                freeParkingSlots.put("car", freeParkingSlots.getOrDefault("car",0) + 1);
//            }
//        }
//        return freeParkingSlots;
//    }

}
