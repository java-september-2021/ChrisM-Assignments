public class Ninja extends Human {

    public Ninja() {
        this.setName("Default Ninja");
        this.stealth = 10;
    }

    public Ninja(String name) {
        super(name);
        this.stealth = 10;
    }

    public void displayHealth() {
        System.out.println("Your Ninja " + getName() + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Ninja, " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.name + " Attacks " + human.name + " using his katana!");
        System.out.println(human.name + " Has taken slicing damage from " + this.name + " He is now at "
                + human.getHealth() + " Health. ");
    }

    public void stealHealth(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(this.name + " uses his uber leet ninja skills to take " + this.stealth + " health from "
                + human.name + " and uses the dark arts to heal himself with the stolen health");
        System.out.println(this.name + " is now at " + this.health + " health. " + human.name + " is now at "
                + human.health + " health");
    }

    public void runAway() {
        this.health -= 10;
        System.out.println(this.name + " pops ninja smoke and disappears into the night taking 10 damage");
        System.out.println(this.name + " is now at " + this.health + " health.");
    }

}
