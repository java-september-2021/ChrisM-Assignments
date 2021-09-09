public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercent, String carrier, String ringTone) {
        super(versionNumber, batteryPercent, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "Galaxy " + this.getVersionNumber() + " Says " + this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Galaxy " + this.getVersionNumber() + " Unlocking via fingerprint";
    }

    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
    }

}