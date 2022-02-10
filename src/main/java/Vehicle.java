public class Vehicle {
    private String vehicleNumber;
    private  String vehicleColor;
    private String vehicleType;

    public Vehicle(String vehicleNumber,String vehicleColor,String vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
        this.vehicleType = vehicleType;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
