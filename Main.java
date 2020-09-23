
package pokemonac1;


 
public class Main {

    
    public static void main(String[] args) {
       
        Pokemon pokemon  = new Pokemon ("Charmander", "Fogo", 10 );
        Pokemon OutroPokemon  = new Pokemon ("Bulbasaur", "Agua", 15 );
        Batalha batalha  = new Batalha();
        pokemon.print();
        OutroPokemon.print();
        batalha.vencedor();
    } 
    
}
