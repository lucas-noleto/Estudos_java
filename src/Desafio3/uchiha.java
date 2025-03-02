package Desafio3;

public class uchiha extends ninja{
    String habilidadeEspecial  = "Sharingan.";

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("A habilidade especial do usuario é :" + habilidadeEspecial);
    }
}
