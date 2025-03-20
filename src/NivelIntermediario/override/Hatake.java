package NivelIntermediario.override;

public class Hatake extends Ninja{

    public Hatake(){
        super();
    }

    public Hatake(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade,int numeroDeMissoesConcluidas, NivelNinja rank ){

        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }
}
