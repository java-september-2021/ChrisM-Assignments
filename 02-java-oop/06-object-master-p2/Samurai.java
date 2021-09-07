public class Samurai extends Human {
    int defaultHealth = 200;
    private static int numberOfSamurai = 0;

    public Samurai() {
        this.setName("Default Samurai");
        this.health = defaultHealth;
        numberOfSamurai++;
    }

    public Samurai(String name) {
        super(name);
        this.health = 200;
        numberOfSamurai++;
    }

    public void displayHealth() {
        System.out.println("Your Samurai " + getName() + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Samurai, " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }

    public static int howMany() {
        return numberOfSamurai;
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.name + " Attacks with lightning speed at " + human.name + " using his katana!");
        System.out.println(human.name + " Has taken slicing damage from " + this.name + " He is now at "
                + human.getHealth() + " Health. ");
    }

    public void deathBlow(Human human) {
        this.health /= 2;
        int preHealth = human.health;
        human.health -= human.health;
        System.out.println(
                this.name + " uses deathblow on " + human.name + " dealing devastating damage wounding him gravely!");
        System.out.println(human.name + " takes " + preHealth + " damage.  He is now at " + human.health
                + " health, and is no longer with us.");
        System.out.println(
                this.name + " also loses half his health from the sheer force put in to the blow.  Putting him at "
                        + this.health);
    }

    public void meditate() {
        System.out.println(this.name + " uses meditate to heal half his lost health back.");
        int healthRegain = (defaultHealth - this.health) / 2;

        this.health += healthRegain;
        System.err
                .println(this.name + " regains " + healthRegain + " health.  He is now at " + this.health + " health.");
    }
}
