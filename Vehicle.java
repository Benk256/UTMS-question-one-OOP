public abstract class Vehicle {
    private String plateNumber;
    private String model;

    public Vehicle(String plateNumber, String model) {
        this.plateNumber = plateNumber;
        this.model = model;
    }

    public String getPlateNumber() { return plateNumber; }
    public String getModel() { return model; }

    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }
    public void setModel(String model) { this.model = model; }

    public abstract void displayInfo();
}