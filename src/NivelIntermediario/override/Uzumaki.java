package NivelIntermediario.override;

public class Uzumaki extends Ninja{
    Biju Biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }


    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank,Biju Biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.Biju=Biju;
    }
    @Override
    public void tacarKunai() {
        System.out.println("Estou chamando a funcao de uma classe filha");
    }
}
