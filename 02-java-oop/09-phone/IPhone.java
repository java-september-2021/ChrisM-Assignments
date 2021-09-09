public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercent, String carrier, String ringTone) {
        super(versionNumber, batteryPercent, carrier, ringTone);
    }

    @Override
    public String ring() {

        return "IPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    }

    @Override
    public String unlock() {
        return "IPhone" + this.getVersionNumber() + " Unlocking via facial recognition";
    }

    @Override
    public void displayInfo() {
        System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }

}