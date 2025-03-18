package NivelIntermediario.interVsAbstract;

public class Uchiha extends Ninja {

    public void jogarShuriken(){
        System.out.println("Joguei uma shuriken");
    }
    public void estrategiaNinja(){
        System.out.println("Uso o sharingan");
    };
    public void tipodeChakra(){
        System.out.println("Meu tipo eh fogo");
    }

    public Uchiha(String nome, String aldeia, int idade, String chakra){
        super(nome,aldeia,idade,chakra);
    }



}
