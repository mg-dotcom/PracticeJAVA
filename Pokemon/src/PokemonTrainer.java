public class PokemonTrainer {
    private Pokemon[] pokemons;
    private String name;
    private int pokemonCount;

    public PokemonTrainer(String name,int maxBags){
        this.name = name;
        this.pokemons = new Pokemon[maxBags];
        this.pokemonCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void addPokemon(Pokemon pokemon){
        if(pokemonCount < pokemons.length){
            this.pokemons[pokemonCount]=pokemon;
            pokemonCount++;
            System.out.println("Ting!!!,Success! ,Add "+pokemon.getName()+" Complete");
        }else {
            System.out.println("Cannot add any more!!!,It's full.");
        }
    }

    public void showYourParty(){
        for(int i = 0; i < pokemonCount;i++){
            System.out.println((i+1) + ". " + pokemons[i].showStatus());
        }
    }

    public void letThemFight(int who,Pokemon outer){
        for(int i = 0; i < pokemons.length;i++){
            if(this.pokemons[who-1].equals(pokemons[i])){
                if(pokemons[i].getLevel() > outer.getLevel()){
                    System.out.println(pokemons[i].getName() +" "+pokemons[i].getLevel()
                                        +" VS "+outer.getName()+" "+outer.getLevel());
                    System.out.println("Congrats !!!, Pokemonเรา Win!!!");
                } else if(pokemons[i].getLevel() == outer.getLevel()){
                    System.out.println(pokemons[i].getName() +" "+pokemons[i].getLevel()
                            +" VS "+outer.getName()+" "+outer.getLevel());
                    System.out.println("Draw!!!");
                } else {
                    System.out.println(pokemons[i].getName() +" "+pokemons[i].getLevel()
                            +" VS "+outer.getName()+" "+outer.getLevel());
                    System.out.println("You Lose!!!,  Pokemonเขา Win!");
                }
            }

        }
    }

    private int random(){
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }
}
