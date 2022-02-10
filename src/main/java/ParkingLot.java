import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    private ParkingFloor[] parkingLot;
    private int noOfFloors;
    private  int noOfSlotsOnEachFloor;
    private int noOfTrucks;
    private int noOfBikes;


    public ParkingLot(int noOfFloors,int noOfSlotsOnEachFloor,int noOfTrucks ,int noOfBikes) {
        this.noOfFloors = noOfFloors;
        this.noOfSlotsOnEachFloor = noOfSlotsOnEachFloor;
        this.noOfBikes = noOfBikes;
        this.noOfTrucks = noOfTrucks;
        this.parkingLot = new ParkingFloor[this.noOfFloors];

        for (int i = 0; i < this.noOfFloors ; i++) {
            this.parkingLot[i] = new ParkingFloor(this.noOfSlotsOnEachFloor, this.noOfTrucks, this.noOfBikes);
        }
    }

    public Map parkVehicleInLot(Vehicle vehicle){
        Map parkingStatus = new HashMap();
        parkingStatus.put("floor", -1);
        parkingStatus.put("slotId", -1);
        int slotId = -1;

        for (int i = 0; i < this.noOfFloors; i++) {
            int slotIdInEachFloor = this.parkingLot[i].getNearestSlotInFloor(vehicle.getVehicleType());
            if(slotIdInEachFloor != -1){
                this.parkingLot[i].parkVehicleinParkingFloor(vehicle);
                parkingStatus.put("floor", i);
                parkingStatus.put("slotId", slotIdInEachFloor);
                slotId = slotIdInEachFloor;
            }
        }
        return  parkingStatus;
    }
    public boolean unParkVehicleInLot(int floorNo, int slotId){
        boolean unParkStatus = false;

        if (this.parkingLot[floorNo].getParkingSlot(slotId).isParked()){
            System.out.println("Coming in here");
            this.parkingLot[floorNo].unParkVehicleinParkingFloor(slotId);
            unParkStatus = true;
        }
       return  unParkStatus;
    }




}
