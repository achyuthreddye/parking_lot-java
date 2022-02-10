public class Main {
    public static void main(String[] args) {
        ParkingFloor parkingFloor = new ParkingFloor(6,2,2);

        for (int i = 0; i < parkingFloor.getParkingFloor().length; i++) {
            System.out.println(parkingFloor.getParkingSlot(i).getSlotType());
        }
        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("truck"));
        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("bike"));
        System.out.println(parkingFloor.getAllFreeSlotCountInFloor().get("car"));
    }
}
