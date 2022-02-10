import java.util.ArrayList;
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
        this.parkingFloor = new Slot[totalNoOfSlots];

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
        return this.parkingFloor;
    }
    public Slot getParkingSlot(int slotId){
        return this.parkingFloor[slotId];
    }

    public Map parkVehicleinParkingFloor(Vehicle vehicleToBeParked){
        int nextNearestSlot = getNearestSlotInFloor(vehicleToBeParked.getVehicleType());
        System.out.println("nextNearestSlot   " +nextNearestSlot );

        Map parkingStatus = new HashMap();
        parkingStatus.put("status", false);
        parkingStatus.put("slotId", -1);

        if( nextNearestSlot == -1){
            System.out.println("No available parking slots");
            return parkingStatus;
        }
        this.parkingFloor[nextNearestSlot - 1].allotSlot(vehicleToBeParked);
        parkingStatus.put("status", true);
        parkingStatus.put("slotId", nextNearestSlot);
        return parkingStatus;
    }

    public  void unParkVehicleinParkingFloor(int slotId){

        if(!this.parkingFloor[slotId - 1].isParked()){
            System.out.println("No Vehicle is parked in here");
            return;
        }
        this.parkingFloor[slotId - 1].unallotSlot();
        return;
    }

    public int getNearestSlotInFloor(String vehicleType){
        int freeSlotInFloor= -1;

        System.out.println(parkingFloor.toString()  +  this.parkingFloor);

        for (int i = 0; i < totalNoOfSlots; i++) {
            if((this.parkingFloor[i].getSlotType().toLowerCase() == vehicleType.toLowerCase()) && !this.parkingFloor[i].isParked()){
                freeSlotInFloor = this.parkingFloor[i].getSlotId();
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

    public Map<String, Integer> getAllOccupiedSlotCountInFloor(){
        Map<String, Integer> occupiedParkingSlotCount=new HashMap();
        occupiedParkingSlotCount.put("truck", 0);
        occupiedParkingSlotCount.put("bike", 0);
        occupiedParkingSlotCount.put("car", 0);

        for (int i = 0; i < this.totalNoOfSlots; i++) {
            if (parkingFloor[i].getSlotType() == "truck" && parkingFloor[i].isParked()){
                occupiedParkingSlotCount.put("truck", occupiedParkingSlotCount.put("truck",occupiedParkingSlotCount.get("truck") + 1) );
            }
            if (parkingFloor[i].getSlotType() == "bike" && parkingFloor[i].isParked()){
                occupiedParkingSlotCount.put("bike", occupiedParkingSlotCount.put("bike",occupiedParkingSlotCount.get("bike") + 1) );
            }
            if (parkingFloor[i].getSlotType() == "car" && parkingFloor[i].isParked()){
                occupiedParkingSlotCount.put("car", occupiedParkingSlotCount.put("car",occupiedParkingSlotCount.get("car") + 1) );
            }
        }
        return occupiedParkingSlotCount;
    }

    public Map<String, ArrayList<String>> getAllFreeSlotsInFloor(){
        Map<String, ArrayList<String>> freeParkingSlots=new HashMap();
        ArrayList<String> freeTruckSlots = new ArrayList<String> ();
        ArrayList<String> freeBikeSlots = new ArrayList<String> ();
        ArrayList<String> freeCarSlots = new ArrayList<String> ();

        for (int i = 0; i < this.totalNoOfSlots; i++) {

            if (parkingFloor[i].getSlotType() == "truck" && !parkingFloor[i].isParked()){
                freeTruckSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                freeParkingSlots.put("truck", freeTruckSlots);
            }

            if (parkingFloor[i].getSlotType() == "bike" && !parkingFloor[i].isParked()){
                freeBikeSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                freeParkingSlots.put("bike", freeBikeSlots);
            }

            if (parkingFloor[i].getSlotType() == "car" && !parkingFloor[i].isParked()){
                freeCarSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                freeParkingSlots.put("car", freeCarSlots);
            }
        }
        return freeParkingSlots;
    }

    public Map<String, ArrayList<String>> getAllOccupiedSlotsInFloor(){
        Map<String, ArrayList<String>> occupiedParkingSlots=new HashMap();
        ArrayList<String> occupiedTruckSlots = new ArrayList<String> ();
        ArrayList<String> occupiedBikeSlots = new ArrayList<String> ();
        ArrayList<String> occupiedCarSlots = new ArrayList<String> ();

        for (int i = 0; i < this.totalNoOfSlots; i++) {

            if (parkingFloor[i].getSlotType() == "truck" && parkingFloor[i].isParked()){
                occupiedTruckSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                occupiedParkingSlots.put("truck", occupiedTruckSlots);
            }

            if (parkingFloor[i].getSlotType() == "bike" && parkingFloor[i].isParked()){
                occupiedBikeSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                occupiedParkingSlots.put("bike", occupiedBikeSlots);
            }

            if (parkingFloor[i].getSlotType() == "car" && parkingFloor[i].isParked()){
                occupiedCarSlots.add(String.valueOf(parkingFloor[i].getSlotId()));
                occupiedParkingSlots.put("car", occupiedCarSlots);
            }
        }
        return occupiedParkingSlots;
    }

}
