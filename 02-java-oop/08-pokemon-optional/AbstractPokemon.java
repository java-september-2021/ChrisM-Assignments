public abstract class AbstractPokemon implements PokemonInterface {

    public Pokemon createPokemon(String name, String type, int health) {
        Pokemon p = new Pokemon(name, type, health);
        return p;
    }
}