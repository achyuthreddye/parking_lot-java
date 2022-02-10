public class Slot {
    private Vehicle vehicle;
    private boolean isParked = false;
    private int slotId;
    private String slotType;

    public Slot(int slotId, String slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getSlotType() {
        return slotType;
    }

    public boolean isParked() {
        return isParked;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void allotSlot(Vehicle vehicleTobeParked){
        this.isParked = true;
        this.vehicle = vehicleTobeParked;
    }

    public  void unallotSlot(){
        this.isParked = false;
        this.vehicle = null;
    }
}
