public class Bus extends Vehicle implements Schedulable, Trackable {
    public Bus(String plateNumber, String model) {
        super(plateNumber, model);
    }

    @Override
    public void schedule() {
        System.out.println("Bus " + getPlateNumber() + " scheduled for the afternoon trip.");
    }

    @Override
    public void track() {
        System.out.println("Tracking Bus: " + getPlateNumber());
    }

    @Override
    public void displayInfo() {
        System.out.println("Bus Model: " + getModel());
    }
}