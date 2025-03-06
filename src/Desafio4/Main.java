package Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico jao = new NinjaBasico("Jao",14, habilidade.TAIJUTSU);
        NinjaAvancado kakashi = new NinjaAvancado("Kakashi",30,"Chidori", habilidade.RINNENGAN);

        jao.mostrarInformacoes();
        jao.executarHabilidade();

        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();


    }
}
