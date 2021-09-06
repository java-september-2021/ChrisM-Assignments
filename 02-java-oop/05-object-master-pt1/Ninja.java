public class Ninja extends Human {

    public Ninja() {
        this.setName("Default Ninja");
    }

    public Ninja(String name) {
        super(name);
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

}
