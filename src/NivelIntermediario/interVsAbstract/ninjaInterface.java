package NivelIntermediario.interVsAbstract;

public interface ninjaInterface {


    //Principais diferencas entre interfaces e classes abstratas
    //Toda variavel criada dentro de uma interface, precisa obrigatoriamente de ser setada e esse valor nao pode ser alterado.
    //Ja nas variaveis criadas
    boolean usaChakra = true;

    //Todo método criado dentro de uma interface é obrigatoriamente um método abstrato. Logo, quem implementar a interface precisa instanciar o método.
    public void jogarShuriken();
}
