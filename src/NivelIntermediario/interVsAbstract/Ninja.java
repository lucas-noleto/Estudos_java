package NivelIntermediario.interVsAbstract;

public abstract class Ninja implements Mangekyo {

    String aldeia;
    String nome;
    int idade;
    String chakra;



    //Crio uma classe abstrata, mas ao mesmo tempo obrigo o usuario a definir esse metodo
    public void nomeNinja(){
        System.out.println("Meu nome eh: " + this.nome);
    };

    public abstract void estrategiaNinja();

    public void tipoChakra(String chakra){
        this.chakra = chakra;
    }

    public Ninja(){

    }

    public  Ninja(String nome,String aldeia,int idade,String chakra){
        this.nome=nome;
        this.aldeia=aldeia;
        this.idade=idade;
        this.chakra=chakra;
    }


}
