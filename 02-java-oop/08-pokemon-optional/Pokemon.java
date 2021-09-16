public class Pokemon {
    private String name, type;
    private int health;
    private static int pokeCount = 0;

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        pokeCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getPokeCount() {
        return pokeCount;
    }

    // a basic pokemon attack. may want to override
    // for differing damage
    public void attackPokemon(Pokemon pokemon) {
        int damage = 10;
        System.out
                .println(this.name + " attacks " + pokemon.name + " dealing " + damage + " points of physical damage");
        pokemon.setHealth(damage);
    }

}