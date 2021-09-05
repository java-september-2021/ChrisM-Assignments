public class BigBat extends Mammal {

    public BigBat() {
        setEnergyLevel(300);
    }

    public void fly() {
        int energy = -50;
        System.out.println("Swoosh! The bat takes off and soars into the air. Expend " + " energy.");
        changeEnergyLevel(energy);
    }

    public void eatHumans() {
        int energy = 25;
        System.out.println("Crunch, crunch, Humans are juicy! Gain " + energy + " energy.");
        changeEnergyLevel(energy);
    }

    public void attackTown() {
        int energy = 100;
        System.out.println("CRASH, BANG, CRACKLE AND BURN!  This roof is on fire!!! Expend " + energy + " energy.");
        changeEnergyLevel(energy);
    }
}
