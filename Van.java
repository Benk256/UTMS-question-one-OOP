public class Van extends Vehicle implements Schedulable {
    public Van(String plateNumber, String model) {
        super(plateNumber, model);
    }

    @Override
    public void schedule() {
        System.out.println("Van " + getPlateNumber() + " scheduled for morning trip.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Van Model: " + getModel());
    }
}