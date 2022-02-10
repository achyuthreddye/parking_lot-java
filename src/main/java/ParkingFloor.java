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
//        if(ve)
        return 5;

    }
}
