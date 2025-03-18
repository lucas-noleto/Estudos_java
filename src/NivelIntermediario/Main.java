package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //Criar um ninja naruto
        uchiha Sasuke = new uchiha();
        Sasuke.nome =  "Sasuke Uchiha";
        Sasuke.idade = 15;
        Sasuke.aldeia = "Konoha";

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 13;
        Naruto.aldeia = Sasuke.aldeia;

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 13;
        Hinata.aldeia = "Konoha";

        System.out.println(Naruto.aldeia);
        //Ninja usando uma função unica do clã que herdou classe ninja
        Sasuke.SharinganAtivado();
        Sasuke.anosParaHokage(50);

        Naruto.anosParaHokage(70);
        Naruto.modoSabio();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.aldeia = "Konoha";
        Boruto.idade = 12;
        Boruto.AtivarJougan();
        Boruto.modoSabio();
        Boruto.AtivarKarma();



        System.out.println(Naruto.retornoVila());

        System.out.println(Sasuke.anosParaHokage(50));

        //Apos implementar os construtores em ninja e uchiha, agora consigo criar o itachi
        uchiha itachi = new uchiha("Vila oculta da folha", "Itachi Uchiha",17 );

        System.out.println(itachi.nome);

        Hatake Kakashi = new Hatake("Kakashi Hatake", "Aldeia da folha",21 );
        Kakashi.ativarSharingan();
        Kakashi.boasVindas();
        Kakashi.bemvindoAnbu();




  }
}

