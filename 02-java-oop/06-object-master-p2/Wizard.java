public class Wizard extends Human {

    public Wizard() {
        this.setName("Default Wizard");
        this.health = 50;
        this.intelligence = 8;
    }

    public Wizard(String name) {
        super(name);
        this.health = 50;
        this.intelligence = 8;
    }

    public void displayHealth() {
        System.out.println("Your Wizard " + getName() + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Wizard, " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }

    public void heal(Human human) {
        human.health += this.intelligence;
        System.out.println(this.name + " casts heal on " + human.name + ".  Healing him for " + this.intelligence
                + " points of health.");
        System.out.println(human.name + " is now at " + human.getHealth() + " health");

    }

    public void fireball(Human human) {
        human.health -= this.intelligence * 3;
        System.out.println(this.name + " casts fireball at " + human.name + ".  It hits and explodes");
        System.out.println(human.name + " Has taken explosive fire damage from " + this.name + " He is now at "
                + human.getHealth() + " Health. ");
    }
}
