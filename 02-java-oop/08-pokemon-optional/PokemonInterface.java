public interface PokemonInterface {

    Pokemon createPokemon(String name, String type, int health);

    String pokemonInfo(Pokemon pokemon);

    void listPokemon();
}