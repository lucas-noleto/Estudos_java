package NivelIntermediario.interVsAbstract;

public class Uzumaki extends Ninja{
    String estrategia = "Rasengan";


    public Uzumaki(){
        super();
    }
    public Uzumaki(String nome, String aldeia, int idade, String chakra){
        super(nome,aldeia,idade,chakra);
    }


    public void estrategiaNinja(){
        System.out.println("Minha estrategia eh: " + this.estrategia);
    }
    public void tipodeChakra(){
        System.out.println("Meu tipo de chackra eh vento!");
    }

}


