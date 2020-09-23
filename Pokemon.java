
package pokemonac1;


public class Pokemon {
    
    public String Nome;
    public String Tipo;
    public int Level;
    public int Ataque;        
    public int Defesa;
    public int Vida;
   
    public Pokemon (String nome, String tipo, int level){
        this.Nome = nome;
        this.Tipo = tipo;
        this.Level = level;
        valores();
    }
    
      public void print() {
        System.out.println("NOME: " + Nome + "\n"
                + "TIPO: " + Tipo + "\n"
                + "LEVEL: " + Level + "\n"
                + "DEFESA: " + Defesa + "\n"
                + "VIDA: " + Vida + "\n"
                + "ATAQUE: " + Ataque + "\n" +
                "______________________"
       
        );}
    
   
     public void valores() {
        switch (Tipo) {
            case ("Fogo"):
                this.Vida = 200 - 20;
                this.Defesa = 30;
                this.Ataque = 20;
                break;
           
            case ("Agua"):
                this.Vida = 200 - 10;
                this.Defesa = 20;
                this.Ataque = 40;
                break;     
        }  
      
     }
}
