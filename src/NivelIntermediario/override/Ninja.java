package NivelIntermediario.override;

public class Ninja implements EstrategiaDeBatalha{
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

    //Sobre carga de metodo inteligencia de combate

    public void inteligenciaDeCombate(){
        System.out.println("Meu nome eh: "+this.nome+"Eu nao tenho qi");
    }

    public void inteligenciaDeCombate(int qi){
        System.out.println("Meu nome eh: "+this.nome+"Essa eh minha inteligencia de combate: "+qi);
    }

}
