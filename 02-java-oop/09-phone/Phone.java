public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public abstract void displayInfo();

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String version) {
        this.versionNumber = version;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercent) {
        this.batteryPercentage = batteryPercent;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getRingTone() {
        return this.ringTone;
    }

    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }

}