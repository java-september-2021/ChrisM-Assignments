public class Gorilla extends Mammal {

    public void throwSomething() {
        int energyReduce = -5;
        System.out.println("The gorilla throws a rock at you! His energy is reduced by " + energyReduce * -1);
        changeEnergyLevel(energyReduce);
    }

    public void eatBananas() {
        int energyChange = 10;
        System.out.println("The gorilla eats a banana, and looks satisfied. He gains " + energyChange + " energy.");
        changeEnergyLevel(energyChange);
    }

    public void climb() {
        int energyChange = -10;
        System.out.println("The gorilla starts climbing the walls.  He expends " + energyChange * -1 + " energy.");
        changeEnergyLevel(energyChange);
    }
}