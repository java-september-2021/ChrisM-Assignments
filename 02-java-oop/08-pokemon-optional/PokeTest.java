public class PokeTest {
    public static void main(String[] args) {
        // Pokemon testemon = new Pokemon();
        // Pokemon secondmon = new Pokemon();
        AbstractPokemon.createPokemon("Slimy", "Slime Type", 200);
        Pokemon.getPokeCount();
        testemon.setName("Trylyon");
        secondmon.setName("Sir Second");

        testemon.attackPokemon(secondmon);
        System.out.println(secondmon.getHealth());
    }

}