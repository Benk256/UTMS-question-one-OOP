public class Main {
    public static void main(String[] args) {
        User student = new Student("Alice", "S1001");
        User lecturer = new Lecturer("Dr. John", "L2002");
        User officer = new TransportOfficer("Officer Mike", "TO3003");

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        Vehicle bus = new Bus("UBB123T", "Isuzu");
        Vehicle van = new Van("UBC456Z", "Toyota");

        bus.displayInfo();
        ((Schedulable)bus).schedule();
        ((Trackable)bus).track();

        van.displayInfo();
        ((Schedulable)van).schedule();

        TransportManager manager = new TransportManager();
        manager.assignDriver("Van");
        manager.assignDriver("Bus", "Morning");
    }
}