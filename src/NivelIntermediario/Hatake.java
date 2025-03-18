package NivelIntermediario;

public class Hatake extends ninja implements Sharingan, Anbu{
    public void boasVindas(){
        System.out.println(nome  + " eu sou um Hatake");
    }

    public Hatake(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    public void ativarSharingan(){
        System.out.println(nome + ": ativou o Sharingan!");
    }

    public void bemvindoAnbu(){
        System.out.println("Sou da Anbu");
    }

}
