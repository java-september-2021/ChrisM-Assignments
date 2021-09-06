public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human("Caveman");
        Human human2 = new Human("Manchild");
        Ninja ninja1 = new Ninja("Mr Sneaky");
        Samurai samurai1 = new Samurai("Master Jiraiya");
        Wizard wizard1 = new Wizard();

        human1.displayHealth();
        human2.displayHealth();
        human1.attack(human2);
        human2.displayHealth();
        ninja1.displayHealth();
        human1.displayStats();
        ninja1.displayStats();
        ninja1.attack(human1);
        ninja1.attack(human1);
        ninja1.attack(human1);
        ninja1.attack(human1);
        samurai1.displayStats();
        wizard1.displayStats();
        wizard1.attack(ninja1);
        samurai1.attack(wizard1);
    }

}
