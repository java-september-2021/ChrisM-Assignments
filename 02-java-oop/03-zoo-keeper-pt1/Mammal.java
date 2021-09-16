public class Mammal {
    private int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public void setEnergyLevel(int energy) {
        this.energyLevel = energy;
    }

    public void changeEnergyLevel(int energy) {
        this.energyLevel += energy;
    }

    public void displayEnergy() {
        System.out.println(this.energyLevel);
    }

}