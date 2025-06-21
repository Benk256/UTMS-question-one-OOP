public class TransportManager {
    public void assignDriver(String vehicleType) {
        System.out.println("Driver assigned to vehicle type: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Driver assigned to " + vehicleType + " for shift: " + shiftTime);
    }
}