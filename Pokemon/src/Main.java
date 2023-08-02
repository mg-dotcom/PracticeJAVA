public class Main {
    public static void main(String[] args) {
        Pokemon pk1 = new Pokemon("Charizzard", "fire");
        Pokemon pk2 = new Pokemon("Pikachu", "Thunder");
        Pokemon pk3 = new Pokemon("Mew", "Psychic");
        Pokemon outer1 = new Pokemon("Squrtle", "Water");
        System.out.println();

        PokemonTrainer pt1 = new PokemonTrainer("MG", 3);
        pt1.addPokemon(pk1);
        pt1.addPokemon(pk2);
        pt1.addPokemon(pk3);
        System.out.println();
        pt1.showYourParty();
        System.out.println();
        pt1.letThemFight(1,outer1);
    }
}