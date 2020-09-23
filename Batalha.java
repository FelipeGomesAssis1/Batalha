package pokemonac1;

public class Batalha {

    public int hpPokemon1 = 200 - 20;
    public int hpPokemon2 = 200 - 10;
    public String nomePokemon1 = "Charmander";
    public String nomePokemon2 = "Bulbasaur";

    public void vencedor() {
        if (hpPokemon1 > hpPokemon2) {
            System.out.println("VENCEDOR = " + nomePokemon1 +  " |  VIDA " + hpPokemon1);
        } else {
            System.out.println("VENCEDOR = " + nomePokemon2 +  " |  VIDA " + hpPokemon2);
        }

    }

}
