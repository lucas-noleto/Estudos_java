package NivelIntermediario.override;

public class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    //TODO: incluir 2 novos atrivutos, missão concluida e rank

    public Ninja(){}

    public Ninja(String nome, String aldeia, int idade){
        this.nome=nome;
        this.aldeia=aldeia;
        this.idade=idade;

    }

    //Sobrecarga do construtor, não precisa redeclarar o construtor, só os novos atributos.
    public Ninja(String nome, String aldeia, int idade,int numeroDeMissoesConcluidas,NivelNinja rank){
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank=rank;
    }

}
