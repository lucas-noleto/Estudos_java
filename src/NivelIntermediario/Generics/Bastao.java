
package NivelIntermediario.Generics;


public class Bastao {

    private String nome;

    public Bastao(String nome){
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
        return nome;
    }

}

