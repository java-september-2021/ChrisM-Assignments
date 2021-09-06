public class Wizard extends Human {

    public Wizard() {
        this.setName("Default Wizard");
    }

    public Wizard(String name) {
        super(name);
    }

    public void displayHealth() {
        System.out.println("Your Wizard " + getName() + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Wizard, " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.name + " casts a magic missle at " + human.name + ".  It hits and explodes");
        System.out.println(human.name + " Has taken explosive damage from " + this.name + " He is now at "
                + human.getHealth() + " Health. ");
    }
}
