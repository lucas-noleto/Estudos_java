package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

       /*
       *
       * Ternarios sao usados para reduzir o codigo
       *
       * se a condicao da variavel for verdadeira, uma coisa vai acontecer, se nao a outra
       * variavel = (condicao) ? valorVerdadeiro : valorFalso
       *        *
       *
       * */


        short numeroDeMissoes = 12;
        String nivel = (numeroDeMissoes >= 10 ) ? "Esse ninja esta com mais de dez missoes " : "Ninja nao esta apto";

        System.out.println(nivel);
    }
}
