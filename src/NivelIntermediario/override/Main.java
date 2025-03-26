package NivelIntermediario.override;

public class Main {
    public static void main(String[] args) {
        Hatake Kakashi = new Hatake("Kakashi  Hatake","Vila da folha", 21, 12, NivelNinja.KAGE );
        System.out.println(Kakashi.numeroDeMissoesConcluidas);
        System.out.println(Kakashi.nome);
        Kakashi.inteligenciaDeCombate(170);

        //Ao fazer a impressao do objeto, estamos mostrando o local onde esta armazenado o objeto (referencia de memoria)
        System.out.println(Kakashi);

    }
}
