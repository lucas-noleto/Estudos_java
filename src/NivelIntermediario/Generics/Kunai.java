package NivelIntermediario.Generics;

public class Kunai {

    private String nome;

    public Kunai(String nome){
        this.nome= nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "Kunai :"+nome;
    }

}
