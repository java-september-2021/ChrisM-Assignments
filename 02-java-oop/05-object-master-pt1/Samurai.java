public class Samurai extends Human {

    public Samurai() {
        this.setName("Default Samurai");
    }

    public Samurai(String name) {
        super(name);
    }

    public void displayHealth() {
        System.out.println("Your Samurai " + getName() + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Samurai, " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.name + " Attacks with lightning speed at " + human.name + " using his katana!");
        System.out.println(human.name + " Has taken slicing damage from " + this.name + " He is now at "
                + human.getHealth() + " Health. ");
    }
}
