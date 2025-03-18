package NivelIntermediario.interVsAbstract;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";

        Naruto.nomeNinja();
        //Classes abstratas protegem uma classe que nao queremos que seja criada por terceiros e ao mesmo tempo facilita a MANUTENÇÃO e a PADRONIZAÇÃO
        Uchiha Sasuke = new Uchiha("Sasuke", "Folha", 13, "Fogo");
        Sasuke.jogarShuriken();

    }

}
