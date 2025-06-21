public class TransportOfficer extends User {
    public TransportOfficer(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " approved a transport request.");
    }
}