package NivelIntermediario.contrutores;


public class Main {
    public static void main(String[] args) {
        //Hokage Hashirama = new Hokage();
        //Hokage Tobirama = new Hokage("Tobirama Senju");
        //Hokage Hiruzen = new Hokage(40);
        //Hokage Minato =  new Hokage("Minato Namikaze", 24, true);

        //Metodo acima foi para instanciar uma classe hokage, entretanto, agora tornamos uma classe abstrata e criamos uma nova classe para extender do hokage

        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.sabedoriaHokage();


    }


}
