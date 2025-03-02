package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar um ninja naruto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome =  "Sasuke Uchiha";
        Sasuke.idade = 15;
        Sasuke.aldeia = "Konoha";

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 13;
        Naruto.aldeia = Sasuke.aldeia;

        System.out.println(Naruto.aldeia);
        //Ninja usando uma função unica do clã que herdou classe ninja
        Sasuke.SharinganAtivado();
        Sasuke.anosParaHokage(50);

        Naruto.anosParaHokage(70);
        Naruto.modoSabio();



        System.out.println(Naruto.retornoVila());

        System.out.println(Sasuke.anosParaHokage(50));

  }
}

