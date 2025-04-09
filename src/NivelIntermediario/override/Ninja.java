package NivelIntermediario.override;

public class Ninja implements EstrategiaDeBatalha{
    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private NivelNinja rank;
    private double altura = 2.10;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public double getAltura() {
        return altura;
    }
//TODO: incluir 2 novos atributos, missão concluida e rank

    public Ninja(){}

    public Ninja(String nome, String aldeia, int idade){
        this.nome=nome;
        this.aldeia=aldeia;
        this.idade=idade;

    }

    //Sobrecarga do construtor, não precisa redeclarar o construtor, só os novos atributos.
    // final pode ser usado para classe,metodos,atributos, funcoes e outros tipos de dados.
    public Ninja(String nome, String aldeia, int idade,int numeroDeMissoesConcluidas,NivelNinja rank){
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank=rank;
    }

    //Ao usar a palavra final, a gente consegue proteger o metodo nao deixando ele ser sobrescrito
//   final void tacarKunai(){
//        System.out.println("Eu sou um metodo da classe mãe");
//    }
    public void tacarKunai(){
        System.out.println("Eu sou um metodo da classe mãe");
    }


    //Sobre carga de metodo inteligencia de combate

    public void inteligenciaDeCombate(){
        System.out.println("Meu nome eh: "+this.nome+"Eu nao tenho qi");
    }

        
    @Override
    public void inteligenciaDeCombate(int qi){
        System.out.println("Meu nome eh: "+this.nome+"Essa eh minha inteligencia de combate: "+qi);
    }

    @Override
    public String toString(){
        return "Meu nome eh: "+nome+" eu tenho "+ idade +" anos e sou da aldeia :" +aldeia;
    }


}
