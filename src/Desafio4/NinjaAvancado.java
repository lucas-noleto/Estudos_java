package Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;



    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("Sou um ninja avançado.");
    }

    public NinjaAvancado(){}
    public NinjaAvancado(String nome, int idade,String especialidade, habilidade habilidade){
        this.nome = nome;
        this.idade = idade;
        this.especialidade= especialidade;
        this.habilidade = habilidade;


    }

}
