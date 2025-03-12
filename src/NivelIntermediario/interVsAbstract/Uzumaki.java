package NivelIntermediario.interVsAbstract;

public class Uzumaki extends Ninja{
    String estrategia = "Rasengan";
    public Uzumaki(String nome){
        this.nome = nome;

    }

    public void estrategiaNinja(){
        System.out.println("Minha estrategia eh: " + this.estrategia);
    }


}


