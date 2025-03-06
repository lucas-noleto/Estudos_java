package NivelIntermediario.contrutores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor vazio
    public Hokage(){};

    public Hokage (int idade){
        this.idade=idade;
    }

    public Hokage(String nome){
        this.nome = nome;

    }

    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVivoOuNao(boolean vivoOuNao) {
        this.vivoOuNao = vivoOuNao;
    }


    //Construindo os construtores com ctrl shift A
    public Hokage(String nome, boolean vivoOuNao, int idade) {
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
        this.idade = idade;
    }
}
