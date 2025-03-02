package TiposDeDados;

import java.util.Locale;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados nao primitivos sao conjuntos dos dados primitivos
        * ex:
        * string,array,class, enum
        * podemos acessar metodos em variaveis nao primitivas
        *
        * Objetivo: Criar um ninja e atribuir metodos a ele
        *
        *
        *
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println(nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        System.out.println(aldeia.toLowerCase());


    }
}
