package NivelIntermediario;

public class ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um metodo publico personalizado
    //Metodo void nao retorna nada


    //Metodo String precisa retornar uma string
    public String retornoVila(){
        return this.aldeia;
    }

    //Metodo int precisa retornar uma string
    public int anosParaHokage(int idadeMinima){
        return idadeMinima - this.idade;
    }
}
