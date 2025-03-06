package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {
    Uzumaki naruto = new Uzumaki();
    naruto.nome =  "Naruto Uzumaki";

    Uchiha sasuke = new Uchiha();
    sasuke.nome = "Sasuke Uchiha";
    sasuke.habilidadeEspecial();
    naruto.habilidadeEspecial();
    }
}
