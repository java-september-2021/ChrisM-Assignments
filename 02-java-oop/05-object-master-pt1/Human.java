public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    protected String name;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
        this.name = "Default Humie";
    }

    public Human(String name) {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getStealth() {
        return this.stealth;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.name + " Attacks " + human.name + " with a vicious blow!");
        System.out.println(human.name + " Has taken damage from " + this.name + " He is now at " + human.getHealth()
                + " Health. ");
    }

    public void displayHealth() {
        System.out.println("Your Human " + this.name + " is at " + getHealth() + " health.");
    }

    public void displayStats() {
        System.out.println("Your Human " + getName() + " stats are as follows \nStrenght :  " + getStrength()
                + "\nStealth : " + getStealth() + "\nIntelligence : " + getIntelligence());
    }
}
