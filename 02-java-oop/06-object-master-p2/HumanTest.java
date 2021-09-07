public class HumanTest {
    public static void main(String[] args) {
        Ninja sneaky = new Ninja("Mr Sneaks alot");
        Wizard wizzy = new Wizard("Wizzy");
        Samurai jiraiya = new Samurai("Jiraiya");
        Samurai shredder = new Samurai("Shredder");

        sneaky.attack(jiraiya);
        sneaky.attack(jiraiya);
        sneaky.attack(jiraiya);
        wizzy.heal(jiraiya);
        wizzy.fireball(sneaky);
        sneaky.stealHealth(wizzy);
        sneaky.runAway();
        sneaky.stealHealth(jiraiya);
        sneaky.stealHealth(jiraiya);
        sneaky.stealHealth(jiraiya);
        jiraiya.deathBlow(sneaky);
        jiraiya.meditate();
        System.out.println("There are " + Samurai.howMany() + " samurai created.");
    }

}
