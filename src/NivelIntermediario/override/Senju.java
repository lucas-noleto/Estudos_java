package NivelIntermediario.override;

public class Senju extends Ninja{

    private String nome;

    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome){

        this.nome=nome;

    }

    public Senju(String nome) {
        this.nome = nome;
    }

    public Senju(String nome, String aldeia, int idade, String nome1) {
        super(nome, aldeia, idade);
        this.nome = nome1;
    }

    public Senju(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, String nome1) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.nome = nome1;
    }
}
