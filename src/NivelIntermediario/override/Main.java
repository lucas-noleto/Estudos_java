package NivelIntermediario.override;

public class Main {
    public static void main(String[] args) {
        Hatake Kakashi = new Hatake("Kakashi  Hatake","Vila da folha", 21, 12, NivelNinja.KAGE );
        System.out.println(Kakashi.getNumeroDeMissoesConcluidas());
        System.out.println(Kakashi.getNome());
        Kakashi.inteligenciaDeCombate(170);
        Kakashi.setAltura(1.81);
        System.out.println(Kakashi.getAltura());

        //Ao fazer a impressao do objeto, estamos mostrando o local onde esta armazenado o objeto (referencia de memoria)
        System.out.println(Kakashi);

        Kakashi.tacarKunai();
        Uzumaki naruto = new Uzumaki();
        naruto.tacarKunai();

    }
}
